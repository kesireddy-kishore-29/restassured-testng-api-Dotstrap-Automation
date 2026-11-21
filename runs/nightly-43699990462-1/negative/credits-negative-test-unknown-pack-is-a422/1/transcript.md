# Transcript: An unknown credit pack is a 422 on packId

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#unknownPackIsA422` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-ba0457d6-d783-4c6c-8415-ee3137973bce` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-94d6c02b-beec-459c-8aee-bebaef3fdf2e` |
| 3 | `POST /v1/credits/purchases` | 422 | 10 | `qa-31d3ee9e-6f0c-4b39-83aa-8f47749a6491` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-0275246d-a03e-4a05-9c72-9bbfedec59f0` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-f4f79aa9-c9a8-41b2-9fb1-3cd74174cdf4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ba0457d6-d783-4c6c-8415-ee3137973bce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba0457d6-d783-4c6c-8415-ee3137973bce
Content-Type: application/json

--- request body ---
{"handle":"qa-5cec47171935","displayName":"QA 5cec47171935","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba0457d6-d783-4c6c-8415-ee3137973bce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-5cec47171935
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4837ddc0-73f3-4fe4-8f66-9d71793a6fff","handle":"qa-5cec47171935","displayName":"QA 5cec47171935","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.972366282Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-94d6c02b-beec-459c-8aee-bebaef3fdf2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94d6c02b-beec-459c-8aee-bebaef3fdf2e
Content-Type: application/json

--- request body ---
{"handle":"qa-5cec47171935","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-94d6c02b-beec-459c-8aee-bebaef3fdf2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4837ddc0-73f3-4fe4-8f66-9d71793a6fff"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-31d3ee9e-6f0c-4b39-83aa-8f47749a6491

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e529ba0552f046b690167930d76de14e
X-Correlation-Id: qa-31d3ee9e-6f0c-4b39-83aa-8f47749a6491
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31d3ee9e-6f0c-4b39-83aa-8f47749a6491
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-31d3ee9e-6f0c-4b39-83aa-8f47749a6491","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0275246d-a03e-4a05-9c72-9bbfedec59f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0275246d-a03e-4a05-9c72-9bbfedec59f0
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0275246d-a03e-4a05-9c72-9bbfedec59f0
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f4f79aa9-c9a8-41b2-9fb1-3cd74174cdf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4f79aa9-c9a8-41b2-9fb1-3cd74174cdf4
Content-Type: application/json

--- request body ---
{"handle":"qa-5cec47171935","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4f79aa9-c9a8-41b2-9fb1-3cd74174cdf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4f79aa9-c9a8-41b2-9fb1-3cd74174cdf4"}
```
