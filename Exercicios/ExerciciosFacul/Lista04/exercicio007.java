package Exercicios.ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        System.out.println("Digite o indice do começo da substring: ");
        int n1=scanner.nextInt();
        System.out.println("Digite o indice do fim da substring: ");
        int n2=scanner.nextInt();

        String sub = input.substring(n1-1, n2);
        System.out.printf("A sua Substring invertida é: %s", new StringBuilder(sub).reverse().toString());
        scanner.close();

    }
}
