import java.util.Scanner;

public class Desafio25 {
    public Desafio25() {

    }

    public void Executar() {
        // (a - b)² = a² -2ab + b²
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        a = sc.nextDouble();

        System.out.println("Informe o segundo numero :");
        b = sc.nextDouble();

        c = (Math.pow(a, 2)) + (-2 * (a * b)) + (Math.pow(b, 2));

        System.out.println("O quadrado da diferença entre:" + " " + a + " " + " e" + " " + b + " " + "=" + " " + c);
    }

    public static void main(String[] args) {
        Desafio25 desafio25;
        desafio25 = new Desafio25();
        desafio25.Executar();
    }
}
