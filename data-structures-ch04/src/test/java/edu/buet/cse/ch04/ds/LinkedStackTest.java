package edu.buet.cse.ch04.ds;

import java.util.stream.IntStream;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedStackTest {

  @Test
  public void testStackOperations() {
    Stack<Integer> stack = new LinkedStack<>();
    assertEquals(Boolean.TRUE, stack.isEmpty());
    assertEquals(0, stack.getSize());

    final int start = 1;
    final int end = 99;
    IntStream.rangeClosed(start, end).forEach(i -> stack.push(i));

    assertEquals(Integer.valueOf(end), stack.top());

    for (int i = end; i >= start; i--) {
      Integer x = stack.pop();
      assertEquals(Integer.valueOf(i), x);
    }

    assertEquals(Boolean.TRUE, stack.isEmpty());
    assertEquals(0, stack.getSize());
  }
}
