package Aulas.POO;
//Imagine que está escrito Jogador no lugar de Classes.
public class Classes {
    public static void main(String[] args) {

        int num = 0;
        //Desse jeito o num++ é um pós incremento;
        //Desse jeito o ++num é um pré incremento
        Classes2 jog1 = new Classes2(++num);
        Classes2 jog2 = new Classes2(++num);

        //Isso só pode ser feito pois o num está declarado como public na Classe.
        jog1.num=10;
        jog2.num=5;
        System.out.printf("%n%d", jog1.num);
        System.out.printf("%n%d", jog2.num);

        jog1.ganharVida(3);





    }
    
}