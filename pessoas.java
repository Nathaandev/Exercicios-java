import java.util.Locale;
import java.util.Scanner;
import entities.Pessoas;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height: ");
            double height = sc.nextDouble();
            pessoas[i] = new Pessoas(name, age, height);
        }

        double soma = 0.0;
        int contUnder16 = 0;
        for (int i = 0; i<n; i++){
            soma += pessoas[i].getHeight();
        }
        double media = soma / n;

        System.out.printf("Avg height: %.2f%n", media);
        System.out.println("Under 16:");
        for (int i=0; i<n; i++){
            if (pessoas[i].getAge() < 16){
                System.out.println(pessoas[i].getName());
                contUnder16 ++;
            }
        }
        double percentageUnder16 = (double) contUnder16 / n * 100;
        System.out.printf("Percentage of people under 16: %.2f%%%n", percentageUnder16);

    }
}
