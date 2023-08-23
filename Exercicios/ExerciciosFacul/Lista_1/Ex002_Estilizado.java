package ExerciciosFacul.Lista_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Ex002_Estilizado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Média");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        JLabel[] labels = new JLabel[]{
            new JLabel("Primeiro número:"),
            new JLabel("Segundo número:"),
            new JLabel("Terceiro número:")
        };

        JFormattedTextField[] fields = new JFormattedTextField[3];
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMaximumFractionDigits(2);

        for (int i = 0; i < fields.length; i++) {
            fields[i] = new JFormattedTextField(format);
            fields[i].setColumns(5);  // Reduzindo o número de colunas para diminuir o tamanho da caixa
            inputPanel.add(labels[i]);
            inputPanel.add(fields[i]);
        }

        JButton calculateButton = new JButton("Calcular Média");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float n1 = ((Number) fields[0].getValue()).floatValue();
                    float n2 = ((Number) fields[1].getValue()).floatValue();
                    float n3 = ((Number) fields[2].getValue()).floatValue();

                    float media = (n1 + n2 + n3) / 3;

                    JOptionPane.showMessageDialog(frame,
                            String.format("A média dos números é: %.2f", media),
                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Digite números válidos em todos os campos.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);

        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setSize(300, 200);  // Definindo o tamanho da janela (largura x altura)
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
