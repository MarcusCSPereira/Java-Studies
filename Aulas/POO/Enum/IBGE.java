package Aulas.POO.Enum;

public class IBGE {
    public static void main(String[] args) {

        //Forma de imprimir toda a listagem do Enum
        for(EstadosBr e : EstadosBr.values()){
            System.out.println(e.getNome() + " " + e.getSigla());
        }

        //Obtendo os objetos do enum:
        EstadosBr e = EstadosBr.BAHIA;
        System.out.println(e.getNomeMaiusculo());
    }
}
