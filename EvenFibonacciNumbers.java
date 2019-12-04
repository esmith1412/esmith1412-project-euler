import java.util.ArrayList;

public class EvenFibonacciNumbers {
  public static ArrayList<Integer> getFibonacciNumbersInRange() {
    int[] nums = {1, 2};
    int fibNum = 0;
    ArrayList<Integer> fibNums = new ArrayList<Integer>();

    for (int i = 1; i < 4000000; i++) {
      if (i == 1 || i == 2)
        fibNum = i;
      else {
        // To get the next number in the Fibonacci sequence
        fibNum = nums[0] + nums[1];
        // To set each index of the array to the correct Fibonacci number
        nums[0] = nums[1];
        nums[1] = fibNum;
      }
      /* To add each Fibonacci number to the ArrayList, if less than equal
      to 4 million */
      if (fibNum <= 4000000)
        fibNums.add(fibNum);
      else
        break;
    }
    return fibNums;
  }

  private static int getSumOfEvenFibonacciNumbers(ArrayList<Integer> fibNums) {
    int sum = 0;

    for (int num : fibNums) {
      if (num % 2 == 0)
        sum += num;
    }
    return sum;
  }

  public static void main(String[] args) {
    /* Each new term in the Fibonacci sequence is generated by adding the
    previous two terms. By starting with 1 and 2, the first 10 terms will be:
    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    By considering the terms in the Fibonacci sequence whose values do not
    exceed four million, find the sum of the even-valued terms.
    */
    ArrayList<Integer> fibNums = getFibonacciNumbersInRange();
    int evenFibSum = getSumOfEvenFibonacciNumbers(fibNums);
    System.out.println(evenFibSum);
  }
}