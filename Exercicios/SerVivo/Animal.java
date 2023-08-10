package Exercicios.SerVivo;

public class Animal implements SerVivo{
    //construtor de animal
    public Animal(){}

    //metodos obrigatorios da interface que a classe implementou
    public void mover() {}

    public void comer(int massa) {}

    public void info() {
        /*System.out.printf("Vivo: %s%n", this.vivo ? "Sim" : "Não");*/
    }

    
}
