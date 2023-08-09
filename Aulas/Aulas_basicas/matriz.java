package Aulas.Aulas_basicas;
import java.security.SecureRandom;

public class matriz {
    public static void main(String[] args) {
    
    final int linhas=20;
    final int colunas=20;
    int[][] numeros = new int[linhas][colunas];

    for(int l=0; l < linhas;l++){
        for(int c=0; c < colunas; c++){
            numeros[l][c] = new SecureRandom().nextInt(100)+1;
        }
    }
    for(int l=0; l < linhas;l++){
        for(int c=0; c < colunas; c++){
            System.out.printf("| %3d ", numeros[l][c]);
        }
        System.out.printf(" |%n");
    }

    System.out.println();

    for(int[] n : numeros){
        for(int v:n){
            System.out.printf("%3d |", v);
        }
        System.out.println();
    }

 }
}
