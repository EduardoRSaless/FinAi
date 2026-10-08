# 16 — Regras do projeto

## Controller fino

`Controller → Service`

## Service para regras de negócio

Exemplos:

- `TransactionService`
- `TransferService`
- `GoalService`

## Repository para banco

`Service → Repository → PostgreSQL`

## DTO separado de Entity

Não exponha Entity JPA diretamente como contrato público da API.

## Dinheiro

Use `BigDecimal`, nunca `double` ou `float`.

## IDs

Prefira `UUID`.

## Datas

Use `LocalDate`, `LocalDateTime` e `YearMonth`.

## IA

A IA usa tools autorizadas. Não acessa o banco diretamente.

Operações que alteram dinheiro precisam passar pelas regras normais da aplicação e exigir confirmação explícita.

## Segurança

```text
senha → hash → banco
```

Nunca:

```text
senha em texto puro → banco
```

## Testes

Toda regra financeira importante deve possuir testes.
