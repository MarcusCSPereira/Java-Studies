package Aulas.POO.Protected;

public class Aviao extends Veiculo{
    
    protected int categoria;

    //construtor da subclasse
    public Aviao(String nome,int categoria){
        super(nome,10);
        this.categoria=categoria;
    }

    //metodo da subclasse
    public void info(){
        super.info();
        System.out.printf("Categoria: %d%n", this.categoria);
    }
}