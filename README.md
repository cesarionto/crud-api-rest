# API REST - EXEMPLO - BY CESÁRIO NETO

Aplicação backend com 4 operações principais (VEIA): Visualizar, Excluir, Inserir, Alterar
Adicionalmente, é exposta uma API REST, desenvolvida com outras características (ver a seguir).

## Características

- A Aplicação foi desenvolvida a partir da arquitetura REST(Roy Fielding).
- Para a persistência de dados foi utilizado o SGBD PostgreSQL.
- Para o mapeamento de entidades foi utilizado JPA e Hibernate.
- Aplicação inicializada com o Springboot.
- Java 11 LTS
- Lombok
- Para o teste de requisições foi utilizado o Postman.


## Para testar em localhost
Clone e Descompacte o arquivo <br/>
- Instale o Postman disponível em: https://www.postman.com/.
- Instale o SGBD PostgreSQL (https://www.postgresql.org/download/) de maneira que o usuario e senha do banco seja postgres.
- Crie um banco de dados local chamado agenda.
- Importe o projeto Maven na IDE e Preferência. 
- Inicie o Projeto.
- Inicie o Postman.
- Configure todas as requisições POST para: Headers: Key = Content-Typr e value = Application/json.

## Testando as Requisições da API em localhost
- Crie um Novo Contato POST: https://localhost:8080/api/contatos
```json
{
    "nome": "",
    "telefone" : ""
}
```
- Atualizar um Contato PUT: https://localhost:8080/api/contatos/{id}
```json
{
    "nome" : "",
    "telefone" : ""
}
```
- Delete um contato DELETE: https://localhost:8080/api/contatos/{id}

- Liste os contatos GET: https://localhost:8080/api/contatos


O processo acima também pode ser feito no POSTMAN.
