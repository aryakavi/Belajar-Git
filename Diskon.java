import java.util.Scanner;
public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode :");
        String diskon = input.nextLine();

        if (diskon.equalsIgnoreCase("DISKON20")){
            System.out.println("DISKON 20%");
        } else if (diskon.equalsIgnoreCase("DISKON10")){
            System.out.println("DISKON 10%");
        } else if (diskon.equalsIgnoreCase("DISKON5")){
            System.out.println("DISKON 5%");
        } else {System.out.println("KODE TIDAK VALID");
    }
    
}

}

