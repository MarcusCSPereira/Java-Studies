import javax.swing.JOptionPane;

public class eX004{
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: ", "OK para continuar", JOptionPane.QUESTION_MESSAGE));
        
        if(n1>0 && n1 <10){
            JOptionPane.showMessageDialog(null,"Criança", null, JOptionPane.PLAIN_MESSAGE);
        }else if(n1>=10 && n1 < 18){
            JOptionPane.showMessageDialog(null,"Adolescente", null, JOptionPane.PLAIN_MESSAGE);
        }else if(n1>=18 && n1 < 50){
            JOptionPane.showMessageDialog(null,"Adulto", null, JOptionPane.PLAIN_MESSAGE);
        }else if(n1>=50 && n1>=100){
            JOptionPane.showMessageDialog(null,"Idoso", null, JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "idade inválida", null, JOptionPane.PLAIN_MESSAGE);
        }
        


    }
}