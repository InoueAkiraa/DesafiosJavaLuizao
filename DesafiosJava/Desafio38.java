import java.util.Scanner;

public class Desafio38 {
    public Desafio38() {
    }

    public void Executar() {

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            // Verifique se o número atual não é um múltiplo de 3
            if ((i % 3) != 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números de 1 a 100 (excluindo múltiplos de 3) é: " + soma);
    }

    public static void main(String[] args) {
        Desafio38 desafio38;
        desafio38 = new Desafio38();
        desafio38.Executar();
    }
}