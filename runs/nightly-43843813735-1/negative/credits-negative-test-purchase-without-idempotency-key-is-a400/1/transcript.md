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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-1e864158-5e53-4556-b36d-9c329eba78e9` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-039f52d9-b865-499d-8554-6c1a8e8b9304` |
| 3 | `POST /v1/credits/purchases` | 400 | 30 | `qa-54d1b39d-b146-49e7-970f-ce701888f63e` |
| 4 | `GET /v1/credits/balance` | 200 | 7 | `qa-af66cd95-aa04-466f-a751-a24b566a5524` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f9730735-7827-4ade-ae43-621270f28b75` |
| 6 | `POST /v1/auth/token` | 401 | 15 | `qa-fa252aba-6aef-40e0-b231-64bf7ceebf2d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1e864158-5e53-4556-b36d-9c329eba78e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e864158-5e53-4556-b36d-9c329eba78e9
Content-Type: application/json

--- request body ---
{"handle":"qa-e370b2c28400","displayName":"QA e370b2c28400","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e864158-5e53-4556-b36d-9c329eba78e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-e370b2c28400
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27340f2b-e2bc-4966-b9fa-1fc53aabc5f8","handle":"qa-e370b2c28400","displayName":"QA e370b2c28400","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.974131021Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-039f52d9-b865-499d-8554-6c1a8e8b9304

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-039f52d9-b865-499d-8554-6c1a8e8b9304
Content-Type: application/json

--- request body ---
{"handle":"qa-e370b2c28400","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-039f52d9-b865-499d-8554-6c1a8e8b9304
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27340f2b-e2bc-4966-b9fa-1fc53aabc5f8"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-54d1b39d-b146-49e7-970f-ce701888f63e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54d1b39d-b146-49e7-970f-ce701888f63e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54d1b39d-b146-49e7-970f-ce701888f63e
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-54d1b39d-b146-49e7-970f-ce701888f63e"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-af66cd95-aa04-466f-a751-a24b566a5524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af66cd95-aa04-466f-a751-a24b566a5524
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-af66cd95-aa04-466f-a751-a24b566a5524
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

{"balance":5,"currency":"credits","accountId":"acc_27340f2b-e2bc-4966-b9fa-1fc53aabc5f8"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9730735-7827-4ade-ae43-621270f28b75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9730735-7827-4ade-ae43-621270f28b75
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9730735-7827-4ade-ae43-621270f28b75
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
correlation: qa-fa252aba-6aef-40e0-b231-64bf7ceebf2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa252aba-6aef-40e0-b231-64bf7ceebf2d
Content-Type: application/json

--- request body ---
{"handle":"qa-e370b2c28400","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa252aba-6aef-40e0-b231-64bf7ceebf2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa252aba-6aef-40e0-b231-64bf7ceebf2d"}
```
