public class kudanil123{

    public static void main(String[] args) {
        
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            
            int jumlahKuadrat = 0; 
            String teksOutput = ""; 
            
            for (int j = 1; j <= i; j++) {
                
                int kuadrat = j * j; 
                jumlahKuadrat += kuadrat; 

                if (j == 1) {
                    teksOutput = "" + kuadrat; 
                } else {
                    teksOutput = teksOutput + " + " + kuadrat; 
                }
            }
            if (i == 1) {
                System.out.println("n = " + i + " -> jumlah kuadrat = " + jumlahKuadrat);
            } else {
                System.out.println("n = " + i + " -> jumlah kuadrat = " + teksOutput + " = " + jumlahKuadrat);
            }
        }
    }
 }