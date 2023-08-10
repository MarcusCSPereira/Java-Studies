package Aulas.POO;

public class Heranca1 {
    public static void main(String[] args) {
        
        //criacao de objetos com a classe pai
        Heranca2 c1 = new Heranca2("Mercedez");
        Heranca2 c2 = new Heranca2("Golf");
        //criacao de objetos com a classe filho
        Heranca3 c3 = new Heranca3("Tanque Alemão", 50, 10);
        Heranca3 c4 = new Heranca3("Mini Tanque", 15, 10);
        
        //usando metodos da classe filho:
        for(int i=0;i< 10;i++){
            c3.atirar();
            c4.sofrerDano(1);
        }
        c3.atirar();
        c4.atirar();


        //info() da classe pai:
        c1.info();
        c2.info();
        //info() da classe filho:
        c3.info();
        c4.info();


    }
}
