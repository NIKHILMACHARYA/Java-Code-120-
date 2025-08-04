import java.util.*;

public class CharOccurrence {
    public static void main(String[] args) {
      String str= "Automation";
      str= str.toLowerCase();
      HashMap < Character,Integer > charCount = new HashMap<>();
      
        for(char ch: str.toCharArray()){
          if(charCount.containsKey(ch)){
            charCount.put(ch,charCount.get(ch)+1);
          }
          else{
            charCount.put(ch,1);
          }
        }

      System.out.println(charCount);
  }
}



//output: {a=2, t=2, u=1, i=1, m=1, n=1, o=2}
