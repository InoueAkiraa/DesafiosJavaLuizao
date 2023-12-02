import java.util.Scanner;

public class Desafio17 {

  public Desafio17() {}

  public void Executar() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o seu nome: ");
    String nome = sc.nextLine();

    // Exibe "Olá meu nome é: {nome recebido}"
    System.out.println("Olá meu nome é " + nome);

    // Nome com todas as letras maiúsculas
    String nomeMaiusculo = nome.toUpperCase();
    System.out.println("Nome em maiúsculas: " + nomeMaiusculo);

    // Nome com todas as letras minúsculas
    String nomeMinusculo = nome.toLowerCase();
    System.out.println("Nome em minúsculas: " + nomeMinusculo);

    // Quantidade de letras ao todo (não considera o espaço vazio)
    int quantidadeLetras = nome.replace(" ", "").length();
    System.out.println("Quantidade de letras ao todo: " + quantidadeLetras);

    // Quantidade de letras no primeiro nome
    String[] partesNome = nome.split(" ");
    String primeiroNome = partesNome[0];
    int letrasPrimeiroNome = primeiroNome.length();
    System.out.println("Quantidade de letras no primeiro nome: " + letrasPrimeiroNome);

  }

  public static void main(String[] args) {
    Desafio17 desafio17;
    desafio17 = new Desafio17();
    desafio17.Executar();
  }
}