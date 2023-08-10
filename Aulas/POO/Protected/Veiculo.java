package Aulas.POO.Protected;

public class Veiculo {
    //Pode ser usado o protected, e ele pode ser chamado em classes herdadas ou classes no mesmo package.
    protected String nome;
    protected int tipo;
    
    //construtor da SuperClasse:
    public Veiculo(String nome, int tipo){
        this.nome=nome;
        this.tipo=tipo;
    }

    //metodo da superclass:
    public void info(){
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Tipo: %d%n", this.tipo );
    }
    
}
