# Contract coverage

| Operation | Documented | Exercised |
|---|---|---|
| `GET /health` | 200 | 200 |
| `GET /openapi.yaml` | 200 | 200 |
| `POST /v1/auth/token` | 200 400 401 415 422 429 503 | 200 400 401 415 422 429 503 |
| `POST /v1/accounts` | 201 400 409 415 422 429 503 | 201 400 409 415 422 429 503 |
| `GET /v1/accounts/me` | 200 401 429 503 | 200 401 429 503 |
| `PATCH /v1/accounts/me` | 200 400 401 415 422 429 503 | 200 400 401 415 422 429 503 |
| `DELETE /v1/accounts/me` | 204 401 429 503 | 204 401 429 503 |
| `GET /v1/accounts/{handle}` | 200 401 404 429 503 | 200 401 404 429 503 |
| `POST /v1/conversations` | 201 400 401 402 415 422 429 503 | 201 400 401 402 415 422 429 503 |
| `GET /v1/conversations` | 200 401 429 503 | 200 401 429 503 |
| `GET /v1/conversations/{id}` | 200 401 403 404 429 503 | 200 401 403 404 429 503 |
| `GET /v1/conversations/{id}/messages` | 200 401 403 404 429 503 | 200 401 403 404 429 503 |
| `POST /v1/conversations/{id}/messages` | 201 400 401 402 403 404 409 415 422 429 503 | 201 400 401 402 403 404 409 415 422 429 503 |
| `POST /v1/conversations/{id}/read` | 200 401 403 404 429 503 | 200 401 403 404 429 503 |
| `POST /v1/conversations/{id}/close` | 200 401 403 404 429 503 | 200 401 403 404 429 503 |
| `GET /v1/credits/balance` | 200 401 429 503 | 200 401 429 503 |
| `GET /v1/credits/ledger` | 200 401 429 503 | 200 401 429 503 |
| `POST /v1/credits/purchases` | 200 201 400 401 409 415 422 429 503 | 200 201 400 401 409 415 422 429 503 |
| `GET /v1/admin/stats` | 200 401 403 429 503 | 200 401 403 429 503 |

Operations called: 19/19 · response codes exercised: 105/105
