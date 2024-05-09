package Exercicio;

public class Empregado {
    public String nome;
    public double SalarioBruto;

    public double impostos;

    public double salariolimpo() {
        return SalarioBruto - impostos;
    }

    public void AumentarSalario(double porcetagem) {  // Função do aumento de salário.
        SalarioBruto += SalarioBruto * porcetagem / 100;
    }

    public String toString(){
         return ("Nome: " + nome + "\nSalário: R$" + String.format("%.2f", salariolimpo()));
    }

}
