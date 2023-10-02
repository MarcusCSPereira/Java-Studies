package Aulas.POO.lanchoneteExemplo;

import Aulas.POO.lanchoneteExemplo.areaCliente.Cliente;
import Aulas.POO.lanchoneteExemplo.atendimento.Atendente;
import Aulas.POO.lanchoneteExemplo.atendimento.cozinha.Almoxarife;
import Aulas.POO.lanchoneteExemplo.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda a aplicação
        //cozinheiro.lavarIngredientes();
        //cozinheiro.baterVitaminaLiquidificador();
        //cozinheiro.selecionarIngredientesVitamina();
        //cozinheiro.prepararLanche();
        //cozinheiro.prepararVitamina();
        //cozinheiro.prepararVitamina();

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda a aplicação
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();

        //ação que somente o seu pacote cozinha precisa conhecer (default)
        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        //ações que não precisam ser visiveis, mas são executadas antes de servir a mesa:
        //atendente.pegarLancheCozinha();

        atendente.servindoMesa();
        atendente.receberPagamento();

        //ação que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        //Feito dentro do metodo antes de fazer pedido:
        //cliente.escolherLanche();

        cliente.fazerPedido();

        //não deveria, pois o estabelecimento tem atendentes:
        //cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa, por isso deve ser privada
        //cliente.consultarSaldoAplicativo();

        cliente.pagarConta();

        //já pensou os clientes ouvindo que o gás acabou ? por isso precisa ser protected:
        //cozinheiro.pedirParaTrocarGas(atendente);
        //cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}