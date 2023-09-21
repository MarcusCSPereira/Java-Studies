package JogoDaVelha;

import javax.swing.JOptionPane;

public class TesteDeFormatacao {
    public static void main(String[] args) {
        String[][] jogo = { { "X", "   ", "   " }, { "X", "X", "O" }, { "X", "O", "O" } };
        String mapeamento = "| 1 | 2 | 3 |\n| 4 | 5 | 6 |\n| 7 | 8 | 9 |";
        imprime(jogo, mapeamento);
    }

    public static void imprime(String[][] jogo,String mapeamento){
        String total="";
        for(String[] n:jogo){
            total+="| ";
            for(String v:n){
                total+= v + " | ";
            }
            total+="\n";
        }
        JOptionPane.showMessageDialog(null,total + " \n\n" +mapeamento, "Sla",JOptionPane.INFORMATION_MESSAGE);
    }
}