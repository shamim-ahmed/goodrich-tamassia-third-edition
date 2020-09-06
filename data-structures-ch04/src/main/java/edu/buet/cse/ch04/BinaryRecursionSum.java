package edu.buet.cse.ch04;

import java.util.stream.IntStream;

/**
 * Compute the sum of the values in an array using divide and conquer
 * 
 * @author shamim
 *
 */
public class BinaryRecursionSum {
  public static void main(String... args) {
    int[] values = IntStream.iterate(0, i -> i + 1).limit(99).toArray();
    System.out.println(findSum(values));
  }

  // this is a wrapper method that invokes the recursive method
  public static int findSum(int[] values) {
    return computeSum(values, 0, values.length - 1);
  }

  // this is the recursive method that finds the sum using divide and conquer
  private static int computeSum(int[] values, int i, int j) {
    if (i > j) {
      return 0;
    }

    if (i == j) {
      return values[i];
    }

    // note how we compute the mid
    int mid = i + (j - i) / 2;

    return computeSum(values, i, mid) + computeSum(values, mid + 1, j);
  }
}
