import java.util.Scanner;
public class BarisKolomSegitigaSikuInput {
    public static void main(String[] args) {
        Scanner sahroni = new Scanner(System.in);

        System.out.println("masukkan baris :");
        int baris = sahroni.nextInt();


        for(int i = 0; i<baris; i++){
            for(int j = 0; j<i; j++){
                System.out.print("sahroni");

            }
            System.out.println();
        }

}
    
}
