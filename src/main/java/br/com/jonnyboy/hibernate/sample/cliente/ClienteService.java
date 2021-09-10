package br.com.jonnyboy.hibernate.sample.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

	@Autowired
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> todosClientes() {
		return clienteRepository.findAll();
	}

	public void novoCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

}
