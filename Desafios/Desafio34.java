
public class Desafio34 {

    public Desafio34() {

    }

    public void Executar() {
        int i, soma = 0;
        String VERDE = "\u001B[32m";

        for (i = 1; i <= 1000; i++) {
            soma = soma + i;

        }
        System.out.println(VERDE + "O valor da soma de 1 a 1000:" + soma);

    }

    public static void main(String[] args) {
        Desafio34 desafio34;
        desafio34 = new Desafio34();
        desafio34.Executar();
    }
}
