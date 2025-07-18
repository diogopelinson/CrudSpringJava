# 📦 Projeto: Cadastro de Usuários - Spring Boot

Este projeto foi desenvolvido como um **estudo prático** para aprender e aplicar os principais conceitos de **Java com Spring Boot**, estrutura em camadas, e o uso de **métodos HTTP (POST, GET, PUT, DELETE)** no contexto de uma API REST.

---

## 🚀 Funcionalidades

- ✅ Cadastrar um novo usuário
- 🔍 Buscar usuário por e-mail
- ✏️ Atualizar dados do usuário por ID
- 🗑️ Deletar usuário por e-mail

---


## 🧱 Estrutura em Camadas

#### `controller/`
- Responsável por receber as requisições HTTP.
- Exemplo: `UsuarioController.java`

#### `business/`
- Contém a lógica de negócio (serviços).
- Exemplo: `UsuarioService.java`

#### `infrastructure/`
- Contém as camadas de persistência de dados.

##### `infrastructure/entitys/`
- Contém a entidade que representa o objeto `Usuario`.

##### `infrastructure/repository/`
- Interface que comunica com o banco de dados.
- Exemplo: `UsuarioRepository.java`

#### `CadastroUsuarioApplication.java`
- Classe principal da aplicação Spring Boot.
---

## ⚙️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Lombok
- Banco de dados H2

---



## Documentação da API

#### Recebe o Usuario

```http
  POST /usuario
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `integer` | **Obrigatório**. Id do Usuario gerado automaticamente|
| `email` | `string` | **Obrigatório**. Email do Usuario|
| `nome` | `string` | **Obrigatório**. Nome do Usuario|

#### Retorna o Usuario

```http
  GET /usuario?email={email}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `email`      | `string` | **Obrigatório**. Email do Usuario |

#### Realiza o Update

```http
  PUT /usuario?id={id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Integer` | **Obrigatório**. Parametero de email para atualizar |

#### Deleta o Usuario

```http
  DELETE /usuario?email={email
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `email`      | `Integer` | **Obrigatório**. Email do Usuario para Deletar |





## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/diogopelinsonmoraes)

