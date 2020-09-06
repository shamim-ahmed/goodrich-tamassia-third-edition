package edu.buet.cse.ch04;

/**
 * Compute Fibonacci numbers using binary recursion
 * 
 * @author shamim
 *
 */
public class BinaryFibonacci {
  public static void main(String... args) {
    for (int i = 0; i < 20; i++) {
      System.out.println(computeFibonacci(i));
    }
  }

  public static long computeFibonacci(long n) {
    if (n <= 1) {
      return n;
    }

    return computeFibonacci(n - 1) + computeFibonacci(n - 2);
  }
}
