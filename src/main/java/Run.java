import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc Tokena: 5, 10, 15");
        int rozmiar = scanner.nextInt();
        List<Character> token = new ArrayList<>();


    switch (rozmiar) {
           case 5 :
               for (int i = 0; i < rozmiar; i++) {
                   char znakASCI;
                   Random liczba = new Random();  // stworzenie obiektu klasy random
                   int los = liczba.nextInt(126)+33;  // losowanie liczby z zakresu i przypisianie do zmiennej całkowitej

                   //  System.out.println(los);                // wylosowana liczba int

                   znakASCI = Character.valueOf((char) los);  // zamiana int (numer ASCII na char z tablicy ASCII)
                   //   System.out.println(znakASCI);// wyświetlenie tej losowej liczby
                   token.add(znakASCI);
               }
               System.out.println("Twoj token to:" + token);
           break;
        case 10 :
            for (int i = 0; i < rozmiar; i++) {
                char znakASCI;
                Random liczba = new Random();// stworzenie obiektu klasy random
                int los = liczba.nextInt(256)+33;// losowanie liczby z zakresu i przypisianie do zmiennej całkowitej


                //  System.out.println(los);                // wylosowana liczba int

                znakASCI = Character.valueOf((char) los);  // zamiana int (numer ASCII na char z tablicy ASCII)
                //   System.out.println(znakASCI);// wyświetlenie tej losowej liczby
                token.add(znakASCI);
            }
            System.out.println("Twoj token to:" + token);
            break;
        case 15 :
            for (int i = 0; i < rozmiar; i++) {
                char znakASCI;
                Random liczba = new Random();  // stworzenie obiektu klasy random
                int los = liczba.nextInt(126)+33;  // losowanie liczby z zakresu i przypisianie do zmiennej całkowitej

                //  System.out.println(los);                // wylosowana liczba int

                znakASCI = Character.valueOf((char) los);  // zamiana int (numer ASCII na char z tablicy ASCII)
                //   System.out.println(znakASCI);// wyświetlenie tej losowej liczby
                token.add(znakASCI);
            }
            System.out.println("Twoj token to:" + token);
            break;
        default:
            System.out.println("Wybrałes rozmiar tokena spoza listy, sprobuj jeszcze raz.");

        }


    }


}
