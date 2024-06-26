package Lanchonete;

import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.Atendente;
import Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponiveis para toda a aplicação
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararCombo();

        //Ações que estabelecimento precisa ter ciencia.
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();

        Almoxarife almoxarife = new Almoxarife();

        //Ações que não precisam estarem disponiveis para toda aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();

        //Ações que somente o seu pacote cozinha precisa conhecer
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

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

        //já pensou os clientes ouvindo que o gás acabou
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
