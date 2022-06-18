package modulo2_estruturasControle.desafios;
/*
8. Criar um programa que receba uma palavra e imprime no console letra por letra.
 */

import java.util.Scanner;

public class Desafio11ImprimirChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            System.out.println(c);
        }

        // Versão do professor:

        System.out.println("Digite a palavra: ");
        palavra = scan.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        // Versão refatorada (for each):

        System.out.println("Digite a palavra: ");
        palavra = scan.nextLine();

        char[] letras1 = palavra.toCharArray();

        for (char letra : letras1) {
            System.out.println(letra);
        }
        scan.close();
    }
}




