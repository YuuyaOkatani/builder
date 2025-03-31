package components;

// O Concrete Builder HotWheelsA implementa o Builder
public class HotWheelsA implements Builder {
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

    // Cria novo objeto JEEP com atributos defindos.
    public JEEP getResult() {
        return new JEEP(numRodas, motor, chassi, numJanelas, cor);

    }

}
