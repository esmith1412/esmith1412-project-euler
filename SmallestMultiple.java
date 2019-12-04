/* 2520 is the smallest number that can be divided by each of the numbers
from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20?
*/
import java.util.ArrayList;

public class SmallestMultiple {
  // To see if a given number is evenly divisible by 1-20
  private static boolean checkIfNumIsSmallestMultiple(long num) {
    ArrayList<Boolean> divisibleBy1to20 = new ArrayList<Boolean>();

    for (long i = 1; i <= 20; i++) {
      if (num % i == 0)
        divisibleBy1to20.add(true);
      else
        divisibleBy1to20.add(false);
    }
    /* If there is even one "false" in the ArrayList, then the number is not
    divisible by 1-20, and the method should return false */
    if ( divisibleBy1to20.contains(false) )
      return false;
    else
      return true;
  }

  public static long getSmallestMultiple() {
    long num = 1;

    while (true) {
      if ( checkIfNumIsSmallestMultiple(num) )
        return num;
      else
        num++;
    }
  }
}
