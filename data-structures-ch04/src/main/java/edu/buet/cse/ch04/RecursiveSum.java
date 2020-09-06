package edu.buet.cse.ch04;

import java.util.stream.IntStream;

/**
 * Compute the sum of first n elements of an array recursively
 * 
 * @author shamim
 *
 */
public class RecursiveSum {
  public static void main(String... args) {
    int[] values = IntStream.iterate(1, i -> i + 1).limit(10).toArray();

    for (int i = 0; i <= values.length; i++) {
      int sum = findSum(values, i);
      System.out.println(sum);
    }
  }

  // this is a wrapper to the recursive method which performs some validation check before
  // triggering the recursion
  public static int findSum(int[] values, int n) {
    if (n > values.length) {
      throw new IllegalArgumentException(
          String.format("The provided array does not have %d elements", n));
    }

    return computeSum(values, n);
  }

  // this is the recursive method to compute sum
  private static int computeSum(int[] values, int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return values[0];
    }

    return computeSum(values, n - 1) + values[n - 1];
  }
}
