import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio14 {

    public Desafio14() {

    }

    public void Executar() {

        List<String> listaDeAlunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {

            System.out.println("Digite o nome do aluno " + i + " : ");
            String Nome = sc.nextLine();
            listaDeAlunos.add(Nome);

        }

        Collections.shuffle(listaDeAlunos);// Embaralhar a ordem dos alunos

        System.out.println("\nOrdem de apresentação dos trabalhos: ");

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + ". " + listaDeAlunos.get(i));
        }

    }

    public static void main(String[] args) {
        Desafio14 desafio14;
        desafio14 = new Desafio14();
        desafio14.Executar();

    }
}