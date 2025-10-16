import java.util.Scanner;
public class Nilai{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Pancasila4, Daspro4, Bing4, AVERAGE;

        System.out.print("Masukkan nilai Pancasila : ");
        Pancasila4 = sc.nextInt();
        System.out.print("Masukkan nilai Dasar pemrograman : ");
        Daspro4 = sc.nextInt();
        System.out.println("Masukkan nilai Bahasa Inggris");
        Bing4 = sc.nextInt();

        AVERAGE = (Daspro4+Pancasila4)/2;
        System.out.println("Nilai rerata : "+ AVERAGE);

        if (AVERAGE>80&&AVERAGE<=100){
            System.out.print("Nilai Akhir : A \n kualifikasi : Sangat Baik");
        } else if (AVERAGE>73&&AVERAGE<=80){
            System.out.print("Nilai Akhir : B+ \n kualifikasi : Lebih dari Baik");
        } else if (AVERAGE>65&&AVERAGE<=73){
            System.out.print("Nilai Akhir : B \n kualifikasi :  Baik");
        } else if (AVERAGE>60&&AVERAGE<=65){
            System.out.print("Nilai Akhir : C+ \n kualifikasi : Lebih Dari Cukup");
        } else if (AVERAGE>50&&AVERAGE<=60){
            System.out.print("Nilai Akhir : C \n kualifikasi : cukup");
        } else if (AVERAGE>0&&AVERAGE<=49){
            System.out.print("Nilai Akhir : E \n kualifikasi : Gagal");
        }else 
            System.out.print("Nilai Akhir : HAH!? \n kualifikasi : HAH!?");

    }
}