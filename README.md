# Sistema Aluno Online

📘 Descrição do Projeto

A API Aluno Online foi desenvolvida por João Victor como projeto final das disciplinas Tecnologia para Back-End. Construída com Java (Spring Boot) e utilizando PostgreSQL, ela fornece serviços RESTful para gerenciar o fluxo acadêmico e acadêmico-administrativo de alunos.

# A API permite:

Cadastro e gerenciamento de alunos

Cadastro e gerenciamento de professores

Cadastro e gerenciamento de disciplinas

# Matrícula de alunos em disciplinas

Atualização de notas

Emissão de histórico escolar

Trancamento de matrícula

Os testes foram realizados via Insomnia e o banco administrado pelo DBeaver.

# Tecnologias Utilizadas

Java 17

Spring Boot

Maven

PostgreSQL

# Ferramentas de Apoio:

Insomnia – Testes das requisições HTTP

DBeaver – Gerenciamento do banco de dados

# Visão Geral dos Módulos

| Módulo          | Descrição                        |
| --------------- | -------------------------------- |
| **Alunos**      | CRUD completo de alunos          |
| **Professores** | CRUD completo de professores     |
| **Disciplinas** | CRUD completo de disciplinas     |
| **Matrículas**  | Matrículas, notas e trancamentos |
| **Histórico**   | Emissão do histórico acadêmico   |

# Endpoints Principais

| Método | Rota         | Descrição           |
| ------ | ------------ | ------------------- |
| POST   | /alunos      | Cadastrar aluno     |
| GET    | /alunos      | Listar alunos       |
| GET    | /alunos/{id} | Buscar aluno por ID |
| PUT    | /alunos/{id} | Atualizar aluno     |
| DELETE | /alunos/{id} | Remover aluno       |

# Módulo Professor

| Método | Rota              | Descrição               |
| ------ | ----------------- | ----------------------- |
| POST   | /professores      | Cadastrar professor     |
| GET    | /professores      | Listar professores      |
| GET    | /professores/{id} | Buscar professor por ID |
| PUT    | /professores/{id} | Atualizar professor     |
| DELETE | /professores/{id} | Remover professor       |

# Módulo Disciplinas

| Método | Rota              | Descrição                |
| ------ | ----------------- | ------------------------ |
| POST   | /disciplinas      | Cadastrar disciplina     |
| GET    | /disciplinas      | Listar disciplinas       |
| GET    | /disciplinas/{id} | Buscar disciplina por ID |
| PUT    | /disciplinas/{id} | Atualizar disciplina     |
| DELETE | /disciplinas/{id} | Remover disciplina       |

# Módulo Matrículas & Histórico

| Método | Rota                                   | Descrição         |
| ------ | -------------------------------------- | ----------------- |
| POST   | /matriculas                            | Criar matrícula   |
| PATCH  | /matriculas/trancar/{id}               | Trancar matrícula |
| PATCH  | /matriculas/atualizar-notas/{id}       | Atualizar notas   |
| GET    | /matriculas/emitir-historico/{alunoId} | Emitir histórico  |

# Exemplos de Requisições (Insomnia)

# POST /alunos – Criar Aluno

<img width="1600" height="666" alt="image" src="https://github.com/user-attachments/assets/375544c7-18d4-4184-a731-87762ecea497" />

# GET /alunos – Buscar Todos os Alunos

<img width="1593" height="714" alt="image" src="https://github.com/user-attachments/assets/61eb4c31-7dcb-4d53-99dd-a41232779bfd" />

 # GET /alunos/{id} – Buscar Aluno por ID

 <img width="1600" height="717" alt="image" src="https://github.com/user-attachments/assets/5c4b1ad6-7e7d-44d1-af4c-fa3da74dbd3f" />

 # Banco de Dados – Alunos (PostgreSQL)

 





**Diagrama do banco de dados do projeto “Aluno Online”, mostrando as tabelas, relacionamentos e chaves primárias e estrangeiras utilizadas para armazenar informações dos alunos**

![image alt](https://github.com/JVictorxp9/Aluno_Online/blob/cd0e38f74b9883b63cb2a41c417b53b952f84192/Banco%20de%20Dados.PNG)

**Interface de cadastro de um novo aluno no sistema, permitindo inserir informações como nome, matrícula, e dados pessoais.**

![image alt](https://github.com/JVictorxp9/Aluno_Online/blob/cd0e38f74b9883b63cb2a41c417b53b952f84192/criarAluno.PNG)

**Tela de busca de alunos, onde é possível pesquisar e visualizar rapidamente os registros cadastrados no sistema.**

![image alt](https://github.com/JVictorxp9/Aluno_Online/blob/cd0e38f74b9883b63cb2a41c417b53b952f84192/BuscarAluno.PNG)

**Exemplo de consulta de um aluno específico pelo seu ID, mostrando os detalhes completos do registro retornado pelo sistema.**

![image alt](https://github.com/JVictorxp9/Aluno_Online/blob/cd0e38f74b9883b63cb2a41c417b53b952f84192/buscarAlunosPorId.PNG)
