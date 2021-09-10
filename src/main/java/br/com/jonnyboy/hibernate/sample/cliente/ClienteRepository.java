package br.com.jonnyboy.hibernate.sample.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Anotacao do Spring para referenciar essa classe como um Repositório
//Note, eu não preciso implementar nada, mesmo com extends a JpaRepository
//O Spring vai se encarregar de todo o processo automaticamente
// "it just works"
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
	
}
