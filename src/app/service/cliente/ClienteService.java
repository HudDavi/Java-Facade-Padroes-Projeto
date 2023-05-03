package app.service.cliente;

public class ClienteService {
	private ClienteService() {
		super();
	}

	public static void post(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}