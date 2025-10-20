import java.lang.StringBuilder;
import java.util.ArrayList;
class Solution{
​
  static String toCamelCase(String s){
     String[] word1 = s.split("_");
     String[] word = word1.split("-");
    
        ArrayList<String[]> newSentence = new ArrayList<>();
        String newWord = "";
        for (String ele: word){
            String[] eles = ele.split("");
            eles[0] = eles[0].toUpperCase();
            String neweles = String.join("",eles);
            newWord = newWord + neweles;
            // newSentence.add(eles);
            // System.out.println(Arrays.toString(eles));
        }
        System.out.println((newWord));
        
    return newWord;  
  }
}