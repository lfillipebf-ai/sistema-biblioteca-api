# Sistema Biblioteca API

API REST para gerenciamento de biblioteca.

## Tecnologias
Java 17, Spring Boot, Spring Data JPA, PostgreSQL, Maven, Docker e REST API.

## Como executar
Pré-requisito: Docker Desktop.

    git clone https://github.com/lfillipebf-ai/sistema-biblioteca-api.git
    cd sistema-biblioteca-api
    docker compose up --build

API: http://localhost:8080

## Funcionalidades
- Cadastro de livros e autores
- Cadastro de leitores
- Empréstimos e devoluções
- Controle de disponibilidade
- Consultas de empréstimos ativos

## Endpoints principais
- GET/POST /api/autores
- GET/POST /api/livros
- GET/POST /api/leitores
- GET/POST /api/emprestimos
- PATCH /api/emprestimos/{id}/devolver
- GET /api/emprestimos/ativos

Autor: Luis Fillipe Backer Faria
GitHub: lfillipebf-ai
