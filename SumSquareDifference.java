/* The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural
numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred
natural numbers and the square of the sum.
*/
public class SumSquareDifference {
  private long sumSquareDifference;

  public SumSquareDifference() {
    this.sumSquareDifference = getSquareOfSums() - getSumOfSquares();
  }

  public long getDifference() {
    return this.sumSquareDifference;
  }

  private static int getSumOfSquares() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      double square = Math.pow(i, 2);
      sum += square;
    }
    return sum;
  }

  private static long getSquareOfSums() {
    long sum = 0;
    for (long i = 1; i <= 100; i++) {
      sum += i;
    }
    // To calculate and return the square of all the sums
    long square = sum * sum;
    return square;
  }
}
