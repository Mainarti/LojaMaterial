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
    public void setNome(String nomeP)
    {
        nome = nomeP;
    }
    public String getnome()
    {
        return nome;
    }
    
    private int quantidade;
    public void setQuantidade (int quant)
    {
        quantidade = quant;
    }
    public int getquant()
    {
        return quantidade;
    }
    
    private float preço;
    public void setPreço (float preçoM)
    {
        preço = preçoM;
    }
    public float getPreço()
    {
        return preço;
    }
    
    private String especif;
    public void setEspecif (String especifM)
    {
        especif = especifM;
    }
    public String getEspecif ()
    {
        return especif;
    }
    
    private float margemLucro;
    public void setMargemLucro (float margemL)
    {
        margemLucro = margemL;
    }
    public float getMagemLucro()
    {
        return margemLucro;
    }
    
    private Date dataFabricação;
    public void setDataFabricação (Date dataF)
    {
        dataFabricação = dataF;
    }
    public Date getDataFabricação()
    {
        return dataFabricação;
    }
    
    private final String[] fornecedor = new String [20];
    
    @Override
	public String toString() 
        {
            return "Nome: " + this.nome + ", Quantidade: " + this.quantidade +
                   ", Preço: " + this.preço + ", Especificação: " + this.especif +
                   ", Margem de Lucro: " + this.margemLucro + ", Data de Fabricação " + this.dataFabricação;
        }
    
}
