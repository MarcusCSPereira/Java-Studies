import javax.swing.JOptionPane;

public class eX002{
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "OK para continuar", JOptionPane.QUESTION_MESSAGE));
        int n2= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "OK para continuar", JOptionPane.QUESTION_MESSAGE));

        if(n1>n2){
            JOptionPane.showMessageDialog(null, String.format("O número %d é maior que o número %d ", n1,n2), null, JOptionPane.PLAIN_MESSAGE);
        }else if(n2>n1){
            JOptionPane.showMessageDialog(null, String.format("O número %d é maior que o número %d ", n2,n1), null, JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, String.format("Os numeros %d e %d são iguais", n1,n2), null, JOptionPane.PLAIN_MESSAGE);
        }
        


    }
}