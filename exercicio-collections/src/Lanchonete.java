import java.util.HashMap;
import java.util.Map;

public class Lanchonete {
    public static void main(String[] args) {
        Map<String, Double> pedidos = new HashMap<>();
        pedidos.put("X-Burger",25.50);
        pedidos.put("Refrigerante",8.0);
        pedidos.put("Batata Frita",12.00);

        // Alterar
        pedidos.put("X-Burger",30.0);

        System.out.println("O Preço do refri:" + pedidos.get("Refrigerante"));

        pedidos.forEach((produto, valor) -> {
            System.out.println(produto + " custa R$ " + valor);
        });


    }
}