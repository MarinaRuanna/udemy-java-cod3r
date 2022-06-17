package modulo2_estruturasControle.desafios;

import java.util.Scanner;

public class Desafio3While {

    public static void main(String[] args) {

        int contador = 0;
        double total = 0;
        double nota;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Para sair digite -1 ou digite a proxima nota para continuar: ");
            nota = scan.nextDouble();
            if (nota <= 10 && nota >= 0) {
                total = total + nota;
                contador++;
            } else if (nota != -1){
                System.out.println("digite uma nota válida.");
            }
        } while (nota != -1);

        double media = total / contador;
        System.out.println("A média é: " + media);

        scan.close();

    }

}
