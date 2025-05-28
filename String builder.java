
import java.util.*;
public class Main {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Nikhil");
        System.out.println(sb);
        // character at index 0.
        System.out.println(sb.charAt(0));
        
        //Replace the index value.
        //sb.setcharAt(0,'V');
        //System.out.print(sb);
        
        //insert the value.
        sb.insert(0,'S');
        System.out.println(sb);
        
        //delete the value.
        sb.delete(2,3);
        System.out.print(sb);
    }
}
