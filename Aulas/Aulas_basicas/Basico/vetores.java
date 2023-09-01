package Aulas.Aulas_basicas.Basico;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in); 
    try{
      char[] gabarito ={'a','a','d','b','c'};
      char[] respostas = new char[gabarito.length];
      int nota=0;
    
      for(int i=0; i < respostas.length; i++){
        System.out.printf("Informe a resposta da questao: %d%n", i+1);
        respostas[i]= scan.nextLine().charAt(0);
      }

      for(int i=0;i < gabarito.length; i++){
        if(respostas[i] == gabarito[i]){
            nota++;
        }
      }
     System.out.printf("%nA nota do aluno foi: %d%n", nota);

      //int[] num= new int[5];
      int[] numeros ={10,20,30,40};
      
      for(int cont=0;cont < numeros.length; cont++){
        System.out.printf("Valor do array na posicao %d : %d%n",cont, numeros[cont]);
        }

    }finally {
      scan.close();
    }
  }
}
