import java.util.Scanner;

import javax.swing.JOptionPane;

public class eX008{
    public static void main(String[] args) {
        int num, cont=0;
        Scanner scan = new Scanner(System.in);
        String primo="Erro";
        System.out.println("Digite um valor:");
        num = scan.nextInt();

        for(int i=1;i<num;i++){
            if(num==1){
                primo = "é primo";
                break;
            }else if(num == 0){
                primo = "n é primo";
                break;
            }else{
                if(num%i==0){
                    cont++;
                    System.out.println(cont);
                }
            }
    }
        if(cont==1){
            System.out.println("numero primo");
        }else{
            System.out.println("numero n é primo");
        }
    

    }
}