import java.util.*;

public class SmallestInArray {
    public static void main(String[] args) {
      int[] numbers= {10,25,3,8,15,1,7};
      int min= numbers[0];
      for(int i=1; i< numbers.length; i++){
        if(numbers[i] < min){
          min= numbers[i];
        }
      }
      System.out.println("Smallest number is : "+min);
  }
}