package homework_3_1;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class numberToGuess {

    public static void main(String[] args) {

        int numberToGuess = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int i, tries =5;

        System.out.println("Start your guesswork in the range of 0-99, remember you have 5 tries, your proposed number is: ");

        for ( i = 0; i < tries ; i++) {


            int userNumber = getNumberFromUser();

            if (Objects.equals(numberToGuess, userNumber)){
                System.out.println("Congratulations, You guessed it! The Number to Guess was: " +numberToGuess + " Your proposed number was: " + userNumber);
                break;
            }
            else if (userNumber > numberToGuess && i !=tries -1)  {
                System.out.println("Your number is GREATER than the one you are trying to guess");
                System.out.println("Please try again, you have " +  (tries - (i+1)) + " attempt left"  );}

                else if (userNumber < numberToGuess && i !=tries -1)  {
                System.out.println("Your number is LOWER than the one you are trying to guess");
                System.out.println("Please try again, you have " +  (tries - (i+1)) + " attempt left"  );}
        }
        if (i == tries) {
            System.out.println("You have exhausted 5 tries. The number to guess was " + numberToGuess);
        }

    }

    public static int getNumberFromUser() {

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

    }


