# Transcript: Same key + same body replays the original purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 292 | `qa-5a2ed181-0516-434d-9af7-5202709c4977` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-fc5e0334-2d27-42c7-87e7-be9a014dd45c` |
| 3 | `POST /v1/credits/purchases` | 201 | 35 | `qa-3d056281-fdb5-4800-bf4e-3053ccaf555e` |
| 4 | `POST /v1/credits/purchases` | 200 | 19 | `qa-dd235612-5c17-4e26-927f-d7a7763061ed` |
| 5 | `GET /v1/credits/balance` | 200 | 21 | `qa-7599a321-c519-4914-b95a-c190014f5449` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-78ea1403-293a-4110-a9c6-5aea82d83b5f` |
| 7 | `POST /v1/auth/token` | 401 | 4 | `qa-417b6bf2-f229-49d8-aa58-563ce6fa82dd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5a2ed181-0516-434d-9af7-5202709c4977

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a2ed181-0516-434d-9af7-5202709c4977
Content-Type: application/json

--- request body ---
{"handle":"qa-04ca4230f6f7","displayName":"QA 04ca4230f6f7","password":"****","region":"eu"}

--- response: 201 in 292 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a2ed181-0516-434d-9af7-5202709c4977
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-04ca4230f6f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac6c7dbc-56b7-48b4-8989-ad5c8a551207","handle":"qa-04ca4230f6f7","displayName":"QA 04ca4230f6f7","region":"eu","role":"user","createdAt":"2026-11-18T10:19:37.679319383Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fc5e0334-2d27-42c7-87e7-be9a014dd45c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc5e0334-2d27-42c7-87e7-be9a014dd45c
Content-Type: application/json

--- request body ---
{"handle":"qa-04ca4230f6f7","password":"****"}

--- response: 200 in 48 ms ---
Date: Wed, 18 Nov 2026 10:19:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc5e0334-2d27-42c7-87e7-be9a014dd45c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac6c7dbc-56b7-48b4-8989-ad5c8a551207"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3d056281-fdb5-4800-bf4e-3053ccaf555e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-76758ba31f2e439799b737ec91ba573e
X-Correlation-Id: qa-3d056281-fdb5-4800-bf4e-3053ccaf555e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d056281-fdb5-4800-bf4e-3053ccaf555e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_3af864a1-d965-49fc-8d01-d9c47928c91d
Content-Length: 144

{"id":"pur_3af864a1-d965-49fc-8d01-d9c47928c91d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.062104956Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dd235612-5c17-4e26-927f-d7a7763061ed

--- request headers ---
Accept: application/json
Idempotency-Key: qa-76758ba31f2e439799b737ec91ba573e
X-Correlation-Id: qa-dd235612-5c17-4e26-927f-d7a7763061ed
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd235612-5c17-4e26-927f-d7a7763061ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_3af864a1-d965-49fc-8d01-d9c47928c91d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3af864a1-d965-49fc-8d01-d9c47928c91d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:38.062104956Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-7599a321-c519-4914-b95a-c190014f5449

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7599a321-c519-4914-b95a-c190014f5449
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-7599a321-c519-4914-b95a-c190014f5449
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_ac6c7dbc-56b7-48b4-8989-ad5c8a551207"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78ea1403-293a-4110-a9c6-5aea82d83b5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78ea1403-293a-4110-a9c6-5aea82d83b5f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78ea1403-293a-4110-a9c6-5aea82d83b5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-417b6bf2-f229-49d8-aa58-563ce6fa82dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-417b6bf2-f229-49d8-aa58-563ce6fa82dd
Content-Type: application/json

--- request body ---
{"handle":"qa-04ca4230f6f7","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-417b6bf2-f229-49d8-aa58-563ce6fa82dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-417b6bf2-f229-49d8-aa58-563ce6fa82dd"}
```
