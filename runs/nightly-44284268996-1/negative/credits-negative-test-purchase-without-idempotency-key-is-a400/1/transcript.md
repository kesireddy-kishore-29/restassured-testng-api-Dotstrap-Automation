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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-21eaad9d-0897-4d10-98d9-738abad6e48b` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-afc0a6f5-5215-4eaf-b8a8-a9d2381dacda` |
| 3 | `POST /v1/credits/purchases` | 400 | 12 | `qa-8041b66a-0232-49c9-9b17-05b12752787a` |
| 4 | `GET /v1/credits/balance` | 200 | 18 | `qa-b879ee21-306d-4ce3-a2ff-ddd65da04cb1` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-22c5a4b1-b90a-42f0-99af-0e7c6dd70563` |
| 6 | `POST /v1/auth/token` | 401 | 9 | `qa-ef4ae37c-9055-4c17-bb97-96b0df92a9a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-21eaad9d-0897-4d10-98d9-738abad6e48b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21eaad9d-0897-4d10-98d9-738abad6e48b
Content-Type: application/json

--- request body ---
{"handle":"qa-128dec30df59","displayName":"QA 128dec30df59","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-21eaad9d-0897-4d10-98d9-738abad6e48b
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
Location: /v1/accounts/qa-128dec30df59
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3eb5721-45b4-4fb3-b339-bb60e92ba437","handle":"qa-128dec30df59","displayName":"QA 128dec30df59","region":"eu","role":"user","createdAt":"2026-11-18T10:20:00.121690976Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-afc0a6f5-5215-4eaf-b8a8-a9d2381dacda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afc0a6f5-5215-4eaf-b8a8-a9d2381dacda
Content-Type: application/json

--- request body ---
{"handle":"qa-128dec30df59","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-afc0a6f5-5215-4eaf-b8a8-a9d2381dacda
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3eb5721-45b4-4fb3-b339-bb60e92ba437"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8041b66a-0232-49c9-9b17-05b12752787a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8041b66a-0232-49c9-9b17-05b12752787a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 12 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8041b66a-0232-49c9-9b17-05b12752787a
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-8041b66a-0232-49c9-9b17-05b12752787a"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-b879ee21-306d-4ce3-a2ff-ddd65da04cb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b879ee21-306d-4ce3-a2ff-ddd65da04cb1
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b879ee21-306d-4ce3-a2ff-ddd65da04cb1
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

{"balance":5,"currency":"credits","accountId":"acc_a3eb5721-45b4-4fb3-b339-bb60e92ba437"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22c5a4b1-b90a-42f0-99af-0e7c6dd70563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22c5a4b1-b90a-42f0-99af-0e7c6dd70563
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22c5a4b1-b90a-42f0-99af-0e7c6dd70563
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
correlation: qa-ef4ae37c-9055-4c17-bb97-96b0df92a9a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef4ae37c-9055-4c17-bb97-96b0df92a9a3
Content-Type: application/json

--- request body ---
{"handle":"qa-128dec30df59","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef4ae37c-9055-4c17-bb97-96b0df92a9a3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef4ae37c-9055-4c17-bb97-96b0df92a9a3"}
```
