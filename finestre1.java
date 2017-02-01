

package finestre1;
import java.util.Scanner;


public class Finestre1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i=0;
        
        int num;
        
        do {
            System.out.println("Inserire il numero di finestre da generare: ");
            num = input.nextInt();
        }
        while(num<=0);
        
        Finestra f1;
        
        do {
            i=i+1;
            f1 = new Finestra();
            f1.testo.setText("Sono la finestra "+i);
            f1.setVisible(true);
        }
        while(i<num);
    }
    
}
