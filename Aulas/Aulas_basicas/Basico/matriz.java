package Aulas.Aulas_basicas.Basico;
import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class matriz {
    public static void main(String[] args) {
    
        final int linhas=10;
        final int colunas=10;
        int[][] numeros = new int[linhas][colunas];

        for(int l=0; l < linhas;l++){
            for(int c=0; c < colunas; c++){
                numeros[l][c] = new SecureRandom().nextInt(89)+10;
            }
        }

        impMatriz(numeros, linhas, colunas);

        System.out.println();

        for(int[] n : numeros){
            for(int v:n){
                System.out.printf("%3d |", v);
            }
            System.out.println();
        }

    }

    public static void impMatriz(int[][] mtz, int linhas, int colunas){
        
        String saida="";
        
        for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                saida += mtz[l][c] + " | ";
            }
            saida+= "\n";
        }

        JOptionPane.showMessageDialog(null, saida, "Matriz", JOptionPane.WARNING_MESSAGE);
    }
}
