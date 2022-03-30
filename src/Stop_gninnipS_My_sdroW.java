import java.util.Arrays;
import java.util.stream.Collectors;

public class Stop_gninnipS_My_sdroW {
  /*
  Write a function that takes in a string of one or more words,
  and returns the same string, but with all five or more letter
  words reversed (Just like the name of this Kata). Strings
  passed in will consist of only letters and spaces. Spaces will
  be included only when more than one word is present.

  Examples: spinWords( "Hey fellow warriors" ) => returns
  "Hey wollef sroirraw" spinWords( "This is a test") => returns
  "This is a test" spinWords( "This is another test" )=> returns
  "This is rehtona test"
   */

  public static String spinWords1(String sentence) {
    //TODO: Code stuff here
    String[] strings = sentence.split("\\s");
    String newString = "";

    for (int i = 0; i < strings.length; i++) {
      newString += strings[i].length() > 4 ?
          new StringBuilder(strings[i]).reverse().append(" ")
          : strings[i] + " ";
    }
    return newString.trim();
  }

  public static String spinWords2(String sentence) {
    //TODO: Code stuff here
    return Arrays.stream(sentence.split("\\s"))
        .map(x -> x.length() > 4 ?
            new StringBuilder(x).reverse().toString()
            : x).collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {
    System.out.println(spinWords2("abc a abcde"));
  }
}
