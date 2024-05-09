package Exercicio;


public class Estudante {

    public String nome;
    public double PrimeiroTrimestre;
    public double SegundoTrimestre;
    public double TerceiroTrimestre;

    public double NotaFinal() {
        return PrimeiroTrimestre + SegundoTrimestre + TerceiroTrimestre;
    }
    public double NotaFaltando() {
        return 60 - NotaFinal();
    }


}
