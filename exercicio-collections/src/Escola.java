import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Escola {

    // 1. O Mapa agora é "static" para ser visível por todos os métodos da classe
    static Map<String, List<Double>> boletim = new HashMap<>();

    public static void main(String[] args) {
        // Povoando os dados (simulando um banco de dados)
        boletim.put("João", Arrays.asList(8.0, 9.0, 7.0));
        boletim.put("Maria", Arrays.asList(10.0, 9.5));
        boletim.put("Pedro", Arrays.asList()); // Aluno sem notas

        // 2. Agora você só chama o método passando o nome!
        System.out.println("Média do João: " + calcularMedia("João"));
        System.out.println("Média da Maria: " + calcularMedia("Maria"));
        System.out.println("Média do Pedro: " + calcularMedia("Pedro"));
        System.out.println("Média do Gaspar: " + calcularMedia("Gaspar")); // Aluno que não existe
    }

    // 3. O Método Especialista
    public static double calcularMedia(String nomeAluno) {
        // Segurança: Primeiro verificamos se o aluno existe no mapa
        if (!boletim.containsKey(nomeAluno)) {
            System.out.println("Erro: Aluno " + nomeAluno + " não encontrado.");
            return 0.0;
        }

        List<Double> notas = boletim.get(nomeAluno);

        // O cálculo com Stream
        return notas.stream()
                .mapToDouble(nota -> nota)
                .average()
                .orElse(0.0);
    }
}