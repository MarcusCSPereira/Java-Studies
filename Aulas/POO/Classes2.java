package Aulas.POO;

//Imagine que está escrito Jogador no lugar de Classes.
public class Classes2 {

    /*atributos, é importante colocar modificadores de acesso a essas variaveis sendo eles: public= posso modificar ou acessar o valor desse atributo de fora da classe ou private = posso modificar ou acessar esse valor apenas dentro da classe.*/
    public int num=0;
    private int num1=0;


    //metodo contrutor necessário sempre.
    public Classes2(){
        System.out.println("Jogador Criado");
    }

    //novo construtor.
    //o num1 está em outro escopo por isso n dá conflito
    public Classes2(int num1){
        this.num1=num1;
        System.out.printf("Jogador %d Criado%n",num1);
    }

    public void ganharVida(int num1){
        this.num1=num1;
        num1++;
        System.out.println("Voce possui: " + num1 + " vidas");
    }



    

}
