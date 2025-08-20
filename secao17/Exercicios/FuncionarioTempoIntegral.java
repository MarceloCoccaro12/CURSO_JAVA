package secao17.Exercicios;

public class FuncionarioTempoIntegral extends Funcionario{

    private double salarioBase;
    

    public FuncionarioTempoIntegral(String nome, double salarioBase){
        super(nome);
        this.salarioBase = salarioBase;
        
    }

    @Override
    public double calcularSalario(){
        return salarioBase;
    }

    @Override
    public void adicionarBeneficios(String beneficio){
        System.out.println("Beneficio adicionado para periodo integral: " +beneficio);
    }

    
    
}
