public class MultiplesOf3And5 {
  // Find the sum of all the multiples of 3 or 5 below 1000.
  public static int getSumOf3And5Multiples() {
    int total = 0;

    for (int i = 1; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0)
        total += i;
      else
        continue;
    }
    return total;
  }

  public static void main(String[] args) {
    int multiplesSum = getSumOf3And5Multiples();

    System.out.print("Here is the sum of all the multiples of 3 or 5 ");
    System.out.println("that are between 1 and 1000: " + multiplesSum + ".");
  }
}
