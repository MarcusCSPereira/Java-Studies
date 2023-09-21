package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String input = scanner.nextLine();

        String[] words = input.split(" "); // Dividindo a frase em palavras

        System.out.println("Palavras individuais:");
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}
