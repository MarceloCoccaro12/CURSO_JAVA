package secao15;

/**
 * 
 * > Exercício 1: Criando uma Classe Celular
 * 
 * Crie uma classe Celular que tenha as seguintes propriedades: marca, modelo, bateria.
 * Implemente os métodos para ligar e desligar o celular,
 * e outro método que silume o consumo da bateria quando é usado.
 * Crie a classe principal para instaciar dois objetos Celular
 * e testar os métodos criados.
 * 
 * > Exercício 2: Classe Aluno com Encapsulamento e Construtores
 * 
 * Crie uma classe Aluno com os atributos privados nome, matricula, notafinal.
 * Adicione um Construtor  parametrizado para inicializar essas propriedades e
 * implemente os setters e getters com validação para garantir
 * que o nome não seja vazio e a nota final esteja entre  0 e 100.
 * Na classe principla, crie dois objetos Aluno,
 * atribua valores e exiba as informações.
 * 
 * > Exercício 3 : Classe ContaCorrente com Métodos e Encapsulamento
 * 
 * Implemente uma classe Contacorrente com as propriedades privados titular, saldo e limite.
 * Crie os métodos para  depositar(), sacar() e exibirSalado().
 * O método de saque deve verificar se o valor é menor ou igual ao limite de saque
 * e se o saldo é suficiente.
 * Crie dois objetos da classe ContaCorrente e teste os métodos criados.
 * 
 * > Exercício 4: Classe ProdutoEletronico com método dentro de Método.
 * 
 * Crie uma classe ProdutoEletronico com propriedades nome, preco, e garantia.
 * Implemente um método para aplicar desconto no preço e, dentro desse método,
 * chmae outro método que calcula o valor do desconto.
 * Crie um objeto da classe ProdutoEletronico, aplique o desconto
 * e exiba as informações após a alteração do preco.
 * 
 * > Exercício 5: Classe LivroBiblioteca com Lógica em Setters e Getters.
 * 
 * Crie uma classe LivroBiblioteca com as propriedades privadas titulo, autor e disponivível.
 * Adicione métodos parapegar emprestado (definido disponivel com false)
 * e devolver o livro(definido disponivel com true).
 * Nos setters e getters, adicione a lógica para verificar se o livro está disponível 
 * ou já emprestado antes de permitir a ação.
 * Na Classe principal, instancie dois livros e simule o processo de empréstimo e devolução.
 */

public class Exercicios {

    public static void main(String[] args) {
        
        // exercício 1 

        Celular c1 = new Celular();
        c1.marca = "Samsung";
        c1.modelo = "A54";

        
        c1.ligarCelular();
        c1.desligarCelular();

        // exercício 2

        Aluno a1 = new Aluno("Marcos", 123, 100);
        
        System.out.println(a1.getNome());
        System.out.println(a1.getMatricula());
        System.out.println(a1.getNotaFinal());

        Aluno a2 = new Aluno("Pedro", 124, 100);
        
        a1.exibirInfo();
        a2.exibirInfo();



    }
    
}
