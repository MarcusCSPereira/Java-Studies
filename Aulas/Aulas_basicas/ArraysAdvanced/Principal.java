package Aulas.Aulas_basicas.ArraysAdvanced;

public class Principal {
    public static void main(String[] args) {
        
     //Carro[] carros;
     final int numcar=5;
     Carro[] carros=new Carro[numcar];
     String[] modelosCarros={"Mercedez","Golf","Camaro","Mustang","Jetta"};

     /*manualmente:
     carros[0]=new Carro("Mercedez");
     carros[1]=new Carro("Golf");
     carros[2]=new Carro("Camaro");
     carros[3]=new Carro("Mustang");
     carros[4]=new Carro("Jetta");*/

     //inicializar o array carros-> voce usa esse for para preencher o array;
     for(int i=0;i< carros.length; i++){
        carros[i]=new Carro(modelosCarros[i]);
     }
    
     //imprimir carros;
     for(Carro c:carros){
        c.info();
     }


    }
}
