import java.util.*;

public class VowelConsonents {
    public static void main(String[] args) {
      String str= "Automation World";
      str= str.toLowerCase();
      int vowels=0, consonents=0;
      
      for(int i=0; i<str.length(); i++){
        char ch=str.charAt(i);
        if(ch >= 'a' && ch <= 'z'){
          if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'){
            vowels++;
          }
          else{
            consonents++;
          }
        }
      }
        
      System.out.println("Vowels: "+vowels+ ", Consonents: "+consonents);
  }
}


//output: Vowels: 7, Consonents: 8



