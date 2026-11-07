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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-f09d9371-12ad-4cd0-a1e2-4688c3f78f49` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-17292d3f-6ec2-48fe-8836-1ac823191a45` |
| 3 | `POST /v1/credits/purchases` | 400 | 22 | `qa-18eba89e-8dce-4446-9ea5-9b1bff396c71` |
| 4 | `GET /v1/credits/balance` | 200 | 8 | `qa-6a9302a1-88c1-4189-babe-0687aa8d17fc` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f998332c-69b7-4cf0-a323-e6987c8c4e0f` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-12da0c0a-d585-45b7-80ea-37a6b533f97c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f09d9371-12ad-4cd0-a1e2-4688c3f78f49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f09d9371-12ad-4cd0-a1e2-4688c3f78f49
Content-Type: application/json

--- request body ---
{"handle":"qa-4f400e821927","displayName":"QA 4f400e821927","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f09d9371-12ad-4cd0-a1e2-4688c3f78f49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-4f400e821927
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f093f105-c63a-4c56-ac8a-e6ed3e8ab41a","handle":"qa-4f400e821927","displayName":"QA 4f400e821927","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.044895053Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-17292d3f-6ec2-48fe-8836-1ac823191a45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17292d3f-6ec2-48fe-8836-1ac823191a45
Content-Type: application/json

--- request body ---
{"handle":"qa-4f400e821927","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-17292d3f-6ec2-48fe-8836-1ac823191a45
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f093f105-c63a-4c56-ac8a-e6ed3e8ab41a"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-18eba89e-8dce-4446-9ea5-9b1bff396c71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18eba89e-8dce-4446-9ea5-9b1bff396c71
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18eba89e-8dce-4446-9ea5-9b1bff396c71
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-18eba89e-8dce-4446-9ea5-9b1bff396c71"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-6a9302a1-88c1-4189-babe-0687aa8d17fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a9302a1-88c1-4189-babe-0687aa8d17fc
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a9302a1-88c1-4189-babe-0687aa8d17fc
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

{"balance":5,"currency":"credits","accountId":"acc_f093f105-c63a-4c56-ac8a-e6ed3e8ab41a"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f998332c-69b7-4cf0-a323-e6987c8c4e0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f998332c-69b7-4cf0-a323-e6987c8c4e0f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f998332c-69b7-4cf0-a323-e6987c8c4e0f
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
correlation: qa-12da0c0a-d585-45b7-80ea-37a6b533f97c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12da0c0a-d585-45b7-80ea-37a6b533f97c
Content-Type: application/json

--- request body ---
{"handle":"qa-4f400e821927","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12da0c0a-d585-45b7-80ea-37a6b533f97c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12da0c0a-d585-45b7-80ea-37a6b533f97c"}
```
