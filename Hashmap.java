import java.util.Scanner;
public class Hashmap{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int[] pos=new int[10];
        int[] neg=new int[10];
        for(int i=0;i<10;i++){
            pos[i]=0;
            neg[i]=0;
        }
        
        System.out.println("Enter the elements of an Array:");
        for (int i = 0; i < 5; i++) {  // Fixed missing parenthesis
            int n = sc.nextInt();
            if (n >= 0 && n < 10) {  // Prevents ArrayIndexOutOfBoundsException
                pos[n]++;
            } else if (n > -10) { // Ensuring valid negative index range
                neg[-n]++;  // Storing absolute value
            }
        }
        
        sort(pos,neg);
        findElement(pos,neg, 6);
       sc.close();
    }
    
    public static void sort(int[] pos, int[] neg) {
        for(int i=neg.length-1;i>=0;i--){
            if(neg[i]>0){
                System.out.println((i*-1)+"");
            }
        }
        for(int i=0;i<pos.length;i++){
            if(pos[i]>0){
                System.out.println(i+" ");
            }
        }
        System.out.println();
        // Sorting logic (to be implemented)
        System.out.println("Sorting logic to be implemented.");
    }

    public static void findElement(int[] pos, int[] neg, int target) {
         // Search logic (to be implemented)
        if(target>=0){
            System.out.println(pos[target]);
        }else{
            System.out.println(neg[target]);
        }
        System.out.println("Finding element: " + target);
    }
}
 
