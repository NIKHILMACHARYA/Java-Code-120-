import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
      Integer[] numbers={1,2,3,4,2,4,5,1,3,8};
      
      Set <Integer> uniqueSet = new HashSet<>(Arrays.asList(numbers));
      Integer[] uniqueNumbers = uniqueSet.toArray(new Integer[0]);
      System.out.println("Original :"+Arrays.toString(numbers));
      System.out.println("Without Duplicates :"+Arrays.toString(uniqueNumbers));
  }
}



// Output:

// Original :[1, 2, 3, 4, 2, 4, 5, 1, 3, 8]
// Without Duplicates :[1, 2, 3, 4, 5, 8]
