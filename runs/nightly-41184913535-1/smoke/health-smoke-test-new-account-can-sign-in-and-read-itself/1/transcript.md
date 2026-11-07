# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 408 | `qa-bb322408-e80d-4f8a-8a86-d0824218b1dd` |
| 2 | `POST /v1/auth/token` | 200 | 63 | `qa-2ff4b94d-ee80-4ac1-b55d-ebff7ebf5568` |
| 3 | `GET /v1/accounts/me` | 200 | 31 | `qa-9932b05d-d6f2-4f27-8630-c5f19e01ef3a` |
| 4 | `GET /v1/accounts/me` | 200 | 23 | `qa-82087a9f-07df-4586-a386-48df9fa5eb1e` |
| 5 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-42f63b93-ba6b-42a6-a384-3c0ed9a28492` |
| 6 | `POST /v1/auth/token` | 401 | 24 | `qa-784717b9-33ca-4144-b47f-4444e019ca8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb322408-e80d-4f8a-8a86-d0824218b1dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb322408-e80d-4f8a-8a86-d0824218b1dd
Content-Type: application/json

--- request body ---
{"handle":"qa-4da9cde8771c","displayName":"QA 4da9cde8771c","password":"****","region":"eu"}

--- response: 201 in 408 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb322408-e80d-4f8a-8a86-d0824218b1dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-4da9cde8771c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de73bf08-f790-441e-ad58-185da519c46f","handle":"qa-4da9cde8771c","displayName":"QA 4da9cde8771c","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.468950081Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2ff4b94d-ee80-4ac1-b55d-ebff7ebf5568

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ff4b94d-ee80-4ac1-b55d-ebff7ebf5568
Content-Type: application/json

--- request body ---
{"handle":"qa-4da9cde8771c","password":"****"}

--- response: 200 in 63 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ff4b94d-ee80-4ac1-b55d-ebff7ebf5568
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de73bf08-f790-441e-ad58-185da519c46f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-9932b05d-d6f2-4f27-8630-c5f19e01ef3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9932b05d-d6f2-4f27-8630-c5f19e01ef3a
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9932b05d-d6f2-4f27-8630-c5f19e01ef3a
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

{"id":"acc_de73bf08-f790-441e-ad58-185da519c46f","handle":"qa-4da9cde8771c","displayName":"QA 4da9cde8771c","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.468950081Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-82087a9f-07df-4586-a386-48df9fa5eb1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82087a9f-07df-4586-a386-48df9fa5eb1e
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-82087a9f-07df-4586-a386-48df9fa5eb1e
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
Content-Length: 181

{"id":"acc_de73bf08-f790-441e-ad58-185da519c46f","handle":"qa-4da9cde8771c","displayName":"QA 4da9cde8771c","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.468950081Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42f63b93-ba6b-42a6-a384-3c0ed9a28492

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42f63b93-ba6b-42a6-a384-3c0ed9a28492
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42f63b93-ba6b-42a6-a384-3c0ed9a28492
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-784717b9-33ca-4144-b47f-4444e019ca8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-784717b9-33ca-4144-b47f-4444e019ca8e
Content-Type: application/json

--- request body ---
{"handle":"qa-4da9cde8771c","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-784717b9-33ca-4144-b47f-4444e019ca8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-784717b9-33ca-4144-b47f-4444e019ca8e"}
```
