import javax.swing.JOptionPane;

public class eX003{
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "OK para continuar", JOptionPane.QUESTION_MESSAGE));
        
        if(n1%2==0){
            JOptionPane.showMessageDialog(null, String.format("O número %d é par",n1), null, JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, String.format("O número %d é ímpar", n1), null, JOptionPane.PLAIN_MESSAGE);
        }
        


    }
}