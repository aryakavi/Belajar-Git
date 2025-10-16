import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner Sahroni = new Scanner(System.in);

        int Anggaran_tetap = 5800000;
        int Biaya_konsumsi = 75000;
        int Honorarium_juri = 75000;
        int Biaya_pendaftaran = 50000;
        int Total_keperluan;
        double Dana_polinema = 0.6;
        double Sponsorship, Pembiayaan_polinema; 

        System.out.println("Masukkan jumlah tim");
        int Kuda = Sahroni.nextInt();
        
        Total_keperluan = Anggaran_tetap + ((Biaya_konsumsi + Honorarium_juri + Biaya_pendaftaran)* Kuda);
        Pembiayaan_polinema = Total_keperluan - (Total_keperluan*Dana_polinema);
        Sponsorship = Total_keperluan - Pembiayaan_polinema;

        System.out.println(Sponsorship);

        

        
    }
    
}
