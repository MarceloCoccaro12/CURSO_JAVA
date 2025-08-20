package secao17.Exercicios;

/**
 * > Exercicio 1: Composição de Objetos (Object Composition)
 * Enunciado: Crie uma classe Endereco que tenha os atributos rua, numero e cidade.
 * Agora, crie uma classe Pessoa que tenha como nome, idade, 
 * e um atributo de composição endereco, que será do tipo Endereço.
 * Implemente um método exibirInformações em Pessoa que exiba os dados da pessoa e 
 * seu endereço completo.
 * 
 * > Exercício 2: Herença e Sobrescrita de Métodos (Overriding)
 * 
 * Enunciado: Crie uma classe Veiculo com método acelerar() que exiba a mensagem "O veículo está acelerando".
 * Crie duas subClasses, Carroi e Moto, que herdam de Veicuo.
 * Na subclasse Carro, sobrescreva o método acelerar() para exibir "O carro está acelerando".
 * Na subclasse Moto, sobrescreva o método acelerar() para exibir "A moto está acelerando".
 * Crie uma classe principal e teste o polimorfismo com os diferentes tipos de veículos.
 * 
 * > Exercício 3: Uso do Método super().
 * 
 * Enunciado: Crie uma classe base Animal com, atributos como nome e som,
 * além de um construtor que inicialize esses atributos.
 * Crie uma subclasse Cachorro que, além de herdar de Animal, tenha um atributo raça.
 * No Construtor de Cachorro, use a palavra-chave super para chamar o construtor da classe Animal e
 * inicializar nome e som. Crie um método exibirDetalhes() que exibe o nome, o som e a raça do Animal.
 * 
 * > Exercicio 4: Classe Abstrata e Interface
 * 
 * Enunciado: Crie uma classe abstrata Funcionario com um atributo nome e um método abstrato calcularSalrio().
 * Crie duas subclasses, FuncionarioTempoIntegral e FuncionarioMeioPeriodo,
 * que implementam o método calcularSalario().
 * Além disso, crie uma interface Beneficioos com um método adicionarBeneficios().
 * As duas  subclasses devem implementar essa interface, adicionando diferentes beneficios a cadsa tipo de funcionario.
 * 
 *  // exetends CLASSE_A implements CLASSE_B
 * 
 * > Exercício 5: Implementação de Múltiplas Interfaces e Polimorfismo
 * 
 * Enunciado: Crie duas interfaces: Pilotavel com o método pilotar(), e Navegavel com o método navegar().
 * Crie uma classe Barco que implemente a interface Navegavel
 * e uma classe Aviao que implementa Pilotavel.
 * Agora, crie uma classe Hidroavio que herda de Barco e implementa tanto Pilotavel quando Navegavel.
 * Na classe principal, use polimorfismo para criar uma função operarVeiculo()
 * que aceite tanto Navegavel quanto Pilotavel e execute os métodos corretos com base no tipo de objeto passado.
 * 
 
 * 
 */

public class Exercicios {

    public static void main(String[] args) {
        
        // Exercicio 1
        Endereco end = new Endereco("Joao Alfredo", 360, "São Paulo");
        
        Pessoa p1 = new Pessoa("Fulano", 33, end);
    
        p1.exibirInformacoes();

        System.out.println();
        // Exercicio 2

        Veiculo veiculo = new Veiculo();
        
        Carro car = new Carro();

        Moto moto = new Moto();

        veiculo.acelerar();
        car.acelerar();
        moto.acelerar();

        System.out.println();
        // Exercicio 3

        Animal leao = new Animal("Leão", "Rugido");

        Cachorro cachorro = new Cachorro("Cachorro", "Late", "Malinois");

        leao.exibirDetalhes();
        cachorro.exibirDetalhes();

        System.out.println();
        // Exercicio 4
        Funcionario fti = new FuncionarioTempoIntegral("Ana", 400);
        Funcionario fmp = new FuncionarioMeioPeriodo("pedro", 40, 120);

        System.out.println("Salario Ana: "+ fti.calcularSalario());
        System.out.println("Salario Pedro: "+ fmp.calcularSalario());

        fti.adicionarBeneficios("Plano de saude e VA");
        fmp.adicionarBeneficios("VA");

        System.out.println();
        // Exercico 5
        Pilotavel meuHidro = new Hidroaviao();
        Navegavel barco = new Barco();
        Pilotavel aviao = new Aviao();

        meuHidro.pilotar();
        aviao.pilotar();
        barco.navegar();

        operaraVeiculo(meuHidro);
        operaraVeiculo(aviao);
        operaraVeiculo(barco);

    }

    public static void operaraVeiculo(Object veiculo){
        if(veiculo instanceof Pilotavel){
            System.out.println("Este veículo é pilotável");

        } 
        
        if (veiculo instanceof Navegavel){
            System.out.println("Este veículo é navegável");

        }
    }

}
