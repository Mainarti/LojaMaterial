package projeto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Mainarti
 */
public class Vendas 
{
    int idVenda;
    Date dataV;
    float valorTotal;
    
    public Vendas (int idVenda, Date dataV, float valorTotal)
    {
        this.idVenda = idVenda;
        this.dataV = dataV;
        this.valorTotal = valorTotal;
    }

    public void setIdVenda(int idVenda)
    {
        this.idVenda = idVenda;
    }
    public int getnome()
    {
        return idVenda;
    }
    public void setdataV(Date dataV)
    {
        this.dataV = dataV;
    }
    public Date getDataV()
    {
        return dataV;
    }
    public void setValorTotal(float valorTotal)
    {
        this.valorTotal = valorTotal;
    }
    public float getValorTotal()
    {    
        return valorTotal;
    }
}
