package secao11;

// import java.util.Scanner;

/*
 * 
 * > Exercício 1: Somatório com for
 * 
 * Crie  um programa que use um loop for para calcular 
 * o somatório dos números  de 1 a 100 e exiba o resultado.
 * 
 * > Exercício 2: Impressaão de Número Pares com While
 * 
 * Desenvolva um programa que use um loop while para imprimir
 * todos os números  pares de 1 a 20.
 * 
 * > Exercício 3: Verificação de Numero Primo com for
 * 
 * Escreva um programa que receba um número do usúario
 * e use um loop for para verificar se ele é primo.
 * 
 * > Exercício 4: Menu Interativo com do-while
 * 
 * Crie um programa que exiba um menu interativo usando do-while,
 * permitindo ao usúario escolher opções até ele sair.
 * 
 * // mnenu de opcoes com print: 1) comida 2) bebida 3)
 * // um número aleatoio que mediante a ser X, pare o loop
 * 
 * > Exercício 5: Fatorial de um Núemero com for
 * 
 * Desenvolva um programa que calcule o
 * fatorial de um número inteiro positivo usando um loop for 
 * 
 * > Exercício 6: Contagem de Dígitos de um Númeor com while
 * 
 * Crie um progrma que conte quantas dígitos há em num número inteiro positivo
 * usando um loop while.
 * 
 * 1000 = 4 digitos
 */

public class Exercicios {
    
    public static void main(String[] args) {
        
        // Exercício 1
        int somatorio = 0;
        for(int i = 0; i <=100; i++){
            somatorio += i;
        }
        System.out.println("Soma de 1 a 100: " + somatorio);

        // // Exercício 2
        int numero = 1;

        while(numero <= 20){

            if(numero % 2 == 0){
                System.out.println("Número par: "+numero);
            }

            numero++;
        }

        // Exercício 3

        int numPrimo = 5;
        boolean ePrimo = true;

        // testar se ele é primo
        for(int i = 2; i < numPrimo; i++){

            // dividir esse cara e não ter resto, ele não é primo
            // 1 e por ele mesmo

            if(numPrimo % i == 0){
                ePrimo = false;
                break;
            }
        }

        if(ePrimo){
            System.out.println("Número "+numPrimo+ " é primo!");
        } else{
            System.out.println("Número "+numPrimo+ " NÃO é primo!");
        }

        // Exercício 4
        int opcao;
        
        do{

            System.out.println("Exercício número 4 - Menu");
            System.out.println("1) Hamburguer");
            System.out.println("2) Cachorro quente");
            System.out.println("3) Sushi");
            System.out.println("4) Sair");

            opcao = (int)(Math.random() * 5);

            System.out.println("A opção escolhida foi: " +opcao);

        } while(opcao != 4);

        // Exercicio 5
        
        int numFatorial = 5;
        int fatorial = 1;

        for(int i = 1; i <= numFatorial; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de "+numFatorial+" é igual a "+fatorial);
        
        // Exercício 6
        int numeroParaContar = 1000;
        int contador = 0;

        while(numeroParaContar != 0){

            numeroParaContar = numeroParaContar / 10;

            contador++;
        }
        System.out.println("Numero de dígitos: "+contador);
    }

}
