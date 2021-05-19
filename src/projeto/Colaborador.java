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
public class Colaborador extends Pessoa implements Comparable<Cliente>{
    
    private String login;
    private String senha;
    private static int contColaborador;
            
    public Colaborador(String nome, String cpf, String login, String senha){
        super(nome, cpf);
        this.login = login;
        this.senha = senha; 
        contColaborador += 1;
    }
    
    
    @Override 
    public String toString(){
        String aux = "\nLogin: " + login + "\nSenha: " + senha;
        return aux;    
    }
    
    @Override
    public int compareTo(Cliente x) 
    {
	if (x.getEndereco().length() > this.getEndereco().length()) 
        {
            return 1;
	} 
        else if (x.getEndereco().length() < this.getEndereco().length())
        {
            return -1;
	} 
        else 
        {
            return 0;
	}
    }
    
    // get

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;    
    }

    public static int getContColaborador() {
        return contColaborador;
    }
           
    // set

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static void setContColaborador(int contColaborador) {
        Colaborador.contColaborador = contColaborador;
    }
    
}
