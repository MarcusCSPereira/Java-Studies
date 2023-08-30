package Exercicios.ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome completo (primeiro e último nome): ");
        String fullName = scanner.nextLine();

        String formattedName = formatName(fullName);
        
        System.out.println("Nome formatado: " + formattedName);
        scanner.close();
    }

    public static String formatName(String fullName) {
        String[] nameParts = fullName.split(" ");
        
        StringBuilder formattedName = new StringBuilder();

        for (int i = 0; i < nameParts.length; i++) {
            String part = nameParts[i];
            if (i > 0) {
                formattedName.append(" ");
            }

            if (i == nameParts.length - 1) {
                formattedName.append(part.toUpperCase()); // Último nome em maiúsculas
            } else {
                formattedName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1).toLowerCase()); // Primeira letra em maiúsculas, restante em minúsculas
            }
        }

        return formattedName.toString();
    }
}
