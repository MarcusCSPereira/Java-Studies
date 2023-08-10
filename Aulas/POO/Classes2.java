package Aulas.POO;

//Imagine que está escrito Jogador no lugar de Classes.
public class Classes2 {

    /*atributos, é importante colocar modificadores de acesso a essas variaveis sendo eles: public= posso modificar ou acessar o valor desse atributo de fora da classe ou private = posso modificar ou acessar esse valor apenas dentro da classe.*/
    private final int maxVidas=3;
    public int num=0;
    private int vidas=1;
    static boolean alerta = false;
    static int qtdJogadores=0;


    //metodo contrutor necessário sempre.
    public Classes2(){
        System.out.println("Jogador Criado");
    }

    //metodo get: obter valores de uma var nas classes:
    public int getVidas(){
        return this.vidas;
    }

    //metodo set: Atribuir valor a uma variavel private:
    public void setVidas(int vidas){
        if(this.vidas >= maxVidas && vidas > 0){
            this.vidas=maxVidas;
            System.out.printf("Voce ja possui o numero maximo de vidas que é %d, logo voce ganhou uma moeda de credito extra%n",maxVidas);
        }else if(vidas < 0){
            vidas*=-1;
            this.vidas-=vidas;
            System.out.printf("Voce perdeu %d vida(s), agora voce so possui: %d vidas%n",vidas, this.vidas);
            if(this.vidas <= 0){
            System.out.printf("Voce nao tem mais vidas: %d, portanto voce morreu%n",this.vidas);
            }
        }else{
            this.vidas+=vidas;
            System.out.printf("Voce ganhou uma vida agora voce possui: %d%n", this.vidas);
        }
    }
    

    //novo construtor.
    //o vidas está em outro escopo por isso n dá conflito
    public Classes2(int num1){
        System.out.printf("Jogador %d Criado%n",num1);
        alerta=true;
        qtdJogadores++;
        
    }

    /*public void ganharVida(int vidas){
        this.vidas=vidas;
        vidas++;
        System.out.println("Voce possui: " + vidas + " vidas");
    }*/


    

}
