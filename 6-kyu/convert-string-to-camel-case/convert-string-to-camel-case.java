import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution{
​
  static String toCamelCase(String s){
    String[] sentenceTest = s.split("");
//         List<String> sentence1 = Arrays.asList(sentenceTest);
    ArrayList <String> arr = new ArrayList<>();
​
    String[] word ={} ;
        
        if(arr.contains("-")){
            word = s.split("-");
            
        }
        if(arr.contains("_")){
            word =  s.split("_");
        } 
        String newWord = "";
        for (int a=0;a<word.length;a++){
            String[] eles = word[a].split("");
            System.out.println(Arrays.toString(eles));
            if(a == 0){
                eles[0] = eles[0];
            }else{
                eles[0] = eles[0].toUpperCase();
            }
            String neweles = String.join("",eles);
            newWord = newWord + neweles;
        }
        System.out.println((newWord));
        
    return newWord;  
  }
}