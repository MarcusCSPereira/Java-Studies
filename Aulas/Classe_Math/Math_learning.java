package Aulas.Classe_Math;

public class Math_learning {
    public static void main(String[] args) {
        
        System.out.printf("Valor mínimo: %d%n",Math.min(1, 0));

        System.out.printf("Valor maior: %d%n",Math.max(0, 1));

        System.out.printf("Raiz Quadrada do número: %.1f%n", Math.sqrt(9));

        System.out.printf("Usando o metódo abs: %d%n", Math.abs(-4));

        System.out.printf("Valor aleatório gerado pelo método random: %d%n",(int)(Math.random()*10));

        System.out.printf("Potencia:%f%n", Math.pow(3, 2));

        System.out.printf("Valor do cosseno a partir de um angulo: %.1f%n",Math.cos(Math.toRadians(60)));

        System.out.printf("Valor do angulo a partir do cosseno: %.1f%n",Math.toDegrees(Math.acos(0.5)));

        System.out.printf("Valor arredondado sempre pra cima %.1f%n",Math.ceil(1.4));

        System.out.printf("Valor arredondado sempre pra baixo %.1f%n",Math.floor(1.8));

        System.out.printf("Valor arredondado corretamente %.1f%n",(double)(Math.round(1.5)));

    }
} 
