package ExerciciosFacul.Lista_1;

import javax.swing.JOptionPane;

public class Ex006 {
        public static void main(String[] args) {
        float n1,result;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número em metros: ", "Primeiro número:",JOptionPane.QUESTION_MESSAGE));

        result=n1*100;

        JOptionPane.showMessageDialog(null,String.format("O medida que você digitou em centímetros é: %.2f cm, e em milímetros é: %.2f mm", result, result*10), "Resultado: ", JOptionPane.DEFAULT_OPTION);
    }

}
