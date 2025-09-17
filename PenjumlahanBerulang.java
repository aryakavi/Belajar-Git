import java.util.Scanner;

public class PenjumlahanBerulang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan angka : ");
        int angka1 = sc.nextInt();
        System.out.print("masukan angka : ");
        int angka2 = sc.nextInt();

        int hasil = 0;
        for (int i = 0; i < angka2; i++) {
            hasil += angka1;
        }
        System.out.println("Hasil penjumlahan berulang: " + hasil);
        sc.close();
    }
    
}
