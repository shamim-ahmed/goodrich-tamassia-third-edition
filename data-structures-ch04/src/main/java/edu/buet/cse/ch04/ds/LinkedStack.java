package edu.buet.cse.ch04.ds;

/**
 * A linked list based implementation of stack
 * 
 * @author shamim
 *
 * @param <T>
 */
public class LinkedStack<T> implements Stack<T> {
  private int size = 0;
  private Node<T> topNode = null;

  /**
   * {@inheritDoc}
   */
  @Override
  public void push(T item) {
    Node<T> node = new Node<>(item);

    if (isEmpty()) {
      topNode = node;
    } else {
      node.setNext(topNode);
      topNode = node;
    }

    size++;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public T pop() {
    if (isEmpty()) {
      throw new IllegalStateException("stack isempty");
    }

    Node<T> node = topNode;
    topNode = topNode.getNext();
    T result = node.getValue();
    size--;

    if (size == 0) {
      topNode = null;
    }

    return result;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public T top() {
    if (isEmpty()) {
      throw new IllegalStateException("stack is empty");
    }

    return topNode.getValue();
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getSize() {
    return size;
  }

  private static class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
      this(value, null);
    }

    public Node(T value, Node<T> next) {
      this.value = value;
      this.next = next;
    }

    public T getValue() {
      return value;
    }

    @SuppressWarnings("unused")
    public void setValue(T value) {
      this.value = value;
    }

    public Node<T> getNext() {
      return next;
    }

    public void setNext(Node<T> next) {
      this.next = next;
    }
  }
}
