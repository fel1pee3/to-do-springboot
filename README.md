# To-Do List API

Uma API simples de gerenciamento de tarefas (To-Do) desenvolvida com **Spring Boot** e **Java 17**.  
O objetivo do projeto é permitir a criação, leitura, atualização e exclusão (CRUD) de tarefas em um banco de dados MySQL.

---

## Tecnologias Utilizadas

- **Spring Boot**
  - Spring Web
  - Spring Data JPA
  - Spring Boot DevTools
- **Lombok**
- **MySQL Driver**
- **Java 17**

---

## Estrutura do Banco de Dados

Banco de dados: `todolist`  
Tabela: `todo`

### Colunas:
- **id** (Long): Identificador único da tarefa (auto-incremento, chave primária)
- **nome** (String): Nome da tarefa
- **descricao** (String): Detalhes da tarefa
- **realizado** (Boolean): Status de conclusão da tarefa
- **prioridade** (Integer): Nível de prioridade da tarefa (ex.: 1 - alta, 2 - média, 3 - baixa)

---

## Endpoints da API

Abaixo está a lista de endpoints disponíveis na API:

| Método | Endpoint         | Descrição                                |
|--------|------------------|------------------------------------------|
| GET    | `/todos`         | Retorna todas as tarefas cadastradas     |
| GET    | `/todos/{id}`    | Retorna uma tarefa específica por ID     |
| POST   | `/todos`         | Adiciona uma nova tarefa                |
| PUT    | `/todos/{id}`    | Atualiza uma tarefa existente            |
| DELETE | `/todos/{id}`    | Remove uma tarefa pelo ID                |

---

## Configuração do Ambiente

### Pré-requisitos:
- **Java 17** ou superior
- **MySQL** instalado e configurado
- **Maven** instalado

### Configuração do Banco de Dados:

Crie um banco de dados chamado `todolist` no MySQL. Use o seguinte comando SQL:

```sql
CREATE DATABASE todolist;
```

## Configuração do application.properties

No arquivo src/main/resources/application.properties, configure a conexão com o banco de dados:

```sql
spring.application.name=NOME-DA-TABELA

spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=root
spring.datasource.password=SENHA
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
```

## 💻 **Como executar o projeto**

### 1. Clonar o Repositório

```bash
git clone https://github.com/fel1pee3/to-do-springboot
```

### 2. Rodar o projeto
### 3. Tester API em alguma aplicação (ex: postman)
### 4. Acesse o projeto via http://localhost:8080/todos

## 📄  **Licença**

Este projeto está sob a licença MIT.
