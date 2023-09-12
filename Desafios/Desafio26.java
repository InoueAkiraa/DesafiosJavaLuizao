import java.util.Scanner;

public class Desafio26 {
    public Desafio26() {

    }

    public void Executar() {
        /*
         * V = 4 * pi * r³ / 3
         */
        Double r, v;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Raio da esfera em metros:");
        r = sc.nextDouble();

        v = 4 * Math.PI * (Math.pow(r, 3));

        System.out.printf("O volume da esfera é :%.2fm³%n", v);
    }

    public static void main(String[] args) {
        Desafio26 desafio26;
        desafio26 = new Desafio26();
        desafio26.Executar();
    }
}