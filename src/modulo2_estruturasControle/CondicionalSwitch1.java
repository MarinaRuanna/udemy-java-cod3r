package modulo2_estruturasControle;

import java.util.Locale;
import java.util.Scanner;

// Switch sem break:

public class CondicionalSwitch1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a faixa: ");

        String faixa = scan.next();

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei nada");
        }
        System.out.println("Fim");
        scan.close();

        // Exemplo 2:
        int idade = 2;

        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("sabe respirar");
        }

    }
}
