import java.util.*;

public class TowerHonai{
    public static void TowerofHonai(int n, string str, string helper, string dest ){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        TowerofHonai(n-1, src, dest ,helper);
        System.ou.println("Transfer disk "+n+" from "+src+" to "+dest);
        TowerofHonai(n-1, helper, src, dest);
    }

    public static void main(string[] args){
        int n=3;
        TowerofHonai(n ,"S", "H", "D")
    }
}    