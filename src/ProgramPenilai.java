import java.util.Scanner;

public class ProgramPenilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else if (nilai >= 90) {
            System.out.println("A");
        } else if (nilai >= 80) {
            System.out.println("B");
        } else if(nilai >=  70){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
