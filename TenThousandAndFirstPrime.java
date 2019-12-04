/* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
that the 6th prime is 13.

What is the 10,001st prime number?
*/
import java.util.ArrayList;

public class TenThousandAndFirstPrime {
  // To see if a given number is prime or not
  private static boolean checkPrime(long num) {
    /* If a number can be evenly divided by a number other than one and itself,
    it's prime, and a number cannot be evenly divided by a number greater
    than it */
    for (long i = 1; i < num; i++) {
      if (num % i == 0 && i != 1)
        return false;
    }
    return true;
  }

  public static long get10001stPrime() {
    // To know which prime number is in the 10001st spot
    ArrayList<Long> primes = new ArrayList<Long>();
    // To check if each number is a prime, in order
    long i = 1;
    /* To add all the prime numbers to the array, and stop after the desired
    index is reached */
    while (primes.size() < 10002) {
      // To see if a number is prime or not
      if ( checkPrime(i) )
        primes.add(i);
      i++;
    }
    // 10001st prime's index will be 10001
    return primes.get(10001);
  }
}
