package projeto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
        
public class Sistema 
{
    ArrayList Material = new ArrayList();
    private final String[] colaborador = new String [25];
    ArrayList Vendas = new ArrayList();
    ArrayList Cliente = new ArrayList();
    List<Fornecedor> Fornecedor = new ArrayList();
    
    public static void main(String[] args) 
    {
    // o menu vai ser aqui
        Sistema teste = new Sistema();
        teste.RealizarVenda();
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
        Vendas vendas;
        vendas = new Vendas();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com o Id da Venda:");
        vendas.setIdVenda(input.nextInt());
        
        System.out.print("Entre com a Data da venda:");
        vendas.setDate(input.nextLine());
        
        System.out.print("Entre com o valor total da venda:");
        vendas.setValortotal(input.nextFloat());
        
        vendas.GerarExtrato();
    }
    private void CancelarVendas()
    {
        
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
    
    
 
