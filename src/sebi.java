import java.util.Scanner;

public class sebi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceți un număr (mărimea array-ului): ");
        int num = sc.nextInt();
        System.out.print("Introduceți numărul care va fi căutat în array: ");
        int numSearch = sc.nextInt();

        int[] numere = new int[num];

        for (int i = 0; i < numere.length; i++) {
            System.out.print("Scrieți numărul "+ (i + 1) + ": ");
            int numar = sc.nextInt();
            numere[i] = numar;
        }

        int counter = 0;
        for (int i : numere) {
            if (i == numSearch) {
                counter++;
            }
        }
        System.out.printf("Numărul %d apare de %d ori", numSearch, counter);

    }
}


