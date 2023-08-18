package ExerciciosFacul.Lista_1;

import javax.swing.JOptionPane;

public class Ex008 {
    public static void main(String[] args) {
        float n1,n2,salarioB;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o número de horas trabalhadas nesse mês:", "Salário:",JOptionPane.QUESTION_MESSAGE));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da sua hora:", "Salário",JOptionPane.QUESTION_MESSAGE));


        salarioB=n1*n2;

        JOptionPane.showMessageDialog(null,String.format("O seu salário bruto esse mês é: %.2f$", salarioB), "Folha de pagamento: ", JOptionPane.DEFAULT_OPTION);

    }
}
