package projeto;

import java.util.ArrayList;

/**
 *
 * @author Mainarti
 */
public class Vendas 
{
   private String idvenda;  
   private float valortotal;
   private String date;
   public String aux;
     
   public Vendas()
   {
       this.date = date;
       this.idvenda = idvenda;
       this.valortotal = valortotal;
       this.aux = aux;
   }
   /** Método para gerar o extrato da venda realizada
    * utilizando da sobrecarga do método ToString.
    */
   public void GerarExtrato()    
   {
        System.out.println(this.toString() );
   }
   @Override
   public String toString()
   {
        return("\nIdentificação venda: " + idvenda + "\nValor Total: " + valortotal + "\nData: " + date + "\nCliente da venda: " + aux);
    }
    public String getIdvenda() 
    {
        return idvenda;
    }
    public void setIdVenda(String idVenda) 
    {
        this.idvenda = idVenda;
    }
    public float getValortotal() 
    {
    return valortotal;
    }
    public void setValortotal(float valortotal) 
    {
        this.valortotal = valortotal;
    }
    public String getDate() 
    {
        return date;
    }
    public void setDate(String date) 
    {
        this.date = date;
    }
        
    public void setAux(String aux)
    {
        this.aux = aux;
    }
    public String getAux()
    {
        return aux;
    }
}