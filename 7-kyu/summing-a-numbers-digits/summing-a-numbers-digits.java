public class Kata{
  public static int sumDigits(int number){
    number = Math.abs(number);
    String[] numbers = (number+"").split("");
    int sum = 0;
    for(String i : numbers){
      sum += Integer.valueOf(i);
    }
    return sum;
  }
}