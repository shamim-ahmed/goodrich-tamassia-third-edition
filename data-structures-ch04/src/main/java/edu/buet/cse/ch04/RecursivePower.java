package edu.buet.cse.ch04;

/**
 * Compute the value of x^n recursively
 * 
 * @author shamim
 *
 */
public class RecursivePower {
  public static void main(String... args) {
    System.out.println(computePower(5, 7));
    System.out.println(computePower(13, 4));
    System.out.println(computePower(1, 1001));
  }

  private static int computePower(int x, int n) {
    if (n == 0) {
      return 1;
    }

    if (n == 1) {
      return x;
    }

    int result;

    if (n % 2 == 1) {
      // n is odd
      int y = computePower(x, (n - 1) / 2);
      result = x * y * y;
    } else {
      // n is even
      int y = computePower(x, n / 2);
      return y * y;
    }

    return result;
  }
}
