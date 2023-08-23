import javax.swing.JOptionPane;

public class eX001{
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para ver se ele é positivo ou negativo: ", "OK para continuar", JOptionPane.QUESTION_MESSAGE));

        String resp = "igual a zero";
        if(n>0){
            resp="positivo";
        }else if(n<0){
            resp="negativo";
        }

        JOptionPane.showMessageDialog(null, String.format("O número %d é %s ", n, resp), null, JOptionPane.PLAIN_MESSAGE);
    }
}