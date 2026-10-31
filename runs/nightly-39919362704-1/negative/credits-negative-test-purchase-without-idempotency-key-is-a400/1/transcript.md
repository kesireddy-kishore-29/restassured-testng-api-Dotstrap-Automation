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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-5bcfb9e4-d52e-4666-a1e1-b4630b6232cb` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-f156082e-a132-4f37-9bb4-2be2ca78ebc2` |
| 3 | `POST /v1/credits/purchases` | 400 | 17 | `qa-9558545f-befa-4539-bfe6-a9eacbc97f81` |
| 4 | `GET /v1/credits/balance` | 200 | 23 | `qa-ce8f4621-7a53-4433-90b7-4f792aed8c6d` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c02a27de-8c15-4456-b515-3e4ea941a0d2` |
| 6 | `POST /v1/auth/token` | 401 | 9 | `qa-58574e02-26ce-452a-87ff-01224b2c2ffa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5bcfb9e4-d52e-4666-a1e1-b4630b6232cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bcfb9e4-d52e-4666-a1e1-b4630b6232cb
Content-Type: application/json

--- request body ---
{"handle":"qa-00e657f60cf8","displayName":"QA 00e657f60cf8","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bcfb9e4-d52e-4666-a1e1-b4630b6232cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Location: /v1/accounts/qa-00e657f60cf8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1540dc3e-db9c-496d-ab0d-b66fd1829bb7","handle":"qa-00e657f60cf8","displayName":"QA 00e657f60cf8","region":"eu","role":"user","createdAt":"2026-10-23T07:41:17.395966422Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f156082e-a132-4f37-9bb4-2be2ca78ebc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f156082e-a132-4f37-9bb4-2be2ca78ebc2
Content-Type: application/json

--- request body ---
{"handle":"qa-00e657f60cf8","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-f156082e-a132-4f37-9bb4-2be2ca78ebc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1540dc3e-db9c-496d-ab0d-b66fd1829bb7"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9558545f-befa-4539-bfe6-a9eacbc97f81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9558545f-befa-4539-bfe6-a9eacbc97f81
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9558545f-befa-4539-bfe6-a9eacbc97f81
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-9558545f-befa-4539-bfe6-a9eacbc97f81"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-ce8f4621-7a53-4433-90b7-4f792aed8c6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce8f4621-7a53-4433-90b7-4f792aed8c6d
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce8f4621-7a53-4433-90b7-4f792aed8c6d
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

{"balance":5,"currency":"credits","accountId":"acc_1540dc3e-db9c-496d-ab0d-b66fd1829bb7"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c02a27de-8c15-4456-b515-3e4ea941a0d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c02a27de-8c15-4456-b515-3e4ea941a0d2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c02a27de-8c15-4456-b515-3e4ea941a0d2
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
correlation: qa-58574e02-26ce-452a-87ff-01224b2c2ffa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58574e02-26ce-452a-87ff-01224b2c2ffa
Content-Type: application/json

--- request body ---
{"handle":"qa-00e657f60cf8","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58574e02-26ce-452a-87ff-01224b2c2ffa
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58574e02-26ce-452a-87ff-01224b2c2ffa"}
```
