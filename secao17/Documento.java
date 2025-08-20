package secao17;

interface Imprimivel {
    void imprimir();
}

interface Salvavel {
    void salvar();

    default void instrucaoParaSalvar(){
        System.out.println("Você deve apartar ctrl + s");
    }
}

public class Documento implements Imprimivel, Salvavel{

    private String documento;

    public  Documento(String documento){
        this.documento = documento;
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimindo o documento: "+documento);
    }

    @Override
    public void salvar(){
        System.out.println("Salvando o documento: "+documento);
    }

}