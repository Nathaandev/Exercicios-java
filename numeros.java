import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i=0;i<n; i++){
            numeros[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
