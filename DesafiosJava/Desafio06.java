import java.util.Scanner;

public class Desafio06 {
  public Desafio06() {}

  public void Executar() {
    double lar, al, ar, art;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o a altura em metros:");
    al = scanner.nextInt();

    System.out.println("Informe o largura em metros:");
    lar = scanner.nextInt();

    ar = lar * al;
    /*
    * 2m² = 1L de tinta
    * ar = art
    * art * 2 = ar *1
    * art = ar / 2
    */
    System.out.println("\n Área da parede :" + " " + ar + " " + "m²");
    art = ar / 2;
    System.out.println("\n O quantidade de tinta necessária:" + " " + art + " " + "L");

  }

  public static void main(String[] args) {

    Desafio06 desafio06;
    desafio06 = new Desafio06();
    desafio06.Executar();
  }
}
