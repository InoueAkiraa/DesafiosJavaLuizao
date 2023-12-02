import java.io.StringReader;

public class Desafio39 {
    public Desafio39() {

    }

    public void Executar() {
        int i;
        String VERDE = "\u001B[32m";
        String VERMELHO = "\u001B[31m";
        String BRANCO = "\u001B[37m";
        String AMARELA = "\u001B[33m";
        for (i = 0; i <= 120; i++) {
            if ((i % 3) == 0 && (i % 4) == 0) {
                System.out.println(AMARELA + "O número " + i + "  é divisivel por 3 e 4");
            } else {
                if ((i % 3) == 0) {
                    System.out.println(VERDE + "O número " + i + " é divisivel por 3");

                } else {
                    if ((i % 4) == 0) {
                        System.out.println(VERMELHO + "O número " + i + " é divisivel por 4");
                    } else {
                        System.out.println(BRANCO + "O número " + i + " não é divisivel por 3 ou 4");
                    }

                }
            }

        }

    }

    public static void main(String[] args) {
        Desafio39 desafio39;
        desafio39 = new Desafio39();
        desafio39.Executar();
    }

}
