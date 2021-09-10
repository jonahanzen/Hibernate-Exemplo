package br.com.jonnyboy.hibernate.sample.cliente;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClienteConfig {

	@Bean
	CommandLineRunner commandLineRunner(ClienteRepository clienteRepository) {
		return args -> {
			Cliente joao = new Cliente("joao", 18);
			Cliente pedro = new Cliente("pedro", 21);
			Cliente maria = new Cliente("maria", 45);
			Cliente jessica = new Cliente("jessica", 28);
			Cliente rebeca = new Cliente("rebeca", 33);

			clienteRepository.saveAll(List.of(joao, pedro, maria, jessica, rebeca));

			List<Cliente> todosClientes = clienteRepository.findAll();
			for (Cliente cliente : todosClientes) {
				System.out.println("\nnome:" + cliente.getNome() + " idade:" + cliente.getIdade());
			}
		};

	}

}
