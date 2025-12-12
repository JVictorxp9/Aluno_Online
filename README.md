# 📑 Sistema Aluno Online


A API Aluno Online foi desenvolvida por João Victor como projeto final das disciplinas Tecnologia para Back-End. Construída com Java (Spring Boot) e utilizando PostgreSQL, ela fornece serviços RESTful para gerenciar o fluxo acadêmico e acadêmico-administrativo de alunos.

# A API permite:

- **Cadastro e gerenciamento de alunos**

- **Cadastro e gerenciamento de professores**

- **Cadastro e gerenciamento de disciplinas**

# Matrícula de alunos em disciplinas**

- **Atualização de notas**

- **Emissão de histórico escolar**

- **Trancamento de matrícula**

Os testes foram realizados via Insomnia e o banco administrado pelo DBeaver.

## 📌 Tecnologias Utilizadas 
- **Java 17 instalado** 
- **Maven instalado**  
- **PostgreSQL configurado**  
- **Insomnia**
- **Dbeave**

## 🏛 Arquitetura e Estrutura do Projeto

Este projeto segue o padrão **Arquitetura em Camadas (Layered Architecture)**, amplamente utilizado em aplicações Java com Spring Boot. Essa abordagem separa as responsabilidades da aplicação em partes independentes, tornando o código mais organizado, limpo e fácil de manter.

A estrutura é dividida em camadas, cada uma com um papel específico:

- **Controller** → Responsável por receber as requisições HTTP e expor os endpoints da aplicação.  
- **Service** → Onde são aplicadas as regras de negócio e processamentos lógicos.  
- **Repository** → Responsável pela comunicação com o banco de dados utilizando JPA/Hibernate.  
- **Model (Entity)** → Classes que representam as entidades e tabelas do sistema.  
- **DTO** → Objetos utilizados para transferência de dados entre as camadas (entrada e saída).  
- **Resources** → Arquivos de configuração, como `application.properties`, scripts SQL e outros recursos.

**Benefícios dessa arquitetura:**

- Separação clara de responsabilidades  
- Código mais modular e fácil de entender  
- Melhor testabilidade das funcionalidades  
- Facilita manutenção e evolução do projeto  
- Segue boas práticas consolidadas do Spring Boot

Essa arquitetura torna o projeto mais profissional e escalável, sendo ideal para APIs REST modernas.


## 🧩 Visão Geral dos Módulos

<div align="center">

<table>
  <tr>
    <th>Módulo</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td><strong>Alunos</strong></td>
    <td>CRUD completo de alunos</td>
  </tr>
  <tr>
    <td><strong>Professores</strong></td>
    <td>CRUD completo de professores</td>
  </tr>
  <tr>
    <td><strong>Disciplinas</strong></td>
    <td>CRUD completo de disciplinas</td>
  </tr>
  <tr>
    <td><strong>Matrículas</strong></td>
    <td>Matrículas, notas e trancamentos</td>
  </tr>
  <tr>
    <td><strong>Histórico</strong></td>
    <td>Emissão do histórico acadêmico</td>
  </tr>
</table>

</div>


## 🧠 Endpoints Principais

## 👨‍🎓 Módulo Alunos

<div align="center">

<table>
  <tr>
    <th>Método</th>
    <th>Rota</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td><strong>POST</strong></td>
    <td>/alunos</td>
    <td>Cadastrar aluno</td>
  </tr>
  <tr>
    <td><strong>GET</strong></td>
    <td>/alunos</td>
    <td>Listar alunos</td>
  </tr>
  <tr>
    <td><strong>GET</strong></td>
    <td>/alunos/{id}</td>
    <td>Buscar aluno por ID</td>
  </tr>
  <tr>
    <td><strong>PUT</strong></td>
    <td>/alunos/{id}</td>
    <td>Atualizar aluno</td>
  </tr>
  <tr>
    <td><strong>DELETE</strong></td>
    <td>/alunos/{id}</td>
    <td>Remover aluno</td>
  </tr>
</table>

</div>


## 👨‍🏫 Módulo Professor

<div align="center">

<table>
  <tr>
    <th>Método</th>
    <th>Rota</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td><strong>POST</strong></td>
    <td>/professores</td>
    <td>Cadastrar professor</td>
  </tr>
  <tr>
    <td><strong>GET</strong></td>
    <td>/professores</td>
    <td>Listar professores</td>
  </tr>
  <tr>
    <td><strong>GET</strong></td>
    <td>/professores/{id}</td>
    <td>Buscar professor por ID</td>
  </tr>
  <tr>
    <td><strong>PUT</strong></td>
    <td>/professores/{id}</td>
    <td>Atualizar professor</td>
  </tr>
  <tr>
    <td><strong>DELETE</strong></td>
    <td>/professores/{id}</td>
    <td>Remover professor</td>
  </tr>
</table>

</div>


## 📚 Módulo Disciplinas

<div align="center">

<table>
  <tr>
    <th>Método</th>
    <th>Rota</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td><strong>POST</strong></td>
    <td>/disciplinas</td>
    <td>Cadastrar disciplina</td>
  </tr>
  <tr>
    <td><strong>GET</strong></td>
    <td>/disciplinas</td>
    <td>Listar disciplinas</td>
  </tr>
  <tr>
    <td><strong>GET</strong></td>
    <td>/disciplinas/{id}</td>
    <td>Buscar disciplina por ID</td>
  </tr>
  <tr>
    <td><strong>PUT</strong></td>
    <td>/disciplinas/{id}</td>
    <td>Atualizar disciplina</td>
  </tr>
  <tr>
    <td><strong>DELETE</strong></td>
    <td>/disciplinas/{id}</td>
    <td>Remover disciplina</td>
  </tr>
</table>

</div>


## 🎓 Módulo Matrículas & Histórico

<div align="center">

<table>
  <tr>
    <th>Método</th>
    <th>Rota</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td><strong>POST</strong></td>
    <td>/matriculas</td>
    <td>Criar matrícula</td>
  </tr>
  <tr>
    <td><strong>PATCH</strong></td>
    <td>/matriculas/trancar/{id}</td>
    <td>Trancar matrícula</td>
  </tr>
  <tr>
    <td><strong>PATCH</strong></td>
    <td>/matriculas/atualizar-notas/{id}</td>
    <td>Atualizar notas</td>
  </tr>
  <tr>
    <td><strong>GET</strong></td>
    <td>/matriculas/emitir-historico/{alunoId}</td>
    <td>Emitir histórico</td>
  </tr>
</table>

</div>


## Exemplos de Requisições Insomnia do Crud Aluno

## POST /alunos – Criar Aluno

<img width="1600" height="666" alt="image" src="https://github.com/user-attachments/assets/375544c7-18d4-4184-a731-87762ecea497" />

## GET /alunos – Buscar Todos os Alunos

<img width="1593" height="714" alt="image" src="https://github.com/user-attachments/assets/61eb4c31-7dcb-4d53-99dd-a41232779bfd" />

 ## GET /alunos/{id} – Buscar Aluno por ID

 <img width="1600" height="717" alt="image" src="https://github.com/user-attachments/assets/5c4b1ad6-7e7d-44d1-af4c-fa3da74dbd3f" />

## Banco de Dados – Alunos (PostgreSQL)

**Diagrama do banco de dados do projeto “Aluno Online”, mostrando as tabelas, relacionamentos e chaves primárias e estrangeiras utilizadas para armazenar informações dos alunos**

![image alt](https://github.com/JVictorxp9/Aluno_Online/blob/cd0e38f74b9883b63cb2a41c417b53b952f84192/Banco%20de%20Dados.PNG)

## Exemplos de Requisições Insomnia do Crud Professor

## POST /professores – Criar Professor

<img width="1600" height="747" alt="image" src="https://github.com/user-attachments/assets/41a759b8-4c55-4fd7-831d-3d9ea317c357" />

## GET /professores – Buscar Todos os Professores

<img width="1600" height="752" alt="image" src="https://github.com/user-attachments/assets/9634e32f-88b1-4118-a185-c16368e3b0ce" />

## GET /professores/{id} – Buscar Professor por ID

<img width="1600" height="745" alt="image" src="https://github.com/user-attachments/assets/9b87de90-a1ff-47aa-91f1-4c33f0926f7b" />

## PUT /professores/{id} – Atualizar Professor

<img width="1600" height="742" alt="image" src="https://github.com/user-attachments/assets/34f1ab7f-ea75-4428-ac8d-6b613f0f02a0" />

## DELETE /professores/{id} – Deletar Professor

<img width="1600" height="749" alt="image" src="https://github.com/user-attachments/assets/77d03857-a118-4da8-be3e-f137adb8fa95" />

## Banco de Dados – Professores (PostgreSQL)

<img width="1600" height="850" alt="image" src="https://github.com/user-attachments/assets/54fead0a-33f3-4f83-a841-d61e94669c59" />

## Exemplos de Requisições Insomnia do Crud Disciplina

## POST /disciplinas – Criar Disciplina

<img width="1600" height="745" alt="image" src="https://github.com/user-attachments/assets/bcbf05c2-cc26-4b17-9c4c-db5826964a8b" />

## GET /disciplinas – Buscar Todas as Disciplinas

<img width="1600" height="736" alt="image" src="https://github.com/user-attachments/assets/1c8aa7b6-6e23-4cf6-94e7-127461659405" />

## GET /disciplinas/{id} – Buscar Disciplina por ID

<img width="1600" height="743" alt="image" src="https://github.com/user-attachments/assets/831efae0-2085-4adb-aa46-8ae2cc6bfad6" />

## PUT /disciplinas/{id} – Atualizar Disciplina

<img width="1600" height="745" alt="image" src="https://github.com/user-attachments/assets/54e39a60-7ead-4643-932d-bfc27de381f6" />

## DELETE /disciplinas/{id} – Deletar Disciplina

<img width="1600" height="740" alt="image" src="https://github.com/user-attachments/assets/8476a8a3-68d0-45d1-9054-c357d494256b" />

# Banco de Dados – Disciplina (PostgreSQL)

<img width="1600" height="850" alt="image" src="https://github.com/user-attachments/assets/c0f0ad8b-947a-4f7c-abce-79cbb4f53fff" />

## Testes no Insomnia – Matrículas & Histórico

## POST /matriculas – Criar Matrícula

<img width="1600" height="743" alt="image" src="https://github.com/user-attachments/assets/5a82e0f3-8e97-4baa-aa0b-a9ea71b5c764" />

## PATCH /matriculas/atualizar-notas/{id} – Atualizar Notas da Matrícula

<img width="1600" height="750" alt="image" src="https://github.com/user-attachments/assets/783c6805-f77c-425a-93de-e627f949028c" />

## PATCH /matriculas/trancar/{id} – Trancar Matrícula

<img width="1600" height="751" alt="image" src="https://github.com/user-attachments/assets/aa35f126-7a5e-421d-b4d5-8a10675535be" />

## GET /matriculas/emitir-historico/{alunoId} – Emitir Histórico do Aluno

<img width="1600" height="742" alt="image" src="https://github.com/user-attachments/assets/99e324bb-59bd-4a72-98d1-bce166c60c2e" />

## Banco de Dados – matricula_aluno (PostgreSQL)

<img width="1600" height="850" alt="image" src="https://github.com/user-attachments/assets/9f9aa24c-596b-4743-9062-2edb1e956471" />


## 📂 Considerações Finais

- **A API segue a arquitetura padrão do Spring Boot.**

- **As respostas são retornadas em JSON.**

- **Todos os testes foram realizados via Insomnia.**

- **O banco foi acompanhado e validado no DBeaver.**


## 📌 Exemplos de Requisições — CRUD Aluno

### 📍 POST /alunos — Criar Aluno
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/375544c7-18d4-4184-a731-87762ecea497" />
</p>

### 📍 GET /alunos — Buscar Todos os Alunos
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/61eb4c31-7dcb-4d53-99dd-a41232779bfd" />
</p>

### 📍 GET /alunos/{id} — Buscar Aluno por ID
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/5c4b1ad6-7e7d-44d1-af4c-fa3da74dbd3f" />
</p>

---

## 🗄️ Banco de Dados — Alunos (PostgreSQL)

**Diagrama da tabela de alunos utilizada no sistema Aluno Online.**

<p align="center">
  <img width="100%" src="https://github.com/JVictorxp9/Aluno_Online/blob/cd0e38f74b9883b63cb2a41c417b53b952f84192/Banco%20de%20Dados.PNG" />
</p>

---

## 📌 Exemplos de Requisições — CRUD Professor

### 📍 POST /professores — Criar Professor
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/41a759b8-4c55-4fd7-831d-3d9ea317c357" />
</p>

### 📍 GET /professores — Buscar Todos os Professores
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/9634e32f-88b1-4118-a185-c16368e3b0ce" />
</p>

### 📍 GET /professores/{id} — Buscar Professor por ID
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/9b87de90-a1ff-47aa-91f1-4c33f0926f7b" />
</p>

### 📍 PUT /professores/{id} — Atualizar Professor
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/34f1ab7f-ea75-4428-ac8d-6b613f0f02a0" />
</p>

### 📍 DELETE /professores/{id} — Deletar Professor
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/77d03857-a118-4da8-be3e-f137adb8fa95" />
</p>

---

## 🗄️ Banco de Dados — Professores (PostgreSQL)

<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/54fead0a-33f3-4f83-a841-d61e94669c59" />
</p>

---

## 📌 Exemplos de Requisições — CRUD Disciplina

### 📍 POST /disciplinas — Criar Disciplina
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/bcbf05c2-cc26-4b17-9c4c-db5826964a8b" />
</p>

### 📍 GET /disciplinas — Buscar Todas as Disciplinas
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/1c8aa7b6-6e23-4cf6-94e7-127461659405" />
</p>

### 📍 GET /disciplinas/{id} — Buscar Disciplina por ID
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/831efae0-2085-4adb-aa46-8ae2cc6bfad6" />
</p>

### 📍 PUT /disciplinas/{id} — Atualizar Disciplina
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/54e39a60-7ead-4643-932d-bfc27de381f6" />
</p>

### 📍 DELETE /disciplinas/{id} — Deletar Disciplina
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/8476a8a3-68d0-45d1-9054-c357d494256b" />
</p>

---

## 🗄️ Banco de Dados — Disciplina (PostgreSQL)

<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/c0f0ad8b-947a-4f7c-abce-79cbb4f53fff" />
</p>

---

## 📌 Testes no Insomnia — Matrículas & Histórico

### 📍 POST /matriculas — Criar Matrícula
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/5a82e0f3-8e97-4baa-aa0b-a9ea71b5c764" />
</p>

### 📍 PATCH /matriculas/atualizar-notas/{id} — Atualizar Notas
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/783c6805-f77c-425a-93de-e627f949028c" />
</p>

### 📍 PATCH /matriculas/trancar/{id} — Trancar Matrícula
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/aa35f126-7a5e-421d-b4d5-8a10675535be" />
</p>

### 📍 GET /matriculas/emitir-historico/{alunoId} — Emitir Histórico
<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/99e324bb-59bd-4a72-98d1-bce166c60c2e" />
</p>

---

## 🗄️ Banco de Dados — matrícula_aluno (PostgreSQL)

<p align="center">
  <img width="100%" src="https://github.com/user-attachments/assets/9f9aa24c-596b-4743-9062-2edb1e956471" />
</p>






















