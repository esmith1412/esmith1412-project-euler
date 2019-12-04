public class SummationOfPrimesDriver {
  public static void main( String[] args ) {
    SummationOfPrimes sum = new SummationOfPrimes(2000000L);
    System.out.println( sum.getSum() );
  }
}
