# Blue Horizon_JAVA
Projeto em Java realizado para solucionar e atender o problema de meio ambiente global referente aos oceanos ditado pela Faculdade de Administração e Tecniologia - FIAP no desafio Global Solution chamado Blue Future

INTEGRANTES DO GRUPO:
- Enrico do Nascimento Ferreira Galdino - rm552082 - 2TDSPH
- Eduardo Ferreira Silva de Jesus - rm98410 - 2TDSPN
- Leonardo Matheus Mariano Guedes da Silva - rm99824 - 2TDSPN
- Luiz Felipe dos Santos Tragl - rm99476 - 2TDSPB
- Pedro Henrique Chersoni Lins - rm99866 - 2TDSPW

Descrição
A Blue Horizon_JAVA é uma aplicação desenvolvida em Java utilizando o framework Spring Boot. O objetivo deste projeto é promover a pesca sustentável, facilitando o registro, monitoramento e gerenciamento de atividades de pesca, além de fornecer dados sobre espécies marinhas e informações relevantes para pescadores e organizações envolvidas na preservação do meio ambiente marinho.

###Funcionalidades
1. Cadastro de Animais: Registre informações sobre espécies marinhas, incluindo nome comum, nome científico, habitat e status de conservação.
2. Cadastro de Clientes: Gere registros de pescadores e usuários, com detalhes como nome, CEP, tipo de cliente e telefone.
3. Gestão de Organizações: Mantenha dados de organizações envolvidas na pesca sustentável, incluindo nome, CEP, email e telefone.
4. Integração com Sistemas de IA: Armazene e gerencie dados de sistemas de IA utilizados na análise e monitoramento das atividades de pesca.
5. Registro de Atividades de Pesca: Registre e gerencie dados de pesca, incluindo data, localização, quantidade, método de pesca e entidades relacionadas (cliente, organização, IA e animal).
6. Paginação e HATEOAS: Suporte para paginação de resultados e implementação de HATEOAS para enriquecer as respostas da API.
7. Validação de Dados: Utilização de Bean Validation para garantir a integridade dos dados.
8. Tratamento de Exceções: Tratamento robusto de erros e exceções, com mensagens claras e detalhadas.
9. Documentação com Swagger: Documentação completa da API disponível via Swagger UI.

###Tecnologias Utilizadas
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate Validator
- H2 Database (para testes e desenvolvimento)
- Swagger 2 (para documentação da API)
- Jakarta Validation

###Endpoints Principais
/api/animals: Endpoints para gestão de espécies marinhas.
/api/clientes: Endpoints para gestão de clientes.
/api/organizacoes: Endpoints para gestão de organizações.
/api/ia: Endpoints para gestão de sistemas de IA.
/api/registros: Endpoints para registro e gerenciamento de atividades de pesca.

###Como Executar
Clone o repositório:
git clone https://github.com/seu-usuario/sustainable-fishing-api.git

Navegue até o diretório do projeto:
cd sustainable-fishing-api

Compile e execute a aplicação:
./mvnw spring-boot:run

_Teste a Aplicação
Execute o aplicativo e acesse o Swagger UI em http://localhost:8080/swagger-ui.html para visualizar e testar as APIs.

Conclusão
Este guia fornece uma estrutura básica para criar uma aplicação Java com Spring Boot que atenda aos requisitos fornecidos. Ele inclui a configuração do projeto, criação de entidades, repositórios, serviços, controladores, tratamento de exceções, e documentação com Swagger. Se precisar de mais detalhes ou ajuda adicional, sinta-se à vontade para perguntar!
