public class Vowel_Count {
  /*
  Return the number (count) of vowels in the given string.
  We will consider a, e, i, o, u as vowels for this Kata (but not y).
  The input string will only consist of lower case letters and/or spaces.
   */

  public static int getCount1(String str) {
    int vowelsCount = 0;
    // TODO: your code here
    String vowels = "aeiou";
    for (int i = 0; i < str.length(); i++) {
      vowelsCount += vowels.contains(str.subSequence(i, i + 1)) ? 1 : 0;
    }
    return vowelsCount;
  }

  public static int getCount2(String str) {
    return str.replaceAll("[^aeiou]", "").length();
  }

  public static void main(String[] args) {
    System.out.println(getCount2("qqwertyuiopo   oo"));
  }
}
