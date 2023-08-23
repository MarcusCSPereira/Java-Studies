package Exercicios.ExerciciosFacul.Lista03;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ex006 {
    public static void main(String[] args) {
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JLabel label = new JLabel("");


        panel.add(label);

        String[] option={"Mostrar", "Cancelar"};
        int[] r = new int[10];
        int n=0, ant=0,num=0;
        int result = JOptionPane.showOptionDialog(null, panel, "Clique para mostrar a sequência",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, option[0]);

        if (result == JOptionPane.OK_OPTION) {
            while(n<10){
                r[n]=num;
                ant=num+ant;
                num++;
                n++;
            }

            label.setText(String.format("A sequencia eh: %d | %d | %d | %d | %d | %d | %d | %d | %d | %d |",r[0],r[1],r[2],r[3],r[4],r[5],r[6],r[7],r[8],r[9] ));
            JOptionPane.showMessageDialog(null, panel,"painel",JOptionPane.PLAIN_MESSAGE);

            
        }
    }
}
