package ExerciciosFacul.Lista03;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ex006 {
    public static void main(String[] args) {
        for(int i = 1; i<=10;i++){
            for(int c = 1; c<=10;c++){
                System.out.printf("%d x %d = %d%n",i,c,i*c);
            }
            System.out.println();
        }

    }
}
