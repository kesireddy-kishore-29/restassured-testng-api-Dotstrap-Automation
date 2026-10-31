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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-1cf0afc6-da9c-4b06-ab27-a29177b09567` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-2e483a62-6eff-46e5-bd2a-cb40af2c5c55` |
| 3 | `POST /v1/credits/purchases` | 400 | 22 | `qa-699e895d-a120-4bb3-b29b-1b07c0af2ca3` |
| 4 | `GET /v1/credits/balance` | 200 | 14 | `qa-a75b636d-08bf-4c5e-9911-139f570a0e5f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-5daa999e-566b-4344-841f-3af797347b9d` |
| 6 | `POST /v1/auth/token` | 401 | 21 | `qa-5536c88a-89d1-40d3-97f1-f6dc470390fa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1cf0afc6-da9c-4b06-ab27-a29177b09567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf0afc6-da9c-4b06-ab27-a29177b09567
Content-Type: application/json

--- request body ---
{"handle":"qa-5d0d5e7ac2ac","displayName":"QA 5d0d5e7ac2ac","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cf0afc6-da9c-4b06-ab27-a29177b09567
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-5d0d5e7ac2ac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7af2d5ac-439b-4cbd-b23f-ea26415da5de","handle":"qa-5d0d5e7ac2ac","displayName":"QA 5d0d5e7ac2ac","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.950170887Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2e483a62-6eff-46e5-bd2a-cb40af2c5c55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e483a62-6eff-46e5-bd2a-cb40af2c5c55
Content-Type: application/json

--- request body ---
{"handle":"qa-5d0d5e7ac2ac","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e483a62-6eff-46e5-bd2a-cb40af2c5c55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7af2d5ac-439b-4cbd-b23f-ea26415da5de"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-699e895d-a120-4bb3-b29b-1b07c0af2ca3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-699e895d-a120-4bb3-b29b-1b07c0af2ca3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-699e895d-a120-4bb3-b29b-1b07c0af2ca3
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-699e895d-a120-4bb3-b29b-1b07c0af2ca3"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-a75b636d-08bf-4c5e-9911-139f570a0e5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a75b636d-08bf-4c5e-9911-139f570a0e5f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a75b636d-08bf-4c5e-9911-139f570a0e5f
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

{"balance":5,"currency":"credits","accountId":"acc_7af2d5ac-439b-4cbd-b23f-ea26415da5de"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5daa999e-566b-4344-841f-3af797347b9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5daa999e-566b-4344-841f-3af797347b9d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5daa999e-566b-4344-841f-3af797347b9d
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
correlation: qa-5536c88a-89d1-40d3-97f1-f6dc470390fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5536c88a-89d1-40d3-97f1-f6dc470390fa
Content-Type: application/json

--- request body ---
{"handle":"qa-5d0d5e7ac2ac","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5536c88a-89d1-40d3-97f1-f6dc470390fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5536c88a-89d1-40d3-97f1-f6dc470390fa"}
```
