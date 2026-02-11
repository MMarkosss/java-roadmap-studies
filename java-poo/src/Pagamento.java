// 'abstract': Significa que você NÃO pode fazer 'new Pagamento()'.
// Ela só serve para ser herdada.
public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    // Método Abstrato: NÃO tem corpo ( chaves {} ).
    // É uma ORDEM: "Quem herdar de mim, É OBRIGADO a explicar como processar".
    public abstract void processar();
}