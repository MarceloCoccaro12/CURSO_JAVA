package secao20;

import java.util.*;

public class Generics {
    
    public static void main(String[] args) {
        
        // 1 - classes genéricas

        // quando instanciamos o objeto, agora o T é ALGUMA COISA
        Caixa<Integer> caixaInterira = new Caixa<>();

        caixaInterira.adicionar(100);
        
        System.out.println(caixaInterira.obter());

        Caixa<String> caixaStr = new Caixa<>();
        caixaStr.adicionar("teste");
        System.out.println(caixaStr.obter());
        
        System.out.println();
        // 2 - métodos genericos
        System.out.println("Maior valor entre 5 e 10: " +obterMaior(5, 10) );
        System.out.println("Maior valor entre Java e Python: " +obterMaior("Java", "Python") );

        String[] letras = {"a", "b", "c", "d"};

        Integer[] numeros = {12, 44, 123, 999};

        Boolean[] bools = {true, false, false, true};

        imprimirArray(letras);
        imprimirArray(numeros);
        imprimirArray(bools);

        System.out.println();
        System.out.println();

        // 3 - Bounded types
        Comparador<Integer> comparadorInteiros = new Comparador<>();
        Comparador<Double> comparadorInteiros2 = new Comparador<>();

        System.out.println("Maior número entre 20 e 10: " + comparadorInteiros.obterMaior(20, 10));
        System.out.println("Maior número entre 20 e 10: " + comparadorInteiros2.obterMaior(1.95, 4.55));

        System.out.println();
        // 4 - Widcard
        
        List<Integer> numeros2 = List.of(1,2,3);
        List<String> palavra2 = List.of("teste", "Java", "olá");

        // aceita qualquer tipo de lista (?)
        imprimirLista(numeros2);
        imprimirLista(palavra2);

        // aceita listas numericas (? extends Number)
        System.out.println(somarNumeros(numeros2));

        // aceita apenas tipos numéricos específicos
        List<Integer> numero3 = new ArrayList<>();

        adicionarNumeros(numero3);
        
        for(Integer numero : numero3){
            System.out.println(numero);
        }

        System.out.println();
        // 5 - generics com collections
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);
        listaInteiros.add(25);
        // listaInteiros.add(30.1);

        for(Number numero : listaInteiros){
            System.out.println(numero);
        }

        Set<String> conjutoDePalavras = new HashSet<>(); // Set só permite dados únicos
        conjutoDePalavras.add("Java");
        conjutoDePalavras.add("Java");
        conjutoDePalavras.add("Generics");

        for(String palavras : conjutoDePalavras){
            System.out.println(palavras);
        }
        Map<String, Integer> mapaDeIdades = new HashMap<>();
        mapaDeIdades.put("Matheus", 33);
        mapaDeIdades.put("Maria", 21);
        mapaDeIdades.put("João", 19);

        for(Map.Entry<String, Integer> entrada : mapaDeIdades.entrySet()){
            System.out.println(entrada.getKey() +" tem "+ entrada.getValue() + " anos de idade.");
        }


    }

    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <T> void imprimirArray(T[] array){
        for(T elemento : array){
            System.out.print(elemento + ", ");
        }
    }

    public static void imprimirLista(List<?> lista){
        for(Object elemento : lista){
            System.out.println(elemento);
        }
    }

    public static double somarNumeros(List<? extends Number> lista){

        double soma = 0;

        for(Number numero : lista){
            soma += numero.doubleValue();
        }

        return soma;
    }

    public static void adicionarNumeros(List<? super Integer> lista){

        for(int i = 1; i <= 5; i++){
            lista.add(i);
        }

    }
}
