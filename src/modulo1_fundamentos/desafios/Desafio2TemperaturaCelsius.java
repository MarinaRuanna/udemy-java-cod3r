package modulo1_fundamentos.desafios;
/*
 * Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
 */
import java.util.Scanner;

public class Desafio2TemperaturaCelsius {
    public static void main(String[] args) {

        final int X = 32;
        final double Y = 5d/9.0;

        System.out.println("Digite a temperatura em Fahrenheit que deseja converter para Celsius: ");
        Scanner scan = new Scanner(System.in);

        double tempF = scan.nextDouble();
        double tempC = (tempF - X) * Y;


        System.out.printf("A temperatura %.2f ºF corresponde a %.2f ºC ", tempF, tempC);

    }
}
