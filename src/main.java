import components.Director;
import components.Formula1;
import components.HotWheelsA;
import components.HotWheelsB;
import components.JEEP;

public class main {
    public static void main(String[] args) {
        Director director = new Director();

        JEEP jeep;
        Formula1 formula1;

        // Instanciar novos builders para o diretor interagir.
        HotWheelsA JEEPBuilder = new HotWheelsA();
        HotWheelsB Formula1Builder = new HotWheelsB();

        // O diretor constroi com o método abaixo com o Builder do JEEP
        director.buildNewJEEP(JEEPBuilder);
        jeep = JEEPBuilder.getResult();
        System.out.println("Novo carrinho criado: ");
        System.out.println("Motor: " + jeep.getMotor());
        System.out.println("Número de janelas: " + jeep.getJanelas());
        System.out.println("Número de rodas: " + jeep.getRodas());
        System.out.println("Chassi: " + jeep.getChassi());
        System.out.println("Cor: " + jeep.getCor());

        // O diretor constroi com o método abaixo com o Builder do Formula 1
        director.buildNewFormula1(Formula1Builder);
        formula1 = Formula1Builder.getResult();
        System.out.println("Novo carrinho criado: ");
        System.out.println("Motor: " + formula1.getMotor());
        System.out.println("Número de janelas: " + formula1.getJanelas());
        System.out.println("Número de rodas: " + formula1.getRodas());
        System.out.println("Chassi: " + formula1.getChassi());
        System.out.println("Cor: " + formula1.getCor());

    }

}