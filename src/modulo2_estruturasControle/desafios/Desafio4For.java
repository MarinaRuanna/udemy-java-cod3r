package modulo2_estruturasControle.desafios;

public class Desafio4For {
    public static void main(String[] args) {

        String valor = "#";

        for (int i = 0; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";

        }
        //Desafio: Não pode usar valor numérico para controlar o laço.
        //Pequenas vitorias do dia: Resolvi sozinha em 5 min ;D

        for (String i = "#"; i.length() <= 6; i += "#") {
            System.out.println(i);
        }

        // Versão do professor:
        for (String i = "#"; !i.equals("#####"); i += "#") {
            System.out.println(i);
        }


    }
}
