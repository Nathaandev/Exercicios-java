public class Main {
    public static void main (String[]args) {
        String product1 = "Computador";
        String product2 = "Mesa de escritório";

        int idade = 30;
        int codigo = 5290;
        char genero = 'f';
        double preço1 = 2100.0;
        double preço2 = 650.50;
        double medir = 53.234567;

        System.out.printf("Produtos:\n%s, Preço: R$%.2f\n%s, Preço: R$%.2f\n\nPessoa:\n %d Anos, Código %d e gênero: %s.\n" +
                "Medir em oito casas decimais: %.8f\nArredondada (três casas decimais): %.3f.", product1, preço1, product2, preço2,idade, codigo, genero, medir, medir);
    }

}
