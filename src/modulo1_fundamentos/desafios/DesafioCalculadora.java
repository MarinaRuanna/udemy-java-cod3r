package modulo1_fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
          /*
     Ler num1
     Ler num2
     - + * / %
    */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número: ");
        double num1 = scan.nextDouble();

        System.out.println("Digite o número: ");
        double num2 = scan.nextDouble();

        System.out.println("Informe a operração que deseja executar: ");
        String op = scan.next();

        // Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

        scan.close();
    }

}
