import java.util.Scanner;

public class Desafio02 {

  public Desafio02() {}

  public void Executar() {
    double num1, num2, media;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a primeira nota:");
    num1 = scanner.nextDouble();
    System.out.println("Informe a segunda nota:");
    num2 = scanner.nextDouble();

    media = (num1 + num2) / 2;

    System.out.println("A média da nota" + " " + media);
  }

  public static void main(String[] args) {

    Desafio02 desafio02;
    desafio02 = new Desafio02();
    desafio02.Executar();
  }
}