import java.util.Scanner;
public class PemainBola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <2; i++);
        System.out.print("masukkan nama tim");
        String namaTim = sc.nextLine();
        System.out.println("masukkan nama anggota");
        for(int j=0; j<2; j++){
            System.out.println(j+ ".");
            String namaAnggota = sc.nextLine();
        }
    }
    
}
