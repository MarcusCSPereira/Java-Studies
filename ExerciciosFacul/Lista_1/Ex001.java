package ExerciciosFacul.Lista_1;

import javax.swing.JOptionPane;

public class Ex001 {
    public static void main(String[] args) {
        
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Primeiro número:",JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número", "Segundo número",JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null,"A Soma dos dois números é: " + (n1+n2), "Resultado: ", JOptionPane.DEFAULT_OPTION);
    }

} 
