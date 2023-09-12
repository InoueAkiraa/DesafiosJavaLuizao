import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio40 {
    public Desafio40() {
    }

    public void Executar() {
        Scanner sc = new Scanner(System.in);
        int indiceAlunoMaisAlto = 0;
        int indiceAlunoMaisBaixo = 0;
        List<String> nomesAlunos = new ArrayList<>();
        List<Double> alturasAlunos = new ArrayList<>();
        List<Integer> codigosMatricula = new ArrayList<>();

        // Preencher a lista de nomes com os nomes dos alunos
        nomesAlunos.add("Marlon");
        nomesAlunos.add("Jão");
        nomesAlunos.add("Rafael");
        nomesAlunos.add("Gabriel");
        nomesAlunos.add("Juan");
        nomesAlunos.add("Martin");
        nomesAlunos.add("Ian");
        nomesAlunos.add("Diogo");
        nomesAlunos.add("José");
        nomesAlunos.add("Pedro");

        for (int i = 0; i < nomesAlunos.size(); i++) {
            System.out.print("Digite a altura (em centimetros) do " + nomesAlunos.get(i) + ": ");
            double altura = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer

            System.out.print("Digite o código de matrícula do " + nomesAlunos.get(i) + ": ");
            int codigoMatricula = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            alturasAlunos.add(altura);
            codigosMatricula.add(codigoMatricula);
        }

        for (int i = 1; i < alturasAlunos.size(); i++) {
            if (alturasAlunos.get(i) > alturasAlunos.get(indiceAlunoMaisAlto)) {
                indiceAlunoMaisAlto = i;
            }
            if (alturasAlunos.get(i) < alturasAlunos.get(indiceAlunoMaisBaixo)) {
                indiceAlunoMaisBaixo = i;
            }
        }

        System.out.println("Aluno mais alto: " + nomesAlunos.get(indiceAlunoMaisAlto));
        System.out.println("Altura: " + alturasAlunos.get(indiceAlunoMaisAlto) + " centimetros");
        System.out.println("Código de Matrícula: " + codigosMatricula.get(indiceAlunoMaisAlto));

        System.out.println("Aluno mais baixo: " + nomesAlunos.get(indiceAlunoMaisBaixo));
        System.out.println("Altura: " + alturasAlunos.get(indiceAlunoMaisBaixo) + " centimetros");
        System.out.println("Código de Matrícula: " + codigosMatricula.get(indiceAlunoMaisBaixo));
    }

    public static void main(String[] args) {
        Desafio40 desafio40;
        desafio40 = new Desafio40();
        desafio40.Executar();
    }
}