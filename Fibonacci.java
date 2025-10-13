 public class Fibonacci{
   public static void main(String [] args){
     int n=10;
     int a=0,b=1;
     System.out.println(a+ " \n" +b+ " ");
     
     for(int i=2; i<n; i++){
       int c=a+b;
       System.out.println(c+" ");
       a=b;
       b=c;
     }
   }
 }


// Output:

// 0 
// 1 
// 1 
// 2 
// 3 
// 5 
// 8 
// 13 
// 21 
// 34
