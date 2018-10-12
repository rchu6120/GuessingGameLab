import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = (int)Math.random()*100+1;
        int guess = (int)Math.random()*100+1;
        int min = 1;
        int max = 100;
        while (n != guess) {
            if (n > guess) {
                System.out.print("Guess higher!");
                min = guess;
                guess = (int)Math.random()*(100-min);
            }
            if (n < guess) {
                System.out.print("Guess lower!");
                max = guess;
                guess = (int)Math.random()*(max-1);
            }
            if (n == guess) {
                System.out.println("You got it! The number is " + n + "!");
            }
        }
    }
}
