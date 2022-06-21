package modulo3_ClassesMetodos;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    public Produto() {
    }

    public Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    public Produto(String nomeInicial, double precoIncial) {
        nome = nomeInicial;
        preco = precoIncial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
