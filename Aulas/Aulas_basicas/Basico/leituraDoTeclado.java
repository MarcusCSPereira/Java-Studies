package Aulas.Aulas_basicas.Basico;
import java.util.Scanner;

public class leituraDoTeclado {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
   try{ 

    int n1=0,n2=0,res=0;
    String nome="";
    //final double pi = 3.14; forma de declarar constante

    System.out.println("Digite seu nome: ");
    nome=scan.nextLine();
    System.out.println("Seu nome é " + nome);

    System.out.println("Digite um numeral: ");
    n1=scan.nextInt();
    System.out.println("Digite outro numeral: ");
    n2=scan.nextInt();

    res=n1+n2;

    System.out.printf("Soma de %d com %d é igual a: %d%n",n1,n2,res);

    }finally {
        scan.close();
    }
  }
}
