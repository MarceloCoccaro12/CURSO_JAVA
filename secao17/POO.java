package secao17;


public class POO {
    public static void main(String[] args) {
        
        // 1 - Object Composition
        Motor motor1 = new Motor("V8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();

        // 2 - Herança
        Cachorro turca = new Cachorro("Turca");

        turca.latir();

        Animal leao = new Animal("Leão");

        leao.emitirSom();

        // a subclasse tem acesso a tudo da classe superclasse
        // e a superclasse NAO tem acesso a classe filha

        // 3 - Classe Object
        Pessoa matheus = new Pessoa("Matheus", 33);
        Pessoa pedro = new Pessoa("Pedro", 20);
        
        
        System.out.println(matheus.toString());
        System.out.println(matheus.equals(pedro));
        System.out.println(matheus.hashCode());

        //  4 - Override
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);

        System.out.println(q1.calcularArea());
        System.out.println(c1.calcularArea());

        // 5 - super
        Funcionario funcionario = new Funcionario("Carlos", 3000);

        Gerente gerente = new Gerente("Marcos", 5000, 1000);

        funcionario.exibirDetalhes();
        gerente.exibirDetalhes();
        
        System.out.println(funcionario.calcularBonus());
        System.out.println(gerente.calcularBonus());


        
    }
}
