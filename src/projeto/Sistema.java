package projeto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
        
public class Sistema 
{
    public static void main(String[] args) 
    {
    // o menu vai ser aqui
        int opçãoMenu = 0;
        do
        {
            Scanner menuSc = new Scanner (System.in); 

            System.out.println("Bem Vindo a loja Construmar, selecione o Módulo que você queira acessar");
            System.out.println("Opção 1 - Material");
            System.out.println("Opção 2 - Fornecedor");
            System.out.println("Opção 3 - Cliente");
            System.out.println("Opção 4 - Vendas");
            System.out.println("Opção 0 - Sair");
            System.out.println("_______________________");
            
            System.out.print("Digite aqui sua opção: ");
            opçãoMenu = Integer.parseInt(menuSc.nextLine());
            
            if(opçãoMenu == 1)
            {
                ScannerMat();
            }
            if(opçãoMenu == 2)
            {
                ScannerVendas();
            }
        }
        while (opçãoMenu != 0);
        

    }
    public static void ScannerMat()
    {
        Scanner matSc = new Scanner (System.in); 
        
        Material material;
        List<Material> listaMaterial = new ArrayList<Material>();
        int opção = 0;
        
        do 
        {
            System.out.println("Opção 1 - Cadastra material");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opção = Integer.parseInt(matSc.nextLine());
          
            if(opção == 1)
            {
                material = new Material(String, int, float, String, float, Date);
            
                System.out.print("Digite o nome: ");
                material.setNome(matSc.nextLine());
                
                System.out.print("Digite a Quantidade: ");
                material.setQuantidade(Integer.parseInt(matSc.nextLine()));
            
                System.out.print("Digite o preço: ");
                material.setPreço(Float.parseFloat(matSc.nextLine()));
            
                System.out.print("Digite a especificação: ");
                material.setEspecif (matSc.nextLine());
            
                System.out.print ("Digite a a margem de lucro: ");
                material.setMargemLucro(Float.parseFloat (matSc.nextLine()));
            
   //           System.out.print ("Digite a data de fabricação: ");
   //           material.setDataFabricação (Date.parseDate (matSc.nextLine()));
   
                System.out.println();
            
                listaMaterial.add(material);
            }
            else
            {
                System.out.println(listaMaterial.toString());

                System.out.println("Pressione um tecla para continuar.");
                matSc.nextLine();
            }         
        }
        while (opção != 0);
    } 
    
    public static void ScannerVendas ()      
    {
        Scanner vendaSc = new Scanner (System.in);
        Vendas vendas;
        List<Vendas> listaVendas = new ArrayList<Vendas>();
        int opçãoV = 0;
        
        do
        {
            System.out.print("Opção 1 - Realizar Venda");
            System.out.print("Opção 0 - Sair");
            System.out.println("_______________________");
            System.out.print("Digite aqui sua opção: ");
            
            opçãoV = Integer.parseInt(vendaSc.nextLine());
            if (opçãoV ==1)
            {
                vendas = new Vendas();
                
                System.out.print("Digite o id da venda: ");
                vendas.setIdVenda(Integer.parseInt(vendaSc.nextLine()));
                
                System.out.print ("Digite o valor total da venda: ");
                vendas.setValorTotal(Float.parseFloat(vendaSc.nextLine()));
                
                System.out.print("Digite a data da venda: ");
                vendas.setDataV(Date.parseDate(vendaSc.nextLine()));
                
            }
        }
        while (opçãoV != 0);
        
    }
}    
