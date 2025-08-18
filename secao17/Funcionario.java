package secao17;

public class Funcionario {

    public String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDetalhes(){
        System.out.println("Nome do funcionario: "+ nome);
    }

    public double calcularBonus(){
        return salario * .1;
    }
    
}
