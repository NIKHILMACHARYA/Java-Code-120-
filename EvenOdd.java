import java.util.Scanner;
public class EvenOdd{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num % 2==0){
            System.out.println("\nNumber is Evan !");
        }
        else{
            System.out.println("\nNumber is Odd !");
         }
         sc.close();
    }
}