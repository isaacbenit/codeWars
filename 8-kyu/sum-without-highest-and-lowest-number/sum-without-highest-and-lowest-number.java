import java.util.*;
public class Kata
{
  public static int sum(int[] numbers)
  {
    if(  numbers == null || numbers.length<2) return 0;
    Arrays.sort(numbers);
    int[] array = Arrays.copyOfRange(numbers,1,numbers.length-1);
    
    return Arrays.stream(array).sum();
  }
}