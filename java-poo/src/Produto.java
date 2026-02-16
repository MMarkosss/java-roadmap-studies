public class Produto {
    // 1. Atributos (O Estado do objeto)
    // Variáveis que guardam as características
    protected String nome;
    protected double preco;
    protected int quantidadeEstoque;

    // 2. Construtor (O Nascimento do objeto)
    // Executado apenas uma vez, quando usamos o 'new'
    public Produto(String nome, double preco, int estoqueInicial) {
        // 'this' diferencia o atributo da classe do parâmetro do método
        this.nome = nome;
        this.preco = preco; // Usa o Setter para validar já na criação!
        this.quantidadeEstoque = estoqueInicial;
    }

    // --- GETTERS E SETTERS ---

    // Qualquer um pode ver o nome
    public String getNome() {
        return nome;
    }

    // Qualquer um pode ver o preço
    public double getPreco() {
        return preco;
    }

    // Só alteramos o preço se for positivo! (REGRA DE NEGÓCIO)
    public void setPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("ERRO: O preço não pode ser negativo.");
        }
    }
    public int getQuantidadeEstoque () {
        return this.quantidadeEstoque;
    }


    // 3. Métodos (O Comportamento)
    // Ações que o produto pode realizar
    public void exibirDetalhes() {
        System.out.println("--- DETALHES DO PRODUTO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + quantidadeEstoque + " unidades");
    }

    // Método que altera o estado do objeto
    public void vender(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque = quantidadeEstoque - quantidade;
            System.out.println("Venda realizada! " + quantidade + "x " + nome + " vendidos.");
        } else {
            System.out.println("Estoque insuficiente para venda de " + nome);
        }
    }
    public void reporEstoque(int quantidade) {
        System.out.println("Repondo o estoque de: "+nome+" com quantidade de:"+quantidade);
        quantidadeEstoque += quantidade;
    }
}