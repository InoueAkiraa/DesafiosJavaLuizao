import java.util.Scanner;

public class Desafio35 {
    public Desafio35() {
    }

    public void Executar() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Desafio35 desafio35;
        desafio35 = new Desafio35();
        desafio35.Executar();
    }
}