import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio32 {
    public Desafio32() {

    }

    public void Executar() {

        Scanner sc = new Scanner(System.in);

        List<String> nomeAlunos = new ArrayList<>();
        List<Integer> idadesAlunos = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            nomeAlunos.add(nome);// adiciona o nome do aluno na lista

            System.out.println("Digite a idade do aluno: ");
            int idade = sc.nextInt();
            sc.nextLine();

            idadesAlunos.add(idade);

        }

        double somaIdades = 0;

        for (int idade : idadesAlunos) {
            somaIdades += idade;
        }

        double idadeMediaTurma = somaIdades / idadesAlunos.size();

        // Exibe a idade média da turma
        System.out.println("A idade média da turma é: " + idadeMediaTurma);
    }

    public static void main(String[] args) {
        Desafio32 desafio32;
        desafio32 = new Desafio32();
        desafio32.Executar();

    }

}