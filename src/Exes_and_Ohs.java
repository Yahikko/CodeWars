import java.util.List;

public class Exes_and_Ohs {

  /*
  Check to see if a string has the same amount of 'x's and 'o's.
  The method must return a boolean and be case insensitive. The
  string can contain any char
   */

  public static boolean getXO1(String str) {
    // TODO: your code here
    int xCount = 0, oCount = 0;
    str = str.toLowerCase().replaceAll("[^xo]", "");
    for (int i = 0; i < str.length(); i++) {
      xCount += str.charAt(i) == 'x' ? 1 : -1;
      oCount += str.charAt(i) == 'o' ? 1 : -1;
    }
    return xCount - oCount == 0;
  }

  public static boolean getXO2(String str) {
    str = str.toLowerCase();
    return str.replace("o", "").length()
        == str.replace("x", "").length();

  }

  public static void main(String[] args) {
    System.out.println(getXO2("Xxxxooertr34"));
  }
}
