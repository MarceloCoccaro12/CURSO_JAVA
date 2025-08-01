package secao8;

/*
 * 
 * 
 * > Exécicio 1 : Função para Converter Temperatura
 * 
 * Crie uma função quer converta uma temperatura de Celsiues para Fahrenheit.
 * A função deve receber a tempejratira em Celsius como argumento
 * e retornar o valor correspondente em Fahrenheit.
 * Exiaba o resultado encapsulado em uma variavel.
 * 
 * > Exercício 2: Funçao para Calcular o Fatorial de um Número
 * 
 * Crie uma funcão que calcule o fatorial de ler número inteiro.
 * Teste a função com um número de sua escolha.
 * 
 * > Exercício 3 : Função com if-else para verificar Paridade
 * 
 * Criei uma função que receba um número inteiro
 * e retorne uma stringIndicando se o núemro é "Par" ou "Ímpar".
 * Use condicionais if-else para determinar a partidade.
 * 
 * > Exercício 4: Função com switch para Classificar Notas
 * 
 * Crie uma função que receba uma nota de 0 a 10
 * 10 e 9: A, 8: B, 7: C, 6: D, 5: E, restante F
 * e retorne uma classificação de letra (A, B, C, D, E, F) usando switch.
 * Inclua uma verificação para garantir que a nota está dentro do intervalo válido
 * 
 * > Exercício 5: Função com System.exit para Verificar Idade
 * 
 * Crie uma função que receba idade de uma pessoa.
 * Se a idade for menor que 18, use System.exit(0)
 * para encerrar o programa com uma mensagem de "Acesso negado".
 * Caso contrário, exiba "Acesso permitido"
 * 
 * > Exercício 6 (Desafio): Função que Recebe uma Array e Retorna o Maior Número
 * 
 * Crie uma função que receba um array de inteiros
 * e retorne o maior número presente no array.
 * Utilize um loop para percorrer os elementos do array e identificar o maior valor.
 */


public class Exercicios{

    public static void main(String[]args){

        // Exercício 1

        double c1 = 50;
        double f1 = converterTemperatura(c1);
        System.out.println("A temperatura de " +c1+ "C é equivalente a" +f1+"F");

        // Exercicio 2

        System.out.println("O fatorial de 10 é: " + calcularFatorial(10));

        // Exercício 3

       System.out.println(parOuImpar(6));
       System.out.println(parOuImpar(7));

       // Exercicio 4
       System.out.println(classificarNotas(11));
       System.out.println(classificarNotas(10));
       System.out.println(classificarNotas(4));

       //Exercício 5
      // verificarIdade(4);
       verificarIdade(19);

       //Exercicio 6
       int [] numeros = {100, 5, 44, 5};
       System.out.println(encontrarMaior(numeros));

    }

    //Funções

    public static double converterTemperatura(double c){
        double F = (c * 1.8) + 32;
        return F;
    }

    public static int calcularFatorial(int numero){

        if(numero == 0 || numero == 1){
            return 1;
        } else{
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static String parOuImpar(int numero){
        if(numero % 2 == 0){
            return "Este númeoro é par";
        }
        else{
            return "Este número é ímpar";
        }
    }

    public static String classificarNotas(int nota){
        
        if(nota < 0 || nota > 10){
            return "Nota inválida";
        }

        switch (nota) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            case 5:
                return "E";
            default:
                return "F";
        }
    }

    public static void verificarIdade(int idade){
        if(idade < 18){
            System.out.println("Acesso negado!");
            System.exit(0);

        }else{
            System.out.println("Acesso permitido");
        }
    }

    public static int encontrarMaior(int[] numeros){

        int maior = numeros[0];

        // Contador, cond. execução, Incremento
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        return maior;
    }
}
