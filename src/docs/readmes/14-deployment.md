# 14 — Deployment

```mermaid
flowchart TB
    USER[Usuário] --> FRONT[Frontend React]
    FRONT --> BACK[Backend Spring Boot]
    BACK --> DB[(PostgreSQL)]
    BACK --> AI[Spring AI]
    AI --> LLM[Provedor de IA]

    DEV[GitHub] --> CI[CI/CD]
    CI --> FRONT
    CI --> BACK
```

Local:

```text
React → Spring Boot → PostgreSQL
```

Produção:

```text
Internet → Frontend → Backend → PostgreSQL
                         ↓
                    Provedor de IA
```
