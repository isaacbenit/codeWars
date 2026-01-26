public class SillyAdditon {
​
    public static int add(int num1,int num2){
       String sum = "";
        String[] numOne = String.valueOf(num1).split("");
        String[] numTwo = String.valueOf(num2).split("");
        String[] remender = new String[0];
        int max = Math.max(numOne.length, numTwo.length);
        if(numOne.length!=max || numTwo.length!=max){
            numOne = ("0".repeat(max - numOne.length) + String.join("", numOne)).split("");
            numTwo = ("0".repeat(max - numTwo.length) + String.join("", numTwo)).split("");
        }
        for (int i= max - 1;i>=0;i--){
            sum = (Integer.parseInt(numOne[i]) + Integer.parseInt(numTwo[i]))+ sum;
        }
      return Integer.parseInt(sum); //this should work right?
    }
}