 
import java.lang.StringBuilder;
class Solution{
​
  static String toCamelCase(String s){
     String[] word = s.split("_");
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