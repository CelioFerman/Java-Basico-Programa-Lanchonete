package Lanchonete;

import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.Atendente;
import Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        //Ações que estabelecimento precisa ter ciencia.
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();

        //Ações que somente o seu pacote cozinha precisa conhecer
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento
        //ainda não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        //esta ação é muito sigiloza, que tal ser privada?
        cliente.consultarSaldoAplicativo();
    }
}
