import java.util.Scanner;

public class Desafio19 {

  public Desafio19() {}

  public void Executar() {

    String VERDE = "\u001B[32m";
    String VERMELHO = "\u001B[31m";
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a idade do usuário: ");
    int idade = sc.nextInt();

    if (idade >= 18) {
      System.out.println(VERDE + "Permissão concedida");
    } else {
      System.out.println(VERMELHO + "Sem permissão");
    }
  }

  public static void main(String[] args) {
    Desafio19 desafio19;
    desafio19 = new Desafio19();
    desafio19.Executar();
  }
}