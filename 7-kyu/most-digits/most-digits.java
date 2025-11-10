import java.util.*;
public class MostDigits {
  public static int findLongest(int[] numbers) {
    System.out.println(Arrays.toString(numbers));
    List<String> one = new ArrayList<>();
        for (int num : numbers) one.add(String.valueOf(num));
        Collections.sort(one,(s1,s2)-> s2.length() - s1.length());
        return Integer.parseInt(one.get(0));
    
  }
}