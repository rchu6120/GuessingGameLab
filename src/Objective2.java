import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hey computer, guess my number from 1-100!");
        int computer = (int)(Math.random()*100)+ 1;
        int computer = input.nextInt();
        int count = 0;
        int min = 1;
        int max = 100;
        String response = input.nextLine();
        if (response.equals("higher")) {
            min = computer;
            computer = (int)(Math.random()*(100 - computer))+(computer + 1);
            count++;
        }
        if (response.equals("lower")) {
            max = computer;
            computer = (int)(Math.random()*(computer - 1))+1;
            count++;
        }
        if (response.equals("correct")) {
            System.out.println("Good job computer! The number is " + computer + ". It took " + count + " tries.");
        }
    }
}

