# Latency per endpoint (ms)

| Operation | Calls | p50 | p95 | Max |
|---|---|---|---|---|
| `DELETE /v1/accounts/me` | 152 | 11 | 29 | 108 |
| `GET /health` | 6 | 15 | 305 | 305 |
| `GET /openapi.yaml` | 1 | 25 | 25 | 25 |
| `GET /v1/accounts/me` | 181 | 7 | 29 | 310 |
| `GET /v1/accounts/{handle}` | 10 | 12 | 36 | 36 |
| `GET /v1/admin/stats` | 6 | 23 | 35 | 35 |
| `GET /v1/conversations` | 7 | 19 | 29 | 29 |
| `GET /v1/conversations/{id}` | 16 | 13 | 80 | 80 |
| `GET /v1/conversations/{id}/messages` | 14 | 11 | 58 | 58 |
| `GET /v1/credits/balance` | 16 | 12 | 42 | 42 |
| `GET /v1/credits/ledger` | 10 | 12 | 129 | 129 |
| `OPTIONS /v1/accounts/me` | 1 | 7 | 7 | 7 |
| `OPTIONS /v1/credits/purchases` | 1 | 18 | 18 | 18 |
| `PATCH /v1/accounts/me` | 8 | 10 | 69 | 69 |
| `POST /v1/accounts` | 163 | 28 | 399 | 454 |
| `POST /v1/auth/token` | 323 | 20 | 80 | 117 |
| `POST /v1/conversations` | 61 | 16 | 66 | 121 |
| `POST /v1/conversations/{id}/close` | 9 | 9 | 39 | 39 |
| `POST /v1/conversations/{id}/messages` | 28 | 11 | 26 | 45 |
| `POST /v1/conversations/{id}/read` | 9 | 12 | 23 | 23 |
| `POST /v1/credits/purchases` | 36 | 54 | 80 | 81 |
