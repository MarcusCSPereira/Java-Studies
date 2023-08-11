package Aulas.Aulas_basicas.ArraysAdvanced;

public class Carro {
    
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;
    private static int carros=0;

    public Carro(String nome){
        this.nome=nome;
        this.ligado=false;
        this.destruido=false;
        this.blindagem=0;
        this.armamento=false;
        carros++;
    }

    public String getNome(){
        return this.nome;
    }
    public Boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(Boolean ligado){
        this.ligado=ligado;
    }
    public Boolean getDestruido(){
        return this.destruido;
    }
    public void setDestruido(Boolean destruido){
        this.destruido=destruido;
    }
    public Boolean getArmamento(){
        return this.armamento;
    }
    public void setArmamento(Boolean armamento){
        this.armamento=armamento;
    }
    public int getBlindagem(){
        return this.blindagem;
    }
    public void setBlindagem(int blindagem){
        this.blindagem=blindagem;
    }
    public void sofrerDano(int dano){
        this.blindagem-=dano;
        if(this.blindagem<=0){
            this.blindagem=0;
            this.ligado=false;
            this.destruido=true;
        }
    }
    public void info(){
        System.out.println("---------------------------------");
        System.out.printf("O nome desse carro é: %s%n", this.nome);
        System.out.printf("Ligado: %s%n",this.ligado ? "Sim" : "Não");
        System.out.printf("Destruido: %s%n", this.destruido ? "Sim" : "Não");
        System.out.printf("Blindagem: %d%n", this.blindagem);
        System.out.printf("Armamento: %s%n", this.armamento ? "Sim" : "Não");
        //mesmo sendo private, como é static eu n preciso do this.
        System.out.printf("Quantidade de Carros criados: %d%n", carros);
    }

}

