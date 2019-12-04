/* A Pythagorean triplet is a set of three natural numbers, a < b < c,
for which, a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
public class SpecialPythagoreanTriplet {

  private int triplet;

  public int findPythagoreanTriplet() {
    int product = 0;

    for (int a = 1; a < 1001; a++) {
      for (int b = 1; b < 1001; b++) {
        for (int c = 1; c < 1001; c++) {
          if (a + b + c == 1000 && (a*a + b*b) == c*c)
            product = a * b * c;
          else
            continue;
        }
      }
    }
    return product;
  }

}
