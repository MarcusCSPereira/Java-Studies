package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome completo (primeiro e último nome): ");
        String fullName = scanner.nextLine();
        scanner.close();
        String[] nomes = fullName.split(" ");
        nomes[0] = nomes[0].substring(0, 1).toUpperCase() + nomes[0].substring(1);
        nomes[1] = nomes[1].toUpperCase();
        String nomeformatado = String.join(" ", nomes);
        System.out.println(nomeformatado);


    }
} 
