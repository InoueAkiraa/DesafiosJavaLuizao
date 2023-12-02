import java.util.Scanner;

public class Desafio31 {

    public void Executar() {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número:");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O número é impar");
        }

        if ((num % 2) == 0) {

            System.out.println("O número é divisivel por 2");

        } else {
            System.out.println("O número não é divisivel por 2");
        }
        if ((num % 3) == 0) {
            System.out.println("O número é divisivel por 3");

        } else {
            System.out.println("O número não é divisivel por 3");
        }
        if ((num % 5) == 0) {
            System.out.println("O número é divisivel por 5");

        } else {
            System.out.println("O número não é divisivel por 5");
        }
    }

    public static void main(String[] args) {
        Desafio31 desafio31;
        desafio31 = new Desafio31();
        desafio31.Executar();

    }
}
