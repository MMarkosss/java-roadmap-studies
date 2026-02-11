// 'extends' diz que Livro herda tudo de Produto
public class Livro extends Produto implements Promocional {
    private String autor;

    public Livro(String nome, double preco, int estoque, String autor) {
        // 'super' chama o construtor da classe Pai (Produto)
        super(nome, preco, estoque);
        this.autor = autor;
    }

    // Sobrescrita (Polimorfismo Básico): Melhorando o método exibirDetalhes
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Executa o que o Pai já fazia
        System.out.println("Autor: " + autor); // Adiciona a parte específica
    }

    @Override
    public double aplicarDesconto(double porcentagem) {
        return getPreco()*(porcentagem/100);
    }
}