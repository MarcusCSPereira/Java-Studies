package Exercicios.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
        try{
            
            Numero n1 = new Numero();
            Numero n2 = new Numero();
            Numero opc = new Numero();
            Numero res = new Numero();
            
            System.out.printf("%nDigite a operacao a ser feita [+] [-] [x] [/] : ");
            opc.setOpc(scan.nextLine());
            System.out.printf("Digite o valor 1: ");
            n1.setValor(scan.nextDouble());
            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scan.nextDouble());

            switch(opc.getOpc()){
                case "+":
                    res.setValor(n1.getValor()+n2.getValor());
                    System.out.printf("%nO resultado é %f + %f = %f", n1.getValor(),n2.getValor(),res.getValor());
                break;
                case "-":
                    res.setValor(n1.getValor()-n2.getValor());
                    System.out.printf("%nO resultado é %f - %f = %f", n1.getValor(),n2.getValor(),res.getValor());
                break;
                case "x":
                    res.setValor(n1.getValor()*n2.getValor());
                    System.out.printf("%nO resultado é %f x %f = %f", n1.getValor(),n2.getValor(),res.getValor());
                break;
                case "/":
                    res.setValor(n1.getValor()/n2.getValor());
                    System.out.printf("%nO resultado é %f / %f = %f", n1.getValor(),n2.getValor(),res.getValor());
                break;
                default :
                    System.out.println("Voce digitou a operacao errada");
                break;
            }
        }finally{
            scan.close();
        }
    }
}
