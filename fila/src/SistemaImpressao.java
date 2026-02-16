import java.util.ArrayDeque;
import java.util.Deque;

public class SistemaImpressao {

    public static void main(String[] args) {
        // Usamos Deque porque precisamos da funcionalidade de inserir no início (VIP)
        // ArrayDeque é mais performático que LinkedList aqui
        Deque<String> filaImpressao = new ArrayDeque<>();

        System.out.println("--- Recebendo Documentos ---");

        // 1. Adicionando documentos normais (offer/offerLast)
        filaImpressao.offer("Relatorio_Mensal.pdf");
        System.out.println("Adicionado: Relatorio_Mensal.pdf");

        filaImpressao.offer("TCC_Final.docx");
        System.out.println("Adicionado: TCC_Final.docx");

        // 2. Chega um documento URGENTE (offerFirst)
        System.out.println(">> ALERTA: Documento do CEO recebido! <<");
        filaImpressao.offerFirst("URGENTE_Demissoes.xlsx");

        // 3. Mais um normal
        filaImpressao.offer("Foto_Gatinho.jpg");
        System.out.println("Adicionado: Foto_Gatinho.jpg");

        System.out.println("\n--- Estado Atual da Fila ---");
        System.out.println(filaImpressao); // Note a ordem: O urgente está no começo

        System.out.println("\n--- Iniciando Impressão ---");

        // 4. Processando a fila (Loop enquanto houver itens)
        while (!filaImpressao.isEmpty()) {
            // poll() pega e remove o primeiro da fila (cabeça)
            String docAtual = filaImpressao.poll();

            System.out.println("Imprimindo: " + docAtual + "...");

            try {
                Thread.sleep(1000); // Simula o tempo de impressão
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nTodos os documentos foram impressos!");
    }
}