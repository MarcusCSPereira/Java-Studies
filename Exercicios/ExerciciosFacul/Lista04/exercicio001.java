package Exercicios.ExerciciosFacul.Lista04;

import javax.swing.JOptionPane;

public class exercicio001{
    public static void main(String[] args) {
        int cont;
        String x= JOptionPane.showInputDialog(null, "Digite uma string", null, JOptionPane.QUESTION_MESSAGE);

        for(cont=0;cont<x.length();cont++){
        }
        JOptionPane.showMessageDialog(null, String.format("O número de letras na String: %s foi de: %d", x,cont), null, JOptionPane.PLAIN_MESSAGE);

    }
}