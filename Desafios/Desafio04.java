import java.util.Scanner;

public class Desafio04 {
  public Desafio04() {}

  public void Executar() {
    int num1, res;

    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor da tabuada:");
    num1 = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      res = num1 * i;
      System.out.println(num1 + " " + "*" + " " + i + " " + "=" + " " + res);
    }
  }

  public static void main(String[] args) {

    Desafio04 desafio04;
    desafio04 = new Desafio04();
    desafio04.Executar();
  }

}