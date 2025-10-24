import java.util.*;

public class EvenOddIndex {
    public static void main(String[] args) {
     String[] elem = {"Java", "Selenium", "TestNG", "Maven", "Jenkins", "docker"};
     System.out.println("Evan index Elements:");
     for(int i=0; i<elem.length; i+=2){
       System.out.println(elem[i]+" ");
     }
      System.out.println("\nOdd index Elements:");
     for(int i=1; i<elem.length; i+=2){
       System.out.println(elem[i]+" ");
     }
  }
}
