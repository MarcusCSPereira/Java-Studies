package ExerciciosFacul.Lista_1;

import javax.swing.JOptionPane;

public class Ex002 {
    public static void main(String[] args) {
        float n1,n2,n3,media;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número", "Primeiro número:",JOptionPane.QUESTION_MESSAGE));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo número", "Segundo número",JOptionPane.QUESTION_MESSAGE));
        n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o terceiro número", "Terceiro número",JOptionPane.QUESTION_MESSAGE));

        media=(n1+n2+n3)/3;;

        JOptionPane.showMessageDialog(null,String.format("A média dos números é: %.2f", media), "Resultado: ", JOptionPane.DEFAULT_OPTION);

    }
}
