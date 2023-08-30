package Exercicios.ExerciciosFacul.Lista04;

import javax.swing.JOptionPane;

public class exercicio002 {
    public static void main(String[] args) {
        
        String msg="";
    
        msg = JOptionPane.showInputDialog(null, "Digite sua mensagem" , null, JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, String.format("A sua String invertida é: %s", new StringBuilder(msg).reverse().toString()), null, JOptionPane.PLAIN_MESSAGE);
    }
}
