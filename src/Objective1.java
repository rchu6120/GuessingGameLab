import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = input.nextLine();
        System.out.print("Hey " + name + ", what difficulty would you like? Type 1 for numbers 1-10, Type 2 for numbers 1-100, Type 3 for numbers 1-1000, or Type 4 for numbers 1-10000? ");
        String type = input.nextLine();
        int count = 0;
        if (type.equals("Type 1")) {
            int n = (int) (Math.random() * 10) + 1;
            System.out.print("Guess my secret number from 1-10! ");
            int guess = input.nextInt();
            while (guess != n) {
                System.out.print("Guess again! ");
                guess = input.nextInt();
                count++;
            }
            if (count == 1) {
                System.out.println("You got it " + name + "!" + " It took you " + count + " try." + " The number is " + n + "!");
            } else {
                System.out.println("You got it " + name + "!" + " It took you " + count + " tries." + " The number is " + n + "!");
            }
        }
        if (type.equals("Type 2")) {
            int n = (int) (Math.random() * 100) + 1;
            System.out.print("Guess my secret number from 1-100! ");
            int guess = input.nextInt();
            while (guess != n) {
                System.out.print("Guess again! ");
                guess = input.nextInt();
                count++;
            }
            if (count == 1) {
                System.out.println("You got it " + name + "!" + " It took you " + count + " try." + " The number is " + n + "!");
            } else {
                System.out.println("You got it " + name + "!" + " It took you " + count + " tries." + " The number is " + n + "!");
            }
        }
        if (type.equals("Type 3")) {
            int n = (int) (Math.random() * 1000) + 1;
            System.out.print("Guess my secret number from 1-1000! ");
            int guess = input.nextInt();
            while (guess != n) {
                System.out.print("Guess again! ");
                guess = input.nextInt();
                count++;
            }
            if (count == 1) {
                System.out.println("You got it " + name + "!" + " It took you " + count + " try." + " The number is " + n + "!");
            } else {
                System.out.println("You got it " + name + "!" + " It took you " + count + " tries." + " The number is " + n + "!");
            }
        }
        if (type.equals("Type 4")) {
            int n = (int) (Math.random() * 10000) + 1;
            System.out.print("Guess my secret number from 1-10000! ");
            int guess = input.nextInt();
            while (guess != n) {
                System.out.print("Guess again! ");
                guess = input.nextInt();
                count++;
            }
            if (count == 1) {
                System.out.println("You got it " + name + "!" + " It took you " + count + " try." + " The number is " + n + "!");
            } else {
                System.out.println("You got it " + name + "!" + " It took you " + count + " tries." + " The number is " + n + "!");
            }
        }
    }
}
