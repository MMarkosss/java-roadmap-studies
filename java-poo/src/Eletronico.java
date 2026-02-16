public class Eletronico extends Produto {
    private int voltagem; // 110 ou 220

    public Eletronico(String nome, double preco, int estoque, int voltagem) {
        super(nome, preco, estoque);
        this.voltagem = voltagem;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Voltagem: " + voltagem + "V");
    }
}