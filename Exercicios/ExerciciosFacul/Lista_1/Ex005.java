package ExerciciosFacul.Lista_1;

import javax.swing.JOptionPane;

public class Ex005 {
        public static void main(String[] args) {
        float n1,n2,result;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu peso (KG):", "Massa:",JOptionPane.QUESTION_MESSAGE));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a sua altura (m):", "Segundo número",JOptionPane.QUESTION_MESSAGE));

        result=n1/pow(n2, 2);
        
        //ou eu uso Math.pow, mas tem que ser em double;

        JOptionPane.showMessageDialog(null,String.format("O seu IMC é: %.2f", result), "Resultado: ", JOptionPane.DEFAULT_OPTION);
    }

        public static float pow(float n2, int indice) {
            for(int i=1;i<indice;i++){
                n2*=n2;
            }
            return n2;
        }

}
