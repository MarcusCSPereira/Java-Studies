package Calculadora;

public class Numero {
    
    private double valor;
    private String opc ="";

    public Numero(){
        this.valor=0;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor=valor;
    }

    public void setOpc(String opc){
        this.opc=opc;
    }

    public String getOpc(){
        return this.opc;
    }
}
