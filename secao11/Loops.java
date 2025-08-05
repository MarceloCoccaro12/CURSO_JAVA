package secao11;

public class Loops {
    
    public static void main(String[] args) {
        
        // 1- FOR

        // loop que vai rodar de 1 a 5

        // Variavel de inicialização = i, j, k
        // Condição -> determina até quando ou quantas vezes, o loop vai rodar
        // incremento -> a variável vai chegar na condição
        // for(int i = 1; i<=5; i++){
        //     System.out.println("Contador: "+i);

        // }
        // // mostrar cada caractere de um string
        // String palavra = "Java";
        
        // // length em strings da o numero de letras

        // // arrays e strings a primeira posicao é 0
        // // J -> 0
        // for(int i = 0; i < palavra.length(); i++){

        //     // palavara.charAt(0) => palavra.charAt(1)...
        //     System.out.println("Cactere: "+ palavra.charAt(i));
        // }

        // // contagem regressiva
        // for(int i = 5; i > 0; i--){
        //     System.out.println("Contador: " +i);
        // }

        // // 2 - WHILE
        // int i = 0;

        // while (i <= 5) {

        //     System.out.println("Contador: "+ i);
            
        //     i++;
        // }

        // int valor = 0;

        // while(valor != 7){

        //     // Match vai estar em double, então temos que  converter ele para int
        //     valor = (int)(Math.random() * 10);

        //     System.out.println("Valor aleatorio: "+ valor);
        // }

        // // 3 - LOOP INFINITO
        // // while(true){
        // //     System.out.println("Infinito");
        // // }

        // // for(int j = 0; j <= 5; j --){
        // //     System.out.println(j);
        // // }

        // // 4 - DO WHILE

        // int j = 10;
        // do{
        //     System.out.println("O valor de j é: "+ j);

        //     j--;
        // }while(j > 0);

        // int numero = 0;
        // do{
        //     valor = (int)(Math.random() * 10);

        //     System.out.println("Valor aleatorio: "+ valor);

        // }while(numero != 1);

        // // 5 - BREAK

        // // break pode ser utilizado com qualquer estrutura de loop

        // for(int x = 0; x <= 10; x++){
        //     System.out.println("O valor de x é: "+x);

        //     if(x == 5){
        //         System.out.println("Parando loop!");
        //         break;
        //     }
        // }

        // // 6 - CONTINUE

        // for(int x = 0; x > 0; x--){
 
        //     if(x % 2 == 0){
        //         System.out.println("par");
        //         continue;
        //     }

        //     System.out.println("Contador: "+ x);
        // }

        // 7 - NESTED LOOPS

        for(int m = 1; m <= 3; m++){

            System.out.println("EXTERNO");

            for(int n = 1; n <= 3; n++){
                
                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }

        // Padrão de estrelas
        for(int o = 1; o <= 10; o++){

            for(int p = 1; p <= o; p++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
