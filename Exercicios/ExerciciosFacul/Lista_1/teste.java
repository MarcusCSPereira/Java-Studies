package ExerciciosFacul.Lista_1;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Ex002 {
    public static void main(String[] args) {
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();

        panel.add(new JLabel("Primeiro número:")); panel.add(field1);
        panel.add(new JLabel("Segundo número:")); panel.add(field2);
        panel.add(new JLabel("Terceiro número:")); panel.add(field3);

        String[] option={"Calcular", "Cancelar"};
        int result = JOptionPane.showOptionDialog(null, panel, "Digite os números",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, option[0]);

        if (result == JOptionPane.OK_OPTION) {
            float n1 = Float.parseFloat(field1.getText());
            float n2 = Float.parseFloat(field2.getText());
            float n3 = Float.parseFloat(field3.getText());

            float media = (n1 + n2 + n3) / 3;

            JOptionPane.showMessageDialog(null, String.format("A média dos números é: %.2f", media),
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    
        }
    }
}

