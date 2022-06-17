package modulo2_estruturasControle;

import javax.swing.*;

public class CondicionalIfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.printf("Número %s é par!", numero);
        } else {
            System.out.printf("Número %s é ímpar!", numero);
        }
    }
}
