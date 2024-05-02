import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Insire as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Insire as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("Area do triangulo X: %f\n", areaX);
        System.out.printf("Area do triangulo Y: %f\n", areaY);
        if (areaX > areaY) {
            System.out.printf("O triangulo com a maior area é o triangulo X com a area de: %f ", areaX);
        } else {
            System.out.printf("O triangulo com a maior area é o triangulo Y com a area de: %f ", areaY);
        }

    }
}



Classe dos triangulos:

package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
