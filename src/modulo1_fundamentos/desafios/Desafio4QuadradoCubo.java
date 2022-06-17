package modulo1_fundamentos.desafios;

/*
 * Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
 */

import java.util.Scanner;

public class Desafio4QuadradoCubo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        String scan1 = scan.nextLine().replace(",", ".");
        double num = Double.parseDouble(scan1);

        double quadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);

        System.out.printf("O quadrado do valor %.2f é %.2f e o seu cubo é %.2f", num, quadrado, cubo);

        scan.close();
    }
}
