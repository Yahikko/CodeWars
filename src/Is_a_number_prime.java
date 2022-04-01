import java.math.BigInteger;

public class Is_a_number_prime {

  /*
  Define a function that takes one integer argument
  and returns logical value true or false depending
  on if the integer is a prime.
   */

  public static boolean isPrime1(int num) {
    return num > 1 && BigInteger.valueOf(num).isProbablePrime(20);
  }

  public static boolean isPrime2(int number) {
    if (number < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPrime1(45));
  }
}
