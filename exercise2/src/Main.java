import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();

        int randInt = random(a, b);
        System.out.println("Randomly picked integer: " + randInt);

        sc.close();
    }

    public static int random(int a, int b) {
        // return a or b, randomly
        Random random = new Random();
        int randomInt = random.nextInt(2);
        return (randomInt == 0) ? a : b;
    }
}