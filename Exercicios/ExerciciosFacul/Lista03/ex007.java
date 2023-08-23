package Exercicios.ExerciciosFacul.Lista03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex007 {
    public static void main(String[] args) {
        JDialog dialog = new JDialog((Dialog) null, "Cálculo de desconto:", true);
        JPanel frame = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new java.awt.Insets(5, 5, 5, 5);
        JLabel label1 = new JLabel("Digite um número: ");
        JTextField field = new JTextField(10);
        JButton button = new JButton("Checar");
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
                    int n1 = Integer.parseInt(field.getText());
                    String result="aa";
                    int cont=0;
                    for(int n=2;n<n1;n++){
                        if(n1%n==0){
                            cont++;
                            break;
                        }
                    }
                    if(cont==0){
                        result = "é Primo";
                    }else{
                        result = "não é primo";
                    }

                    label2.setText(String.format("Resultado: %d %s", n1,result));
                    field.setText("");

                } catch (NumberFormatException ex) {
                    label2.setText("Resultado: Erro");
                }
            }
        });

        field.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                label2.setText("Resultado:");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });

        dialog.add(frame);
        dialog.setSize(400, 300); // Ajustando tamanho da janela
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);



    }
}
