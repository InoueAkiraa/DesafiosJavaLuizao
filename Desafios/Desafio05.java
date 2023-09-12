import java.util.Scanner;

public class Desafio05 {
  public Desafio05() {}

  public void Executar() {
    double num1, res;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor em reais:");
    num1 = scanner.nextInt();

    res = num1 / 5;
    System.out.println("O valor em doletas:" + " " + "$" + res);
  }

  public static void main(String[] args) {

    Desafio05 desafio05;
    desafio05 = new Desafio05();
    desafio05.Executar();
  }
}