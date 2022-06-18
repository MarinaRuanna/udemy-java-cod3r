package modulo2_estruturasControle.desafios;
/*
1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 */

import java.util.Scanner;

public class Desafio5Par {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();

        if (num <= 10 && num >= 0) {
            if (num % 2 == 0) {
                System.out.println("Número está entre 0 e 10 e é par!");
            } else {
                System.out.println(" O número está entre 10 e 0 e é impar");
            }
        } else {
            System.out.println("O numero não está entre 0 e 10");
        }

        scan.close();
    }
}
