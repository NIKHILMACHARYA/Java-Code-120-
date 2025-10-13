import java.util.*;

public class SumofDigits {
    public static void main(String[] args) {
      int Numbers= 12345;
      int sum=0;
      while(Numbers>0){
        sum += Numbers % 10;
        Numbers /=10;
      }
      System.out.println("Sum of digits: "+sum);
  }
}


// Output:

// Sum of digits: 15

