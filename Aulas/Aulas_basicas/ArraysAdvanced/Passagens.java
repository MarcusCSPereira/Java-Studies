package Aulas.Aulas_basicas.ArraysAdvanced;

public class Passagens {
    public static void main(String[] args) {
        
        int[] notas = {10,85,62,45,98,78};
        int ap,rp;
        int[] resultado={0,0};
        
        conferirNotas(notas, resultado);
        ap=resultado[0];
        rp=resultado[1];

        System.out.printf("Aprovados: %d%nReporvados: %d%n", ap ,rp);

    }

    public static void conferirNotas(int[] nt, int[] result){
        for(int n:nt){
            if(n>=60){
                result[0]++;
            }else{
                result[1]++;
            }
        }
    }

    //forma errada de fazer
    /*public static void conferirNotas(int[] nt, int a, int r){
        for(int n:nt){
            if(n>=60){
                a++;
            }else{
                r++;
            }
        }
        System.out.printf("Aprovados: %d%nReporvados: %d%n", a,r);
    }*/

}
