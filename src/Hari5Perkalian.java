import java.util.Scanner;

public class Hari5Perkalian {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan angka perkalian ");
        int b = a.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(b + " x " + i + " = " + (b * i));
        }
    }
}
