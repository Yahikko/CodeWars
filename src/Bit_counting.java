public class Bit_counting {

  /*
  Write a function that takes an integer as input,
  and returns the number of bits that are equal to
  one in the binary representation of that number.
  You can guarantee that input is non-negative.
   */

  public static int countBits1(int n) {
    return Integer.toBinaryString(n)
        .replaceAll("0", "").length();
  }

  public static int countBits2(int n) {
    return Integer.bitCount(n);
  }

  public static int countBits3(int n) {
    return (int) Integer.toBinaryString(n).chars()
        .filter(c -> c == '1')
        .count();
  }

  public static void main(String[] args) {
    System.out.println(countBits1(1234));
  }
}
