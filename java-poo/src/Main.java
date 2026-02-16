
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // --- 1. PREPARANDO O SISTEMA ---
        // Criando o cliente (simulação de banco de dados)
        Cliente cliente = new Cliente("Ana", "123456");

        // --- 2. TENTATIVA DE LOGIN (Interface em ação) ---
        System.out.println("--- TELA DE LOGIN ---");
        boolean isLogado = cliente.login("123456"); // Tente mudar a senha para testar o erro

        if (isLogado) {
            // --- 3. SE LOGOU, MONTA O CARRINHO ---
            System.out.println("\n--- INICIANDO COMPRAS ---");
            ArrayList<Produto> carrinho = new ArrayList<>();

            carrinho.add(new Livro("Harry Potter", 40.0, 10, "J.K. Rowling"));
            carrinho.add(new Eletronico("Fone JBL", 200.0, 5, 110));
            carrinho.add(new Roupa("Camiseta Java", 60.0, 20, 'G'));

            double total = 0;
            double totalDesconto =0;
            for (Produto p : carrinho) {

                p.exibirDetalhes();
                if (p instanceof Promocional promo) {
                    totalDesconto += promo.aplicarDesconto(10);
                    total += p.getPreco();
                } else {
                    total += p.getPreco();
                }

                System.out.println("-----------------");

            }
            total = total - totalDesconto;

            System.out.println("TOTAL DO PEDIDO: R$ " + total);
            System.out.println("Você economizou: "+ totalDesconto +" R$ com os descontos");

            // --- 4. PAGAMENTO (Polimorfismo) ---
            Pagamento pagamento = new PagamentoPix(total, "chave@pix.com");
            pagamento.processar();

        } else {
            System.out.println("Acesso negado. Não é possível comprar.");
        }
    }
}
