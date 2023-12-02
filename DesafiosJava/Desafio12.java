import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio12 {

  public Desafio12() {}

  public void Executar() {
    int qtdA;
    List<String> lista = new ArrayList();
    String Nome;

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a quantidade de alunos");
    qtdA = sc.nextInt();

    for (int i = 1; i <= qtdA; i++) {
      System.out.println("Informe o nome do aluno:");
      Nome = sc.next();
      lista.add(Nome);
    }

    Collections.sort(lista);// Ordena a lista
    System.out.println(lista);

  }

  public static void main(String[] args) {
    Desafio12 desafio12;
    desafio12 = new Desafio12();
    desafio12.Executar();
  }
}
