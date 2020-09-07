package edu.buet.cse.ch04.ds;

/**
 * Stack interface
 * 
 * @author shamim
 *
 * @param <T>
 */
public interface Stack<T> {
  /**
   * Push an item onto the stack
   * 
   * @param item
   */
  void push(T item);

  /**
   * Pop an item from the stack
   * 
   * @return an item
   * @throws IllegalStateException if stack is empty
   */
  T pop();

  /**
   * Return the top item from the stack without removing it
   * 
   * @return an item
   * @throws IllegalStateException if stack is empty
   */
  T top();

  /**
   * Return a flag to indicate if stack is empty
   * 
   * @return a boolean
   */
  boolean isEmpty();

  /**
   * Return the current size of the stack
   * 
   * @return an int
   */
  int getSize();
}
