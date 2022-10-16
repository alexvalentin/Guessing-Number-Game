package guessnumbergame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);

        Scanner userInput = new Scanner(System.in);

        System.out.println("\nWelcome to Guess Number Game.\n You will be asked to Guess a number to Win the game.\n You have maximum 5 attemp limit.\n");


        while (userGuessNumber != secretNumber){
            System.out.println("Enter a guess number between 1 to 100 - try [" + attempt + "].");

            if (userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();

                if (userGuessNumber == secretNumber)
                {
                    System.out.println("Wow, your number is correct. You win the game");
                    break;
                }

                else if (userGuessNumber < secretNumber)
                    System.out.println("You need a Greater number.");

                else if (userGuessNumber > secretNumber)
                    System.out.println("You need a Smaller number.");

                if (attempt == 5)
                {
                    System.out.println("You have exceeded the maximum attempt. Try again. The number is " + secretNumber);
                    break;
                }

                attempt++;
            }
            else {
                System.out.println("Enter a valid integer number");
                break;
            }
        } //while (userGuessNumber != secretNumber);
    }
}

