package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        String subString;
        String subStringreverse="";

        System.out.println("Digite o indice do começo da substring: ");
        int n1=scanner.nextInt();
        System.out.println("Digite o indice do fim da substring: ");
        int n2=scanner.nextInt();

        subString = input.substring(n1-1, n2);
        System.out.println(subString);
        for(int i=subString.length()-1;i>=0;i--){
            subStringreverse += subString.charAt(i);
        }

        System.out.println(subStringreverse);

        scanner.close();
    }
}
