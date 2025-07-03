# LIST_TODO

## Descrição

O **LIST_TODO** é uma aplicação de lista de tarefas (To-Do List) desenvolvida em **Java 17** utilizando **Spring Boot**. A aplicação oferece um CRUD completo para gerenciar tarefas, além de recursos como **Swagger**, integração com **MySQL** e **H2Database**, **WebFlux** para programação reativa, e testes unitários com integração ao banco de dados.

A aplicação também é projetada para se comunicar com um banco de dados Dockerizado, proporcionando flexibilidade e escalabilidade no ambiente de desenvolvimento.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada no desenvolvimento.
- **Spring Boot**: Framework principal para a criação da aplicação.
- **Spring WebFlux**: Para implementação de programação reativa e responsiva.
- **MySQL**: Banco de dados principal para armazenamento das tarefas.
- **H2Database**: Banco de dados em memória utilizado para testes.
- **Docker**: Utilizado para rodar o banco de dados MySQL em um contêiner.
- **Swagger**: Interface para documentação interativa da API.
- **Maven**: Gerenciador de dependências e build da aplicação.
- **Testes**: Testes unitários implementados para garantir a funcionalidade da aplicação.

## Funcionalidades

- **CRUD Completo**: Criação, Leitura, Atualização e Exclusão de tarefas.
- **Documentação com Swagger**: Interface interativa para explorar a API de forma intuitiva.
- **Banco de Dados em Docker**: O MySQL roda em um contêiner Docker, permitindo fácil configuração e gerenciamento.
- **Testes Unitários**: Testes para garantir o funcionamento correto da aplicação, incluindo testes com o banco de dados H2 para a classe principal.

## Como Executar a Aplicação

### Pré-requisitos

- **Java 17** ou superior instalado.
- **Maven** instalado para build da aplicação.
- **Docker** instalado para rodar o MySQL em contêiner.

### Passos para Execução

1. Clone o repositório:
    ```bash
    git clone https://github.com/MarcosSilva2021/list_todo.git
    cd list_todo
    ```

2. Construa o projeto com o Maven:
    ```bash
    mvn clean install
    ```

3. Suba o contêiner Docker para o banco de dados MySQL:
    - No diretório do projeto, crie um arquivo `docker-compose.yml` com a configuração do MySQL:

      ```yaml
      version: '3.8'
      services:
        mysql:
          image: mysql:8
          environment:
            MYSQL_ROOT_PASSWORD: root
            MYSQL_DATABASE: list_todo_db
          ports:
            - "3306:3306"
          networks:
            - todo-network
      networks:
        todo-network:
          driver: bridge
      ```

    - Inicie o Docker:
      ```bash
      docker-compose up -d
      ```

4. Execute a aplicação:
    ```bash
    mvn spring-boot:run
    ```

    A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080).

5. Acesse a documentação da API via Swagger:
    - URL Swagger: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Testes

### Testes Unitários

Os testes estão localizados no diretório `src/test/java`. Eles incluem:

- Testes da classe principal utilizando o banco H2.
- Testes de integração para garantir que o CRUD funciona corretamente com o MySQL.

Para rodar os testes, use o comando:

```bash
mvn test
