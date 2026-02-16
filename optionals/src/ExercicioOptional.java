import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExercicioOptional {

    // Simula um banco de dados em memória
    private static Map<Integer, String> bancoDeDados = new HashMap<>();

    static {
        bancoDeDados.put(1, "Notebook Dell");
        bancoDeDados.put(2, "Teclado Mecânico");
        bancoDeDados.put(3, "Monitor Ultrawide");
    }

    // 1. TODO: Refatore este método para retornar Optional<String>
    public static Optional<String> buscarProdutoPorId(Integer id) {
        return Optional.ofNullable(bancoDeDados.get(id)); // O Map retorna null se não achar a chave
    }


    public static void main(String[] args) {

        // Tarefa 2: Encadeando busca -> map -> ifPresent
        buscarProdutoPorId(1)
                .map(String::toUpperCase)
                .ifPresent(n -> System.out.println("Encontrado: " + n));

        // Tarefa 3: Imprimindo o resultado do orElse
        System.out.println(
                buscarProdutoPorId(99).orElse("Produto não encontrado")
        );

        // Tarefa 4: Lançando exceção (isso vai parar o programa aqui)
        buscarProdutoPorId(50)
                .orElseThrow(() -> new IllegalArgumentException("Erro: ID inválido"));
    }
}