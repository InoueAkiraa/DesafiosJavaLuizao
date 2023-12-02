import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio11 {
    public Desafio11() {}

  public void Executar() {
    int qtdA;
    List lista = new ArrayList();
    String Nome;

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a quantidade de alunos");
    qtdA = sc.nextInt();

    for (int i = 1; i <= qtdA; i++) {
      System.out.println("Informe o nome do aluno:");
      Nome = sc.next();
      lista.add(Nome);
    }

    System.out.println(lista);
  }

  public static void main(String[] args) {
    Desafio11 desafio11;
    desafio11 = new Desafio11();
    desafio11.Executar();
  }
}
