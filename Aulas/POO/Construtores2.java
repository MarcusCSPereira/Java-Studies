package Aulas.POO;

public class Construtores2 {
    public static void main(String[] args) {
        
        //instanciando o objeto com o contrutor padrão:
        Construtores p1 = new Construtores();
        p1.nome = "Caneta Azul";
        p1.marca = "Mercur";
        p1.valor = 1.50f;

        //instanciando objeto com outros construtores:
        Construtores p2 = new Construtores("Caneta vermelha", "Faber");
        p2.valor = 1.75f;

        Construtores p3 = new Construtores("Caneta Preta", "Bic", 1.89f);

        //objeto p1:
        System.out.printf("A %s da marca %s custa: %f%n",p1.nome,p1.marca,p1.valor);
        //objeto p2:
        System.out.printf("A %s da marca %s custa: %f%n",p2.nome,p2.marca,p2.valor);
        //objeto p3:
        System.out.printf("A %s da marca %s custa: %f%n",p3.nome,p3.marca,p3.valor);

    }
}
