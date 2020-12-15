package projeto;

    public class Fornecedor 
    {
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;

    
     public Fornecedor()
    {
        this.cnpj = cnpj;
        this.email = email;

        this.nome = nome;
        this.telefone = telefone;
    }
    @Override    
    public String toString(){
        return "Dados do fornecedor: " + ("\nNome: " + nome + "\nCNPJ: " + cnpj + "\nTelefone: " + telefone + 
                "\nE-mail: " + email + "\nFornecedor: " );
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getTelefone() {
    return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    }


