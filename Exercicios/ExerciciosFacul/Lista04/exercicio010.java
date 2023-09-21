package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio010 {
    public static void main(String[] args) {
        String nome;
        String email="@empresa.com.br";
        Scanner scan = new Scanner(System.in);
        String prefixoEmail="";

        System.out.println("Digite seu nome:");
        nome=scan.nextLine();

        String[] part = nome.split(" ");
        for(String p:part){
            prefixoEmail+=p.toLowerCase().charAt(0);
        }
            System.out.println(prefixoEmail.concat(email));
            scan.close();
    }
}
