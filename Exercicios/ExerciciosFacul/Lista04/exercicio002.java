package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio002 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String msg="";
        String gsm="";
        System.out.println("Digite uma mensagem: ");
        msg = scan.nextLine();

        for(int i = msg.length()-1;i>=00;i--){
            gsm += msg.charAt(i);
        }
        scan.close();
        System.out.printf("Sua String invertida é: %s%n",gsm);
        

    }
}
