public class Detect_pangram {
  /*
  Given a string, detect whether or not it is a pangram.
  Return True if it is, False if not. Ignore numbers and
  punctuation.
   */

  public static boolean check1(String sentence) {
    String s = "abcdefghijklmnopqrstuvwxyz";
    sentence = sentence.toLowerCase().replaceAll("[^a-z]", "");
    for (int i = 0; i < sentence.length(); i++) {
      String a = String.valueOf(sentence.charAt(i));
      if (s.contains(a)) {
        s = s.replace(a, "");
      }
    }
    return s.length() == 0;
  }

  public boolean check2(String sentence) {
    for (char c = 'a'; c <= 'z'; c++) {
      if (!sentence.toLowerCase().contains("" + c)) {
        return false;
      }
    }
    return true;

  }

  public boolean check3(String sentence) {
    return sentence.chars()
        .map(Character::toLowerCase)
        .filter(Character::isAlphabetic)
        .distinct()
        .count() == 26;
  }

  public static void main(String[] args) {
    System.out.println(check1("ty56"));
  }
}
