
package model;

/**
 *
 * @author mylen
 */
public class Paciente {
    
    private int id;
    private String nome;
    private int cpf;
    private int telefone;
    private char endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public char getEndereco() {
        return endereco;
    }

    public void setEndereco(char endereco) {
        this.endereco = endereco;
    }
            
    
}
