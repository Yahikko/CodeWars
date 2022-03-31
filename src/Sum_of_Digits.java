public class Sum_of_Digits {

  /*
  Given n, take the sum of the digits of n. If
  that value has more than one digit, continue
  reducing in this way until a single-digit number
  is produced. The input will be a non-negative integer.
   */

  public static int digital_root(int n) {
    return (n != 0 && n % 9 == 0) ? 9 : n % 9;
  }

  public static void main(String[] args) {
    System.out.println(4564 % 9);
  }
}
