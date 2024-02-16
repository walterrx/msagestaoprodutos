# Projeto de Gestão de Produtos de E-commerce

Este projeto implementa um sistema de gestão de produtos para uma plataforma de e-commerce, utilizando Spring Boot e seguindo os princípios da Clean Architecture e Domain-Driven Design (DDD).

## Tecnologias Utilizadas

- **Spring Boot**: para a criação de microserviços.
- **Spring Data JPA**: para persistência de dados em um banco de dados.
- **H2 Database**: como banco de dados em memória para desenvolvimento e testes.
- **MapStruct**: para mapeamento objeto-objeto.
- **Maven**: para gerenciamento de dependências e build do projeto.

## Estrutura do Projeto

O projeto segue a Clean Architecture e está organizado da seguinte forma:

com.example.ecommerce.msagestaoprodutos
├── application
│ ├── dto
│ ├── mapper
│ └── service
├── configuration
├── domain
│ ├── model
│ └── repository
└── infrastructure
├── repository
├── security (opcional)
└── web


- **Domain**: Contém a lógica de negócios e o modelo de domínio.
- **Application**: Responsável pela lógica de aplicação e orquestração de operações de negócio.
- **Infrastructure**: Inclui a camada de persistência, configurações e controladores.
- **Configuration**: Contém a classe principal do Spring Boot e configurações adicionais.

## Como Executar

1. Clone o repositório:
git clone [<url-do-repositorio>](https://github.com/walterrx/msagestaoprodutos.git)
2. Navegue até a pasta do projeto e execute:
mvn clean install
3. Para iniciar a aplicação, execute:
mvn spring-boot:run

A aplicação estará disponível em `http://localhost:8080`.

## Endpoints

A aplicação expõe os seguintes endpoints para gestão de produtos:

- `POST /api/produtos`: Adiciona um novo produto.
- `GET /api/produtos`: Lista todos os produtos.
- `...` (outros endpoints conforme a implementação)

## Configuração

### Banco de Dados

O projeto utiliza H2 Database. As configurações padrão podem ser encontradas em `src/main/resources/application.properties`.

### MapStruct

O MapStruct é utilizado para mapeamento DTO. Assegure-se de que o processador de anotações do MapStruct esteja habilitado em seu IDE.


