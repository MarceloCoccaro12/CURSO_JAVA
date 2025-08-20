package secao17.Exercicios;

public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, String som, String raca){
        super(nome, som);
        this.raca = raca;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: "+nome+", Som: "+som+ ", Raça: "+raca);
    }
    
}
