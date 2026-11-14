# Latency per endpoint (ms)

| Operation | Calls | p50 | p95 | Max |
|---|---|---|---|---|
| `DELETE /v1/accounts/me` | 152 | 13 | 35 | 57 |
| `GET /health` | 6 | 12 | 422 | 422 |
| `GET /openapi.yaml` | 1 | 18 | 18 | 18 |
| `GET /v1/accounts/me` | 180 | 10 | 30 | 421 |
| `GET /v1/accounts/{handle}` | 10 | 19 | 28 | 28 |
| `GET /v1/admin/stats` | 6 | 14 | 42 | 42 |
| `GET /v1/conversations` | 7 | 12 | 32 | 32 |
| `GET /v1/conversations/{id}` | 16 | 11 | 78 | 78 |
| `GET /v1/conversations/{id}/messages` | 14 | 12 | 24 | 24 |
| `GET /v1/credits/balance` | 16 | 12 | 53 | 53 |
| `GET /v1/credits/ledger` | 10 | 13 | 49 | 49 |
| `OPTIONS /v1/accounts/me` | 1 | 17 | 17 | 17 |
| `OPTIONS /v1/credits/purchases` | 1 | 19 | 19 | 19 |
| `PATCH /v1/accounts/me` | 8 | 24 | 42 | 42 |
| `POST /v1/accounts` | 163 | 32 | 481 | 539 |
| `POST /v1/auth/token` | 323 | 21 | 59 | 94 |
| `POST /v1/conversations` | 61 | 18 | 47 | 60 |
| `POST /v1/conversations/{id}/close` | 9 | 13 | 49 | 49 |
| `POST /v1/conversations/{id}/messages` | 28 | 16 | 35 | 51 |
| `POST /v1/conversations/{id}/read` | 9 | 13 | 27 | 27 |
| `POST /v1/credits/purchases` | 36 | 21 | 69 | 72 |
