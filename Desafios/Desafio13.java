import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Desafio13 {

  public Desafio13() {}

  public void Executar() {

    List<String> lista = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Informe a quantidade de alunos");
    int qtdA = sc.nextInt();

    for (int i = 1; i <= qtdA; i++) {
      System.out.println("Informe o nome do aluno: ");
      String Nome = sc.next();
      lista.add(Nome);
    }

    int indiceSorteado = random.nextInt(lista.size());
    String alunoEscolhido = lista.get(indiceSorteado);

    System.out.println("O aluno escolhido para apagar o quadro : " + alunoEscolhido);

  }

  public static void main(String[] args) {
    Desafio13 desafio13;
    desafio13 = new Desafio13();
    desafio13.Executar();
  }
}
