# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-df16cc61-b537-4134-9040-a6c9b6b5f3b0` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-494ff8fa-0f4d-48c4-9742-659e7ee892a7` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-6b8d7895-5556-4932-9570-ea08b12ea2c0` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-d5f31ab1-a440-48aa-b29c-c4591f6ea993` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-434bd024-bd14-4d09-a1aa-d9f67840cd3f` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-2f716439-cd99-43ac-8992-b32adad56470` |
| 7 | `POST /v1/auth/token` | 200 | 18 | `qa-8f90a9e6-a436-4751-bda0-d71c0ac30a50` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-05464ab9-4175-445d-bf92-636cc3539133` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-16778754-7088-47a3-9147-19759ba79eec` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e124b915-7fd0-40d0-8179-1bf15bedd284` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-33ee59ca-e813-414f-8d1d-a7bf0329e412` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-df16cc61-b537-4134-9040-a6c9b6b5f3b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df16cc61-b537-4134-9040-a6c9b6b5f3b0
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2066c15f11","displayName":"QA 6c2066c15f11","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-df16cc61-b537-4134-9040-a6c9b6b5f3b0
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
Location: /v1/accounts/qa-6c2066c15f11
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56e448b9-b889-4334-bdbd-84fd36041d97","handle":"qa-6c2066c15f11","displayName":"QA 6c2066c15f11","region":"eu","role":"user","createdAt":"2026-11-23T10:54:55.007156736Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-494ff8fa-0f4d-48c4-9742-659e7ee892a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-494ff8fa-0f4d-48c4-9742-659e7ee892a7
Content-Type: application/json

--- request body ---
{"handle":"qa-310989003572","displayName":"QA 310989003572","password":"****","region":"us"}

--- response: 201 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-494ff8fa-0f4d-48c4-9742-659e7ee892a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-310989003572
X-Served-Region: us
Content-Length: 181

{"id":"acc_ddfa98af-a9e2-4022-9efd-101a3fe2a5ad","handle":"qa-310989003572","displayName":"QA 310989003572","region":"us","role":"user","createdAt":"2026-11-23T10:54:55.037319342Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6b8d7895-5556-4932-9570-ea08b12ea2c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b8d7895-5556-4932-9570-ea08b12ea2c0
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2066c15f11","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b8d7895-5556-4932-9570-ea08b12ea2c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56e448b9-b889-4334-bdbd-84fd36041d97"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d5f31ab1-a440-48aa-b29c-c4591f6ea993

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5f31ab1-a440-48aa-b29c-c4591f6ea993
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2066c15f11","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5f31ab1-a440-48aa-b29c-c4591f6ea993
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56e448b9-b889-4334-bdbd-84fd36041d97"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-434bd024-bd14-4d09-a1aa-d9f67840cd3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-434bd024-bd14-4d09-a1aa-d9f67840cd3f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-434bd024-bd14-4d09-a1aa-d9f67840cd3f
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
Content-Length: 181

{"id":"acc_56e448b9-b889-4334-bdbd-84fd36041d97","handle":"qa-6c2066c15f11","displayName":"QA 6c2066c15f11","region":"eu","role":"user","createdAt":"2026-11-23T10:54:55.007156736Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-310989003572
correlation: qa-2f716439-cd99-43ac-8992-b32adad56470

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f716439-cd99-43ac-8992-b32adad56470
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f716439-cd99-43ac-8992-b32adad56470
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
Content-Length: 74

{"handle":"qa-310989003572","displayName":"QA 310989003572","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-8f90a9e6-a436-4751-bda0-d71c0ac30a50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f90a9e6-a436-4751-bda0-d71c0ac30a50
Content-Type: application/json

--- request body ---
{"handle":"qa-310989003572","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f90a9e6-a436-4751-bda0-d71c0ac30a50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ddfa98af-a9e2-4022-9efd-101a3fe2a5ad"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05464ab9-4175-445d-bf92-636cc3539133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05464ab9-4175-445d-bf92-636cc3539133
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05464ab9-4175-445d-bf92-636cc3539133
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-16778754-7088-47a3-9147-19759ba79eec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16778754-7088-47a3-9147-19759ba79eec
Content-Type: application/json

--- request body ---
{"handle":"qa-310989003572","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16778754-7088-47a3-9147-19759ba79eec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-16778754-7088-47a3-9147-19759ba79eec"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e124b915-7fd0-40d0-8179-1bf15bedd284

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e124b915-7fd0-40d0-8179-1bf15bedd284
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e124b915-7fd0-40d0-8179-1bf15bedd284
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-33ee59ca-e813-414f-8d1d-a7bf0329e412

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33ee59ca-e813-414f-8d1d-a7bf0329e412
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2066c15f11","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33ee59ca-e813-414f-8d1d-a7bf0329e412
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-33ee59ca-e813-414f-8d1d-a7bf0329e412"}
```
