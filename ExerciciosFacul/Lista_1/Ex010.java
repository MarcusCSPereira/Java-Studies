package ExerciciosFacul.Lista_1;

import javax.swing.JOptionPane;

public class Ex010 {
        public static void main(String[] args) {
        float n1,n2,vm;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a distância percorrida(km):", "Calcúlo de Velocidade Média:",JOptionPane.QUESTION_MESSAGE));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o tempo gasto em horas nesse percuso:", "Calcúlo de Velocidade Média:",JOptionPane.QUESTION_MESSAGE));

        vm=n1/n2;

        JOptionPane.showMessageDialog(null,String.format("A sua velocidade média aproximada nesse percuso foi de: %.2f (km/h)", vm), "Calcúlo de Velociade Média:", JOptionPane.DEFAULT_OPTION);

    }
}