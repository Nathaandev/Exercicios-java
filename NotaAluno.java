package Exercicio;
import java.util.Locale;
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.print("Nome do aluno: ");
        estudante.nome = sc.next(); // Pega o nome do aluno.
        System.out.print("Nota do primeiro trimestre (Nota máxima: 30) ");
        estudante.PrimeiroTrimestre = sc.nextDouble(); // Pega a nota do primeiro trimestre.
        while (estudante.PrimeiroTrimestre > 30) { // Verifica se o usuário colocou uma nota maior que 30 (Limite)
            System.out.println("A nota máxima do primeiro trimestre é 30.\nNota do primeiro trimestre: ");
            estudante.PrimeiroTrimestre = sc.nextDouble();
        }
        System.out.println("Nota do segundo trimestre (Nota máxima: 35) ");
        estudante.SegundoTrimestre = sc.nextDouble(); // Pega a nota do Terceiro trimestre
        while (estudante.SegundoTrimestre > 35) { // Verifica se o usuário colocou uma nota maior que 35 (Limite)
            System.out.println("A nota máxima do segundo trimestre é 35.\nNota do segundo trimestre: ");
            estudante.SegundoTrimestre = sc.nextDouble();
        }
        System.out.println("Nota do terceiro trimestre (Nota máxima: 35) ");
        estudante.TerceiroTrimestre = sc.nextDouble();
        while (estudante.TerceiroTrimestre > 35) { // Verifica se o usuário colocou uma nota maior que 35 (Limite)
            System.out.println("A nota máxima do terceiro trimestre é 35.\nNota do terceiro trimestre: ");
            estudante.TerceiroTrimestre = sc.nextDouble();
        }

        System.out.printf("Nome: %s\nNota final do aluno: %.2f. ",estudante.nome, estudante.NotaFinal()); // Diz o nome e a nota final do aluno.
        if (estudante.NotaFinal() < 60) { // Verifica se o estudante foi reprovado ou aprovado.
            System.out.println("Reprovado.");
            System.out.printf("Pontos faltando: %.2f\n", estudante.NotaFaltando());
        } else {
            System.out.println("Aprovado.");
            if (estudante.NotaFinal() == 100){
                System.out.printf("Nota máxima, parabéns, %s!", estudante.nome);
            }
        }


    }
}