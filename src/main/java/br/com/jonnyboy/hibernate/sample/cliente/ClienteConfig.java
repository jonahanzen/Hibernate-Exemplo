package br.com.jonnyboy.hibernate.sample.cliente;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Anotacao para usar essa classe como uma configuracao, novamente, gerenciada pelo spring
//Ela torna possivel eu trabalhar com Bean, que é um objeto também gerenciado pelo Spring
@Configuration
public class ClienteConfig {

	@Bean
	//Injetando clienteRepository
	CommandLineRunner commandLineRunner(ClienteRepository clienteRepository) {
		return args -> {
			Cliente joao = new Cliente("joao", 18);
			Cliente pedro = new Cliente("pedro", 21);
			Cliente maria = new Cliente("maria", 45);
			Cliente jessica = new Cliente("jessica", 28);
			Cliente rebeca = new Cliente("rebeca", 33);

			//Persiste todos os clientes
			clienteRepository.saveAll(List.of(joao, pedro, maria, jessica, rebeca));

			//Consulta o banco e retorna todos os clientes
			List<Cliente> todosClientes = clienteRepository.findAll();
			
			//Imprime o resultado da consulta
			for (Cliente cliente : todosClientes) {
				System.out.println("\nnome:" + cliente.getNome() + " idade:" + cliente.getIdade());
			}
		};

	}

}
