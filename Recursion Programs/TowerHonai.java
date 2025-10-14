import java.util.*;

public class TowerHonai {
    public static void TowerofHonai(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        TowerofHonai(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        TowerofHonai(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        TowerofHonai(n, "S", "H", "D");
    }
}



// Output:

// Transfer disk 1 from S to D
// Transfer disk 2 from S to H
// Transfer disk 1 from D to H
// Transfer disk 3 from S to D
// Transfer disk 1 from H to S
// Transfer disk 2 from H to D
// Transfer disk 1 from S to D

    

