class Palindrome{
    public static void main(String [] args){
        int n=1221;
        int b=0;
        int save=n;
        int r;
        while(n!=0){
            r=n%10;
            b=b*10;
            b=b+r;
            n=n/10;
        }
        if( save==b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}