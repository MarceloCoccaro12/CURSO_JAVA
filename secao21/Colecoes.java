package secao21;

import java.util.*;
import java.util.stream.*;

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

        System.out.println();
        // 4 -iterando

        // for-each
        for(String nome : nomes){

            System.out.println(nome);
        }

        // Iterator
        Iterator<String> nomesIterator = nomes.iterator();

        // remover um elemento
        while(nomesIterator.hasNext()){

            String nome = nomesIterator.next();

            if(nome.equals("João")){
                nomesIterator.remove();
            }
        }

        System.out.println(nomes);

        // ListIterator
        ListIterator<String> listIteratorNomes = listaDeNomes.listIterator();

        while(listIteratorNomes.hasNext()){
            System.out.println("Nome: "+listIteratorNomes.next());
        }

        while(listIteratorNomes.hasPrevious()){
            System.out.println("Nome: "+listIteratorNomes.previous());
        }
    
        System.out.println();
        // 5 - Collections imutáveis

        // criando lista imutavel
        List<String> listaMutavel = new ArrayList<>();

        listaMutavel.add("teste");
        listaMutavel.add("testando");

        List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);

        System.out.println(listaImutavel);

        // nao podemos adicionar novos elementos
        // listaImutavel.add("teste2");

        List<String> listaImutavel2 = List.of("item1", "item2","item3");

        // listaImutavel.add("Item 4");

        System.out.println(listaImutavel2);

        Set<Integer> listaImutavelSet = Set.of(1,2,3);

        // listaImutavelSet.add(4);

        System.out.println(listaImutavelSet);

        System.out.println();
        // 6 - Filter

        List<Integer> numerosFiltrados =  numeros.stream().filter(numero -> numero > 3).collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(numerosFiltrados);

        System.out.println();
        // 7 - busca

        // for
        int numeroParaEncontrar = 4;

        boolean encontrou = false;
        for(Integer numero : numeros){
            if(numero == numeroParaEncontrar){
                encontrou = true;
            }
        }
        System.out.println(numeros);

        System.out.println("Encontrou? " + encontrou);

        // contains
        String nomeBuscado = "Carlos";
        boolean encontrou2 = nomes.contains(nomeBuscado);

        System.out.println(nomes);
        System.out.println("Encontrou nome?: "+ encontrou2);

        // findAny
        Optional<Integer> qualquerNumero = numeros.stream().findAny();

        System.out.println(qualquerNumero);

        Optional<Integer> primeroNumero = numeros.stream().findFirst();

        System.out.println(primeroNumero);

        Optional<Integer> primerioPar = numeros.stream().filter(num -> num % 2 == 0).findFirst();

        System.out.println(primerioPar);

        System.out.println();

        // 8 - Map
        // modificam a collection

        List<Integer> quadrados = numeros.stream()
                                    .map(n -> n * n)
                                    .collect(Collectors.toList());
        
        System.out.println(numeros);
        System.out.println(quadrados);

        List<String> nomeMaiusculos = nomes.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
        
        System.out.println(nomeMaiusculos);

        System.out.println();

        // modificacao

        numeros.add(50);

        System.out.println(numeros);

        // remove elementos pelo valor
        numeros.remove(Integer.valueOf(3));

        System.out.println(numeros);

        // alterar todos os elementos
        numeros.replaceAll(numero -> numero * 3);

        System.out.println(numeros);

        numeros.add(201);
        numeros.add(205);
        numeros.add(208);

        System.out.println(numeros);

        // remocao baseada em condicao

        numeros.removeIf(numero -> numero > 200);

        System.out.println(numeros); 

        System.out.println();
        // 10 - reduce

        int soma = numeros.stream()
                .reduce(0, (acumulador, numero) -> acumulador + numero);
    
        System.out.println("Soma de todos os números: " + soma);

        String frase = nomes.stream()
                .reduce("", (concatenador, nome) -> concatenador + " " + nome);

        System.out.println(frase);

        System.out.println();
        // 11 - ordenacao com comparator

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Pedro", 33));
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("João", 67));
        pessoas.add(new Pessoa("Maria", 18));
        pessoas.add(new Pessoa("Rodrigo", 40));

        // ordenar pelo nome
        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }

        // Ordenar pelo nome e idade

        pessoas.sort(Comparator.comparing(Pessoa::getNome)
                                .thenComparing(Pessoa::getIdade));
    
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }   

        System.out.println();
        // 12 - uso avançado de streams
        
        // flatMap  - achatar listas
        List<List<String>> listaDeListas = Arrays.asList(
            Arrays.asList("Maçã", "Morango"),
            Arrays.asList("Banan", "Mamão"),
            Arrays.asList("Uva", "Melão"));

        List<String> listaUnica = listaDeListas.stream()
                                .flatMap(List::stream)
                                .collect(Collectors.toList());

        System.out.println(listaUnica);

        // pipeline
        List<Integer> resultado = numeros.stream()
                            .filter(n -> n % 2 == 0) // filtro de pares
                            .map(n -> n * 5) // multiplicacao
                            .sorted() // ordenacao
                            .collect(Collectors.toList());

        System.out.println(resultado);

    }
}  
