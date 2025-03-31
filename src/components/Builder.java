package components;

public interface Builder {
    void Reset();

    void QuantidadeRodas(int numRodas);

    void Motorzinho(String motor);

    void Chassi(String chassi);

    void QuantidadeJanelas(int numJanelas);

    void SelecionarCor(String cor);

}