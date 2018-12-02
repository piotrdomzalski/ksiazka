import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isOver;
        int bookCounter = 0;
        Books[] book = new Books[10];

        Scanner inputBook = new Scanner(System.in);
        System.out.println("Dodaj nowa ksiazke");

        do {
            book[bookCounter] = new Books();

            System.out.print("Autor: ");
            book[bookCounter].setAutor(inputBook.nextLine());
            System.out.print("Tytul: ");
            book[bookCounter].setTytul(inputBook.nextLine());
            System.out.print("Opis: ");
            book[bookCounter].setOpis(inputBook.nextLine());
            System.out.print("iloscStron: ");
            book[bookCounter].setIloscStron(inputBook.nextInt());
            System.out.println("Czy chcesz dodac kolejna pozycje? (y/n)");
            isOver = inputBook.next().equals("n");

            bookCounter++;
            inputBook.nextLine();
        } while (!isOver);

        for (int i = 0; i < bookCounter; i++) {
            System.out.println(book[i]);
        }


        System.out.println("good bye!");
        inputBook.close();
    }
}
