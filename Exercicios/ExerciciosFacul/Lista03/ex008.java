package Exercicios.ExerciciosFacul.Lista03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex008 {
    private static int n = 0;
    private static float soma = 0;

    public static void main(String[] args) {
        float[] array = new float[100000];
        
        JDialog dialog = new JDialog((Dialog) null, "Cálculo de desconto:", true);
        JPanel frame = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new java.awt.Insets(5, 5, 5, 5);
        JLabel label1 = new JLabel("Digite um número: ");
        JTextField field = new JTextField(10);
        JButton button = new JButton("Adicionar");
        JLabel label2 = new JLabel("Resultado:");
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.EAST;
        frame.add(label1, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        frame.add(field, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        frame.add(button,constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.WEST;
        frame.add(label2,constraints);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float n1 = Float.parseFloat(field.getText());
                    
                    if (n1 != 0 && n < array.length) {
                        array[n] = n1;
                        soma += n1;
                        n++;
                        label2.setText("Valor adicionado: " + n1);
                    } else if (n1 == 0) {
                        float media = n > 0 ? soma / n : 0; 
                        label2.setText(String.format("Média dos valores: %.2f", media));
                        n = 0;
                        soma = 0;
                    } else {
                        label2.setText("Array cheio ou valor inválido");
                    }
                    
                    field.setText("");
                } catch (NumberFormatException ex) {
                    label2.setText("Resultado: Erro");
                }
            }
        });

        dialog.add(frame);
        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
