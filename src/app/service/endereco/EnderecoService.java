package app.service.endereco;

public class EnderecoService {
	private static EnderecoService instancia = new EnderecoService();

	private EnderecoService() {
		super();
	}

	public static EnderecoService get() {
		return instancia;
	}

	public String getCidade(String cep) {
		return "Manaus";
	}

	public String getEstado(String cep) {
		return "Amazonas";
	}
}