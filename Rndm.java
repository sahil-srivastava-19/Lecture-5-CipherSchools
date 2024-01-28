import java.util.Random;
import java.util.Scanner;

public class Rndm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int compChoice = rnd.nextInt(20);
        System.out.println("Guess a number between 0-20:- ");
        for (int i = 1; i < 6; i++) {
            System.out.print("User Choice: ");
            int userChoice = sc.nextInt();
            if (userChoice > compChoice) {
                System.out.println("Your guess is too high!");
            } else if (userChoice < compChoice) {
                System.out.println("Your guess is too low!");
            } else {
                System.out.println("Gotch! You guessed it right.");
                break;
            }
        }
    }
}
