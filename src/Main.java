
public class Main {

	public static void main(String[] args) {
		Cliente jose = new Cliente();
		jose.setNome( "Jos� Damasceno");
		
		
		
		Conta cc =new ContaCorrente(jose);
		cc.depositar(100);
		
		
		Conta cp =new ContaPoupanca(jose);
		cp.depositar(1000.00);
		cc.transferir(100, cp);
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
