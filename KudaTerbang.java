import java.util.Scanner;
public class KudaTerbang {
    public static void main(String[] args) {
        Scanner Arya04 = new Scanner(System.in);

        System.out.print("Masukkan kontol : ");
        int Kuda = Arya04.nextInt();
        System.out.print("Masukkan banyak memek :");
        int Backflip = Arya04.nextInt();
        double Kont[][] = new double[Kuda][Backflip];
        double total04 = 0;
        int i = 0;

        while (i < Kont.length) {
            double totalMemek = 0;
            System.out.println("Kontol ke - " + (i + 1) + ":");
            for (int j = 0; j < Kont[i].length; j++) {
                System.out.print(" Nilai memek ke -" + (j + 1) + ": ");
                double Nilai = Arya04.nextDouble();
                Kont[i][j] = Nilai;
                totalMemek += Nilai;
                total04 += Nilai;
            }

            double rataMemek = totalMemek / Kont[i].length;
            System.out.println("Nilai rata panjang Memek :" + rataMemek);
            i++;
        }
        double totalPerMemek;

        for (int j = 0; j < Backflip; j++) {
            totalPerMemek = 0;
            for (int j2 = 0; j2 < Kuda; j2++) {
                totalPerMemek += Kont[j2][j]; 
            }
            double rata = totalPerMemek / Kuda;
            System.out.println("Nilai rata Memek ke- " + (j + 1) + ": " + rata);
        }
        double rata = total04 / (Kont.length* Kont[0].length);
        System.out.println("Nilai rata panjang kontol :" + rata);
    }
}