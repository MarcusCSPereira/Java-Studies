package ExerciciosFacul.Lista04;

import java.util.Scanner;

public class exercicio003 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String msg="";
        String gsm="";
        System.out.println("Digite uma mensagem: ");
        msg = scan.nextLine();

        for(int i = msg.length()-1;i>=0;i--){
            gsm += msg.charAt(i);
        }
        scan.close();
        if(gsm.equals(msg)){
            System.out.println("É um palindromo");
        }else{
            System.out.println("Não é um palindromo");
        }
        System.out.printf("Sua String invertida é:%s%n",gsm);
        

    }
}
