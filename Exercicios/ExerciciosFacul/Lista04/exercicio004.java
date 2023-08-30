package Exercicios.ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio004 {
    public static void main(String[] args) {
        String x ="";
        char c;
        int cont=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma String:");
        x=scan.nextLine();

        for(int i=0;i<x.length();i++){
            c=x.toLowerCase().charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                cont++;
            }
        }

        System.out.println(cont);
        scan.close();
    }
}
