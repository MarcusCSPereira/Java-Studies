package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio005 {
    public static void main(String[] args) {
        String teste;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua mensagem com espaços em excesso:");
        teste = scan.nextLine();
        String[] partes = teste.split(" ");
        System.out.println(partes.length);
        int corte = partes.length -1;
        System.out.println(corte);
        String output = partes[corte].toUpperCase() + ", ";

        for(int i =0;i<partes.length-1;i++){
            output+= partes[i].charAt(0) + ". ";
        }
        System.out.println(output.toUpperCase());


        scan.close();
    }
}

