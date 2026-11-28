# Latency per endpoint (ms)

| Operation | Calls | p50 | p95 | Max |
|---|---|---|---|---|
| `DELETE /v1/accounts/me` | 152 | 13 | 42 | 62 |
| `GET /health` | 6 | 62 | 463 | 463 |
| `GET /openapi.yaml` | 1 | 26 | 26 | 26 |
| `GET /v1/accounts/me` | 180 | 9 | 43 | 435 |
| `GET /v1/accounts/{handle}` | 10 | 18 | 56 | 56 |
| `GET /v1/admin/stats` | 6 | 8 | 23 | 23 |
| `GET /v1/conversations` | 7 | 19 | 44 | 44 |
| `GET /v1/conversations/{id}` | 16 | 17 | 37 | 37 |
| `GET /v1/conversations/{id}/messages` | 14 | 12 | 49 | 49 |
| `GET /v1/credits/balance` | 16 | 8 | 62 | 62 |
| `GET /v1/credits/ledger` | 10 | 15 | 44 | 44 |
| `OPTIONS /v1/accounts/me` | 1 | 456 | 456 | 456 |
| `OPTIONS /v1/credits/purchases` | 1 | 459 | 459 | 459 |
| `PATCH /v1/accounts/me` | 8 | 25 | 40 | 40 |
| `POST /v1/accounts` | 163 | 38 | 430 | 503 |
| `POST /v1/auth/token` | 323 | 24 | 57 | 99 |
| `POST /v1/conversations` | 61 | 19 | 49 | 77 |
| `POST /v1/conversations/{id}/close` | 9 | 8 | 54 | 54 |
| `POST /v1/conversations/{id}/messages` | 28 | 15 | 55 | 55 |
| `POST /v1/conversations/{id}/read` | 9 | 12 | 39 | 39 |
| `POST /v1/credits/purchases` | 36 | 30 | 58 | 61 |
