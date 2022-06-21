package modulo3_ClassesMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {

        // Construtor sem parametros
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;


        // Construtor com um parametro
        var p2 = new Produto("Caneta Preta");
        p2.preco = 12.56;

        // Contrutor com dois parametros
        Produto p3 = new Produto("Computador", 3300);

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double mediaCarrinho = (p1.precoComDesconto()
                + p2.precoComDesconto(0.1)
                + p3.precoComDesconto())
                / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

    }
}
