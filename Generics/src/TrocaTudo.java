import java.util.Arrays;

public class TrocaTudo {

    // MÉTODO GENÉRICO
    // <T>: Avisa que este método específico vai lidar com um tipo genérico.
    // void: O método não retorna nada (apenas altera o array).
    // T[] array: Recebe um array de qualquer tipo (String[], Integer[], etc).
    public static <T> void trocarPosicao(T[] array, int origem, int destino) {

        // 1. Validação simples de segurança (Boas práticas)
        if (array == null || origem < 0 || destino < 0 ||
                origem >= array.length || destino >= array.length) {
            System.out.println("Operação impossível: Índices inválidos.");
            return;
        }

        // 2. A Lógica de Troca (Swap)
        // Precisamos de uma variável temporária do tipo T para não perder o valor
        T temporario = array[origem];
        array[origem] = array[destino];
        array[destino] = temporario;
    }

    public static void main(String[] args) {
        // TESTE 1: Com Strings
        String[] nomes = {"Ana", "Marcos", "Bia"};
        System.out.println("Antes: " + Arrays.toString(nomes));

        // Troca o 0 ("Ana") com o 2 ("Bia")
        TrocaTudo.trocarPosicao(nomes, 0, 2);

        System.out.println("Depois: " + Arrays.toString(nomes));

        System.out.println("-----------------");

        // TESTE 2: Com Integers (Wrapper Class)
        // Atenção: Generics não funcionam com int primitivo (int[]), precisa ser Integer[]
        Integer[] numeros = {10, 20, 30, 40};
        System.out.println("Antes: " + Arrays.toString(numeros));

        // Troca o 1 (20) com o 3 (40)
        TrocaTudo.trocarPosicao(numeros, 1, 3);

        System.out.println("Depois: " + Arrays.toString(numeros));
    }
}