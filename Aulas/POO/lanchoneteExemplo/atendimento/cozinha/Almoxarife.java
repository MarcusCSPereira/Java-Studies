package Aulas.POO.lanchoneteExemplo.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }
    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        //só o almoxarife precisa desse acesso, porém ele é necessário de ser executado.
        controlarEntrada();
        controlarSaida();
    }
    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}