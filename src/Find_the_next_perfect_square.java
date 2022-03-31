public class Find_the_next_perfect_square {

  /*
  Complete the findNextSquare method that finds
  the next integral perfect square after the one
  passed as a parameter. Recall that an integral
  perfect square is an integer n such that sqrt(n)
  is also an integer.

  If the parameter is itself not a perfect square
  then -1 should be returned. You may assume the
  parameter is non-negative.
   */

  public static long findNextSquare(long sq) {
    return Math.sqrt((double) sq) % 1 == 0 ?
        (long) Math.pow(Math.sqrt(sq) + 1, 2) : -1;
  }

  public static void main(String[] args) {
    System.out.println(findNextSquare(143));
  }
}
