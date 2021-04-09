package JavaTraining.Assignment4;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int answer = random.nextInt(100);
        while (true) {
            System.out.println("Input a number to guess: ");
            guess = scanner.nextInt();
            if (guess > answer) {
                System.out.println("Too high, try again.");
            } else if (guess < answer) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Bingo! you got it!");
                return;
            }
        }
    }
}
