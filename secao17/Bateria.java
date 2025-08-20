package secao17;

public class Bateria extends InstrumentoMusical{
    
    public Bateria(String nome){
        super(nome);

    }

    @Override
    public void tocar(){
        System.out.println("Bantendo nos tambores da " +nome);
    }
}
