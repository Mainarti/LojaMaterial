package projeto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Date;
        
public class Sistema 
{

    public static void main(String[] args) 
    {
    // o menu vai ser aqui
        int opçãoMenu = 0;
        do
        {
            System.out.println("Bem Vindo a loja Construmar, selecione o Módulo que você queira acessar");
            System.out.println("Opção 1 - Material");
            System.out.println("Opção 2 - Fornecedor");
            System.out.println("Opção 3 - Cliente");
            System.out.println("OPção 4 - Vendas");
            
            if(opçãoMenu == 1)
            {
                ScannerMat();
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
                material = new Material();
            
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
}    
