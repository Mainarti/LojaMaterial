package projeto;
import java.util.Scanner;
import java.util.ArrayList;
        
public class Sistema 
{
    ArrayList Material = new ArrayList();
    private String[] colaborador = new String [25];
    ArrayList Vendas = new ArrayList();
    ArrayList Cliente = new ArrayList();
    ArrayList Fornecedor = new ArrayList();
    
    public static void main(String[] args) 
    {
    // o menu vai ser aqui
        Sistema meuSistema = new Sistema();
        meuSistema.Menu();
        
    }
    private void Menu()
    {
       int opção = 0;
        Scanner inMenu = new Scanner(System.in);
        do
        {
            System.out.println("## Bem Vindo a loja de Construção Construmar ^^ ##");
            System.out.println("Escolha um dos Módulos abaixo");
            System.out.println("Opção 1 - Incluir Colaborador");
            System.out.println("Opção 2 - Incluir Cliente");
            System.out.println("Opção 3 - Realizar Venda");
            System.out.println("Opção 4 - Cancelar Venda");
            System.out.println("Opção 5 - Consultar Vendas");
            System.out.println("Opção 6 - Incluir Material");
            System.out.println("Opção 7 - Incluir Fornecedor");
            System.out.println("Opção 8 - Consultar Fornecedor");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opção = Integer.parseInt(inMenu.nextLine());
            
            if(opção == 1)
            {
                IncluirColaborador();
            }
            if(opção == 2);
            {
                Incluircliente();
            }
            if(opção == 3);
            {
               // RealizarVenda();
            }
            if(opção == 4);
            {
                CancelarVendas();
            }
            if(opção == 5);
            {
                ConsultarVendas();
            }
            if(opção == 6)
            {
                IncluirMaterial();
            }
            if(opção == 7);
            {
                IncluirFornecedor();
            }
            if(opção == 8);
            {
                ConsultarFornecedor();
            }
        }
        while(opção!=0);
    }
    
    private void IncluirColaborador()
    {
        
    }
    private void Incluircliente()
    {
        
    }
    
    private void IncluirMaterial()
    {
        int opção = 0;
        Scanner inMaterial = new Scanner(System.in);
            Material material;
            
            do
            {
                System.out.println("## Escolha uma das opções abaixo ##");
                System.out.println("Opção 1 - Inclui Material");
                System.out.println("Opção 2 - Imprime O Estoque");
                System.out.println("Opção 0 - Sair do programa");
                System.out.println("_______________________");
                
                System.out.print("Digite aqui sua opção: ");
                opção = Integer.parseInt(inMaterial.nextLine());
                
                if(opção == 1)
                {
                    System.out.println("Insira os dados do material: ");
                    material = new Material();
                    
                    System.out.print("Digite o nome: ");
                    material.setNome(inMaterial.nextLine());
                    
                    System.out.print("Digite a Data de Fabricação: ");
                    material.setDataFabricação(inMaterial.nextLine());
                    
                    System.out.print("Digite a Margem de Lucro: ");
                    material.setMargemLucro(inMaterial.nextFloat());
                    
                    System.out.print("Digite o Preço: ");
                    material.setPreço(inMaterial.nextFloat());
                    
                    System.out.print("Digite a Quantidade: ");
                    material.setQuantidade(inMaterial.nextInt());
                    
                    System.out.println();
                              
                    Material.add(material);
                }
                else if (opção == 2)
                {
                    if(Material.isEmpty()){
                        System.out.println("Não existem produtos incluidos, pressione uma tecla para continuar!");
                        inMaterial.nextLine();
                    }
                    else
                    {
                        System.out.println(Material.toString());
                        
                        System.out.println("Pressione um tecla para continuar.");
                        inMaterial.nextLine();
                    }
                }
            }
            while (opção!= 0);
    }
    private void CancelarVendas()
    {
        
    }
    private void ConsultarVendas()
    {
        System.out.println(Vendas);
    }
    private void IncluirFornecedor()
    {
        int opção = 0;
        Scanner inFornecedor = new Scanner(System.in);
        Fornecedor fornecedor;
        do
        {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Inclui Fornecedor");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opção = Integer.parseInt(inFornecedor.nextLine());
            
            if(opção == 1)
            {
                System.out.println("Insira os dados do Fornecedor: ");
                fornecedor = new Fornecedor();
                
                System.out.print("Digite o nome: ");
                fornecedor.setNome(inFornecedor.nextLine());
                
                System.out.print("Digite a Data: ");
                fornecedor.setCnpj(inFornecedor.nextLine());

                System.out.print("Digite a Quantidade: ");
                fornecedor.setTelefone(inFornecedor.nextLine());

                System.out.print("Digite o Preço: ");
                fornecedor.setEmail(inFornecedor.nextLine());
                
                Fornecedor.add(fornecedor);
            }    
        }
        while (opção!= 0);
        inFornecedor.close();
    }
    private void ConsultarFornecedor()
    {        
        System.out.println(Fornecedor.toString());
        System.out.println("Pressione um tecla para continuar.");
             
    }   
    }
    
    
 
