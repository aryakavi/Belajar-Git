import java.util.Scanner;
public class PraktikumPemilihan4 {
 public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc04.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc04.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc04.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc04.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || 
            uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
            
        } else {
            double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.40 * uas);
            String nilaiHuruf;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf :" + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");

            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("MAAF ANDA TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
    }
}
   