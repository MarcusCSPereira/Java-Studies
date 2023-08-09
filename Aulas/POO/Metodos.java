package Aulas.POO;

public class Metodos{
    public static void main(String[] args) {
        
        nome();
        msg("Ai Calica");
        System.out.println("\n" + soma(10,20));
        System.out.println(soma2(10, 20, 30, 40));
        System.out.println(soma2(10.5f, 20f, 30.6f, 40.7f));

    }
    /*método sem parametros definidos, trato os numeros passados como parametro usando uma lista de valores.*/
    public static int soma2(int... numeros){
        int res=0;

        for(int n:numeros){
            res+=n;
        }
        return res;
    }
    // Sobrecarga de metodos, eu uso outro tipo de parametro:
    public static float soma2(float... numeros){
        float res = 0.0f;
        for(float n:numeros){
            res+=n;
        }
        return res;
    }

    //isso é um método.
    public static void nome(){
        System.out.println("Cesinha");
    }

    public static void msg(String mensagem){
        System.out.printf("A msg é: %s",mensagem);
    }

    public static int soma(int n1, int n2){
        return n1+n2;
    }

}