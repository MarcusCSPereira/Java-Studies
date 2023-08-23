import javax.swing.JOptionPane;

public class eX006{
    public static void main(String[] args) {
        
        String resp="Reprovado";
        
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma nota:", "OK para continuar", JOptionPane.QUESTION_MESSAGE));

        if(x>7){
            resp="Aprovado";
        }
            
        JOptionPane.showMessageDialog(null, String.format("O aluno está %s, nota: %d", resp,x), null, JOptionPane.PLAIN_MESSAGE);
    }

}