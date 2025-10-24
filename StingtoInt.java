import java.util.*;

public class StingtoInt {
    public static void main(String[] args) {
      //String to Integer
      String numstr="12345";
      int num = Integer.parseInt(numstr);
      System.out.println("Sring to Integer: " +num);
      
      //Integer to String
      int number = 12345;
      String str = Integer.toString(number);
      System.out.println("Integer to String: "+str);
  }
}
