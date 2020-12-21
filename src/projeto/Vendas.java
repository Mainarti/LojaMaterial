package projeto;
/**
 *
 * @author Mainarti
 */
public class Vendas 
{
   private int idvenda;  
   private float valortotal;
   private String date;
   private Cliente cliente;
     
   public Vendas()
   {
       this.date = date;
       this.idvenda = idvenda;
       this.valortotal = valortotal;
   }
   public void GerarExtrato()
   {
        System.out.println(this.toString() );
   }
   @Override
   public String toString()
   {
        return("\nIdentificação venda: " + idvenda + "\nValor Total: " + valortotal + "\nData: " + date + "Cliente da venda" + cliente);
    }
    public int getIdvenda() 
    {
        return idvenda;
    }
    public void setIdVenda(int idVenda) 
    {
        this.idvenda = idvenda;
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
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    public Cliente getCliente()
    {
        return cliente;
    }
} 