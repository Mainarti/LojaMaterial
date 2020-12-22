package projeto;
import java.util.Scanner;
import java.util.ArrayList;
        
public class Sistema 
{
    ArrayList<Material> Material = new ArrayList();
    Colaborador colaborador []= new Colaborador [25];
    ArrayList<Vendas> Venda = new ArrayList();
    ArrayList<Cliente> cliente = new ArrayList();
    ArrayList<Fornecedor> Fornecedor = new ArrayList();
    
    public static void main(String[] args) 
    {
    // o menu vai ser aqui
        
        Sistema chamada = new Sistema();
        
        //chamada.CancelarVendas();
        //chamada.IncluirMaterial();
        //chamada.IncluirFornecedor();
        //chamada.ConsultarVendas();
        chamada.Incluircliente();
        chamada.RealizarVenda();
        //chamada.IncluirColaborador();
    }
    private void IncluirColaborador()
    {
       
        int i;
        
        Colaborador colab = new Colaborador("","","","");
        
        Scanner input = new Scanner(System.in);
        
        
                   
        System.out.print("Entre com o Nome do colaborador: ");
        colab.setNome (input.nextLine());
        
        System.out.print("Entre com o CPF do colaborador: ");
        colab.setCpf(input.nextLine());
        
        System.out.print("Entre com o Login do colaborador: ");
        colab.setLogin(input.nextLine());
        
        System.out.print("Entre com o Senha do colaborador: ");
        colab.setSenha(input.nextLine());
            
    }
    private void Incluircliente()
    {
        
        Cliente cli = new Cliente("","");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com o Nome do cliente: ");
        cli.setNome(input.nextLine());
        
        System.out.print("Entre com o CPF do cliente: ");
        cli.setCpf(input.nextLine());
        
        System.out.print("Entre com o endereço do cliente: ");
        cli.setEndereco(input.nextLine());
        
        System.out.print("Entre com o email do cliente: ");
        cli.setEmail(input.nextLine());
        
        System.out.print("Entre com o telefone do cliente: ");
        cli.setTelefone(input.nextLine());
        
        cliente.add(cli);
        
        System.out.println(cliente.contains(cli));   
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
        for(int i = 0; i < cliente.size(); i++)
        {                   
            System.out.print("Escolha o cliente cadastrado: ");
            System.out.println(cliente);
                   
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
