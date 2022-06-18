package modulo2_estruturasControle.desafios;

import java.util.Scanner;

/*
9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */

public class Desafio12MaiorDeTodos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor;
        int contador = 0;
        int maior = 0;

        do {
            System.out.println("Digite um valor: ");
            valor = scan.nextInt();

            if (valor > maior) {
                maior = valor;
                contador++;
            } else {
                contador ++;
            }
        } while (contador != 10);
        System.out.printf("O maior valor digitado foi %s", maior);

        scan.close();
    }
}
