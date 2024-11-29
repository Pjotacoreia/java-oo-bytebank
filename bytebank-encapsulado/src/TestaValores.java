
public class TestaValores { 
	

    public static void main(String[] args) { 

    	
        Conta joao = new Conta(1337, 24226);
        
        System.out.println(joao.getAgencia());
        System.out.println(joao.getNumero());
        
        Conta joao1 = new Conta(13327, 24226);
        System.out.println(joao1.getAgencia());
        System.out.println(joao1.getNumero());
        
        System.out.println(Conta.getTotal());
    }    
}