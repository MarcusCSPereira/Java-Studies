package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String teste="";
        int controle=0;
        char caracter=' ';
        System.out.println("Digite ma String:");
        teste = scan.nextLine();       
        System.out.println("Digite um caracter:");
        caracter = scan.nextLine().charAt(0);

        for(int i = 0;i<teste.length();i++){
            if(teste.charAt(i) == caracter){
                controle++;
            }
        }

        scan.close();

        System.out.println(controle);

    }
}
