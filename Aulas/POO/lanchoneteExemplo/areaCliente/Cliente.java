package Aulas.POO.lanchoneteExemplo.areaCliente;

public class Cliente {
    private void escolherLanche() {
        System.out.println("ESCOLHENDO O LANCHE");
    }
    public void fazerPedido() {
        escolherLanche();
        System.out.println("FAZENDO O PEDIDO");
    }
    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("PAGANDO A CONTA");
    }
    private void consultarSaldoAplicativo() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }

    //Esse metodo n deve existir pois já temos o atendente:
    /*public void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCÃO");
    }*/
}