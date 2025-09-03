import java.util.*;

public class SumDigits {
    public static void main(String[] args) {
      int number= 12345;
      
      int sum =0;
      while (number>0){
        sum += number %10;
        number /=10;
      }
      System.out.println("Sum of digits :" + sum);


    }
}



//Output:

//Sum of digits :15
