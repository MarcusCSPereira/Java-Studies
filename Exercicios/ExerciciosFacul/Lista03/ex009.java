package Exercicios.ExerciciosFacul.Lista03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex009 {
    public static void main(String[] args) {
        JDialog dialog = new JDialog((Dialog) null, "Contagem de Letras Maiúsculas:", true);
        JPanel frame = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new java.awt.Insets(5, 5, 5, 5);
        JLabel label1 = new JLabel("Digite uma frase:             ");
        JTextField field = new JTextField(20);
        JButton button = new JButton("Contar Maiúsculas");
        JLabel label2 = new JLabel("Número de letras maiúsculas: ");
        
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
                    String frase = field.getText();
                    int countMaiusculas = 0;
                    
                    for (int i = 0; i < frase.length(); i++) {
                        char letra = frase.charAt(i);
                        if (Character.isUpperCase(letra)) {
                            countMaiusculas++;
                        }
                    }
                    
                    label2.setText("Número de letras maiúsculas: " + countMaiusculas);
                    
                } catch (Exception ex) {
                    label2.setText("Erro ao contar maiúsculas");
                }
            }
        });

        dialog.add(frame);
        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
