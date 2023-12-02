import java.util.Scanner;

public class Desafio28 {
    public Desafio28() {

    }

    public void Executar() {
        double L, Km, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a kilometragem:");
        Km = sc.nextDouble();

        System.out.println("Informe a quantidade de Litros de combustivel");
        L = sc.nextDouble();

        c = Km / L;

        System.out.println("O consumo de combustivel durante a viagem foi:" + c + "Km/L");

    }

    public static void main(String[] args) {
        Desafio28 desafio28;
        desafio28 = new Desafio28();
        desafio28.Executar();

    }
}
