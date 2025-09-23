import java.util.*;

public class Recursion3 {
   public static int factorial(int n){
     if(n == 1 || n == 0){
       return 1;
     }
     int fact_n1 = factorial(n-1);
     int fact_n = n*fact_n1;
     return fact_n;
   }
   
  public static void main (String [] args){
    int n= 5;
    int ans = factorial(n);
    System.out.println(ans);
  }
}

