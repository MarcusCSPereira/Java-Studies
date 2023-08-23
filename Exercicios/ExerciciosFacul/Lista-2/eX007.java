import javax.swing.JOptionPane;

public class eX007{
    public static void main(String[] args) {
        
        String resp="Entrada inválida";
        
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma coordenada X:", "OK para continuar", JOptionPane.QUESTION_MESSAGE));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma coordenada Y:", "OK para continuar", JOptionPane.QUESTION_MESSAGE));

        if(x>0 && y>=0){
            resp="1\u00BA Quadrante";
        }else if(x<0 && y >=0){
            resp="2\u00BA Quadrante";
        }else if(x<0 && y<0){
            resp="3\u00BA Quadrante";
        }else if(x>0 && y<0){
            resp="4\u00BA Quadrante";
        }else if(y==0 && x==0){
            resp="Na Origem";
        }
            
        JOptionPane.showMessageDialog(null, String.format("O quadrante que a coordenada (%d,%d) está é o: %s", x,y, resp), null, JOptionPane.PLAIN_MESSAGE);
    }

}