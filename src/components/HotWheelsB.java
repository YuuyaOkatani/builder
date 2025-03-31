package components;

public class HotWheelsB implements Builder {
    private String motor;
    private int numRodas;
    private String chassi;
    private int numJanelas;
    private String cor;

    @Override
    public void Reset() {
        this.Reset();
    }

    @Override
    public void QuantidadeRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    @Override
    public void Motorzinho(String motor) {
        this.motor = motor;
    }

    @Override
    public void Chassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public void QuantidadeJanelas(int numJanelas) {
        this.numJanelas = numJanelas;
    }

    @Override
    public void SelecionarCor(String cor) {
        this.cor = cor;
    }

    // Cria novo objeto Formula 1 com atributos defindos.
    public Formula1 getResult() {
        return new Formula1(numRodas, motor, chassi, numJanelas, cor);
    }

}
