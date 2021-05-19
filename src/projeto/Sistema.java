/**Classe para objetos do tipo Funcionários, onde serão contidos, valores e métodos para o mesmo.
* @author Mainarti
* @version 1.0
*/
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
        int opção = 0;
        Sistema chamada = new Sistema();
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Inclui Cliente");
            System.out.println("Opção 2 - Inclui Colaborador");
            System.out.println("Opção 3 - Inclui Material");
            System.out.println("Opção 4 - Inclui Fornecedor");
            System.out.println("Opção 5 - Realiza Venda");
            System.out.println("Opção 6 - Consulta Venda");
            System.out.println("Opção 7 - Cancela Venda");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");
          
            System.out.print("Digite aqui sua opção: ");
            opção = Integer.parseInt(input.nextLine());
            switch (opção) 
            {
                case 1:
                    chamada.Incluircliente();
                    break;
                case 2:
                    chamada.IncluirColaborador();
                    break;
                case 3:
                    chamada.IncluirMaterial();
                    break;
                case 4:
                    chamada.IncluirFornecedor();
                    break;
                case 5:
                    chamada.RealizarVenda();
                    break;
                case 6:
                    chamada.ConsultarVendas();
                    break;
                case 7:
                    chamada.CancelarVendas();
                    break;
            }
        }
        while(opção != 0);
        input.close();  
    }
    /**Método responsável por incluir um colaborador dentro do ArrayList Colaborador
    *Um for é criado para percorrer o vetor e utilizar a menor posição desse vetor para salvar o objeto
    *O objeto Colab é criado e instanciado recebendo o set de cada atributo desse colaborador
    *após esse objeto ter recebido todos os atributos ele é salvo dentro da posição
    *encontrada pelo for.
    */
    private void IncluirColaborador()
    {
        for(int i = 0; i<colaborador.length; i++)
        {
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
        
        colaborador[i] = colab;
        }
        
    }
    
    /**Método responsável por incluir um cliente dentro do ArrayList Cliente.
     * O objeto cli é criado e instanciado recebendo o set de cada atributo desse cliente
     * após esse objeto ter recebido todos os atributos ele é salvo dentro do Array
     * ao utilizar o método add() fornecido pelo ArrayList.
     * 
     * @param colab objeto utilizado.
     * 
     * Por ultimo é utilizado o método contains para verificar se o cliente foi cadastrado.
     * 
     * @return True.
     */
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
    
    /** Método responsável por incluir um cliente dentro do ArrayList Material.
     * O objeto cli é criado e instanciado recebendo o set de cada atributo desse cliente
     * após esse objeto ter recebido todos os atributos ele é salvo dentro do Array
     * ao utilizar o método add() fornecido pelo ArrayList.
     * 
     * @param prod objeto utilizado.
     * 
     * Por ultimo é utilizado o método contains para verificar se o material foi cadastrado.
     * @return True.
     */
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
    
    /** Método responsável por realizar uma venda e armazena-la dentro do ArrayList Vendas.
     * O objeto vendasO é criado e instanciado para receber o set de cada atributo dessa venda
     * Em seguida é imprimido para o usuário escolher algum cliente previamente cadastrado 
     * para ser efetuada a venda em seu nome,
     * em seguida uma String busca é criada afim de receber o cpf do cliente escolhido.
     * 
     * É criado um for para percorrer todo o ArrayList Venda, dentro do for um objeto do tipo cliente
     * recebendo o método get(i) do ArrayList cliente.
     * 
     * Essa String é comparada com o CPF de algum cliente cadastrado e caso seja true é iniciado o processo de venda.
     * após esse objeto ter recebido todos os atributos ele é salvo dentro do Array
     * ao utilizar o método add() fornecido pelo ArrayList.
     * 
     * @param vendasO objeto do tipo Vendas utilizado.
     * Por ultimo é utilizado o método contains para verificar se o material foi cadastrado.
     * @return True.
     */
     private void RealizarVenda()
    {
        Vendas vendasO = new Vendas();
        Scanner input = new Scanner(System.in);
        System.out.print("Escolha o cpf do cliente cadastrado: "); 
        String busca = input.nextLine();
        
        
        for(int i = 0; i < cliente.size(); i++)
        {                   
            Cliente c1i = cliente.get(i);
            if(c1i.getCpf().equals(busca))
            
            {
                System.out.println("Cliente Encontrado");
                System.out.print("Entre com a Data da venda:");
                vendasO.setDate(input.nextLine());
        
                System.out.print("Entre com o Id da Venda:");
                vendasO.setIdVenda(input.nextLine());
        
                System.out.print("Entre com o valor total da venda:");
                vendasO.setValortotal(input.nextFloat());
                           
                Venda.add(vendasO);
                vendasO.setAux(busca);
                vendasO.GerarExtrato();
        
                System.out.println(Venda.contains(vendasO));
                System.out.println("");
                
            }
            else
            {
                System.out.print("cpf incorreto ou não cadastrado");            
            }
        }
        
    }
     
    /** Método responsável por cancelar uma venda de dentro do ArrayList Vendas.
     * O objeto vendasO é criado e instanciado para instanciar o método GerarExtrato().
     * 
     * Em seguida é imprimido para o usuário digitar o ID da venda a ser cancelada.
     * em seguida uma String busca é criada afim de receber o ID da venda escolhida.
     * 
     * É criado um for para percorrer todo o ArrayList Venda, dentro do for um objeto do tipo Venda
     * está recebendo o método get(i) do ArrayList Venda.
     * 
     * Essa String é comparada com o ID de alguma venda cadastrada e caso seja true é iniciado o processo de venda.
     * È utilizado o método remove tendo como parâmetro o objeto vendasO.
     * 
     * @param vendasO objeto do tipo Vendas utilizado.
     * Por ultimo é utilizado o método contains para verificar se há vendas no ArrayList.
     * @return True caso ainda haja vendas, e False cajo não haja vendas incluidas.
     */
    private void CancelarVendas()
    {
        Vendas vendasO = new Vendas();
        Scanner input = new Scanner(System.in);
        System.out.print("Escolha o Id da venda a ser cancelada: "); 
        String busca = input.nextLine();
        
        for(int i = 0; i < Venda.size(); i++)
        {
            Vendas vend = Venda.get(i);
            if(vend.getIdvenda().equals(busca))
            {
                vendasO.GerarExtrato();

                Venda.remove(vendasO);
        
                System.out.println("Venda Cancelada");
        
                System.out.println(Venda.contains(vendasO)); 
            }
            else
            {
                System.out.print("Venda não encontrada.");
            }
        }
    }
    
    /** Método responsável por consultar uma venda de dentro do ArrayList Vendas.
     * é criado um objeto vendaC do tipo Vendas que será instanciado para chamar o método GerarExtrato().
     * @return ToString da classe Vendas.
     */
    private void ConsultarVendas()
    {
        Vendas vendaC = new Vendas();
        vendaC.GerarExtrato();
    }
    
    /** Método responsável por incluir um fornecedor de dentro do ArrayList fornecedor.
     * é criado um objeto forneced do tipo Fornecedor que será instanciado para receber o set de cada atributo
     * a ser salvo dentro desse objeto.
     * 
     * Após terminado o preenchimento de dados, é utilizado o método add() do ArrayList Fornecedor tendo como parâmetro
     * o objeto forneced.
     * 
     * @return True caso a inclusão tenha acontecido.
     */
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
