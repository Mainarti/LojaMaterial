package projeto;
import java.util.Date;

public class Material 
{
    private String nome;
    private int quantidade;
    private float preço;
    private float margemLucro;
    private String dataFabricação;
    
    public Material () 
    { 
        this.nome = nome;
        this.quantidade = quantidade;
        this.preço = preço;
        this.margemLucro = margemLucro;
        this.dataFabricação = dataFabricação;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getnome()
    {
        return nome;
    }
    public void setQuantidade (int quantidade)
    {
        this.quantidade = quantidade;
    }
    public int getquant()
    {
        return quantidade;
    }
    public void setPreço (float preço)
    {
        this.preço = preço;
    }
    public float getPreço()
    {
        return preço;
    }
   
       public void setMargemLucro (float margemLucro)
    {
        this.margemLucro = margemLucro;
    }
    public float getMagemLucro()
    {
        return margemLucro;
    }
    public void setDataFabricação (String dataFabricação)
    {
        this.dataFabricação = dataFabricação;
    }
    public String getDataFabricação()
    {
        return dataFabricação;
    }
    
    @Override
	public String toString() 
        {
            return "Nome: " + this.nome + ", Quantidade: " + this.quantidade +
                   ", Preço: " + this.preço +", Margem de Lucro: " + this.margemLucro + 
                   ", Data de Fabricação " + this.dataFabricação;
        }
}
