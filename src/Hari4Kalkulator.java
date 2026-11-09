import java.util.Scanner;

public class Hari4Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Operator (+ - * /): ");
        String op = input.next();


        System.out.print("Angka kedua: ");
        double b = input.nextDouble();

        if (op.equals("+")) {
            System.out.println("Hasil: " + (a + b));
        } else if (op.equals("-")) {
            // isi sendiri
            System.out.println("Hasil: " + (a - b));
        } else if (op.equals("*")) {
            // isi sendiri
            System.out.println("Hasil: " + (a * b));
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Tidak bisa dibagi 0");
            } else {
                System.out.println("Hasil: " + (a / b));
            }
            // cek dulu: kalau b == 0, cetak pesan. Kalau tidak, cetak a / b
        } else {
            // operator tidak dikenal
            System.out.println("Operator tidak dikenal");
        }
    }
}
