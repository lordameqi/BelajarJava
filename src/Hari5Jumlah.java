import java.util.Scanner;

public class Hari5Jumlah {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan n ");
        int a = inp.nextInt();

        int total = 0;
        for (int i = 0; i <= a; i++) {
            total += i;


        }
        System.out.println("Jumlah 1 sampai " + a + " = " + total);
    }
}
