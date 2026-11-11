public class Hari5 {
    public static void main(String[] args) {
//        for (int i = 0; i < +5; i++) {
//            System.out.println("putran ke i " + i);
//        }

//        int hitung = 1;
//        while (hitung <= 3) {
//            System.out.println("Hitung: " + hitung);
//            hitung--;
//        }

        for (int i = 1; i <= 10; i++) {
            if (i == 3) break;   // lewati putaran ini
            if (i == 6) continue;      // hentikan loop sepenuhnya
            System.out.println(i);
        }
    }
}
