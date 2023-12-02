import java.util.Scanner;

public class Desafio09 {
  public Desafio09() {}

  public void Executar() {
    double tc, tf;

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a temperatura em Celcius:");
    tc = sc.nextDouble();

    tf = (tc * 1.8) + 32;
    System.out.println("Temperatura em Fahrenheit:" + " " + tf);
  }
  public static void main(String[] args) {
    Desafio09 desafio09;
    desafio09 = new Desafio09();
    desafio09.Executar();
  }
}
