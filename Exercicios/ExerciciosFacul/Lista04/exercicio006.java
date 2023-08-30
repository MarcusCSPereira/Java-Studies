package Exercicios.ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        System.out.print("Digite a letra que deseja contar: ");
        char letter = scanner.next().charAt(0);
        
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == letter) {
                count++;
            }
        }
        
        System.out.println("A letra '" + letter + "' aparece " + count + " vezes na string.");
        scanner.close();
    }
}
