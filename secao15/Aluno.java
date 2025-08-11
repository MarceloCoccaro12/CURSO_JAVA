package secao15;

public class Aluno {
    
    private String nome;
    private int matricula;
    private double notaFinal;

    public Aluno(String nome, int matricula, double notaFinal){
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public void setNome(String nome){
        if(nome != null && !nome.isEmpty() && nome.length() > 3){
            this.nome = nome;
        } else {
            System.out.println("O nome enviado não atende os critérios");
        }
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNotaFinal(double notaFinal){
        if(notaFinal >= 0 && notaFinal <= 100){
            this.notaFinal = notaFinal;
        } else{
            System.out.println("Valor incorreto.");
        }
    }

    public String getNome(){
        return nome;
    }
    
    public int getMatricula(){
        return matricula;
    }

    public double getNotaFinal(){
        return notaFinal;
    }

    public void exibirInfo(){
        System.out.println("O Aluno: "+ nome + " , obteve a nota final de: "+notaFinal);
    }

}


