package modulo2_estruturasControle.desafios;

/*
7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos,
caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
 */


import java.util.Scanner;

public class Desafio10Somatorio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero;
        double somatorio = 0;
        boolean sair = false;

        do {
            System.out.println("Digite um numero positivo para adicionar ao somatorio ou um numero negativo para encerrar: ");
            numero = scan.nextDouble();
            if (numero < 0) {
                sair = true;
            } else {
                somatorio = somatorio + numero;
                System.out.println(somatorio);
            }
        } while (!sair);

        System.out.println("A somatoria dos números positivos digitados é: " + somatorio);

    }
}
