package Lanchonete.atendimento.cozinha;

import Lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando Lanche Natural e Hamburguer no Balcão");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando Suco no Balcão");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche() {
        System.out.println("Preparando Lanche Tipo Hamburguer");
    }

    public void prepararVitamina() {
        System.out.println("Preparando Suco");
    }

    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, salado, ovo e carne");
    }

    public void selecionarIngredientesVitamina() {
        System.out.println("Selecionando fruta, leite e suco");
    }

    public void lavarIngredientes() {
        System.out.println("Lavando Ingredientes");
    }

    public void baterVitaminaLiquidificador() {
        System.out.println("Batendo Vitamina Liquidificador");
    }

    public void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e o ovo para hamburguer");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
