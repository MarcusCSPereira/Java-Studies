package Exercicios.SerVivo;

public interface SerVivo {
    
    /*atributo da interface
    public boolean vivo=true;
    */
    //metodos obrigatorios declarados na interface
    public void mover();
    public void comer(Vegetal vegetal,int massa, int peso);
    public void atacar(Animal defensor);
    public void info();
}
