package Aulas.Interfaces;

import javax.swing.JOptionPane;


public class Joption_pane {
    public static void main(String[] args) {
        
        int n2=0;

        Object[] items = {10,20,30};


        String nome= JOptionPane.showInputDialog(null, "Qual seu nome: ", "Entrada", JOptionPane.QUESTION_MESSAGE);
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero: "));
        
        JOptionPane.showMessageDialog(null,"Seu nome é: "+ nome + " e o numero que vc digitou foi: " + n1, "Saída", JOptionPane.INFORMATION_MESSAGE);

        do{
            n2 =(JOptionPane.showConfirmDialog(null, "Voce quer sair do loop: ", "Sim ou Não? ", JOptionPane.YES_NO_OPTION));
            JOptionPane.showMessageDialog(null, "O resultado da sua decisão anterior foi: "+n2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }while(n2!=0);

        Object valor = JOptionPane.showInputDialog(null,"Escolha um item","Opçao",JOptionPane.INFORMATION_MESSAGE,null,items, items [0]);

        JOptionPane.showMessageDialog(null, "Valor escolhido: "+valor, "Escolhido", JOptionPane.INFORMATION_MESSAGE);


    

    }
}
