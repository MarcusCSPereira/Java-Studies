package Exercicios.ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string com espaços em excesso: ");
        String input = scanner.nextLine();

        String result = removeExcessSpaces(input);
        
        System.out.println("String com espaços reduzidos: " + result);
        scanner.close();
    }

    public static String removeExcessSpaces(String str) {
        str = str.trim();  // Remover espaços no início e no final
        str = str.replaceAll("\\s+", " ");  // Substituir múltiplos espaços por um único espaço
        return str;
    }
}
