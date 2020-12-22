/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author Mainarti
 */
public class Pessoa extends Sistema
{
    private String nome;
    private String endereco;
    private String email;
    private String cpf;
    private String telefone;
    private static int contPessoa; 
    
    public Pessoa(String nome, String cpf){
        super();
        this.nome = nome;
        this.cpf = cpf;
        
        contPessoa += 1;
    }
    /**
     *
     * @return 
     */
    @Override 
    public String toString(){
        String aux = "CPF: " + cpf ;
        return aux; 
    }
    
   
    // get

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public static int getContPessoas() {
        return contPessoa;
    }
    
    
    // set 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static void setContPessoas(int contPessoas) {
        Pessoa.contPessoa = contPessoas;
    }
    
        
}
