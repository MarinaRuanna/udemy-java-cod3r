package modulo2_estruturasControle.desafios;

/*
4. Criar um programa que receba um número e diga se ele é um número primo.
 */

import java.util.Scanner;

public class Desafio8NumeroPrimo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja verificar se é primo: ");

        int numero = scan.nextInt();

        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                System.out.printf("O numero %s não é primo", numero);
            } else {
            System.out.printf("O numero %s é primo", numero);
            }
        }

        scan.close();
    }
}

