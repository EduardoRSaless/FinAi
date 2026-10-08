# 12 — Flyway

```mermaid
flowchart LR
    APP[Spring Boot] --> FLY[Flyway]
    FLY --> CHECK[Verifica migrations]
    CHECK --> M1["V1__create_users.sql"]
    M1 --> M2["V2__create_accounts.sql"]
    M2 --> M3["V3__create_categories.sql"]
    M3 --> M4["V4__create_transactions.sql"]
    M4 --> DB[(PostgreSQL)]
```

Exemplo:

```text
V1__create_users.sql
V2__create_accounts.sql
V3__create_categories.sql
V4__create_transactions.sql
V5__create_cards.sql
```

Depois de aplicada, uma migration não deve ser reescrita. Crie outra.
