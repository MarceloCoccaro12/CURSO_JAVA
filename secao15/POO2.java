package secao15;

import java.util.Arrays;

public class POO2 {
    
    public static void main(String[] args) {
        
        // 1 - Níveis de acesso
        Funcionario func1 = new Funcionario("Matheus", 2000, "teste123");

        func1.exibirDados();
        
        func1.nome = "Teste";
        func1.salario = 1500;
        // func1.senha = "teste4212";

        func1.exibirDados();
        func1.aumentarSalario(10);

        // System.out.println(func1.verificarSenha());

        if(func1.autenticar("teste123")){
            System.out.println("Usuário entrou no sistema");
        }

        // 2 - Classe Imutável

        PessoaImutavel joaquim = new PessoaImutavel("Joaquim", 23);

        System.out.println(joaquim.getNome());
        System.out.println(joaquim.getIdade());

        // joaquim.nome = "teste";

        // 3 - Encapsulamento de arrays

        String[] meusAlunos = {"Matheus", "João", "Maria"};

        Turma novaTurma = new Turma(meusAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));
        
        String[] outrosAlunos = {"Aluno 1", "Aluno 2"};
        
        novaTurma.setAlunos(outrosAlunos);
        
        System.out.println(Arrays.toString(novaTurma.getAlunos()));



    }
}
