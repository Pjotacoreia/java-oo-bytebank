
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(12, 2442);

		
		System.out.println("O saldo de sua conta é: " + conta.getSaldo());
		
		Cliente pjota = new Cliente();
		
		pjota.setNome("Pjota");
		
		conta.setTitular(pjota);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println("Total de conta é: " + Conta.getTotal());
		
	}
}
