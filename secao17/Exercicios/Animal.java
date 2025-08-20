package secao17.Exercicios;

public class Animal {
    
    protected String nome;
    protected String som;

    public Animal(String nome, String som){
        this.nome = nome;
        this.som = som;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+nome+", Som: "+som);
    }
    
}
