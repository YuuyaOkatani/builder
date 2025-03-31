package components;

public class Formula1 {
    private final String motor;
    private final int numRodas;
    private final String chassi;
    private final int numJanelas;
    private final String cor;

    // Construtor
    public Formula1(int numRodas, String motor, String chassi, int numJanelas, String cor) {
        this.numRodas = numRodas;
        this.motor = motor;
        this.chassi = chassi;
        this.numJanelas = numJanelas;
        this.cor = cor;
    }

    // Retornar os dados do objeto criado
    public int getRodas() {
        return numRodas;
    }

    public String getMotor() {
        return motor;
    }

    public String getChassi() {
        return chassi;
    }

    public int getJanelas() {
        return numJanelas;
    }

    public String getCor() {
        return cor;
    }

}
