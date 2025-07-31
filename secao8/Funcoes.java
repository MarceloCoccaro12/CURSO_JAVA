package secao8;

public class Funcoes {

    public static void main(String[] args){

        // 1- Craindo a primeira função
        //tanto funcoes como variáveis, a gente nomeia;
        saudacao();
        saudacao();
        saudacao();

        // 2- parametros
        soma(2,4);
        soma(8,12);

        saudar("Marcelo");

        // 3 - return
        dobrar(4);

        int numero = 10;

        int numeroDobrado = dobrar(numero);

        System.out.println("O número dobrado é: "+ numeroDobrado);

        System.out.println(dobrar(12));

        // 4- retorno em variavel
        String r1 = verificarPar(numero);

        String r2 = verificarPar(3);

        System.out.println(r1);
        System.out.println(r2);

        int x = dobrar(soma2(2, 4));

        System.out.println(x);


    }

    // NIVEL DE  ACESSO, STATIC => não preciso instanciar classe para executar, TIPO RETORNO
    // NOME, OS PARENTESES (ARGS), BLOCO {}
    public static void saudacao(){
        System.out.println("Olá, esta é minha primeira função!");
    }

    public static void soma(int a, int b){
        int resultado = a+ b;
        System.out.println("O resultado da soma é: " + resultado);

    }

    public static void saudar(String nome){
        System.out.println("Olá, "+ nome + ", tudo bem?");
    }

    // Parâmetros de funções diferentes, podem ter o mesmo nome
    public static int dobrar(int n){
        return n*2;
    }

    public static String verificarPar(int n){
        if(n % 2 == 0){
            return "O número " + n + " é par";
        } else{
            return "O número " + n + " não é par";
        }
    }
    
    public static int soma2(int a, int b){
        return a + b;
    }
}
