package ExerciciosFacul.Lista03;
import java.util.*;

public class ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero:");
        n1=scan.nextInt();
        for(int i=0;i<=10;i++){
            System.out.printf("%d x %d = %d %n",n1,i,n1*i);
        }
        scan.close();
    }
}
