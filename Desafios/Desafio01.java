import java.util.Scanner;

public class Desafio01 {
  
  public Desafio01() {} // construtor vazio

  public void Executar() {
    int numero, dobro, triplo;
    double quadrado;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o valor:");
    numero = scanner.nextInt();

    dobro = numero * 2;
    triplo = numero * 3;
    quadrado = Math.sqrt(numero);
    System.out.println(
    "\nO dobro de " + numero + " é: " + dobro + "\n" 
    + "O Triplo de " + numero + " é: "+ triplo + " " 
    + "\nA raiz de " + numero + " é: " + quadrado);

  }

  public static void main(String[] args) {

    Desafio01 desafio01;
    desafio01 = new Desafio01();
    desafio01.Executar();
  }
}