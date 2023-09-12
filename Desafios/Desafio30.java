import java.util.Scanner;

public class Desafio30 {
    public Desafio30() {

    }

    public void Executar() {

        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros = 5;

        int maiorNumero = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int menorNumero = Integer.MAX_VALUE; // Inicializa com o maior valor possível

        for (int i = 1; i <= quantidadeNumeros; i++) {

            System.out.println("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            // Atualiza o maior e o menor número, se necessário

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            }

        }

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);

    }

    public static void main(String[] args) {
        Desafio30 desafio30;
        desafio30 = new Desafio30();
        desafio30.Executar();

    }
}