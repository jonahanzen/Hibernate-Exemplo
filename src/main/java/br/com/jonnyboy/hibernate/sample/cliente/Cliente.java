package br.com.jonnyboy.hibernate.sample.cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//Ao anotarmos a classe como Entity, uma tabela com o mesmo nome da classe é criada no banco de dados


@Entity
public class Cliente {
	
	//Toda classe precisa de uma chave primária, esse valor anotamos como Id
	@Id
	// Eu não quero / e não preciso me preocupar com o ID da classe
	//Aqui estou anotando que é um valor gerado 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	//Aqui deixo anotado que o campo nome não pode ser nulo, 
	// e deve conter no mínimo 2 caracteres, e no máximo 30
	@NotNull
	@Size(min = 2, max = 30)
	private String nome;
	
	
	//Anotacao para o campo idade não pode ser nulo, e que a idade deve ser no mínimo 18
	@NotNull
	@Min(18)
	private Integer idade;
	
	//A classe deve conter um construtor padrão
	public Cliente() {
	}

	//Construtor com campos, que devem ser válidos
	public Cliente(@NotNull @Size(min = 2, max = 30) String nome, @NotNull @Min(18) Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
	

}
