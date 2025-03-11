import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("podaj liczbę: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("liczba dodatnia");
        } else if (number < 0) {
            System.out.println("liczba ujemna");
        } else {
            System.out.println("liczba = 0");
        }
        scanner.close();
    }
}
