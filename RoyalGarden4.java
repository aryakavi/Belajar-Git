public class RoyalGarden4 {

    static int[][] stockBunga = {{10, 5, 15, 7}, {6, 11, 9, 12},  {2, 10, 10, 5},  {5, 7, 12, 9} };
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.printf("%-15s | %-15s | %-15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("====================================================");
        tampilkanPendapatanDanStatus();
    }

    public static void tampilkanPendapatanDanStatus() {
        for (int i = 0; i < stockBunga.length; i++) {
            long pendapatan = 0;

            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += (long) stockBunga[i][j] * hargaBunga[j];
            }

            String status;
            if (pendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.printf("%-15s | Rp %-13d | %-15s\n", namaCabang[i], pendapatan, status);
        }
        System.out.println("====================================================");
    }
}