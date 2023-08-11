package Exercicios.SerVivo;

public class Vegetal {
    
    private int massa;
    private int peso;
    private String nome;

    public Vegetal(String nome,int massa, int peso){
        this.massa = massa;
        this.peso=peso;
        this.nome=nome;
    }
    
    public int getMassa(){
        return this.massa;
    }
    public String getNome(){
        return this.nome;
    }
    public int getPeso(){
        return this.peso;
    }

    public void info(){
        System.out.println("---------------------------------------------");
        System.out.printf("Massa do vegetal: %d%n ", this.massa);
        System.out.println("---------------------------------------------");
    }
}
