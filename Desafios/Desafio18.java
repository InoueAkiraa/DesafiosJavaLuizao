import java.util.Scanner;

public class Desafio18 {
  public Desafio18() {}

  public void Executar() {
    int op = 9;
    while (op != 0) {
      op = menu();
      if (op == 1) {
        Divisao();
      }
      if (op == 2) {
        Soma();
      }
      if (op == 3) {
        Subtração();
      }
      if (op == 4) {
        Multiplicação();
      }
    }
  }

  public int menu() {
    int o;
    Scanner sc = new Scanner(System.in);

    System.out.println(
            "\n 1 - Divisao \n 2 - Soma \n 3 - Subtração \n 4 - Multiplicação \n 0 - Sair ");

    System.out.println("\n Informe a opcao :");
    o = sc.nextInt();

    return o;
  }

  public void Divisao() {
    double a, b;
    double c;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nInforme o numerador:");
    a = sc.nextInt();

    System.out.println("\nInforme o denominador:");
    b = sc.nextInt();

    c = a / b;

    System.out.println("Resultado da operaçao:" + c);

  }

  public void Soma() {
    double a, b;
    double c;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nInforme o primeiro número:");
    a = sc.nextInt();

    System.out.println("\nInforme o segundo número:");
    b = sc.nextInt();

    c = a + b;

    System.out.println("Resultado da operçao:" + c);
  }

  public void Subtração() {
    double a, b;
    double c;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nInforme o primeiro número:");
    a = sc.nextInt();

    System.out.println("\nInforme o segundo número:");
    b = sc.nextInt();

    c = a - b;

    System.out.println("Resultado da operaçao:" + c);
  }

  public void Multiplicação() {
    double a, b;
    double c;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nInforme o primeiro número:");
    a = sc.nextInt();

    System.out.println("\nInforme o segundo número:");
    b = sc.nextInt();

    c = a * b;

    System.out.println("Resultado da operaçao:" + c);
  }

  public static void main(String[] args) {
    Desafio18 desafio18;
    desafio18 = new Desafio18();
    desafio18.Executar();
  }
}
