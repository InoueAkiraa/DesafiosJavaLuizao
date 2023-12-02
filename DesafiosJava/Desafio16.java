import java.util.Scanner;

public class Desafio16 {
  public Desafio16() {}

  public void Executar() {
    int num;
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um numero:");
    num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.println("O numero é par");
    } else {
      System.out.println("O número é impar");
    }

  }

  public static void main(String[] args) {
    Desafio16 desafio16;
    desafio16 = new Desafio16();
    desafio16.Executar();
  }
}
