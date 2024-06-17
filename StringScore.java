public class StringScore {

  public static int calculateScore(String s) {
    int score = 0;
    for (int i = 1; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      char previousChar = s.charAt(i - 1);
      score += Math.abs(currentChar - previousChar);
    }
    return score;
  }

  
}
