package modulo1_fundamentos.desafios;

import javax.swing.*;
import java.util.Scanner;

public class DesafioConversaoStringNumerico {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o valor do seu saláio no mês 1: ");
            String salarioTexto1 = scan.nextLine().replace(",", ".");
            System.out.println("Digite o valor do seu saláio no mês 2: ");
            String salarioTexto2 = scan.nextLine().replace(",", ".");
            System.out.println("Digite o valor do seu saláio no mês 3: ");
            String salarioTexto3 = scan.nextLine().replace(",", ".");

            try {
                double salario1 = Double.parseDouble(salarioTexto1);
                double salario2 = Double.parseDouble(salarioTexto2);
                double salario3 = Double.parseDouble(salarioTexto3);
                double mediaSalario = (salario1 + salario2 + salario3) / 3;

                System.out.printf("A média salarial é de %.2f: ", mediaSalario);

                continueLooping = false;

            } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválda, informe um número inteiro! " + e.getMessage() );
            }

        } while (continueLooping);

    }
}
