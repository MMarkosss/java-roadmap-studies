public class BancoApp {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(); // Saldo começa zerado

        try {
            // Tenta sacar 100 reais
            System.out.println("Tentando sacar...");
            minhaConta.sacaDinheiro(100.0);
            System.out.println("Saque realizado!"); // Essa linha é pulada se der erro

        } catch (SaldoInsuficienteException e) {
            // Se der erro, cai aqui
            // e.getMessage() vai retornar "Erro, saldo insuficiente!"
            System.out.println("Não foi possível sacar: " + e.getMessage());

        } finally {
            // Opcional: Executa SEMPRE (dando erro ou não)
            System.out.println("Operação finalizada. Obrigado.");
        }
    }
}