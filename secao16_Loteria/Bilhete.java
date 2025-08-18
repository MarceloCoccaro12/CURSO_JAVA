package secao16_Loteria;

import java.util.Arrays;
import java.util.Random;

public class Bilhete{

    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos){
        this.numerosEscolhidos = numerosEscolhidos;
    }

    // Método para realizar sorteio
    public void realizarSorteio(){

        Random random = new Random();
        resultadoSorteio = new int[6];
        
        for(int i = 0; i < resultadoSorteio.length; i++){

            resultadoSorteio[i] = random.nextInt(60) + 1;
        }
        Arrays.sort(resultadoSorteio);
    }

    // Método contar acertos
    public int contarAcertos(){
        int acertos = 0;

        for(int numeroEscolhido : numerosEscolhidos){
            for(int numeroSorteio : resultadoSorteio){
                if(numeroEscolhido == numeroSorteio){
                    acertos++;
                }
            }
        }

        return acertos;
    }

    // Método exibirResultado
    public void exibirResultado(){
        System.out.println("Números escolhidos: " +Arrays.toString(numerosEscolhidos));
        System.out.println("Números sorteados: " +Arrays.toString(resultadoSorteio));

        int acertos = contarAcertos();
        System.out.println("Número de acertos foi: "+ acertos);
    }

}
