package modulo3_ClassesMetodos.desafios;

public class Jantar {
    public static void main(String[] args) {

        Comida feijao = new Comida("feijão", 0.200);
        Comida arroz = new Comida("arroz", 0.130);

        Pessoa marina = new Pessoa("Marina", 47.0);

        System.out.println(marina.peso);

        marina.comer(feijao);

        System.out.println(marina.peso);

        marina.comer(arroz);

        System.out.println(marina.peso);


    }
}
