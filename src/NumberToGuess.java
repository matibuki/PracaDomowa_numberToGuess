import java.util.Random;
import java.util.Scanner;

public class NumberToGuess {
    public static void main(String[] args) {
        game();
    }

    public static int Guess() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public static void game() {

        int answer = new Random().nextInt(100);
        System.out.println(answer);
        System.out.println("Welcome to the number guessing fun! Please take a guess between 0 and 99. You have 5 tries.");

        int i = 5;

        while  ((i >= 0)) {
            if (i!=0) {
                int guessNumber = Guess();


                if (guessNumber == answer) {
                    System.out.println("You guessed it!");
                    break;
                }

                else if ((guessNumber > answer)) {
                    System.out.println("Your number is LOWER than the one you are trying to guess.");
                    i--;
                    System.out.println("You have " + (i) + " tries left.");
                    if ((i < 5) && (i!=0)) {
                        System.out.println("Please try again.");
                    }

                }

                else if ((guessNumber < answer)) {
                    System.out.println("Your number is GREATER than the one you are trying to guess.");
                    i--;
                    System.out.println("You have " + (i) + " tries left.");
                    if ((i < 5) && (i!=0)) {
                        System.out.println("Please try again.");
                    }

                }
            }

            else {
                System.out.println("Sorry you didn't guess the number, the answer was: " + answer);
                break;

            }

        }
    }
}
