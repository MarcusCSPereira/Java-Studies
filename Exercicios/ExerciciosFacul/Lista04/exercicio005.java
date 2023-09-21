package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio005 {
    public static void main(String[] args) {
        String teste;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua mensagem com espaços em excesso:");
        teste = scan.nextLine();
        String substring = teste.substring(2);
        System.out.println(substring);

        StringBuilder builder = new StringBuilder(teste);
        String testeInvertido = builder.reverse().toString();
        System.out.println(testeInvertido);

        teste = teste.replaceAll("\\s+", " ");
        System.out.println(teste);
        scan.close();
    }
}

