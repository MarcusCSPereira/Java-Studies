package Exercicios.ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio010 {
    public static void main(String[] args) {
        String nome;
        String email="@empresa.com.br";
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome=scan.nextLine();

        String[] part = nome.split(" ");
        StringBuilder build = new StringBuilder();

        for(String partes: part){
            if(!partes.equals("")){
                build.append(partes.charAt(0));
            }
        }
       
        build.append(email);
        String emailCompleto = build.toString().toLowerCase();
        System.out.println(emailCompleto);
        scan.close();

    }
}
