# Sistema Aluno Online

📘 Descrição do Projeto

## 📑 Sumário
- [Descrição](#-descrição-do-projeto)
- [Tecnologias](#-tecnologias-utilizadas)
- [Arquitetura da Aplicação](#-arquitetura-da-aplicação)
- [Como Rodar o Projeto](#-como-rodar-o-projeto)
- [Requisitos](#-pré-requisitos)
- [Endpoints](#-endpoints-principais)
- [Banco de Dados](#-banco-de-dados)
- [Estrutura do Projeto](#-estrutura-de-pastas)
- [Autor](#-autor)


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

# ⚙️ Tecnologias Utilizadas

- Java 17

- Spring Boot

= Maven

- PostgreSQL

# Ferramentas de Apoio:

Insomnia – Testes das requisições HTTP

DBeaver – Gerenciamento do banco de dados

# 🧩 Visão Geral dos Módulos

| Módulo          | Descrição                        |
| --------------- | -------------------------------- |
| **Alunos**      | CRUD completo de alunos          |
| **Professores** | CRUD completo de professores     |
| **Disciplinas** | CRUD completo de disciplinas     |
| **Matrículas**  | Matrículas, notas e trancamentos |
| **Histórico**   | Emissão do histórico acadêmico   |

# 🧠 Endpoints Principais

# 👨‍🎓 Módulo Alunos

| Método | Rota         | Descrição           |
| ------ | ------------ | ------------------- |
| POST   | /alunos      | Cadastrar aluno     |
| GET    | /alunos      | Listar alunos       |
| GET    | /alunos/{id} | Buscar aluno por ID |
| PUT    | /alunos/{id} | Atualizar aluno     |
| DELETE | /alunos/{id} | Remover aluno       |

# 👨‍🏫 Módulo Professor

| Método | Rota              | Descrição               |
| ------ | ----------------- | ----------------------- |
| POST   | /professores      | Cadastrar professor     |
| GET    | /professores      | Listar professores      |
| GET    | /professores/{id} | Buscar professor por ID |
| PUT    | /professores/{id} | Atualizar professor     |
| DELETE | /professores/{id} | Remover professor       |

# 📚 Módulo Disciplinas

| Método | Rota              | Descrição                |
| ------ | ----------------- | ------------------------ |
| POST   | /disciplinas      | Cadastrar disciplina     |
| GET    | /disciplinas      | Listar disciplinas       |
| GET    | /disciplinas/{id} | Buscar disciplina por ID |
| PUT    | /disciplinas/{id} | Atualizar disciplina     |
| DELETE | /disciplinas/{id} | Remover disciplina       |

# 🎓 Módulo Matrículas & Histórico

| Método | Rota                                   | Descrição         |
| ------ | -------------------------------------- | ----------------- |
| POST   | /matriculas                            | Criar matrícula   |
| PATCH  | /matriculas/trancar/{id}               | Trancar matrícula |
| PATCH  | /matriculas/atualizar-notas/{id}       | Atualizar notas   |
| GET    | /matriculas/emitir-historico/{alunoId} | Emitir histórico  |

# Exemplos de Requisições Insomnia do Crud Aluno

# POST /alunos – Criar Aluno

<img width="1600" height="666" alt="image" src="https://github.com/user-attachments/assets/375544c7-18d4-4184-a731-87762ecea497" />

# GET /alunos – Buscar Todos os Alunos

<img width="1593" height="714" alt="image" src="https://github.com/user-attachments/assets/61eb4c31-7dcb-4d53-99dd-a41232779bfd" />

 # GET /alunos/{id} – Buscar Aluno por ID

 <img width="1600" height="717" alt="image" src="https://github.com/user-attachments/assets/5c4b1ad6-7e7d-44d1-af4c-fa3da74dbd3f" />

 # Banco de Dados – Alunos (PostgreSQL)

**Diagrama do banco de dados do projeto “Aluno Online”, mostrando as tabelas, relacionamentos e chaves primárias e estrangeiras utilizadas para armazenar informações dos alunos**

![image alt](https://github.com/JVictorxp9/Aluno_Online/blob/cd0e38f74b9883b63cb2a41c417b53b952f84192/Banco%20de%20Dados.PNG)

# Exemplos de Requisições Insomnia do Crud Professor

# POST /professores – Criar Professor

<img width="1600" height="747" alt="image" src="https://github.com/user-attachments/assets/41a759b8-4c55-4fd7-831d-3d9ea317c357" />

# GET /professores – Buscar Todos os Professores

<img width="1600" height="752" alt="image" src="https://github.com/user-attachments/assets/9634e32f-88b1-4118-a185-c16368e3b0ce" />

# GET /professores/{id} – Buscar Professor por ID

<img width="1600" height="745" alt="image" src="https://github.com/user-attachments/assets/9b87de90-a1ff-47aa-91f1-4c33f0926f7b" />

# PUT /professores/{id} – Atualizar Professor

<img width="1600" height="742" alt="image" src="https://github.com/user-attachments/assets/34f1ab7f-ea75-4428-ac8d-6b613f0f02a0" />

# DELETE /professores/{id} – Deletar Professor

<img width="1600" height="749" alt="image" src="https://github.com/user-attachments/assets/77d03857-a118-4da8-be3e-f137adb8fa95" />

# Banco de Dados – Professores (PostgreSQL)

<img width="1600" height="850" alt="image" src="https://github.com/user-attachments/assets/54fead0a-33f3-4f83-a841-d61e94669c59" />

# Exemplos de Requisições Insomnia do Crud Disciplina

# POST /disciplinas – Criar Disciplina

<img width="1600" height="745" alt="image" src="https://github.com/user-attachments/assets/bcbf05c2-cc26-4b17-9c4c-db5826964a8b" />

# GET /disciplinas – Buscar Todas as Disciplinas

<img width="1600" height="736" alt="image" src="https://github.com/user-attachments/assets/1c8aa7b6-6e23-4cf6-94e7-127461659405" />

# GET /disciplinas/{id} – Buscar Disciplina por ID

<img width="1600" height="743" alt="image" src="https://github.com/user-attachments/assets/831efae0-2085-4adb-aa46-8ae2cc6bfad6" />

# PUT /disciplinas/{id} – Atualizar Disciplina

<img width="1600" height="745" alt="image" src="https://github.com/user-attachments/assets/54e39a60-7ead-4643-932d-bfc27de381f6" />

# DELETE /disciplinas/{id} – Deletar Disciplina

<img width="1600" height="740" alt="image" src="https://github.com/user-attachments/assets/8476a8a3-68d0-45d1-9054-c357d494256b" />

# Banco de Dados – Disciplina (PostgreSQL)

<img width="1600" height="850" alt="image" src="https://github.com/user-attachments/assets/c0f0ad8b-947a-4f7c-abce-79cbb4f53fff" />

# Testes no Insomnia – Matrículas & Histórico

# POST /matriculas – Criar Matrícula

<img width="1600" height="743" alt="image" src="https://github.com/user-attachments/assets/5a82e0f3-8e97-4baa-aa0b-a9ea71b5c764" />

# PATCH /matriculas/atualizar-notas/{id} – Atualizar Notas da Matrícula

<img width="1600" height="750" alt="image" src="https://github.com/user-attachments/assets/783c6805-f77c-425a-93de-e627f949028c" />

# PATCH /matriculas/trancar/{id} – Trancar Matrícula

<img width="1600" height="751" alt="image" src="https://github.com/user-attachments/assets/aa35f126-7a5e-421d-b4d5-8a10675535be" />

# GET /matriculas/emitir-historico/{alunoId} – Emitir Histórico do Aluno

<img width="1600" height="742" alt="image" src="https://github.com/user-attachments/assets/99e324bb-59bd-4a72-98d1-bce166c60c2e" />

# Banco de Dados – matricula_aluno (PostgreSQL)

<img width="1600" height="850" alt="image" src="https://github.com/user-attachments/assets/9f9aa24c-596b-4743-9062-2edb1e956471" />

✅ Considerações Finais

A API segue a arquitetura padrão do Spring Boot.

As respostas são retornadas em JSON.

Todos os testes foram realizados via Insomnia.

O banco foi acompanhado e validado no DBeaver






















