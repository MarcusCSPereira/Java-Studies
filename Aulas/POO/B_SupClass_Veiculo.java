package Aulas.POO;

public class B_SupClass_Veiculo {
    private String nome;
    private int tipo;
    
    //construtor da SuperClasse:
    public B_SupClass_Veiculo(String nome, int tipo){
        this.nome=nome;
        this.tipo=tipo;
    }

    //metodo da superclass:
    public void info(){
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Tipo: %d%n", this.tipo );
    }
    
}
