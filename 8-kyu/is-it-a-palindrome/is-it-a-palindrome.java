public class Palindrome {
 public static Boolean isPalindrome(String x) {
        x= x.toLowerCase();
        StringBuffer reverse = new StringBuffer(x.toLowerCase());
        reverse.reverse();
       return  x.equals(reverse.toString());
    }
}