package br.com.jonnyboy.hibernate.sample.cliente;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Anotacao para referenciar essa classe como um serviço
//Isso tira a responsabilidade de instanciar a classe, podendo a injetar automaticamente
@Service
public class ClienteService {

	//Injecao do repositorio, eu não preciso instanciar a classe pois o spring boot
	//automatiza todo o processo
	@Autowired
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}

	/**
	 * Metodo criado com repositório do tipo Cliente para retornar todos os clientes
	 * 
	 * @return todos clientes
	 */
	public List<Cliente> todosClientes() {
		return clienteRepository.findAll();
	}

	/**
	 * Metodo criado com repositorio do tipo Cliente para persistir no banco de dados.
	 * 
	 * @param cliente valido
	 */
	public void novoCliente(@Valid Cliente cliente) {
		clienteRepository.save(cliente);
	}

}
