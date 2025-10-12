import java.util.*;

public class EvenOdd{
    public static void main(String[]args){
        int numbers = {1,2,3,4,5,6,7,8,9};
        ArrayList even = new ArrayList<>();
        ArrayList odd = new ArrayList<>();

        for(int num : numbers){
            if(num % 2 == 0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        System.out.println("Even numbers are: "+even);
        System.out.println("Odd numbers are: "+odd);
    }
}