public class Roupa extends Produto implements Promocional{
    //atributos
    private char tamanho;
    public Roupa(String nome, double preco, int estoqueInicial, char tamanho) {
        super(nome, preco, estoqueInicial);
        this.tamanho=tamanho;
    }
    //Setters e Getters
    public void setTamanho (char tamanho){
        this.tamanho=tamanho;
    }
    public char getTamanho () {
        return tamanho;
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho: "+getTamanho());
    }
    @Override
    public double aplicarDesconto(double porcentagem) {
        return getPreco()*(porcentagem/100);
    }
}