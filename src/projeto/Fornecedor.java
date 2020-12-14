package projeto;

    public class Fornecedor 
    {
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    private String fornecedor;
    
     public Fornecedor(String nome, String cnpj, String telefone, String email, String fornecedor){
        this.cnpj = cnpj;
        this.email = email;
        this.fornecedor = fornecedor;
        this.nome = nome;
        this.telefone = telefone;
    }
    @Override    
    public String toString(){
        return "Dados do fornecedor: " + ("\nNome: " + nome + "\nCNPJ: " + cnpj + "\nTelefone: " + telefone + 
                "\nE-mail: " + email + "\nFornecedor: " + fornecedor);
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
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
