import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Desafio15 {

  public Desafio15() {}

  public void Executar() {

    List<String> listaAlunos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    // Ler os nomes dos alunos
    for (int i = 1; i <= 4; i++) {
        System.out.println("Digite o nome do aluno " + i + " : ");
        String Nome = sc.nextLine();
        listaAlunos.add(Nome);

    }

    // Embaralha a ordem dos alunos
    Collections.shuffle(listaAlunos);

    // Sortear do aluno que vai apresentar primeiro
    int indiceSorteado = random.nextInt(listaAlunos.size());
    String primeroQueVaiApresentar = listaAlunos.get(indiceSorteado);

    System.out.println("\nOrdem de apresentação dos trabalhos: ");

    for (int i = 0; i < 4; i++) {
      System.out.println((i + 1) + ". " + listaAlunos.get(i));
    }

    // Exibir o primeiro apresentador sorteado
    System.out.println("\nO sorteado para apresentar primeiro será: " + primeroQueVaiApresentar);
  }

  public static void main(String[] args) {
    Desafio15 desafio15;
    desafio15 = new Desafio15();
    desafio15.Executar();
  }
}