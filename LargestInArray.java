import java.util.*;

public class LargestInArray {
    public static void main(String[] args) {
      int[] numbers= {25,4,8,15,3};
      int max= numbers[0];
      
      for(int i=1; i< numbers.length; i++){
        if(numbers[i] > max){
          max= numbers[i];
        }
      }
        System.out.println("Largest number is :" +max);
  }
}