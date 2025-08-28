package secao19;

import java.io.Serializable;

public class Pessoa implements Serializable{
    public static final long serialVersionUID = 1L; // tipo de identificador

    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
