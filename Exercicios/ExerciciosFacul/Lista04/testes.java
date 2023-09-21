package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String subnome="";
        String email = "@example.com.br";
        System.out.println("Digite seu nome completo");
        String nome = scan.nextLine();
        nome.replaceAll("\\s+"," ");
        String[] partes = nome.toLowerCase().trim().split(" ");
        for(String p: partes){
            subnome+=p.charAt(0);
        }
        System.out.println(subnome + email);
        scan.close();
    }
}
