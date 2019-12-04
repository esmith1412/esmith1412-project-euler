public class LargestPrimeFactor {
  private long value;
  // To store the largest prime factor of a given number
  private long largestPrimeFactor;

  public LargestPrimeFactor(long num) {
    this.value = num;
    this.largestPrimeFactor = this.setLargestPrimeFactor();
  }

  // Helper function to find prime numbers
  private static boolean checkPrime(long num) {
    /* To check whether the number is divisible by any number other than
    itself and one */
    for (long i = 2; i < num; i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  // Helper function to see if one number is a factor of another
  private static boolean checkFactor(long dividend, long divisor) {
    return dividend % divisor == 0;
  }

  // To calculate the largest prime for the current number
  private long setLargestPrimeFactor() {
    long largestPrimeFactor = 0;

    for (long i = 1; i < this.value; i++) {
      if ( checkPrime(i) && checkFactor(this.value, i) ) {
        largestPrimeFactor = i;
      }
      else
        continue;
    }
    return largestPrimeFactor;
  }

  public long getLargestPrimeFactor() {
    return this.largestPrimeFactor;
  }
}
