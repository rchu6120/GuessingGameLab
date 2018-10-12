import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name?");
        String name = input.nextLine();
        System.out.print("Hey" + name + ", what difficulty would you like? Type 1, Type 2, Type 3, or Type 4?");
        String type = input.nextLine();

        int n = (int)Math.random()*10+1;
        int guess = input.nextInt();
        int count = 0;
        while (guess != (n)) {
            System.out.print("Guess again!");
            guess = input.nextInt();
            count++;
        }
        System.out.println("You got it" + name + "!" + " It took you " + count + " times." + " The number is " + n + "!");
    }
}
