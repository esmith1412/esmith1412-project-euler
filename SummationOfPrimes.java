/* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
import java.lang.ArithmeticException;

public class SummationOfPrimes {
  private long num;
  private long sum;

  public SummationOfPrimes(long num) {
    this.num = num;
    this.setSum();
  }

  public long getSum() {
    return this.sum;
  }

  private void setSum() {
    long sum = 0;
    for (long i = 0; i < this.num; i++) {
      if ( isPrime(i) ) {
        sum += i;
      }
      else
        continue;
    }
    this.sum = sum;
  }

  // Helper function to find prime numbers
  private static boolean isPrime(long num) {
    // Zero and one aren't prime numbers
    if (num == 0 || num == 1)
      return false;
    // Two is a prime number
    else if (num == 2)
      return true;
    /* To only check numbers greater than one and less than the
    passed-in number */
    else {
      for (long i = 2; i < num; i++) {
        if (num % i == 0)
          return false;
      }
    }
    // Any number that doesn't trigger any of the previous conditions is prime
    return true;
  }
}
