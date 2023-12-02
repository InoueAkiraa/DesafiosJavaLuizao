import java.util.Scanner;

public class Desafio20 {

  public Desafio20() {}

  public void Executar() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma frase:  ");
    String frase = sc.nextLine();

    // Substitui todas as ocorrências de 'A' ou 'a' por '&'
    String fraseSubstituida = frase.replaceAll("[Aa]", "&");

    System.out.println("Frase com as letras 'A' ou 'a' substituídas por '&':");
    System.out.println(fraseSubstituida);
  }

  public static void main(String[] args) {
    Desafio20 desafio20;
    desafio20 = new Desafio20();
    desafio20.Executar();
  }
}
