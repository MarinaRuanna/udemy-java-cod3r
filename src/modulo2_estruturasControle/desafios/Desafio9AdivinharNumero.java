package modulo2_estruturasControle.desafios;

/*
6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
O Jogador tem 10 tentativas para adivinhar o número gerado.
Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
e imprima se o número inserido é maior ou menor do que o número armazenado.
 */
import java.util.Scanner;
import java.util.Random;

public class Desafio9AdivinharNumero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(100);
        System.out.println("Tente adivinhar o numero de 0 a 100, ou digite -1 para desistir:" );
        int chute = scan.nextInt();
        int tentativas;
        int i = 9;
        do {
            if (chute == numero && i == 9) {
                System.out.printf("Você acertou! Na sua primeira tentativa! Parabens!! o numero é %s", numero);
                break;
            } else if (chute == numero) {
                System.out.printf("Você acertou! O numero é %s", numero);
                tentativas = 10 - i;
                System.out.printf("\nvocê usou %s tentativas", tentativas);
                break;
            } else if (chute == -1) {
                System.out.println("Não tentar é pior do que perder :(");
                break;
            } else {
                i--;
                System.out.println("Você errou!");
                if (chute > numero) {
                    System.out.println("Seu chute é maior que o numero!");
                } else {
                    System.out.println("Seu chute é menor que o numero!");
                }
                System.out.println("Tente novamente, você possui " + (i + 1) + " tentativas:");
                chute = scan.nextInt();
            }
                } while ( i > 0);

        if ( i == 0) {
            System.out.println("Você perdeu :( Suas tentativas acabaram e você não acertou o numero!");
        }

        scan.close();
    }
}
