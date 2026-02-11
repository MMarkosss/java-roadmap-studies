public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    // O compilador te obriga a implementar isso, senão dá erro!
    @Override
    public void processar() {
        System.out.println("--- PROCESSANDO PIX ---");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Enviando para a chave: " + chavePix);
        System.out.println("Status: CONFIRMADO IMEDIATAMENTE.");
    }
}