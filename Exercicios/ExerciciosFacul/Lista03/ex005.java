package ExerciciosFacul.Lista03;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class ex005 {
    public static void main(String[] args) {
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JTextField field1 = new JTextField();


        panel.add(new JLabel("Digite o número para calcular o fatorial dele:")); panel.add(field1);

        String[] option={"Calcular", "Cancelar"};
        int r=0;
        int result = JOptionPane.showOptionDialog(null, panel, "Digite os números",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, option[0]);

        if (result == JOptionPane.OK_OPTION) {
            int n1 = Integer.parseInt(field1.getText());
                r=n1;  
            
            while(n1>1){
                r = r*(n1-1);
                n1--;
            }

            
        }
        JOptionPane.showMessageDialog(null, String.format("o Fatorial desse numero é: %d", r),"Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
