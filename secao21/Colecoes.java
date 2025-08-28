package secao21;

import java.util.*;

public class Colecoes {
    
    public static void main(String[] args) {
        
        // 1 - List

        List<String> listaDeNomes = new ArrayList<>();

        // adicionar
        listaDeNomes.add("Maria");
        listaDeNomes.add("João");
        listaDeNomes.add("Pedro");

        // resgatar
        System.out.println("Primerio nome: " +listaDeNomes.get(0));
        
        // alterar
        listaDeNomes.set(1, "Ana");

        System.out.println("Segundo nome: " +listaDeNomes.get(1));
        
        // Remover elemento
        listaDeNomes.remove(2);
        
        // Erro de execução, fora dos indices do array
        // System.out.println("Segundo nome: " +listaDeNomes.get(2));

        listaDeNomes.add("Teste");
        listaDeNomes.add("Outro teste");

        // procura por valor  de item
        System.out.println(listaDeNomes.contains("Teste"));

        // LinkedList
        List<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros.get(3));

        numeros.remove(0);

        // Ver os valores facilmente
        System.out.println(numeros.toString());

        numeros.set(0, 22);

        System.out.println(numeros.get(0));

        // As collections tem os mesmo métodos, qualquer uma
        // mas nem todas, podem aplicá-los

        System.out.println();
        // 2 - Set

        // HashSet - reordena os elementos
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("PHP");
        conjunto.add("PHP");

        System.out.println(conjunto);
        System.out.println(conjunto.contains("PHP"));

        // LinkedHashSet - manteve a ordem
        Set<Integer> numeros2 = new LinkedHashSet<>();

        numeros2.add(5);
        numeros2.add(10);
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(55);

        System.out.println(numeros2);

        // TreeSet -reordena os elementos
        Set<String> nomes = new TreeSet<>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Roberto");
        nomes.add("Alan");

        System.out.println(nomes);
        // Set não tem get

        System.out.println();
        // 3 - Map
        
        // HashMap
        Map<String, Integer> idadeMap = new HashMap<>();

        // adicionar no map com o put

        idadeMap.put("João", 30);
        idadeMap.put("Mateus", 33);
        idadeMap.put("Alan", 18);
        
        // map com chave já existente
        idadeMap.put("Alan", 24);

        System.out.println(idadeMap);

        System.out.println("Idade de Alan: "+ idadeMap.get("Alan"));

        // Remove elementos
        idadeMap.remove("Mateus");

        // encontrando por chave  e por valor
        System.out.println(idadeMap.containsKey("Alan"));
        System.out.println(idadeMap.containsValue(99));

        // exibir valores
        System.out.println(idadeMap.entrySet());

        // LinkedHashMap
        Map<String, String> capitalMap = new LinkedHashMap<>();

        capitalMap.put("Brasil", "Brasilia");
        capitalMap.put("Argentina", "Buenos Aires");
        capitalMap.put("França", "Paris");

        System.out.println(capitalMap.entrySet());

        System.out.println(capitalMap.containsKey("Brasil"));

        // TreeMap - reordena os itens
        Map<String, Double> produtoPrecoMap = new TreeMap<>();
        produtoPrecoMap.put("Maçã", 3.50);
        produtoPrecoMap.put("Pera", 4.50);
        produtoPrecoMap.put("Leite", 5.50);
        produtoPrecoMap.put("Avelã", 11.50);

        System.out.println(produtoPrecoMap);

        System.out.println(produtoPrecoMap.containsValue(11.50));





    }
}
