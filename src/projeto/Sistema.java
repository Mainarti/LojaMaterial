package projeto;
import java.util.Scanner;
import java.util.ArrayList;
        
public class Sistema 
{
    ArrayList<Material> Material = new ArrayList();
    final String[] colaborador = new String [25];
    ArrayList<Vendas> Venda = new ArrayList();
    ArrayList<Cliente> cliente = new ArrayList();
    ArrayList<Fornecedor> Fornecedor = new ArrayList();
    
    public static void main(String[] args) 
    {
    // o menu vai ser aqui
        
        Sistema chamada = new Sistema();
        //chamada.RealizarVenda();
        //chamada.CancelarVendas();
        //chamada.IncluirMaterial();
        //chamada.IncluirFornecedor();
        //chamada.ConsultarVendas();
    }
    private void IncluirColaborador()
    {
        
    }
    private void Incluircliente()
    {
        
    }
    private void IncluirMaterial()
    {
        Material prod = new Material();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com a Data da venda: ");
        prod.setNome(input.nextLine());
        
        System.out.print("Entre com o Id da Venda: ");
        prod.setDataFabricação(input.nextLine());
        
        System.out.print("Entre com o valor total da venda: ");
        prod.setPreço(input.nextFloat());
        
        System.out.print("Entre com a margem de lucro: ");
        prod.setMargemLucro(input.nextFloat());
        
        System.out.print("Entre com a data de fabricação: ");
        prod.setDataFabricação(input.nextLine());
        
        Material.add(prod);
        
        System.out.println(Material.contains(prod));
                
        prod.VerificarEstoque();
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
        
        vendasO.GerarExtrato();
        
        System.out.println(Venda.contains(vendasO));
        
            }
    private void CancelarVendas()
    {
        Vendas vendasO = new Vendas();
        
        vendasO.GerarExtrato();

        Venda.remove(vendasO);
        
        System.out.println("Venda Cancelada");
        
        System.out.println(Venda.contains(vendasO));
    }
    private void ConsultarVendas()
    {
        Vendas vendaC = new Vendas();
        vendaC.GerarExtrato();
    }
    private void IncluirFornecedor()
    {
        Fornecedor forneced = new Fornecedor();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com o nome do fornecedor: ");
        forneced.setNome(input.nextLine());
        
        System.out.print("Entre com o CNPJ do fornecedor: ");
        forneced.setCnpj(input.nextLine());
        
        System.out.print("Entre com telefone do fornecedor: ");
        forneced.setTelefone(input.nextLine());
        
        System.out.print("Entre com o email do fornecedor: ");
        forneced.setTelefone(input.nextLine());
        
        Fornecedor.add(forneced);
        
        System.out.println(Fornecedor.contains(forneced));

    }
    }