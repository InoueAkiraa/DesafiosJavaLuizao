import java.util.Scanner;

public class Desafio29 {
    public Desafio29() {

    }

    public void Executar() {
        Double mes, valorPres, tj, newPres;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de meses: ");
        mes = sc.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        valorPres = sc.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        tj = sc.nextDouble();

        // Taxa de juros ao mês
        newPres = valorPres * tj * mes;

        System.out.println("O novo valor da prestação é: " + newPres);
    }

    public static void main(String[] args) {
        Desafio29 desafio29;
        desafio29 = new Desafio29();
        desafio29.Executar();

    }

}
