package components;

public class Director {

    // Método para criar novo carrinho de Formula 1 utilizando o Builder
    public void buildNewFormula1(Builder builder) {
        builder.QuantidadeRodas(4);
        builder.Motorzinho("V6");
        builder.QuantidadeJanelas(0);
        builder.Chassi("Formula 1");
        builder.SelecionarCor("Vermelha");

    }

    // Método para criar novo carrinho de JEEP utilizando Builder
    public void buildNewJEEP(Builder builder) {
        builder.QuantidadeRodas(4);
        builder.Motorzinho("Hurricane 2.0T");
        builder.QuantidadeJanelas(6);
        builder.Chassi("JEEP");
        builder.SelecionarCor("Verde musgo");

    }

    // Comentário: basicamente o uso de get e set herdados da interface implementada
    // no builder.

}
