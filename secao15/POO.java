package secao15;

public class POO {

    public static void main(String[] args) {
        
        // 1 - Criar classe
        // criaçaode Carro.java
    
        // 2 - Instanciar a classe
        Carro fusca = new Carro();

        // Acessar atributos e métodos sintaxe:
        // NOMEOBJETO.NOMEATRI e NOMEOBJETO.METODO()
    
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;

        fusca.acelerar();
        fusca.exibirInfo();

        Carro carro2 = new Carro();

        carro2.marca = "Fiat";

        // 3 - métodos
        fusca.aumentarVelocidade(10);

        fusca.ligarMotor();

        fusca.aumentarVelocidade(20);
        fusca.aumentarVelocidade(30);
        
        // 4 - Criando propriedades
        Pessoa joao = new Pessoa();

        // PROTEGIDO: joao.nome = "João";

        joao.setNome("João");

        System.out.println("O nome do João é: " +joao.getNome());
        
        joao.setIdade(33);
        
        System.out.println("A idade do João é: " +joao.getIdade());

        // 5 - Setters

        ContaBancaria contaDaAna = new ContaBancaria();

        contaDaAna.setTitular("Ana");
        contaDaAna.setSaldo(1000);
        contaDaAna.exibirInfo();

        System.out.println(contaDaAna.getTitutar());
        System.out.println(contaDaAna.getSaldo());

        // 6 - Lógica em getters e setters

        Produto camisa = new Produto();

        camisa.setNome("Camisa regata");

        System.out.println(camisa.getNome());

        camisa.setPreco(29.99999999);
        System.out.println(camisa.getPreco());
    }
    
}
