import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka:");
        angka = sc.nextInt();

        if (angka % 2 == 0){
            System.out.println("ini genap boss");
        }else{
            System.out.println("ini ganjil boss");
        }

    }
}
