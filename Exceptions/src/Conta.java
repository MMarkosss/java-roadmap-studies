public class Conta {
    private double saldo;

    // Note o "throws" na assinatura!
    public void sacaDinheiro(double valor) throws SaldoInsuficienteException {

        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            // Sintaxe correta: throw new
            throw new SaldoInsuficienteException("Erro, saldo insuficiente!");
        }
    }
}