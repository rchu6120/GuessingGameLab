import java.util.Scanner;

public class RChuLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name?");
        String name = input.nextLine();
        System.out.print("Hey " + name + ", guess my secret number!");
        int n = (int)Math.random()*10+1;
        int guess = input.nextInt();
        while (!guess.equals())


    }
}
