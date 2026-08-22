### Modelo
---

### 1° Entity

Define a estrutura de alguma entidade, e nesse a estrutura do banco de dados.

### 2° Repository

Interface que extende o JPA, é a ponte entre o código Java e o banco de dados. Vai "puxar" os métodos do banco de dados (CRUD).

### 3° DTOs

Transporta dados de forma segura e otimizada entre camadas da aplicação, como o banco de dados e o SPA. 

- Controle e Filtragem de dados: Define exatemente quais campos a aplicação aceita receber. Impede que dados sensíveis vazem no JSON.

- Isolamento de Camadas: Garante que as mudanças feitas no banco de dados não quebrem o contrato com o Frontend. 

- Validação de Entrada

- Impede enviar campos proibidos no corpo do JSON.

### 4° Service

Implementa as regras de neócio. Usa o Repositoy para persistir e os DTOs para receber e retornar dados.

### 5° Controller

Expõe as rotas HTTP, apenas chama os métodos do Service e retorna DTOs.