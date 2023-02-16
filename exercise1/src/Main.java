import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // generate a random integer from 1 to 1000
        Random random = new Random();
        int number = random.nextInt(1000) + 1;
        //System.out.println(number);

        // ask the user to guess the number
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess a number between 1 and 1000: ");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("Yeah, you've found it!");
            } else if (guess < number) {
                System.out.println("Wrong, it's too small.");
            } else {
                System.out.println("Wrong, it's too big.");
            }
        } while (guess != number);

        scanner.close();
    }
}