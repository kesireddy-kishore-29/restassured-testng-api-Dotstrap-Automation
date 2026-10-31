# Transcript: A purchase without an Idempotency-Key is refused with 400

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#purchaseWithoutIdempotencyKeyIsA400` |
| Features | FEAT-IDEMP-03, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 341 | `qa-d89cce94-63db-42f4-b1fa-f3718a15ad4d` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-0e5662fc-d328-4a0d-b1b2-5b6bdeb286e7` |
| 3 | `POST /v1/credits/purchases` | 400 | 21 | `qa-e1a6db70-bd4d-44da-a7fb-055f4cb1bd11` |
| 4 | `GET /v1/credits/balance` | 200 | 21 | `qa-f415d1ba-7887-4ae3-bd8f-6603ad66d72f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-8d3118ba-6261-4158-a56c-9a051ac55413` |
| 6 | `POST /v1/auth/token` | 401 | 15 | `qa-c8679225-1ac7-4eed-bba5-ca202df48f5e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d89cce94-63db-42f4-b1fa-f3718a15ad4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d89cce94-63db-42f4-b1fa-f3718a15ad4d
Content-Type: application/json

--- request body ---
{"handle":"qa-f331d320124c","displayName":"QA f331d320124c","password":"****","region":"eu"}

--- response: 201 in 341 ms ---
Date: Thu, 29 Oct 2026 08:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-d89cce94-63db-42f4-b1fa-f3718a15ad4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-f331d320124c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d2efc4df-71ae-48dd-87b2-f6c4a8e12eb4","handle":"qa-f331d320124c","displayName":"QA f331d320124c","region":"eu","role":"user","createdAt":"2026-10-29T08:38:50.610042409Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0e5662fc-d328-4a0d-b1b2-5b6bdeb286e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e5662fc-d328-4a0d-b1b2-5b6bdeb286e7
Content-Type: application/json

--- request body ---
{"handle":"qa-f331d320124c","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e5662fc-d328-4a0d-b1b2-5b6bdeb286e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d2efc4df-71ae-48dd-87b2-f6c4a8e12eb4"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e1a6db70-bd4d-44da-a7fb-055f4cb1bd11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1a6db70-bd4d-44da-a7fb-055f4cb1bd11
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1a6db70-bd4d-44da-a7fb-055f4cb1bd11
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
Content-Length: 319

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-e1a6db70-bd4d-44da-a7fb-055f4cb1bd11"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-f415d1ba-7887-4ae3-bd8f-6603ad66d72f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f415d1ba-7887-4ae3-bd8f-6603ad66d72f
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f415d1ba-7887-4ae3-bd8f-6603ad66d72f
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
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_d2efc4df-71ae-48dd-87b2-f6c4a8e12eb4"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d3118ba-6261-4158-a56c-9a051ac55413

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d3118ba-6261-4158-a56c-9a051ac55413
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d3118ba-6261-4158-a56c-9a051ac55413
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
correlation: qa-c8679225-1ac7-4eed-bba5-ca202df48f5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8679225-1ac7-4eed-bba5-ca202df48f5e
Content-Type: application/json

--- request body ---
{"handle":"qa-f331d320124c","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8679225-1ac7-4eed-bba5-ca202df48f5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8679225-1ac7-4eed-bba5-ca202df48f5e"}
```
