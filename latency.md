# Latency per endpoint (ms)

| Operation | Calls | p50 | p95 | Max |
|---|---|---|---|---|
| `DELETE /v1/accounts/me` | 152 | 17 | 45 | 93 |
| `GET /health` | 6 | 51 | 389 | 389 |
| `GET /openapi.yaml` | 1 | 15 | 15 | 15 |
| `GET /v1/accounts/me` | 179 | 9 | 45 | 388 |
| `GET /v1/accounts/{handle}` | 10 | 14 | 39 | 39 |
| `GET /v1/admin/stats` | 6 | 18 | 40 | 40 |
| `GET /v1/conversations` | 7 | 16 | 33 | 33 |
| `GET /v1/conversations/{id}` | 16 | 12 | 29 | 29 |
| `GET /v1/conversations/{id}/messages` | 14 | 13 | 25 | 25 |
| `GET /v1/credits/balance` | 16 | 10 | 56 | 56 |
| `GET /v1/credits/ledger` | 10 | 14 | 27 | 27 |
| `OPTIONS /v1/accounts/me` | 1 | 313 | 313 | 313 |
| `OPTIONS /v1/credits/purchases` | 1 | 315 | 315 | 315 |
| `PATCH /v1/accounts/me` | 8 | 25 | 42 | 42 |
| `POST /v1/accounts` | 163 | 37 | 414 | 482 |
| `POST /v1/auth/token` | 323 | 26 | 60 | 95 |
| `POST /v1/conversations` | 61 | 19 | 55 | 76 |
| `POST /v1/conversations/{id}/close` | 9 | 12 | 77 | 77 |
| `POST /v1/conversations/{id}/messages` | 28 | 20 | 46 | 52 |
| `POST /v1/conversations/{id}/read` | 9 | 14 | 23 | 23 |
| `POST /v1/credits/purchases` | 36 | 23 | 64 | 65 |
