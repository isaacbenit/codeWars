import java.util.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
    // TODO: Insert Code Here
     ArrayList<Integer> cakes = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: recipe.entrySet()){
            if(available.get(entry.getKey())!= null){
                cakes.add(available.get(entry.getKey())/recipe.get(entry.getKey()));
            }else {return 0;} 
        }
     Collections.sort(cakes);
    return cakes.get(0);
  }
}