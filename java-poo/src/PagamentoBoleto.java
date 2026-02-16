public class PagamentoBoleto extends Pagamento{
    private String codigoBarra;

    public PagamentoBoleto(double valor, String codigoBarra) {
        super(valor);
        this.codigoBarra = codigoBarra;
    }

    @Override
    public void processar() {
        System.out.println("Boleto gerado. Aguardando pagamento em até 3 dias úteis");
    }
}