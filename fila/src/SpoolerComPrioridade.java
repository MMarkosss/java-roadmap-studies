import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class SpoolerComPrioridade {
    public static void main(String[] args) {

        // 2. Criamos o COMPARATOR (O Juiz)
        // Regra: Menor número (1) vem antes do Maior número (5). Ordem Crescente.
        Comparator<Documento> regraDePrioridade = Comparator.comparingInt(doc -> doc.prioridade);

        // 3. Instanciamos a PriorityQueue passando a regra (O Juiz)
        Queue<Documento> filaImpressao = new PriorityQueue<>(regraDePrioridade);

        System.out.println("--- Adicionando documentos fora de ordem ---");

        // Adicionamos em ordem aleatória
        filaImpressao.offer(new Documento("Foto_Gatinho.jpg", 5)); // Baixa
        filaImpressao.offer(new Documento("Relatorio_Financeiro.xlsx", 2)); // Média-Alta
        filaImpressao.offer(new Documento("Trabalho_Escola.docx", 4)); // Média-Baixa
        filaImpressao.offer(new Documento("MEMORANDO_CEO_URGENTE.pdf", 1)); // Altíssima!

        /* NOTA: Se você der um System.out.println(filaImpressao) aqui, a ordem visual
         pode parecer estranha. A PriorityQueue só garante que o PRIMEIRO (head)
         está correto, o resto ela arruma conforme removemos. */

        System.out.println("\n--- Processando a Fila (A Magia Acontece) ---");

        while (!filaImpressao.isEmpty()) {
            // O poll() vai perguntar ao Comparator: "Quem é o menor número agora?"
            Documento doc = filaImpressao.poll();
            System.out.println("Imprimindo: " + doc);
        }
    }
}