import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey computer, guess my number from 1-100! ");
        sleep(1500);
        int computer = 50;
        System.out.println(computer);
        int count = 0;
        int min = 1;
        int max = 100;
        String response = input.nextLine();
        while (!response.equals("correct")) {
            if (response.equals("higher")) {
                min = computer + 1;
                computer = (int) (Math.random()*(max-min) + min);
                System.out.println(computer);
            }
            if (response.equals("lower")) {
                max = computer - 1;
                computer = (int) (Math.random()*(max-min) + min);
                System.out.println(computer);
            }
            count++;
            response = input.nextLine();
        }
        if (count == 1) {
            System.out.println("Good job computer! The number is " + computer + ". It took " + count + " try.");
        } else {
            System.out.println("Good job computer! The number is " + computer + ". It took " + count + " tries.");
        }
    }

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {}
    }
}

