package modulo1_fundamentos.desafios;
/*
Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
 */
import java.util.Scanner;

public class Desafio3CalculadoraImc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso (em kg): ");
        String scan1 = scan.nextLine().replace(",", ".");
        double peso = Double.parseDouble(scan1);

        System.out.println("Digite a altura (em metros): ");
        String scan2 = scan.nextLine().replace(",", ".");
        double altura = Double.parseDouble(scan2);

        double imc = peso / (altura * altura);

        System.out.printf("O IMC é de %.2f", imc);

        scan.close();
    }
}
