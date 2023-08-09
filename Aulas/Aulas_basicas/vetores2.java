package Aulas.Aulas_basicas;
import java.util.Arrays;
import java.util.Scanner;

public class vetores2 {
    public static void main(String[] args){
    
    Scanner scan= new Scanner(System.in);
    try{
        final int tam=10;
        int[] num={20,10,50,40,30,60,70,80,90,100};
        int[] numeros= new int[tam];
        int p=0;
        
        //Arrays.sort(num);//ordenacao de array.
        //Arrays.fill(numeros,10);//preencher vetores.
        System.arraycopy(num, 0, numeros,0, tam);//qual vetor,a partir de qual posicao,qual o destino,qual a prmeira posicao do destino, ate qual eu quero copiar.
        //Arrays.equals(num, numeros);//compara 2 arrays retornando um booleano: true-> vetores iguais;
        //Arrays.binarySearch(vetor,elemento): vetor precisar estar ordenado// busca um elemento no vetor.    

        System.out.printf("Arrais sao iguais: %s%n", (Arrays.equals(num, numeros) ? "Sim" : "Não"));

        System.out.print("Digite um valor para pesquisar no vetor:");
        p = scan.nextInt();

        System.out.printf("O elemento %d%s está no vetor.%n", p, (Arrays.binarySearch(num, p) > 0 ? "" : " não"));
        System.out.printf("%d%n", Arrays.binarySearch(num, p));
        
        for(int n:numeros)
            System.out.printf("%d - ", n);//Ele trasforma a variavel n no vetor, começando da primeira posição.

    }finally{
        scan.close();
    }
 }
}
