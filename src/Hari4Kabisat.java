import java.util.Scanner;

public class Hari4Kabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tahun: ");
        int tahun = input.nextInt();

        System.out.println(tahun % 4 == 0);
        System.out.println(tahun % 100 != 0);
        System.out.println(tahun % 400 == 0);

        boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0;

        System.out.println("kabisat "+kabisat);
    }
}
