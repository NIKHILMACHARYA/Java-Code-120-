public class Main{
    public static void main(String [] args){
        int n=6322;
        int r=0;
        int b=0;

        while(n!=0){
            r= n%10;
            b=b*10+r;
            n=n/10;
        }
        System.out.println(b);
    }
}