package secao12_calculadora;

import java.util.Scanner;

/**
 * 
 * Objetivo: Crair uma calculadora que faz soma, multiplicação, divisão e subtração
 * 
 * 1 - Pedir dois números para o usúario (double)
 * 2 - Apresentar uma tabela/texto para escolher a operação
 * 3 - Resgatar a operação que o usúario selecionou
 * 4 - Realizar o calculo
 * 5 - Exibir o resultado
 * 6 - Se a operação escolhida for inválida, exibir mensagem de erro
 */

public class CalculadoraSimples {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        double num1 = scanner.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        
        System.out.print("Digite um número: ");

        double num2 = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Escolha um operador (+)(-)(*)(/): ");

        String operador = scanner3.nextLine();
        
        double resultado = 0;

        if(operador.equals("+")){
            resultado = num1 + num2;
            
        } else if(operador.equals("-")){
            resultado = num1 - num2;

        } else if(operador.equals("*")){
            resultado = num1 * num2;

        } else if(operador.equals("/")){
            resultado = num1 / num2;

        } else{
            System.out.println("Erro no operador!");
        }

        System.out.println(resultado);
        scanner.close();
        scanner2.close();
        scanner3.close();

    }
    
}
