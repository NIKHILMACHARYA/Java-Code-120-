import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {

    // The number to guess
    private int pickedNumber;

    // Constructor: randomly pick a number between 1 and n
    public NumberGuessGame(int n) {
        Random rand = new Random();
        pickedNumber = rand.nextInt(n) + 1; // range [1, n]
    }

    // Our "guess" function (like LeetCode's API)
    private int guess(int num) {
        if (num == pickedNumber) return 0;
        else if (num > pickedNumber) return -1; // guessed too high
        else return 1;  // guessed too low
    }

    // Binary search algorithm to find the number
    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // should never reach here
    }

    // Main method to run in normal Java compiler
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number (n): ");
        int n = sc.nextInt();

        NumberGuessGame game = new NumberGuessGame(n);

        int guessedNumber = game.guessNumber(n);
        System.out.println("The picked number was: " + guessedNumber);
    }
}



// Output:

// Enter the maximum number (n): 125
// The picked number was: 48
