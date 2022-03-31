public class Valid_Braces {

  /*
  Write a function that takes a string of braces,
  and determines if the order of the braces is valid.
  It should return true if the string is valid, and
  false if it's invalid.
  */

  public static boolean isValid(String braces) {
    String b = braces;
    for(int i=0;i<braces.length()/2;i++)
    {
      b = b.replaceAll("\\(\\)", "");
      b = b.replaceAll("\\[\\]", "");
      b = b.replaceAll("\\{\\}", "");
      if(b.length() == 0)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(isValid("([])"));
  }
}
