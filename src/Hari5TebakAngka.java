import java.util.Scanner;

public class Hari5TebakAngka {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int rahasia = (int) (Math.random() * 100) + 1;
        ;
        int tebakan = -1;
        int jumlahTebakan = 0;
        System.out.println("rahasia " + rahasia);

        while (tebakan != rahasia) {
            System.out.print("Tebak angka ");
            tebakan = inp.nextInt();

            jumlahTebakan++;

            if (tebakan > rahasia) {
                System.out.println("terlalu besar");
            } else if (tebakan < rahasia) {
                System.out.println("terlalu kecil");
            } else {
                System.out.println("bener kmu menebak " + jumlahTebakan + " kali");
            }
        }
    }
}
