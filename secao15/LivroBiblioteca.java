package secao15;

public class LivroBiblioteca {
    
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public LivroBiblioteca(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo){
        if(titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        } else {
            System.out.println("Título inválido");
        }
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public boolean estaDisponivel(){
        return disponivel;
    }

    public void pregarEmprestado(){
        if(disponivel){
            disponivel = false;
            System.out.println("Você pegou emprestado, o livro: "+ titulo);
        } else {
            System.out.println("O livro " +titulo+", não está disponível");
        }
    }

    public void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("Você devolveu, o livro: "+ titulo);
        } else {
            System.out.println("O livro " +titulo+", já está disponível");
        }
    }



    


}
