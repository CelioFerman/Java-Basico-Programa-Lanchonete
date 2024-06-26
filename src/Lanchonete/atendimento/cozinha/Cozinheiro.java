package Lanchonete.atendimento.cozinha;
import Lanchonete.atendimento.cozinha.Almoxarife;

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

    private void prepararLanche() {
        System.out.println("Preparando Lanche Tipo Hamburguer");
    }

    private void prepararVitamina() {
        System.out.println("Preparando Suco");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, salado, ovo e carne");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionando fruta, leite e suco");
    }

    private void lavarIngredientes() {
        System.out.println("Lavando Ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo Vitamina Liquidificador");
    }

    private void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e o ovo para hamburguer");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
