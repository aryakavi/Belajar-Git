import java.util.Scanner;
public class JadwalKuliahMhs4 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        int n = input.nextInt();
        input.nextLine(); 
        String[][] jadwal = new String[n][4];
        inputData(jadwal);
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        tampilkanSemua(jadwal);
        System.out.print("\nCari jadwal berdasarkan HARI: ");
        String cariHari = input.nextLine();
        tampilkanBerdasarkanHari(jadwal, cariHari);
        System.out.print("\nCari jadwal berdasarkan NAMA MATA KULIAH: ");
        String cariMatkul = input.nextLine();
        tampilkanBerdasarkanMatkul(jadwal, cariMatkul);
    }

    public static void inputData(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nInput Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            data[i][0] = input.nextLine();
            System.out.print("Ruang            : ");
            data[i][1] = input.nextLine();
            System.out.print("Hari             : ");
            data[i][2] = input.nextLine();
            System.out.print("Jam Kuliah       : ");
            data[i][3] = input.nextLine();
        }
    }

    public static void tampilkanSemua(String[][] data) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-15s | %-10s | %-15s |\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("| %-20s | %-15s | %-10s | %-15s |\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("---------------------------------------------------------------------------");
    }

    public static void tampilkanBerdasarkanHari(String[][] data, String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][2].equalsIgnoreCase(hari)) {
                System.out.println("- " + data[i][0] + " (" + data[i][3] + ") di " + data[i][1]);
                found = true;
            }
        }
        if (!found) System.out.println("Tidak ada jadwal.");
    }

    public static void tampilkanBerdasarkanMatkul(String[][] data, String matkul) {
        System.out.println("\nDetail Mata Kuliah " + matkul + ":");
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equalsIgnoreCase(matkul)) {
                System.out.println("Hari: " + data[i][2] + ", Jam: " + data[i][3] + ", Ruang: " + data[i][1]);
                found = true;
            }
        }
        if (!found) System.out.println("Mata kuliah tidak ditemukan.");
    }
}