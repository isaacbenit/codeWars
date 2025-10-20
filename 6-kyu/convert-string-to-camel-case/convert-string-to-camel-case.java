 
// import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution{
​
  static String toCamelCase(String s){
//      s=s.trim();
    System.out.println(s);
    String[] sentenceTest = s.split("");
        List<String> sentence1 = Arrays.asList(sentenceTest);
    String[] word ={} ;
        
        if(sentence1.contains("-")){
            word = s.split("-");
            
        }
        if(sentence1.contains("_")){
            word =  s.split("_");
        } 
//      String[] word = s.split("-");
        ArrayList<String[]> newSentence = new ArrayList<>();
        String newWord = "";
        for (String ele: word){
            String[] eles = ele.split("");
          
          List<String> eles1 = Arrays.asList(eles);
//             if(eles1.contains(" ")){
//             eles[1] = eles[1].toUpperCase();
//              }else{
//               eles[0] = eles[0].toUpperCase();  
//              }
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