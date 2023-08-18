package ExerciciosFacul.Lista_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex004 {
    public static void main(String[] args) {
        JDialog dialog = new JDialog((Dialog) null, "Cálculo de desconto:", true);
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5); // Margens entre os componentes

        JButton gerar = new JButton("Calcular");
        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);
        JLabel resultado = new JLabel("Valor do produto com desconto:");
        JLabel desconto = new JLabel("Valor do desconto:");
        JLabel erro = new JLabel("");

        // Configurações para os campos de entrada
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Digite o Valor do produto:"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(field1, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Digite o desconto (%):       "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(field2, constraints);

        // Configurações para o botão "Calcular"
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(gerar, constraints);

        // Configurações para a exibição do resultado
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(resultado, constraints);

        // Configurações para a exibição do desconto
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(desconto, constraints);

        // Configurações para a exibição de erro
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(erro, constraints);

        gerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float n1 = Float.parseFloat(field1.getText());
                    float n2 = Float.parseFloat(field2.getText());

                    float result = n1 - (n1 * n2 / 100);
                    n1 = n1 * n2 / 100;
                    resultado.setText(String.format("Valor do produto com desconto: %.2f", result));
                    desconto.setText(String.format("Valor do desconto: %.2f", n1));
                    erro.setText(""); // Limpar mensagem de erro

                } catch (NumberFormatException ex) {
                    resultado.setText("Erro");
                    erro.setText("Digite números válidos");
                }
            }
        });

        dialog.add(panel);
        dialog.setSize(400, 300); // Ajustando tamanho da janela
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
