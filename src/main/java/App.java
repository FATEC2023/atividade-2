package main.java;
import java.util.Scanner;

public class App {
    public String nomeCompleto;
    public String rgm;
    public int idade;
    public String github;
    public String linkedin;
    public String curso;
    public String turma;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App app = new App();
        app.obterDados(scanner);
        app.exibirDados();
        scanner.close();
    }

    public void obterDados(Scanner sc) {
        System.out.println("Digite o seu nome completo:");
        nomeCompleto = sc.nextLine();

        System.out.println("Digite o seu RGM:");
        rgm = sc.nextLine();

        System.out.println("Digite a sua idade:");
        idade = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha

        System.out.println("Digite o seu @GitHub:");
        github = sc.nextLine();

        System.out.println("Digite o seu @LinkedIn:");
        linkedin = sc.nextLine();

        System.out.println("Digite o seu curso:");
        curso = sc.nextLine();

        System.out.println("Digite a sua turma:");
        turma = sc.nextLine();
    }

    public void exibirDados() {
        System.out.println("\nDados do Usuário:");
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("RGM: " + rgm);
        System.out.println("Idade: " + idade);
        System.out.println("@GitHub: " + github);
        System.out.println("@LinkedIn: " + linkedin);
        System.out.println("Curso: " + curso);
        System.out.println("Turma: " + turma);
    }
}
