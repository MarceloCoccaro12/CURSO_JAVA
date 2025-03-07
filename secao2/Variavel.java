package secao2;

public class Variavel {
    
    public static void main(String[] args) {
        
        // 1- O que são variaveis
        // tipo -> nome atribuir valor
        String nome = "Matheus";

        // nome => Marcelo
        System.out.println(nome);

        //2 - Atribuição de variável com outra 
        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 999999999999l;

        System.out.println(numeroGrande);

        // 3 -Comentários

        /*
         Comentario linha 1
         linha 2
         linha 3
         */

         /**
          * Função para somar números
          * param1 : Primeiro numero
          * param2 : Segundo numero
          *
          * Retorno soma
          */

        // 4 - Strings
        String fistName = "Matheus ";
        String lastName = "Fulano ";

        System.out.println(fistName + lastName);

        // 5 - Char

        char letra = 'A'; // apenas aspas simples
        System.out.println(letra);

        // 6 - Int

        int n = 42;

        System.out.println(n);
        System.out.println(n + 5);
        System.out.println(n * 10);

        // 7 - Long

        long populacaoMundial = 8000000000000L;
        System.out.println(populacaoMundial);

        // 8 - Double

        double preco = 19.99;
        System.out.println(preco);

        // 9 - OP. aritmeticos p1

        int soma = 12 + 5;
        int sub = 12 - 5;
        int mult = 12 * 5;
        double div = 12 / 2;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);

        // 10 OP. p2
        int x = 5;
        x++;
        x++;
        x++;
        x++;
        System.out.println(x);

        int y = 5;

        y--;

        System.out.println(y);

        int a = 10;
        a += 5;
        System.out.println(a);

       
        int b = 10;
        b -= 5;
        System.out.println(b);

        // 11 - Type casting

        // implicito
        int numero2 = 42;

        long numeroLong = numero2;

        double numereoDouble = numero2;

        System.out.println(numeroLong);
        System.out.println(numereoDouble);

        // explicito

        double valorDouble = 9.93;

        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        // 12 - constantes

        final int DIAS_DA_SEMANA = 7;

        System.out.println("Dias da semana: " +DIAS_DA_SEMANA);

        // 13 - var

        var z = 10;
        System.out.println(z);


    }

}
