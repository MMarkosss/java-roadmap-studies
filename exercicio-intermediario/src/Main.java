import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("=== Calculadora: Fração para Decimal ===");

        try {
            // 1. Numerador
            System.out.println("Digite o numerador (Inteiro):");
            int numerador = Integer.parseInt(leitor.nextLine());

            // 2. Denominador
            System.out.println("Digite o denominador (Inteiro):");
            int denominador = Integer.parseInt(leitor.nextLine());

            // 3. A Lógica da Divisão
            // O Java tenta dividir inteiros primeiro. Se for divisão por zero, ele lança ArithmeticException AQUI.
            // Se não for por zero, convertemos para double para ver o decimal.

            // Truque de Mestre: Fazemos a conta de inteiros primeiro só para validar o zero
            int testeZero = numerador / denominador;

            // Se passou pelo teste acima, fazemos a conta real com decimais
            double resultado = (double) numerador / denominador;

            System.out.println("O resultado é: " + resultado);

        } catch (NumberFormatException erro) {
            System.out.println("Erro: Você digitou caracteres não numéricos!");

        } catch (ArithmeticException erro2) {
            System.out.println("Erro Crítico: Impossível dividir por ZERO.");
        } finally {
            leitor.close(); // Boa prática: fechar o scanner
        }
    }
}