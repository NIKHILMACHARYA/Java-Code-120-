public class StringLength{
  public static void main(String [] args){
    String str = "automation";
    int len = 0;
    try{
      while(true){
        str.charAt(len);
        len++;
      }
    }catch(StringIndexOutOfBoundsException e){
    }
    System.out.println("Length of String: "+len);
  }
}  


// Output:

// Length of String: 10
