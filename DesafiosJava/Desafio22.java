import java.util.Scanner;

public class Desafio22 {
    public Desafio22() {

    }

    public void Executar() {
        double alt, pes, IMC;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura em metros");
        alt = sc.nextDouble();

        System.out.println("Informe o peso em Kg:");
        pes = sc.nextDouble();

        IMC = pes / (Math.sqrt(alt));

        System.out.println("O calculo do IMC deu :" + " " + IMC);

    }

    public static void main(String[] args) {
        Desafio22 desafio22;
        desafio22 = new Desafio22();
        desafio22.Executar();
    }
}
