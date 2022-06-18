package modulo2_estruturasControle.desafios;

import java.util.Scanner;

/*
5. Refatorar o exercício 04, utilizando a estrutura switch.
 */
public class Desafio9NumeroPrimoSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja verificar se é primo: ");

        int numero = scan.nextInt();
        int contador = 0;

        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        switch (contador){
            case 0:
                System.out.printf("O numero %s é primo", numero);
                break;
            default:
                System.out.printf("O numero %s não é primo", numero);
                break;
        }

        scan.close();
    }
}
