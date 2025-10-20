public class Sum {
​
  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum1 = 0;
    int sum2 = 0;
    // arr1 + arr2 is not working...
    for(int i =0; i< arr1.length;i++){
      sum1 = sum1 +arr1[i];
    }
    for(int a =0; a< arr2.length;a++){
      sum2 = sum2 + arr2[a];
    }
    return sum1+sum2;
  }
​
}