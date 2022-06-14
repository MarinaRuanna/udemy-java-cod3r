package fundamentos.desafios;

/*
Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
 * Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
 */

import java.util.Scanner;

public class DesafioBhaskara {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Equação: ax² + bx + c = 0");

        System.out.println("\nDigite o valor do coeficiente A: ");
        int a = scan.nextInt();

        System.out.println("\nDigite o valor do coeficiente B: ");
        int b = scan.nextInt();

        System.out.println("\nDigite o valor do coeficiente C: ");
        int c = scan.nextInt();

        int delta = (b * b) - (4 * a * c);
        double raizd = Math.sqrt(delta);

        System.out.println("O delta é:" + delta);

        double raiz1 = ((-b) + raizd) / (2 * a);
        double raiz2 = ((-b) - raizd) / (2 * a);

        System.out.printf("A raiz X' é: %.0f", raiz1);
        System.out.println("\n");
        System.out.printf("A raiz X'' é: %.0f", raiz2);

        scan.close();
    }
}
