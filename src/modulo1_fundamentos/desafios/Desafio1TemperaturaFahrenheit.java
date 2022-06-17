package modulo1_fundamentos.desafios;

import java.util.Scanner;

public class Desafio1TemperaturaFahrenheit {
    public static void main(String[] args) {

        final int X = 32;
        final double Y = 9.0/5d;

        System.out.println("Digite a temperatura em Celsius que deseja converter para Fahrenheit: ");
        Scanner scan = new Scanner(System.in);

        double tempC = scan.nextDouble();
        double tempF = (tempC * Y) + X;


        System.out.printf("A temperatura %.2f ºC corresponde a %.2f ºF ", tempC, tempF);

        scan.close();
    }
}
