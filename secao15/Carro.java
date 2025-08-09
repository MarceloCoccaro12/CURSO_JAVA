package secao15;

public class Carro {

    // atributos ou propriedades

    String marca;
    String modelo;
    int ano;

    double velocidadeAtual = 0;
    boolean motorLigado = false;

    // métodos

    public void acelerar(){
        System.out.println("Estamos acelerando o carro!");

    }

    public void exibirInfo(){
        System.out.println("Marca: " + marca + ", modelo: " + modelo + ", ano: " + ano);
    }

    // 3 - métodos

    public void ligarMotor(){

        if(!motorLigado){
            motorLigado = true;
            System.out.println("Ligando o motor...");

        } else {
            System.out.println("O motor já está ligado!");
        }

    }

    public void aumentarVelocidade(double incremento){
        if(motorLigado){

            velocidadeAtual += incremento;

            System.out.println("A velocidade atual é: " +velocidadeAtual);

        } else {
            System.out.println("Primeiro precisa ligar o motor!");
        }
    }
    
}
