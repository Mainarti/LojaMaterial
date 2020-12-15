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
    String dataV;
    float valorTotal;
    
    public Vendas ()
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
    public void setDataV(String dataV)
    {
        this.dataV = dataV;
    }
    public String getDataV()
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
    
    @Override
        public String toString()
        {
            return "IdVenda" + this.idVenda + "DataV" + this.dataV + 
                   "Valor Total" + this.valorTotal;
        }
    public void GerarExtrato()
   {
        System.out.println(this.toString() );
   }
}
