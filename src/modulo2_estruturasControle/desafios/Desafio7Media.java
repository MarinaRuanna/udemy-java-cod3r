package modulo2_estruturasControle.desafios;

/*
3. Criar um programa que receba duas notas parciais, calcular a média final.
Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
caso contrário imprime no console "Reprovado".
 */

import java.util.Scanner;

public class Desafio7Media {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota parcial:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota parcial:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media <= 10 && media >= 0){
            if (media >= 7.0) {
                System.out.println("Média: " + media);
                System.out.println("Aprovado");
            } else if (media >= 4.0) {
                System.out.println("Média: " + media);
                System.out.println("Recuperação");
            } else {
                System.out.println("Média: " + media);
                System.out.println("Reprovado");
            }
        } else {
            System.out.println("Digite uma nota válida");
        }
    }
}
