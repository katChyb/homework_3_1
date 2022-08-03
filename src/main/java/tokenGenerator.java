import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tokenGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide Token size: 5, 10, 15");
        int tokenSize = scanner.nextInt();
        List<Character> token = new ArrayList<>();


        switch (tokenSize) {
            case 5 -> addToTable(token, tokenSize);
            case 10 -> addToTable(token, tokenSize);
            case 15 -> addToTable(token, tokenSize);
            default -> System.out.println("You have selected a token size not included in the list, please try again.");
        }
    }
    public static void addToTable(List<Character> token, int tokenSize) {
        for (int i = 0; i < tokenSize; i++) {
            char signASCI;
            Random number = new Random();  // stworzenie obiektu klasy random
            int los = number.nextInt(126) + 33;  // losowanie liczby z zakresu i przypisianie do zmiennej całkowitej
            signASCI = Character.valueOf((char) los);  // zamiana int (numer ASCII na char z tablicy ASCII)
            token.add(signASCI);
        }
        System.out.println("Your token is: " + token);

    }
}
