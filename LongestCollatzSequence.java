/*  The following iterative sequence is defined for the set of
positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1)
contains 10 terms. Although it has not been proved yet (Collatz Problem), it is
thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.


The Collatz conjecture is a conjecture in mathematics that concerns a sequence
defined as follows: start with any positive integer n. Then each term is obtained
from the previous term as follows: if the previous term is even, the next term
is one half the previous term. If the previous term is odd, the next term is 3
times the previous term plus 1. The conjecture is that no matter what value of n,
the sequence will always reach 1. */
import java.util.ArrayList;

public class LongestCollatzSequence {
  private long longestStartingNumber = this.findLongestCollatzSequence();

  public long getLongestStartingNumber() {
    return this.longestStartingNumber;
  }

  private ArrayList<Long> findCollatzSequenceForNum(long num) {
    // To contain the Collatz sequence
    ArrayList<Long> sequence = new ArrayList<Long>();

    // To add the starting number to the array
    sequence.add(num);

    while (num != 1) {
      // Number is even
      if (num % 2 == 0) {
        num = num / 2;
        sequence.add(num);
      }
      // Number is odd
      else {
        num = 3 * num + 1;
        sequence.add(num);
      }
    }
    /* Return the ArrayList containing the Collatz sequence for the
    specified number */
    return sequence;
  }

  private long findLongestCollatzSequence() {
    long largestStartingNumber = 0;
    long longestLength = 0;

    for (long i = 2; i <= 1000000; i++) {
      long collatzLength = this.findCollatzSequenceForNum(i).size();

      if (collatzLength > longestLength) {
        longestLength = collatzLength;
        largestStartingNumber = i;
      }
      else
        continue;
    }
    return largestStartingNumber;
  }
}
