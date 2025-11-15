# 🗺️ CepListAPI

CepListAPI é uma API REST desenvolvida em Spring Boot com o objetivo de estudar e praticar conceitos iniciais de back-end Java, persistência de dados e integrações com serviços externos.

O projeto foi criado para entender na prática como consumir uma API pública de CEP (ViaCEP), salvar e manipular endereços em banco de dados utilizando JPA/Hibernate, e estruturar os principais componentes de uma API moderna: entidades, repositórios, controllers, DTOs e serviços.

A aplicação serve tanto como material de aprendizado quanto como referência inicial para quem deseja aprender a integrar APIs externas com persistência em banco.

---

## 🚀 Conceitos estudados

- Estrutura básica de um projeto Spring Boot
- Consumo de API externa (`https://viacep.com.br/`)
- Criação de entidades JPA e manipulação de dados com Hibernate
- Uso de DTOs para separar modelo interno da resposta/entrada da API
- Separação de camadas (Controller, Service, Repository)
- Boas práticas de organização e código limpo

---

## 🔗 Endpoints principais

- **GET `/endereco/{cep}`** – Buscar endereço pelo CEP (consulta ViaCEP direto)
- **POST `/endereco/{cep}`** – Salvar endereço pesquisando o CEP na API do ViaCEP e armazenar no banco de dados
- **GET `/endereco`** – Listar todos os endereços já armazenados
- **DELETE `/endereco/{id}`** – Remover endereço salvo pelo ID
- **PUT `/endereco/{id}`** – Atualizar campos de um endereço salvo (parcialmente ou totalmente)

*Todos os dados persistidos usam JPA/Hibernate com MySQL (ou outro banco configurável).*

---

## ⚙️ Como executar localmente

1. Configure as informações do banco de dados no arquivo `application.properties`:
    - Atenção: não suba usuários, senhas ou dados sensíveis em repositórios públicos.
2. Rode o projeto com o comando:
   ```
   ./mvnw spring-boot:run
   ```
3. Use um cliente REST (ex: Postman ou Insomnia) e acesse os endpoints acima.

---

## 📚 Observação

O projeto foi desenvolvido com foco em estudo prático, integração de APIs externas, e serve como uma base para explorar conceitos fundamentais do desenvolvimento back-end com Spring Boot.

Quer experimentar, adaptar ou expandir? O código está aberto para aprendizado!

---