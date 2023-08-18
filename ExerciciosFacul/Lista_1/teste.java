package ExerciciosFacul.Lista_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teste {
    public static void main(String[] args) {
        JDialog dialog = new JDialog((Dialog) null, "Digite os números", true);
        JPanel panel = new JPanel(new GridLayout(7, 2));
        JTextField field1 = new JTextField();
        JButton calculateButton = new JButton("Calcular Média");
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JLabel resultLabel = new JLabel("Resultado: ");
        JLabel errorLabel = new JLabel("");


        panel.add(new JLabel("Primeiro número:"));
        panel.add(field1);

        panel.add(new JLabel("Segundo número:"));
        panel.add(field2);

        panel.add(new JLabel("Terceiro número:"));
        panel.add(field3);

        panel.add(new JLabel(""));
        panel.add(new JLabel(""));

        panel.add(new JLabel(""));
        panel.add(calculateButton);

        panel.add(resultLabel);
        panel.add(errorLabel);


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float n1 = Float.parseFloat(field1.getText());
                    float n2 = Float.parseFloat(field2.getText());
                    float n3 = Float.parseFloat(field3.getText());

                    float media = (n1 + n2 + n3) / 3;

                    resultLabel.setText(String.format("Resultado: %.2f", media));
                    errorLabel.setText("");  // Limpar mensagem de erro
                } catch (NumberFormatException ex) {
                    errorLabel.setText("Digite números válidos em todos os campos.");
                }
            }
        });


        dialog.add(panel);
        dialog.setSize(400, 300);  // Definindo o tamanho da janela (largura x altura)
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
