import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int result = rand.nextInt(10);
        result += 1;

        System.out.println("Welcome to my numbguesser game");
        System.out.println("Whats your name? \nEnter your name:");

        String name = scanner.nextLine();

        System.out.printf("Welcome %s", name);
        System.out.println("");
        System.out.printf("%d", result);
        System.out.println("");
        System.out.println("To start you need a number \nEnter your number:");

        int number = 0;
        for (int i = 0; i < 6; i++) {

            number = scanner.nextInt();
            System.out.println("");

            if (number > 10)
                System.out.println("Your number is higher than its allowed");

            else if (number < result)
                System.out.println("Your number is lower");

            else if (number > result)
                System.out.println("Your number is higher");

            else if (number == result)
                break;
        }
        if (number == result) {
            System.out.printf("%s you won", name);
        }
    }
}
