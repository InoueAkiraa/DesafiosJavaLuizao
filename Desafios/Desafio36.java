import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio36 {
    public Desafio36() {

    }

    public void Executar() {

        Scanner sc = new Scanner(System.in);

        List<String> nomesPessoas = new ArrayList<>();
        List<Integer> idadesPessoas = new ArrayList<>();
        List<String> nacionalidadesPessoas = new ArrayList<>();

        nomesPessoas.add("Pedro");
        nomesPessoas.add("Maria");
        nomesPessoas.add("João");
        nomesPessoas.add("Ana");
        nomesPessoas.add("Marcos");
        nomesPessoas.add("Henrique");
        nomesPessoas.add("Sandro");
        nomesPessoas.add("Felipe");
        nomesPessoas.add("Perla");
        nomesPessoas.add("Camila");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade de " + nomesPessoas.get(i) + ": ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpa o buffer
            idadesPessoas.add(idade);

            System.out.print("Digite a nacionalidade de " + nomesPessoas.get(i) + ": ");
            String nacionalidade = sc.nextLine();
            nacionalidadesPessoas.add(nacionalidade);

        }

        int aptosAVotar = 0;
        int naoAptosAVotar = 0;

        for (int i = 0; i < 10; i++) {
            int idade = idadesPessoas.get(i);
            String nacionalidade = nacionalidadesPessoas.get(i);

            if (idade > 16 && nacionalidade.equalsIgnoreCase("brasileira")) {
                aptosAVotar++;
            } else {
                naoAptosAVotar++;
            }
        }

        System.out.println("Pessoas aptas a votar: " + aptosAVotar);
        System.out.println("Pessoas não aptas a votar: " + naoAptosAVotar);
    }

    public static void main(String[] args) {
        Desafio36 desafio36;
        desafio36 = new Desafio36();
        desafio36.Executar();

    }

}