package modulo2_estruturasControle;

import java.util.Scanner;

public class CondicionalIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o média: ");
        double media = scan.nextDouble();
        
        if (media <= 10 && media >= 7.0 ) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns");
        }
        if (media < 7.0 && media >= 4.5 ) {
            System.out.println("Recuperação");
        }
        if (media < 4.5 && media >= 0.0 ) {
            System.out.println("Reprovado");
        }

        scan.close();
    }
}
