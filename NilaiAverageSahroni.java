import java.util.Scanner;
public class NilaiAverageSahroni {
    public static void main(String[] args) {
    
        Scanner Jaran = new Scanner(System.in);
        int[] IjazahSahroni = new int[10];
        int total = 0;
    
        for (int ireng = 0; ireng < IjazahSahroni.length; ireng++) {
            System.out.print("Lebokkan nilai ijazah Sahroni ke " +(ireng+1) + ": " );
            IjazahSahroni [ireng] = Jaran.nextInt();
            total += IjazahSahroni [ireng];
        }

        double ratarata = total/IjazahSahroni.length;
        System.out.println("Rata-rata dari 10 Sahroni: " +ratarata);

    }
}
