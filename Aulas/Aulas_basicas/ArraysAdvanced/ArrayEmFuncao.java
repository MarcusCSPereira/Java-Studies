package Aulas.Aulas_basicas.ArraysAdvanced;

public class ArrayEmFuncao {
    public static void main(String[] args) {
        
        int[] numeros={10,21,30,43,50,44,71};

        parImpar(numeros);

    }

    public static void parImpar(int...num){
        for(int n:num){
            if(n%2==0){
                System.out.printf("O número %d é par%n", n); 
            }else{
                System.out.printf("O número %d é ímpar%n", n);
            }
        }
    } 
}
