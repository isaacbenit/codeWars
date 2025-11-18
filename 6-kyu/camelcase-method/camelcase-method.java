import java.util.*;
public class Solution {
​
    public static String camelCase(String str) {
        str = str.trim();
        return str.length()==0 ? "":  String.join("",Arrays.stream(str.split("\\s+"),0,str.split("\\s+").length).map(s ->  s.substring(0, 1).toUpperCase() + s.substring(1)).toArray(String[] ::new));
    }
​
}
​