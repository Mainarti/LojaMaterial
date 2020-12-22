package projeto;
/**
 *
 * @author Mainarti
 */
public class Cliente extends Pessoa implements Comparable<Colaborador>{
    private static int contCliente;
    
    public Cliente(String nome, String cpf)
    {
        super(nome, cpf);
        contCliente += 1; 
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
    public void imprimirInfoCliente()
    {
        System.out.println("");
    } 
    // get
  
    public static int getContCliente() {
        return contCliente;
    } 
    // set
    public void setContCliente(int contCliente) {
        Cliente.contCliente = contCliente;
    }
    
}