package ExerciciosFacul.Lista_1;

import javax.swing.*;

public class Ex009 {
    public static void main(String[] args) {
       
        JTextField dollarField = new JTextField(10);
        dollarField.setText("$"); // Pré-insere o símbolo "$"

        Object[] message = {
            "Digite a quantia em Dólar que você deseja converter:", dollarField
        };

        int option = JOptionPane.showOptionDialog(
            null,
            message,
            "Conversão de moedas:",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            null,
            null
        );

        if (option == JOptionPane.OK_OPTION) {
            String userInput = dollarField.getText().replace("$", "");
            float n1 = Float.parseFloat(userInput);

            Object[] moedas = {"Real", "Euro", "Libra esterlina"};
            
            Object result = JOptionPane.showInputDialog(null, "Escolha para qual moeda você quer converter: ", "Moedas", JOptionPane.INFORMATION_MESSAGE, null, moedas, moedas[0]);

            float convers = 0;
            switch(result.toString()) {
                case "Real":
                    convers = n1 * 4.97f;
                    break;
                case "Euro":
                    convers = n1 * 0.92f;
                    break;
                case "Libra esterlina":
                    convers = n1 * 0.79f;
                    break;
                default:
                    break;
            }

            JOptionPane.showMessageDialog(null, String.format("O valor convertido é: %.2f %s", convers, result), "Conversão de moedas:", JOptionPane.DEFAULT_OPTION);
        }
    }
}

