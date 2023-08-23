package ExerciciosFacul.Lista_1;

import javax.swing.JOptionPane;

public class Ex003 {
        public static void main(String[] args) {
        float n1,result;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite uma temperatura em Celsius", "Temperatura",JOptionPane.QUESTION_MESSAGE));


        result = (1.8f*n1) + 32;

        JOptionPane.showMessageDialog(null,String.format("Essa temperatura em Farenheit é: %.1f", result), "Resultado: ", JOptionPane.DEFAULT_OPTION);

    }

}
