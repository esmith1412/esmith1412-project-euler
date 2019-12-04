/* A palindromic number reads the same both ways. The largest palindrome made
from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
class LargestPalindromeProduct {
  private long largestPalindrome;

  public LargestPalindromeProduct() {
    this.largestPalindrome = this.calculateLargestPalindrome();
  }

  public long getLargestPalindrome() {
    return this.largestPalindrome;
  }

  private boolean checkPalindrome(long num) {
    // It's easier to compare characters if they're strings
    String numString = Long.toString(num);
    StringBuilder reverseStringBuilder = new StringBuilder(numString).reverse();
    String reverseString = reverseStringBuilder.toString();

    if ( numString.equals(reverseString) )
      return true;
    return false;
  }

  private long calculateLargestPalindrome() {
    long largestPalindrome = 0;

    for (long i = 100; i <= 999; i++) {
      for (long j = 100; j <= 999; j++) {
        long product = i * j;
        if ( checkPalindrome(product) ) {
          if (product > largestPalindrome)
            largestPalindrome = product;
        }
        else
          continue;
      }
    }
    return largestPalindrome;
  }

}
