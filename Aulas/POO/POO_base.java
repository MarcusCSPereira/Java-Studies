package Aulas.POO;
import java.util.Scanner;
//o POO é uma classe, mas suponha que esta escrito Aluno ai.
//não existe main na classe
public class POO_base {

        //atributos
        String nome;
        String curso;
        int idade;
        int inteligencia, nota,opc=1;

        //metodos
        void assistirAula(){
            //definicao do metodo
            System.out.println("\nVoce assistiu aula, sua inteligencia subiu");
            inteligencia+=10;
        }
        void fazerProva(){
            //definicao do metodo
            nota=inteligencia*2;
        }
        void imprimirNota(){
            System.out.printf("\nSua nota foi : %d%n", nota);
        }

    public static void main(String[] args) {
        
        //Isto pode ser feito no mesmo arquivo ou arquivo separados.
        
        //instanciar o objeto:
        POO_base aluno1 = new POO_base();
        Scanner scan = new Scanner(System.in);

        try{
        
            //declarar valores para atributos:
            System.out.print("Digite o seu nome: ");
            aluno1.nome = scan.nextLine();
            aluno1.idade = 18;
            aluno1.curso = "Ciência da Computação";

            while(aluno1.opc > 0 && aluno1.opc <= 3){
           
                System.out.print("\nDigite uma opção sendo elas -> [1]= ass aula / [2] = fazer prova / [3] = ver nota / : ");
                aluno1.opc = scan.nextInt();
            
                //chamando os metodos:
                switch(aluno1.opc){
                    case 1:
                    aluno1.assistirAula();
                    break;
                    case 2:
                    aluno1.fazerProva();
                    break;
                    case 3:
                    aluno1.imprimirNota();
                    break;
                    default:
                    System.out.println("\nFim do programa");
                break;
            }
        }
    }finally{
        scan.close();
    }
}

}




