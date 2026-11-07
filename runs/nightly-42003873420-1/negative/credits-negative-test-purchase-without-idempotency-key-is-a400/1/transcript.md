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
| 1 | `POST /v1/accounts` | 201 | 474 | `qa-9abda637-1a03-48d4-b3c6-63c56d59b356` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-70f4085d-b5dd-4570-83b5-b0223d240d66` |
| 3 | `POST /v1/credits/purchases` | 400 | 20 | `qa-8824e8da-23c9-4dd5-9767-67c620152524` |
| 4 | `GET /v1/credits/balance` | 200 | 16 | `qa-aefc9929-3f35-4a65-b360-0db07ea77141` |
| 5 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-87f86e0b-b42f-445e-b6ae-49d0b656fa82` |
| 6 | `POST /v1/auth/token` | 401 | 16 | `qa-7eddc0e5-08fe-4135-a59e-bbdd9fc34403` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9abda637-1a03-48d4-b3c6-63c56d59b356

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9abda637-1a03-48d4-b3c6-63c56d59b356
Content-Type: application/json

--- request body ---
{"handle":"qa-f7545d8a04fa","displayName":"QA f7545d8a04fa","password":"****","region":"eu"}

--- response: 201 in 474 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9abda637-1a03-48d4-b3c6-63c56d59b356
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
Location: /v1/accounts/qa-f7545d8a04fa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6013309-92d1-432b-8ffc-d14e7911bb85","handle":"qa-f7545d8a04fa","displayName":"QA f7545d8a04fa","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.557276439Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-70f4085d-b5dd-4570-83b5-b0223d240d66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70f4085d-b5dd-4570-83b5-b0223d240d66
Content-Type: application/json

--- request body ---
{"handle":"qa-f7545d8a04fa","password":"****"}

--- response: 200 in 81 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-70f4085d-b5dd-4570-83b5-b0223d240d66
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6013309-92d1-432b-8ffc-d14e7911bb85"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8824e8da-23c9-4dd5-9767-67c620152524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8824e8da-23c9-4dd5-9767-67c620152524
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8824e8da-23c9-4dd5-9767-67c620152524
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-8824e8da-23c9-4dd5-9767-67c620152524"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-aefc9929-3f35-4a65-b360-0db07ea77141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aefc9929-3f35-4a65-b360-0db07ea77141
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-aefc9929-3f35-4a65-b360-0db07ea77141
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

{"balance":5,"currency":"credits","accountId":"acc_e6013309-92d1-432b-8ffc-d14e7911bb85"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87f86e0b-b42f-445e-b6ae-49d0b656fa82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87f86e0b-b42f-445e-b6ae-49d0b656fa82
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87f86e0b-b42f-445e-b6ae-49d0b656fa82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7eddc0e5-08fe-4135-a59e-bbdd9fc34403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eddc0e5-08fe-4135-a59e-bbdd9fc34403
Content-Type: application/json

--- request body ---
{"handle":"qa-f7545d8a04fa","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7eddc0e5-08fe-4135-a59e-bbdd9fc34403
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7eddc0e5-08fe-4135-a59e-bbdd9fc34403"}
```
