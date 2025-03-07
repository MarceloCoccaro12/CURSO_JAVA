package secao2;

public class Exercicios {

    /*
     * EXERCÍCIO 1:
     * 
     * Crie uma variável int para armazenar o valor 10.
     * Crie uma segunda varável int que armazene o dobro do valor da primeira variável
     * usando operadores aritméticos.
     * Exiba o resultado.
     * 
     * EXERCÍCIO 2:
     * 
     * Declare uma variável char que armazene a letra 'B'.
     * Faça o casting explícito dessa variável para int e exiba o valor numérico correspondente.
     * 
     * EXERCÍCIO 3:
     * 
     * Declare duas variáveis double para armazenar os valores 15.75 e 20.40.
     * Some os valores dessas variáveis e armazene o resultado em uma nova variavel double.
     * Exiba o resultado
     * 
     * EXERCICIO 4
     * 
     * Declare uma variavel long para armazenar o numero de 2 bilhoões (2_000_000_000).
     * Em seguida, declare uma variavel int e faça o cating explicito do valor long para int.
     * Exiba o resultado.
     * 
     * EXERCÍCIO 5
     * 
     * Escreva um programa que crie uma variavel String com o valor "Olá, Mundo".
     * Em seguida, crie outra variavel String que concatena a primeira variável com o texto
     * "Bem-vindo ao Java!".
     */
    public static void main(String[] args) {
        // ex1
        int n1 = 10;
        int dobro = n1 * 2;
        System.out.println(dobro);

        // ex2
        char letra = 'B';
        int letraB = (int) letra;
        System.out.println(letraB);

        // ex3
        double num1 = 15.75;
        double num2 = 20.40;
        double soma = num1 + num2;
        System.out.println(soma);

        // ex4
        long numeroGrande = 2_000_000_000L;
        int numeroGranInt = (int) numeroGrande;
        System.out.println(numeroGranInt);

        // ex5
        String mensagem = "Olá, mundo. ";
        String saudacao = mensagem + "Bem-vindo ao Java!";
        System.out.println(saudacao);


    }

}
