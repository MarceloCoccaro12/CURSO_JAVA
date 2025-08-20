package secao17.Exercicios;

public class FuncionarioMeioPeriodo extends Funcionario{

    private double salarioPorHora;
    private int horasTrabalhadas;

    public FuncionarioMeioPeriodo(String nome, double salarioPorHora, int horasTrabalhadas){
        super(nome);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario(){
        return salarioPorHora * horasTrabalhadas;
    }

    @Override
    public void adicionarBeneficios(String beneficio){
        System.out.println("Beneficio adicionado para meio periodo: " +beneficio);
    }

    
    
}
