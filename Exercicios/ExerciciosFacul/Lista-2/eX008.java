import javax.swing.JOptionPane;

public class eX008{
    public static void main(String[] args) {
        
        String resp="Entrada inválida";
        
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um lado do triângulo:[maior que 0]", "OK para continuar", JOptionPane.QUESTION_MESSAGE));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um lado do triângulo:[maior que 0]", "OK para continuar", JOptionPane.QUESTION_MESSAGE));
        int z = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um lado do triângulo:[maior que 0]", "OK para continuar", JOptionPane.QUESTION_MESSAGE));

        if(x==y && y==z){
            resp="Equilátero";
        }else if(x==y || x==z || y==z && x!=0 && y!=0 && z != 0){
            resp="Isocéles";
        }else if(x !=y && y!=z && z!=x && x!=0 && y!=0 && z != 0){
            resp="Escaleno";
        }else if(x==0 || y==0 || z == 0){
            resp="Não existe, pois lado = 0";
        }
            
        JOptionPane.showMessageDialog(null, String.format("O triângulo é classificado como: %s",resp), "Resposta", JOptionPane.PLAIN_MESSAGE);
    }

}