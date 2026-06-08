# Projeto: Sistema de Gerenciamento(JDBC)

Este projeto foi desenvolvido como parte dos meus estudos em persistência de dados, focando no padrão de projeto **DAO (Data Access Object)** e na utilização de **Java JDBC** para comunicação com bancos de dados relacionais **MySQL**.

## Tecnologias Utilizadas

* **Linguagem:** Java 21+
* **Banco de Dados:** MySQL
* **Gerenciamento de Dependências:** Maven (via IntelliJ IDEA)
* **Conexão:** JDBC Driver para MySQL

## Conceitos Aplicados

O principal objetivo deste projeto foi dominar a "engrenagem" por baixo dos panos das aplicações backend, praticando:

* **Arquitetura em Camadas:** Separação entre entidades (`entities`), acesso a dados (`dao`) e aplicação (`application`).
* **Padrão DAO:** Implementação de interfaces para desacoplar a regra de negócio da lógica de banco de dados.
* **Tratamento de Exceções:** Uso de blocos `try-catch-finally` para garantir a integridade das conexões e evitar vazamentos de memória.
* **Integridade Referencial:** Manipulação segura de chaves estrangeiras e controle de transações.

## Como Rodar o Projeto

1.  **Clone o repositório:**
    `git clone https://github.com/diegosidarta/demo-dao-jdbc.git`
2.  **Configuração:** Certifique-se de ter o MySQL instalado e crie o banco de dados conforme o script SQL disponibilizado.
3.  **Dependências:** O projeto utiliza o driver JDBC do MySQL. Caso necessário, adicione a biblioteca via Maven ou carregue o `.jar` correspondente na estrutura do projeto.
4.  **Execução:** Configure as credenciais de acesso ao seu banco de dados no arquivo `db.properties` e execute a classe `Program.java`.

