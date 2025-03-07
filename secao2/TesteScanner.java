package secao2;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {
        // 1 - testando scanner
        Scanner entrada = new Scanner(System.in);

        // Mensagem para o usuario entender o que precisa digitar
        System.out.print("Digite seu nome: ");

        // Resgata o valor  do terminal
        String nome = entrada.nextLine();

        // Exibe o valor
        System.out.println("Olá " + nome + "!");

        // nextInt
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");

        int idade = scanner.nextInt();

        System.out.print("Você tem " + idade + " anos.");
        System.out.println("\n");

        
        // 2 - Problema do nextLine
        
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        scanner.nextLine();
        
        System.out.println("Digite um texto: ");
        
        String txt = scanner.nextLine();
        
        System.out.println("Os dados são, n = " + n + " e txt = " +txt);
        
        // Fechamento do scanner, para evitar memory leak
        entrada.close();
        scanner.close();

        
    }
    
}
