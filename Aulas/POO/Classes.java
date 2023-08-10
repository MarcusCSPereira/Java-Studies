package Aulas.POO;
//Imagine que está escrito Jogador no lugar de Classes.
public class Classes {
    public static void main(String[] args) {

        //aqui voce consegue entender o uso de static nos atributos*
        System.out.printf("%nAlerta:%s%n%n", Classes2.alerta ? "Sim" : "Não");

        //Desse jeito o num++ é um pós incremento;
        //Desse jeito o ++num é um pré incremento
        int num = 0;
        Classes2 jog1 = new Classes2(++num);
        //Classes2 jog2 = new Classes2(++num);
        
        //aqui voce consegue entender o uso de static nos atributos*
        System.out.printf("%nAlerta:%s%n%n", Classes2.alerta ? "Sim" : "Não");
        System.out.printf("Numero de Jogadores: %d%n ", Classes2.qtdJogadores);


        //Isso só pode ser feito pois o num está declarado como public na Classe.
        /*jog1.num=3;
        jog2.num=3;
        System.out.printf("%n%d", jog1.num);
        System.out.printf("%n%d", jog2.num);
        */

        //Metodo get e set
        System.out.println("\nO jogador 1 possui " + jog1.getVidas() + " vida(s)\n" );
        
        jog1.setVidas(1);
        jog1.setVidas(1);
        jog1.setVidas(1);
        jog1.setVidas(-2);
        jog1.setVidas(-1);





    }
    
}