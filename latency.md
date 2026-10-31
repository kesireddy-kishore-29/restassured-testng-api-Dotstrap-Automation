# Latency per endpoint (ms)

| Operation | Calls | p50 | p95 | Max |
|---|---|---|---|---|
| `DELETE /v1/accounts/me` | 152 | 15 | 36 | 531 |
| `GET /health` | 6 | 11 | 410 | 410 |
| `GET /openapi.yaml` | 1 | 15 | 15 | 15 |
| `GET /v1/accounts/me` | 179 | 9 | 47 | 536 |
| `GET /v1/accounts/{handle}` | 10 | 15 | 541 | 541 |
| `GET /v1/admin/stats` | 6 | 13 | 46 | 46 |
| `GET /v1/conversations` | 7 | 18 | 38 | 38 |
| `GET /v1/conversations/{id}` | 16 | 9 | 30 | 30 |
| `GET /v1/conversations/{id}/messages` | 14 | 11 | 27 | 27 |
| `GET /v1/credits/balance` | 16 | 6 | 29 | 29 |
| `GET /v1/credits/ledger` | 10 | 12 | 48 | 48 |
| `OPTIONS /v1/accounts/me` | 1 | 32 | 32 | 32 |
| `OPTIONS /v1/credits/purchases` | 1 | 9 | 9 | 9 |
| `PATCH /v1/accounts/me` | 8 | 23 | 544 | 544 |
| `POST /v1/accounts` | 163 | 38 | 659 | 705 |
| `POST /v1/auth/token` | 323 | 25 | 68 | 109 |
| `POST /v1/conversations` | 61 | 23 | 108 | 126 |
| `POST /v1/conversations/{id}/close` | 9 | 7 | 50 | 50 |
| `POST /v1/conversations/{id}/messages` | 28 | 14 | 37 | 49 |
| `POST /v1/conversations/{id}/read` | 9 | 9 | 48 | 48 |
| `POST /v1/credits/purchases` | 36 | 33 | 85 | 96 |
