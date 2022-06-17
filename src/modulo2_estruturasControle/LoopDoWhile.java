package modulo2_estruturasControle;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {

        // do {} while ();

        Scanner scan = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras...");
            System.out.println("Quer sair? ");
            texto = scan.nextLine();
        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        scan.close();
    }

}
