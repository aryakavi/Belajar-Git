import java.util.Scanner;
public class Bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;

        System.out.println("Masukkan umur anda :");
        umur = input.nextInt();

        if (umur<17) {
            System.out.println("Harga 30000");
        } else { 
            System.out.println("Anda member?");
        
        boolean member=input.nextBoolean();

            if (member) {
                System.out.println("Harga 45000"); 
            } else {
                System.out.println("Harga 50000");
            }
        }
    }
}
