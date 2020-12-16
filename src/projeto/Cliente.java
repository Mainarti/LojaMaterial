package projeto;
/**
 *
 * @author Mainarti
 */
public class Cliente extends Pessoa implements Comparable<Colaborador>{
    private Vendas regCompras;
    private static int contCliente;
    
    public Cliente(String nome, String cpf){
        super(nome, cpf);
        contCliente += 1; 
    }
    
    
    @Override 
    public String toString(){
        String aux = "Registro de Compras do Cliente: " + regCompras;
        return aux; 
    }
    
    @Override 
    public int compareTo(Colaborador x) {
	if (x.getNome().length() > this.getNome().length()) {
		return 1;
	} else if (x.getNome().length() < this.getNome().length()){
		return -1;
	} else {
		return 0;
	}
}
    
    public boolean imprimirInfoCliente(){
        boolean x = true;
        return x;
    } 
    
    // get

    public Vendas getRegCompras() {
        return regCompras;
    }

    public static int getContCliente() {
        return contCliente;
    }
    
        
    // set

    public void setRegCompras(Vendas regCompras) {
        this.regCompras = regCompras;
    }

    public void setContCliente(int contCliente) {
        Cliente.contCliente = contCliente;
    }
    
}