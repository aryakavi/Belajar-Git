import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AnalisisNilaiKuliah {

    private static Scanner scanner = new Scanner(System.in);

    static class Mahasiswa {
        String nama;
        List<Integer> nilaiKuliah = new ArrayList<>();

        public Mahasiswa(String nama) {
            this.nama = nama;
        }

        public double hitungRataRata() {
            if (nilaiKuliah.isEmpty()) return 0.0;
            int total = 0;
            for (int nilai : nilaiKuliah) {
                total += nilai;
            }
            return (double) total / nilaiKuliah.size();
        }

        public int cariTertinggi() {
            if (nilaiKuliah.isEmpty()) return 0;
            int max = nilaiKuliah.get(0);
            for (int nilai : nilaiKuliah) {
                if (nilai > max) {
                    max = nilai;
                }
            }
            return max;
        }

        public int cariTerendah() {
            if (nilaiKuliah.isEmpty()) return 0;
            int min = nilaiKuliah.get(0);
            for (int nilai : nilaiKuliah) {
                if (nilai < min) {
                    min = nilai;
                }
            }
            return min;
        }
    }

    public static void bacaDataMahasiswa(List<Mahasiswa> daftarMahasiswa, int jumlahMataKuliah) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();
            
            Mahasiswa mhs = new Mahasiswa(nama);

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai Mata Kuliah ke-" + (j + 1) + " (" + nama + "): ");
                int nilai = scanner.nextInt();
                mhs.nilaiKuliah.add(nilai);
            }
            daftarMahasiswa.add(mhs);
            scanner.nextLine();
        }
    }

    public static void cetakLaporan(List<Mahasiswa> daftarMahasiswa) {
        System.out.println("\nLAPORAN ANALISIS NILAI");
        System.out.println("---------------------------------------------");

        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("Nama: " + mhs.nama);
            
            System.out.print("Nilai Mata Kuliah: ");
            for (int nilai : mhs.nilaiKuliah) {
                System.out.print(nilai + " ");
            }
            System.out.println();
            
            double rataRata = mhs.hitungRataRata();
            int tertinggi = mhs.cariTertinggi();
            int terendah = mhs.cariTerendah();

            System.out.printf("Rata-rata Nilai: %.2f\n", rataRata);
            System.out.println("Nilai Tertinggi: " + tertinggi);
            System.out.println("Nilai Terendah: " + terendah);
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        
        System.out.print("Jumlah mata kuliah yang akan diinput: ");
        int jumlahMataKuliah = scanner.nextInt();

        bacaDataMahasiswa(daftarMahasiswa, jumlahMataKuliah);

        cetakLaporan(daftarMahasiswa);
        
        scanner.close();
    }
}