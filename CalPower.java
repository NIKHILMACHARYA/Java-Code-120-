
public class calPower {
    public static int CalPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowern_1 = CalPower(x,n-1);
        int xPowern = x * xPowern_1;
        return xPowern;
    }
    
    public static void main(String[] args) {
    int x=2, n=5;
    int ans=CalPower(x,n);
    System.out.println(x+" Power of "+n+" is: " +ans);
    }
}