# 15 — Como implementar uma funcionalidade

```mermaid
flowchart TD
    IDEA[Requisito] --> UC[Definir caso de uso]
    UC --> DOMAIN[Definir domínio]
    DOMAIN --> DB[Definir migration]
    DB --> ENTITY[Criar Entity]
    ENTITY --> REPO[Criar Repository]
    REPO --> SERVICE[Criar Service]
    SERVICE --> CONTROLLER[Criar Controller]
    CONTROLLER --> TEST[Testar]
    TEST --> DOC[Atualizar documentação]
    DOC --> COMMIT[Commit]
```

### Exemplo: transação

```text
1. Ler o diagrama
2. Criar Entity
3. Criar migration
4. Criar Repository
5. Criar Service
6. Criar DTO
7. Criar Controller
8. Criar testes
9. Testar API
10. Atualizar documentação
```
