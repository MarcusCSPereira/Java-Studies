package Aulas;
public class comandDecis{

    public static void main(String[] args){
        // == > < >= <= != ! && || (true entra no if / entra no false)
        int nota=60, nota1=100;
        String res;

        res=(nota1 >= nota ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);
        //Dessa forma consigo imprimir com variave sem o usar o prf

        if(nota1 > nota){
            System.out.printf("A nota: %d é maior que a nota: %d%n",nota1, nota);
        }
            System.out.print("Fim do progama");
            switch(nota1){
                case 10: case 20: case 30:
                    System.out.println("Reprovado");
                    break;
                case 100:
                    System.out.println("Aprovado");
                    break;
                default:
                    System.out.println("Recuperacao");

            }
    }
    
}
