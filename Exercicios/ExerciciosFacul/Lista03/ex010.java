package ExerciciosFacul.Lista03;

import javax.swing.*;

public class ex010 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabuada de Multiplicação (Duas Tabuadas por Linha)");
        JTextArea textArea = new JTextArea(20, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        StringBuilder table = new StringBuilder();

        for (int i = 1; i <= 10; i += 2) {
            for (int j = 1; j <= 10; j++) {
                int result1 = i * j;
                int result2 = (i + 1) * j;
                table.append(i).append(" x ").append(j).append(" = ").append(result1)
                     .append("\t|\t")
                     .append(i + 1).append(" x ").append(j).append(" = ").append(result2)
                     .append("\n");
            }
            table.append("\n");
        }

        textArea.setText(table.toString());
        textArea.setEditable(false);

        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
