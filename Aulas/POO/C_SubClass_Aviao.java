package Aulas.POO;

public class C_SubClass_Aviao extends B_SupClass_Veiculo{
    
    private int categoria;

    //construtor da subclasse
    public C_SubClass_Aviao(String nome,int categoria){
        super(nome,10);
        this.categoria=categoria;
    }

    //metodo da subclasse
    public void info(){
        super.info();
        System.out.printf("Categoria: %d%n", this.categoria);
    }
}