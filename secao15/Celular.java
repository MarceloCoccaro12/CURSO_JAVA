package secao15;

public class Celular {
    
    String marca;
    String modelo;
    int bateria = 100;

    boolean celularLigado = false;

    public void ligarCelular(){
        if(!celularLigado){
            celularLigado = true;
            System.out.println("Celular Ligado!");
        } else{
            System.out.println("Celular continua ligado.");
        }
    }

    public void desligarCelular(){
        if(celularLigado){
            System.out.println("Celular desligado.");
        } else {
            System.out.println("Celular está desligado.");
        }
    }

    public void usar(int consumo){
        if(bateria - consumo >= 0 ){
            bateria -= consumo;
            System.out.println("O celular foi usado. A bateria está em " +bateria+"%");
        } else{
            System.out.println("A bateria é insuficiente");
        }
    }





}
