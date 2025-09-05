public class FacorialNmbr{
  public static void main(String [] args){
    int num = 5;
    
    int factorial = factorialRecursive(num);
    System.out.println("Factorial of "+num+" : "+factorial);
  }

  public static int factorialRecursive(int n){
    if(n==0 | n==1) return 1;
    return n * factorialRecursive(n-1);
  }
}


// Output:

// Factorial of 5 : 120
  
