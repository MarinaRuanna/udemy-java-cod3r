package modulo1_fundamentos.desafios;

/*
Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
 */

import java.util.Scanner;

public class Desafio5AreaTriangulo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o vaor da base do triangulo (em cm): ");
        String scan1 = scan.nextLine().replace(",", ".");
        double b = Double.parseDouble(scan1);

        System.out.println("Digite a altura do triangulo (em cm): ");
        String scan2 = scan.nextLine().replace(",", ".");
        double h = Double.parseDouble(scan2);

        double A = (b * h) / 2;

        System.out.printf("Area do triangulo = %.2fcm²", A);

        scan.close();
    }
}
