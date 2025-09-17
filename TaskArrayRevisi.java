import java.util.Scanner;
public class TaskArrayRevisi {

    
    public static void main(String[] args) {
    
        Scanner Jaran = new Scanner(System.in);
        String[] Sahroni = new String[4];
    
        for (int i = 0; i < 4; i++) {
            System.out.print("input jeneng konco sampeyan: ");
            Sahroni [i] = Jaran.nextLine();
        }

        for (int i = 0; i < Sahroni.length; i++){
            System.out.println("konco sekitar: " +Sahroni[i]);
        }

    }
}
