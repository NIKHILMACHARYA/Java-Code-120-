import java.util.Scanner;
public class DivisionByZero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a:");   //a=12
        int a=sc.nextInt();
        System.out.println("Enter value for a:");   //b=0
        int b=sc.nextInt();
     
        
        try{
            System.out.println("Value is:"+a/b);
        }catch(ArithmeticException e){
            System.out.println("Division By Zero is not Possible !");
        }
    }
}