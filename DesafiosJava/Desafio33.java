import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio33 {
    public Desafio33() {

    }

    public void Executar() {
        Scanner sc = new Scanner(System.in);

        List<String> nomesPessoas = new ArrayList<>();
        List<Integer> idadesPessoas = new ArrayList<>();

        // Preencher a lista de nomes com os nomes das 10 pessoas
        nomesPessoas.add("Jão");
        nomesPessoas.add("Rafael");
        nomesPessoas.add("Gabriel");
        nomesPessoas.add("Juan");
        nomesPessoas.add("Martin");
        nomesPessoas.add("Ian");
        nomesPessoas.add("Marlon");
        nomesPessoas.add("Diogo");
        nomesPessoas.add("José");
        nomesPessoas.add("Pedro");

        // Preencher a lista de idades com as idades das 10 pessoas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade de " + nomesPessoas.get(i) + ": ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            idadesPessoas.add(idade);
        }

        int countMaioresDe18 = 0;

        for (int idade : idadesPessoas) {
            if (idade > 18) {
                countMaioresDe18++;
            }
        }

        System.out.println("Pessoas com mais de 18 anos: " + countMaioresDe18);
    }

    public static void main(String[] args) {
        Desafio33 desafio33;
        desafio33 = new Desafio33();
        desafio33.Executar();
    }
}