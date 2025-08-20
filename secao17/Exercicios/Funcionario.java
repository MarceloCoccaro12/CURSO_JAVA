package secao17.Exercicios;

abstract class Funcionario implements Beneficios{
    
    protected String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
