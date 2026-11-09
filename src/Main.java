import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Umur: ");
        double umur = input.nextDouble();
//        input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.println(nama + " umur " + umur);

        System.out.println(-2 % 2 ==0);
    }
}