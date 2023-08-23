
import javax.swing.JOptionPane;

public class eX005{
    public static void main(String[] args) {
        char opc;
        String resposta = "consoante";
        opc = JOptionPane.showInputDialog(null,"Digite um caractér do alfabeto:", null, JOptionPane.QUESTION_MESSAGE).charAt(0);

        switch(opc){
            case 'a':case 'A':case 'e':case 'E':case 'i':case 'I':case 'o':case 'O':case 'u':case 'U':
                resposta = "vogal";
                break;
            default :
            resposta = "consoante";
            break;
        }

        JOptionPane.showMessageDialog(null, String.format("Esse carácter é: %s", resposta), null, JOptionPane.PLAIN_MESSAGE);

    }
}