package Exercicios.ExerciciosFacul.Lista04;

import javax.swing.JOptionPane;

public class exercicio003 {
    public static void main(String[] args) {
        String msg="",gsm="",resp="não é um palindromo";
    
        msg = JOptionPane.showInputDialog(null, "Digite sua mensagem" , null, JOptionPane.QUESTION_MESSAGE);
        gsm = new StringBuilder(msg).reverse().toString();
        if(msg.equals(gsm)){
            resp="é um palindromo";
        }
        JOptionPane.showMessageDialog(null, String.format("A sua String %s", resp), null, JOptionPane.PLAIN_MESSAGE);
    }
}
