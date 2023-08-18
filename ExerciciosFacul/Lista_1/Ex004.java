package ExerciciosFacul.Lista_1;

import javax.swing.JOptionPane;

public class Ex004 {
        public static void main(String[] args) {
        float n1,n2,result;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do produto: ", "Preço:",JOptionPane.QUESTION_MESSAGE));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a porcentagem de desconto:", "Desconto:",JOptionPane.QUESTION_MESSAGE));


        result=n1*(n2/100);

        JOptionPane.showMessageDialog(null,String.format("Você recebeu um desconto de: %.2f $ | e seu produto ficou com o preço de: %.2f $", result, n1-result), "Resultado: ", JOptionPane.DEFAULT_OPTION);
        
    }

}
