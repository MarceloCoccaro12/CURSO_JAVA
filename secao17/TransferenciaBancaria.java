package secao17;

public class TransferenciaBancaria implements Pagamento{

    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$"+valor+", via transferência bancaria");
    }

    @Override
    public void exibirRecibo(double valor){
        System.out.println("O valor de R$"+valor+ " foi tranferido para o banco.");
    }
    
}
