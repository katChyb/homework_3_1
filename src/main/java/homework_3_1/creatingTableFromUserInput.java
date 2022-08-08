package homework_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class creatingTableFromUserInput {


    public static void main(String[] args) {

        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int userSize =numberToGuess.getNumberFromUser();
        int i = 0;
        int[] numbersTable = new int[userSize];
        System.out.println("Please provide numbers to populate the array");

       addingToTable(userSize,i,numbersTable);
// do wyjasnienia wynik dla awerage i max
        System.out.println("Your table size is: " + userSize + "  Your table is: " + Arrays.toString(numbersTable) );
        System.out.println("Your table average is: " + Arrays.stream(numbersTable).average().getAsDouble());
        System.out.println("Your table Max. is: " + Arrays.stream(numbersTable).max().getAsInt());
        }

    public static int[] addingToTable(int userSize, int i, int numbersTable[]) {

        for (i = 0; i < userSize; i++) {
            int userNumbers = numberToGuess.getNumberFromUser();
            numbersTable[i] = userNumbers;
        }
        return numbersTable;
    }
}


