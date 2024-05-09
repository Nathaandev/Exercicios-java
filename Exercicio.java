package Exercicio;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Empregado empregado = new Empregado();

        System.out.print("Digite o nome do empregado: ");
        empregado.nome = sc.next();  // Pega o nome do usuário.

        System.out.print("Salário bruto: "); // Pega o salário do usuário.
        empregado.SalarioBruto = sc.nextDouble();

        System.out.print("Impostos: "); // Pega os impostos.
        empregado.impostos = sc.nextDouble();

        System.out.printf("Dados do empregado: %s", empregado); // Da o nome e o salário líquido.
        System.out.printf("\nPorcentagem de aumento de salário: ", empregado.nome);
        double porcentagem = sc.nextDouble(); // Recebe o aumento de salário.
        empregado.AumentarSalario(porcentagem); // Aumenta o salário com base na porcentagem dada.
        System.out.printf("Dados atualizados do empregado: %s", empregado); // Devolve os dados do usuário com nome e salário liquido após o aumento.
    }
}
