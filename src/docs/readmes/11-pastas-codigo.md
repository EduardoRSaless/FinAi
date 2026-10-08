# 11 — Estrutura de pastas

```mermaid
flowchart TD
    ROOT["br/com/finai"]
    ROOT --> API["api"]
    ROOT --> APP["application"]
    ROOT --> DOMAIN["domain"]
    ROOT --> INFRA["infrastructure"]

    API --> CTRL["controller"]
    API --> DTO["dto"]
    APP --> SERVICE["service"]
    APP --> UC["usecase"]
    DOMAIN --> ENTITY["entity"]
    DOMAIN --> ENUM["enums"]
    DOMAIN --> RULE["rules"]
    INFRA --> REPO["repository"]
    INFRA --> SEC["security"]
    INFRA --> AI["ai"]
    INFRA --> CONFIG["config"]
```

### Estrutura

```text
src/main/java/br/com/finai/
├── api/
│   ├── controller/
│   └── dto/
├── application/
│   ├── service/
│   └── usecase/
├── domain/
│   ├── entity/
│   ├── enums/
│   └── rules/
└── infrastructure/
    ├── repository/
    ├── security/
    ├── ai/
    └── config/
```
