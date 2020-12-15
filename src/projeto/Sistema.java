package projeto;
import java.util.Scanner;
import java.util.ArrayList;
        
public class Sistema 
{
    ArrayList<Material> Material = new ArrayList();
    private final String[] colaborador = new String [25];
    ArrayList<Vendas> Venda = new ArrayList();
    ArrayList Cliente = new ArrayList();
    ArrayList<Fornecedor> Fornecedor = new ArrayList();
    
    public static void main(String[] args) 
    {
    // o menu vai ser aqui
        Sistema teste = new Sistema();
        teste.RealizarVenda();
        //teste.CancelarVendas();
    }
    private void IncluirColaborador()
    {
        
    }
    private void Incluircliente()
    {
        
    }
    private void IncluirMaterial()
    {
        Material teste = new Material("Porta", 5, 67, 02, "12/12/2020");
        teste.VerificarEstoque();
    }
    private void RealizarVenda()
    {
        Vendas vendasO = new Vendas();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com a Data da venda:");
        vendasO.setDate(input.nextLine());
        
        System.out.print("Entre com o Id da Venda:");
        vendasO.setIdVenda(input.nextInt());  
        
        System.out.print("Entre com o valor total da venda:");
        vendasO.setValortotal(input.nextFloat());
        
        Venda.add(vendasO);
        
        System.out.println(Venda.contains(vendasO));
        
            }
    private void CancelarVendas()
    {
        //Vendas vendasC = new Vendas(5,5,"");
        
       // Vendas.add(vendasC);
        
        //System.out.println(this.toString() );

        //Vendas.remove(vendasC);
        
        //System.out.println(Vendas.contains(vendasC));
    }
    private void ConsultarVendas()
    {
        Vendas teste = new Vendas();
        System.out.println(toString());
    }
    private void IncluirFornecedor()
    {
        Fornecedor teste = new Fornecedor("Casas Bahia", "12354789721", "38-988369993", "mainarti.christian");
        System.out.println(teste.toString());
    }
}
    
    
 
