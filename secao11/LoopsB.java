package secao11;

public class LoopsB {
    public static void main(String[] args) {

        // 8 - Loops com rótulos

        // rótulos externos e internos

       
        for(int i = 0; i < 5; i++){

            System.out.println("Externo:" +i);

            interno:
            for(int j = 0; j < 3; j++){

                if(j == 2){
                    System.out.println("Parou interno");
                    break interno;
                }
                System.out.println("i"+ i + ", j " +j);
            }
        }

        // 9 - off by one

        // [1, 2, 3, 4]

        // 4 vezes

        // 5 -> acessar um elemento inválido

        // associar o loop a qtd de elementos

        // executar 5 vezes
        for(int i=0; i <= 5; i++){

            System.out.println("I: "+i);
        }
    }
}
