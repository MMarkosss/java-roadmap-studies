
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        List<String> parafazer = new ArrayList<>();
        // O ArrayList só é lento se você inserir no início ou no meio (porque ele precisa empurrar todo mundo para o lado).
        parafazer.add("Estudar Java");
        parafazer.add("Fazer Café");
        parafazer.add("Almoçar");
        parafazer.add("Ir ao mercado");
        parafazer.add("Jantar");

        // Simples, direto e funciona
        if (!parafazer.contains("Dormir")) {
            parafazer.add("Dormir");
        }

        parafazer.remove(2);


        /*
        for (String listfaz:parafazer) {
        System.out.println(listfaz);
        }
        */

        parafazer.forEach(System.out::println);
    }
}