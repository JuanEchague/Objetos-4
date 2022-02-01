package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Rectangulo {

    /////////////////////Atributes//////////////////
    private double altura;
    private double base;
    ///////////////Builders/////////////////////

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    //////////////////////

    public Rectangulo() {
    }
    //////////////////Getters and Setters/////////////

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    ///////////////////Metodos//////////////////////
    public void crearRectangulo() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la medida de la base del rectangulo: ");
        this.base = read.nextDouble();
        System.out.println("Ingrese la medida de la altura del rectangulo: ");
        this.altura = read.nextDouble();

    }

    public void calcularSuperficie() {
        System.out.printf("La superficie del rectangulo es de: %.2f\n", base * altura);
    }

    public void calcularPerimetro() {
        System.out.printf("El perimetro del rectangulo es de: %.2f\n", (base + altura) * 2);
    }

    public void dibujarRectangulo() {
        System.out.println("Representacion grafica del rectangulo: ");
        for (int i = 0; i < this.base; i++) {
            for (int j = 0; j < this.altura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
