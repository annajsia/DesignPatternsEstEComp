package ex 4.2;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();

	}

}
