import java.util.Arrays;
public class CharacterCounter {
​
  public static boolean validateWord(String word) {
    word = word.toLowerCase();
    // your code here
    String[] word1 = word.split("");
        String one  = Arrays.stream(word1,0,word1.length).filter(r -> r.equals(word1[0])).reduce("",String::concat);
​
        for(int i=1;i<word1.length;i++){
            int finalI = i;
            int size = Arrays.stream(word1,0,word1.length).filter(r -> r.equals(word1[finalI])).reduce("",String::concat).length();
​
            if (size != one.length()) return false;
        }
    return true;
  }
}