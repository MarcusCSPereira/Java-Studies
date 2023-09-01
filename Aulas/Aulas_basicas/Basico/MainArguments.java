package Aulas.Aulas_basicas.Basico;

import javax.swing.JOptionPane;

public class MainArguments {
    public static void main(String[] args) {
        
        int soma=0;
        if(args.length <=0){
            JOptionPane.showMessageDialog(null, "Sem valores passados", "Argumento: args", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            for(String n:args){
                int v=Integer.valueOf(n);
                soma+=v;
            }
         JOptionPane.showMessageDialog(null, "O resultado desse soma foi: " + soma, "Soma dos argumentos passados em args", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
