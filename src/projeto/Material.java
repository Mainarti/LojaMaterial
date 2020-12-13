package projeto;
import java.util.Date;
/**
 *
 * @author Mainarti
 */
public class Material 
{
    public Material () 
    { 
    
    }
    private String nome;
    private int quantidade;
    private float preço;
    private String especif;
    private float margemLucro;
    private Date dataFabricação;
    
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
    public void setEspecif (String especif)
    {
        this.especif = especif;
    }
    public String getEspecif ()
    {
        return especif;
    }
    public void setMargemLucro (float margemLucro)
    {
        this.margemLucro = margemLucro;
    }
    public float getMagemLucro()
    {
        return margemLucro;
    }
    public void setDataFabricação (Date dataFabricação)
    {
        this.dataFabricação = dataFabricação;
    }
    public Date getDataFabricação()
    {
        return dataFabricação;
    }
    private final String[] material = new String [20];
    
    @Override
	public String toString() 
        {
            return "Nome: " + this.nome + ", Quantidade: " + this.quantidade +
                   ", Preço: " + this.preço + ", Especificação: " + this.especif +
                   ", Margem de Lucro: " + this.margemLucro + ", Data de Fabricação " + this.dataFabricação;
        }
}
