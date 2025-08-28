package secao18;

import java.io.*;

public class Erros {
    
    public static void main(String[] args) {
        
        // 1 - try catch
        try{

            int a  = 0;
            int b  = 0;

            int resultado = b / a;

        } catch(ArithmeticException e){
            System.out.println("Divisão por zero não é possível");
        }

        try {
            
            int[] numeros = {1,2,3};

            System.out.println(numeros[4]);


        } catch (Exception e) {
            System.out.println("Erro genérico");

            System.out.println("Msg:" +e.getMessage());
        }

        System.out.println();
        // 2 - Finally

        try {
            
            int[] numeros = {1,2,3};

            System.out.println(numeros[4]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro genérico finally");

            System.out.println("Msg:" +e.getMessage());

        } finally {
            System.out.println("Executou o finally.");
        }


        try {
            
            int[] numeros = {1,2,3};

            System.out.println("Acessando indice existente: "+numeros[2]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro genérico finally");

            System.out.println("Msg:" +e.getMessage());

        } finally {
            System.out.println("Executou o finally.");
        }

        System.out.println();
        // 3 - verificadas e nao verificadas

        // VERIFICADA - vai estar vermelho e tera que ser tratada

        try {
            BufferedReader reader =new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " +e.getMessage());
        }

        // NÃO VERIFICADAS -erros que o java deixa passar
        String texto = null;

        // System.out.println(texto.length());



        // 4 - Execeções com throw

        try {
            
            validarIdade(20);
            validarIdade(10);

        } catch (Exception e) {
            System.out.println("Erro: " +e.getMessage());

        }

        System.out.println();

        // 5 - execeções customizadas
        Banco minhaConta = new Banco(5000);

        try{

            minhaConta.sacar(6000);
        } catch(SaldoInsuficienteException e) {

            System.out.println("Erro: " + e.getMessage());

        }
        System.out.println();
        // 6 - throws em métodos

        try {
            
            processarArquivo("/var/www/arquivo.txt");

        } catch (FileNotFoundException  e) {
            System.out.println("Error:" +e.getMessage());
        } catch (IOException e) {
            System.out.println("Error:" +e.getMessage());
        }

        System.out.println();
        // 7 - Encadeamento de exceções
        try {
            
            abrirArquivo(null);

        } catch (Exception e) {
            System.out.println("Mensagem: "+e.getMessage());
            System.out.println("Causad original: "+e.getCause());
        }

        System.out.println();
        // 8 - relançar as excecoes

        try {
            
            processarDados(null);

        } catch (Exception e) {
            System.out.println("Outra coisa...");

            System.out.println("Msg: " +e.getMessage());

            System.out.println("Pilha de execução: " +e.getStackTrace());
        }




    }

    public static void validarIdade(int idade){

        if(idade < 18){
            throw new IllegalArgumentException("Idade deve ser maior que 18.");
        }
        System.out.println("Idade válida: "+idade);
    }

    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException{
        if(caminho == null || caminho.isEmpty()){
            throw new IOException("Caminho inválido");
        }

        File arquivo = new File(caminho);

        if(!arquivo.exists()){
            throw new FileNotFoundException("Arquivo não encontrado.");
        }

        System.out.println("Arquivo encontrado com sucesso");
    }

    public static void abrirArquivo(String caminho){

        try {
            
            if(caminho == null){
                throw new NullPointerException("Caminho nulo");
            }

            throw new FileNotFoundException("Arquivo não encontrado.");


        } catch (FileNotFoundException e) {

            NullPointerException npe = new NullPointerException("Erro ao processar arquivo");

            npe.initCause(e);

            throw npe;
            
        }
    }

    public static void processarDados(String dados) throws Exception{

        try {
            
            if(dados == null){
                throw new  NullPointerException("Os dados são nulos.");
            }
            
        } catch (Exception e) {
            System.out.println("Tramento, criação  de log, ...");

            throw e; // mandando o erro para o catch de cima

        }
    }

}
