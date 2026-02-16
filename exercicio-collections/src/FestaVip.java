import java.util.HashSet;
import java.util.Set;

public class FestaVip {
    public static void main(String[] args) {
        Set<String> Festa = new HashSet<>();
        Festa.add("Carlos");
        Festa.add("Ana");
        Festa.add("Bia");
        Festa.add("Bia");

        System.out.println("Foram convidados:" + Festa.size());

        if (Festa.contains("Bia")) {
            System.out.println("Bia esta convidada");
        }
        Festa.forEach(System.out::println);
    }
}