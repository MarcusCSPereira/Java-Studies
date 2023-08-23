package ExerciciosFacul.Lista_1;

import javax.swing.JOptionPane;

public class Ex007 {
        public static void main(String[] args) {
        float n1,n2,result;
        int h,m,s;

        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a distância que você vai percorrer em Km:", "Primeiro número:",JOptionPane.QUESTION_MESSAGE));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a velocidade média em Km/h", "Segundo número",JOptionPane.QUESTION_MESSAGE));
        
        result=n1/n2;
        int controle = (int) result;
        h=controle;
        m=0;
        s=0;

        if(result-controle!=0){
            float c1 = result-controle;
            c1=c1*60;
            controle = (int) c1;
            m = (int) c1;
            if(c1-controle!=0){
                float c2=c1-controle;
                c2=c2*60;
                s = (int) c2;
            }
        }

        JOptionPane.showMessageDialog(null,String.format("O tempo estimado de viagem será de : %d(h) %d(m) %d(s)", h,m,s), "Resultado: ", JOptionPane.DEFAULT_OPTION);    
    }

}
