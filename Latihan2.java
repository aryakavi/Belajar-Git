import java.util.Scanner;
class Latihan2 {
    public static void main(String[] args) {
        Scanner Sahroni = new Scanner(System.in);
        
        int BiayaPerHalaman = 200;
        int HardCover = 20000;
        int BeratCover = 250;
        int Packaging = 300;
        int BiayaPengiriman = 15000;
        double BeratKertas = 3;
        double BeratBarangBefore;
        int BeratBarangAfter;

        System.out.println("Masukkan jumlah halaman buku :");
        int HalamanBuku = Sahroni.nextInt();

        BeratBarangBefore = BeratCover + Packaging + (BeratKertas*((HalamanBuku +1)/2));
        BeratBarangAfter = ((int)BeratBarangBefore + 999) / 1000;
        int BiayaPengirimanTotal = BiayaPengiriman * BeratBarangAfter;
        int BiayaPembuatanBuku = HardCover + (BiayaPerHalaman * HalamanBuku);
        int TotalHarga = BiayaPembuatanBuku + BiayaPengirimanTotal;

        System.out.println(" Total yang harus anda bayarkan" +TotalHarga);



    }
}
