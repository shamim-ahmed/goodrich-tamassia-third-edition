package edu.buet.cse.ch04;

/**
 * Compute Fibonacci nubmers using linear recursion
 * 
 * @author shamim
 *
 */
public class LinearFibonacci {
  public static void main(String... args) {
    for (int i = 0; i < 20; i++) {
      System.out.println(findFibonacci(i));
    }
  }

  // this method is a wrapper to the recursive method which computes the nth Fibonacci number
  public static long findFibonacci(long n) {
    long[] values = computeFibonacci(n);
    return values[0];
  }

  // the recursive method that computes the nth Fibonacci number
  private static long[] computeFibonacci(long n) {
    if (n <= 1) {
      return new long[] {n, 0};
    }

    // the array will contain the (n -1) th and (n-2) th Fibonacci numbers
    long[] values = computeFibonacci(n - 1);
    long x = values[0] + values[1];
    long y = values[0];
    values[0] = x;
    values[1] = y;

    return values;
  }
}
