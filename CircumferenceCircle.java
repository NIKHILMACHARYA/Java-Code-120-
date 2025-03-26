import java.util.Scanner;

public class CircumferenceCircle{
    public static void main(String[] args){
        int radius;
        double circumference,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius=sc.nextInt();
        
        circumference = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.println("Circumference of the  Circle:"+ circumference);
        System.out.println("Area of the circle:"+ area);
        sc.close();
    }
}