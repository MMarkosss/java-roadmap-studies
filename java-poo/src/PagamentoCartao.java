public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processar() {
        System.out.println("--- PROCESSANDO CARTÃO ---");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Validando cartão final " + numeroCartao.substring(numeroCartao.length() - 4)); // Pega só os 4 ultimos digitos
        System.out.println("Status: APROVADO.");
    }
}