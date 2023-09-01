package Aulas.Aulas_basicas.Basico;
public class AloMundo{
    public static void main(String[] args){
        
        int num=15, num1=15, res=0;
        String nome="Marcus César";
        char opc='o';
        double duplo=1.50;
        res = num+num1;
        
        /*É importante declarar as variaveis com algum valor nelas
        /Aqui aprendemos os tipos de print/Temos a ideia de formatacao em que definimos o tipo da impressão sendo ela %f: float %d: int e etc o \n pode ser usando dentro dos prints, porem na formatacao do printf se utiliza o %n*/

        System.out.printf("%d%n", res);
        System.out.print("Alo mundo\n");
        System.out.println("Hello World");
        System.out.printf("Nome %s%nAno: %d%n","Cesinha",2023);
        System.out.printf("Valor da variavel num: %d%n%s", num, nome);
        System.out.printf("Valor da variavel num: %c%n",opc);
        System.out.printf("Valor da variavel num: %f%n",duplo);

    }
}