Projeto super simples criado com o propósito de mostrar as funcionalidades base do Hibernate. 
O objetivo é mostrar as configurações base para que assim então se possa fazer demais implementações.

Ferramentas utilizadas: PostgreSQL 13, JavaSE-16.

## Instruções para gerar o Projeto

O processo começa no site do [Spring](https://start.spring.io/) , onde configuramos o nosso projeto e suas dependências, neste caso o projeto foi feito utilizando as seguintes configurações:

Você pode achar as mesmas configurações neste link -> [Hibernate-Exemplo](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.4.10&packaging=jar&jvmVersion=16&groupId=br.com.jonnyboy&artifactId=hibernate.sample&name=example%20project&description=Simple%20project%20to%20demonstrate%20hibernate%20functionalities&packageName=br.com.jonnyboy.hibernate.sample&dependencies=validation,data-jpa,postgresql)

- Maven project.  Escolher entre Gradle ou Maven é mais por preferência pessoal neste primeiro momento, nenhuma configuração adicional ou implementação adicional será feita.

- Spring boot : 2.4.10.  Optei por escolher uma versão mais estável.

- No project metadata ficam as configurações do seu próprio projeto, nome de pacote e afins, novamente, nenhuma configuração adicional precisa ser feita
com exceção de escolher a versão do Java, neste caso a 16 e packaging Jar. a diferença entre Jar (Java Archive) e War(Web Application Archive) é simples. Jar é basicamente um arquivo compacto 
contendo o "básico" necessário para construir uma aplicação "padrão", enquanto War já vem configurado para aplicações Web (servlets e afins)

- Por fim precisamos das dependências para trabalharmos com o Hibernate!  então ao clicar em Add Dependencies temos de escolher 3 dependências: Validation, Spring Data JPA, PostgreSQL Driver.

- Generate ! Note que todo o processo não deve demorar 2 minutos e, já temos um projeto Spring Boot com tudo o que precisamos e vamos utilizar. Agora basta descompactar o arquivo e importar na IDE preferida.


## Entendendo as configurações ( Deixei comentários adicionais nas classes para melhor compreensão )

### Tudo começa no [POM](https://github.com/jonahanzen/Hibernate-Exemplo/blob/master/pom.xml) e no [application.properties](https://github.com/jonahanzen/Hibernate-Exemplo/blob/master/src/main/resources/application.properties)

O POM quem vai baixar todas as dependências para o projeto bem como configurar ele de forma adequada.

O application.properties quem vai definir em qual banco vamos nos conectar, login, senha,etc. é neste arquivo que boa parte da mágica acontece a nível de configuração do que o hibernate precisa fazer e como fazer.

Neste projeto, temos 5 classes:

- [ExampleProjectApplication](https://github.com/jonahanzen/Hibernate-Exemplo/blob/master/src/main/java/br/com/jonnyboy/hibernate/sample/ExampleProjectApplication.java) : É a classe main que vai ser executada quando o projeto for iniciado.

- [Cliente](https://github.com/jonahanzen/Hibernate-Exemplo/blob/master/src/main/java/br/com/jonnyboy/hibernate/sample/cliente/Cliente.java) : É a Entity, a classe onde referenciamos o que e como queremos no banco de dados.

- [ClienteRepository](https://github.com/jonahanzen/Hibernate-Exemplo/blob/master/src/main/java/br/com/jonnyboy/hibernate/sample/cliente/ClienteRepository.java) : Por padrão, o Spring Boot já nos oferece implementações genéricas para trabalharmos com dados. (CRUD e afins)

- [ClienteService](https://github.com/jonahanzen/Hibernate-Exemplo/blob/master/src/main/java/br/com/jonnyboy/hibernate/sample/cliente/ClienteService.java) : Aqui podemos incluir lógica de negócios, como incluir ou quando excluir,etc.

- [ClienteConfig](https://github.com/jonahanzen/Hibernate-Exemplo/blob/master/src/main/java/br/com/jonnyboy/hibernate/sample/cliente/ClienteConfig.java) : Apenas uma classe que roda um comando para criar alguns clientes, salvar no banco de dados e então consultar esse banco de dados e imprimir.








