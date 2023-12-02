import java.util.Scanner;

public class Desafio24 {

    public Desafio24() {

    }

    public void Executar() {
        double alt, r, ab, v;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho do Raio do cilindro em metros:");
        r = sc.nextFloat();

        System.out.println("Informe a altura do cilindro em metros:");
        alt = sc.nextFloat();

        ab = Math.PI * (Math.sqrt(r));
        v = ab * alt;

        System.out.println("O volume do cilindro é :" + " " + v + "m³");
    }

    public static void main(String[] args) {
        Desafio24 desafio24;
        desafio24 = new Desafio24();
        desafio24.Executar();
    }

}
