package Aulas.POO;
//nesse caso Produto é um "objeto".
public class Construtores{

    //atributos
    String nome;
    String marca;
    float valor;

    //construtores
    Construtores(){
        //esse é o contrutor padrão, se eu n definir ele, eu não vou conseguir usar ele na hora de testar a classe
    }
    Construtores(String nome){
        this.nome=nome;
    }
    Construtores(String nome, String marca){
        this.nome=nome;
        this.marca=marca;
    }
    Construtores(String nome, String marca, float valor){
        this.nome=nome;
        this.marca=marca;
        this.valor=valor;
    }
}