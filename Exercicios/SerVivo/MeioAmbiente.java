package SerVivo;

public class MeioAmbiente {
    public static void main(String[] args) {
        
        //Animal a1 = new Animal();
        Sapo s1 = new Sapo(10,10,10);
        Aranha a1 = new Aranha(5, 5, 5, 3);
        Formiga f1 = new Formiga(2, 2, 0);
        Vegetal alga = new Vegetal("alga",2,1);
        Vegetal folha = new Vegetal("folha",1,0);
        Vegetal morango = new Vegetal("morango" ,4,4);
        
        f1.info();
        a1.info();
        s1.info();

        f1.comer(folha,folha.getMassa(),folha.getPeso());
        f1.comer(morango,morango.getMassa(),morango.getPeso());
        a1.atacar(f1);
        s1.comer(alga,alga.getMassa(), alga.getPeso());
        a1.atacar(s1);






    }
}
