import java.util.Scanner;

public class Desafio08 {
  public Desafio08() {}
 
  public void Executar() {
    double sal, saln;

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o preço o salário:");
    sal = sc.nextInt();

    saln = sal * 1.15;
    System.out.println("\n Novo salário com 15% de aumento:" + saln);
  }

  public static void main(String[] args) {

    Desafio08 desafio08;
    desafio08 = new Desafio08();
    desafio08.Executar();
  }
}
