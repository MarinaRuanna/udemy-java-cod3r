package modulo2_estruturasControle.desafios;

import java.util.Scanner;

/*
2. Criar um programa informa se o ano atual é um ano bissexto;

Critérios para definir o ano bissexto

Para ser bissexto, o ano deve ser:

Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero;

Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja, deixa resto diferente de zero;

Pode ser que seja divisível por 400. Caso seja divisível por 400, a divisão deve ser exata, deixando o resto igual a zero.

 */
public class Desafio6AnoBissexto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano que deseja verificar se é bissexto: ");
        int year = scan.nextInt();
        boolean leap = year % 4 == 0 && ((year % 100) != 0 || year % 400 == 0);

        System.out.printf("O ano %s é bossexto? %b" , year, leap);

        scan.close();
    }
}
