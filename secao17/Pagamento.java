package secao17;

interface Pagamento {
    
    // método abstrato
    void processarPagamento(double valor);

    // método com default
    default void exibirRecibo(double valor){
        System.out.println("Recibo do pagamento, com o valor de R$" +valor);
    }
}
