import java.util.Scanner;
public class BeratAverageSahroni {
    public static void main(String[] args) {
        Scanner Jaran = new Scanner(System.in);
        double[] TinggiSahroni = new double[4];
        double total = 0;

        for (int ireng = 0; ireng < TinggiSahroni.length; ireng++) {
            System.out.print("Lebokkan tinggi ijazah Sahroni ke " + (ireng + 1) + ": ");
            TinggiSahroni[ireng] = Jaran.nextDouble();
            total += TinggiSahroni[ireng];
        }

        double ratarata = total / TinggiSahroni.length;
        System.out.println("Rata-rata dari " + TinggiSahroni.length + " Sahroni: " + ratarata);
    }
}
