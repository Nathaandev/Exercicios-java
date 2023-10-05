import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;
        do {
            System.out.print("Escolha quandos graus celsius você quer: ");
            int celsius = sc.nextInt();
            double fahrenheit = celsius * 1.8 + 32; //converte celsiu para fahrenheit
            System.out.printf("Você escolheu %d Graus celsius.\nValor em Fahrenheit: %.1f.\n", celsius, fahrenheit);
            while (true) {
                System.out.print("Deseja repetir? (S/N): "); //pergunta se a pessoa quer repetir o programa.
                repetir = sc.next().charAt(0); //vai receber a resposta.
                repetir = Character.toLowerCase(repetir); //converter a escolha para letra minúscula
                if (repetir == 's' || repetir == 'n'){
                    if (repetir == 'n') {
                        System.out.println("Fechando programa..."); //mensagem que aparece quando acabar o programa.
                    }
                    break;
                }
                else{
                    System.out.println("Entrada inválida. Insire 'S' ou 'N'. "); //pergunta de novo se a pessoa quer continuar porque ela escreveu algo que não é 'S' ou 'N'.
                }
            }
        } while (repetir == 's'); //Se digitar 'S', o comando volta.


    }
}
