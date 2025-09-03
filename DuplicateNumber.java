import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
      Integer[] nmbr={1,2,3,5,2,1,6,7,3};
      
      Set<Integer> uniqueSet =new HashSet<>(Arrays.asList(nmbr));
      Integer[] uniqueNumber = uniqueSet.toArray(new Integer[0]);
      System.out.println("Original: " +Arrays.toString(nmbr));
      System.out.println("Without duplicate: "+Arrays.toString(uniqueNumber));
    }
}




//Output:

//Original: [1, 2, 3, 5, 2, 1, 6, 7, 3]
//Without duplicate: [1, 2, 3, 5, 6, 7]
