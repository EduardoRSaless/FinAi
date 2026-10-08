# 09 — IA + Tool Calling

```mermaid
sequenceDiagram
    actor U as Usuário
    participant FE as React
    participant API as AiController
    participant AI as Spring AI
    participant LLM as Modelo de IA
    participant TOOL as FinancialTools
    participant APP as Services
    participant DB as PostgreSQL

    U->>FE: "Quanto gastei com alimentação?"
    FE->>API: POST /api/v1/ai/chat
    API->>AI: Mensagem + contexto
    AI->>LLM: Pergunta
    LLM-->>AI: Solicita getExpensesByCategory()
    AI->>TOOL: Executa tool autorizada
    TOOL->>APP: Consulta dados
    APP->>DB: Consulta
    DB-->>APP: Dados
    APP-->>TOOL: Resultado
    TOOL-->>AI: Resultado
    AI->>LLM: Resultado + pergunta
    LLM-->>AI: Resposta
    AI-->>API: Resposta
    API-->>FE: JSON
    FE-->>U: Resposta financeira
```

### Tools iniciais

- `getCurrentBalance`
- `getTransactions`
- `getExpensesByCategory`
- `getFinancialGoals`
- `getCreditCardInvoice`
- `getCashFlow`

A IA não acessa PostgreSQL diretamente.
