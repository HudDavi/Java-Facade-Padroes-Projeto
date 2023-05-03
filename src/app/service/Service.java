package app.service;

import app.service.cliente.ClienteService;
import app.service.endereco.EnderecoService;

public class Service{
	public void service(String nome, String cep) {
		String cidade = EnderecoService.get().getCidade(cep);
		String estado = EnderecoService.get().getEstado(cep);
		ClienteService.post(nome, cep, cidade, estado);
	}
}