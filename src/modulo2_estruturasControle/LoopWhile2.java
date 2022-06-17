package modulo2_estruturasControle;

import java.util.Scanner;

public class LoopWhile2 {
    public static void main(String[] args) {

        // while

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá: ");
        String valor = scan.next();

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.println("Olá:");
            valor = scan.next();
        }

        scan.close();
    }
}
