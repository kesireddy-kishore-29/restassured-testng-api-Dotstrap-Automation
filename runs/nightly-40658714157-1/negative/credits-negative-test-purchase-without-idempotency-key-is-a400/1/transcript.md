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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-af602449-ce30-4851-bdf2-0a9fb83796d3` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-dbc9b576-9a41-406c-b48e-0c2ac8738e1d` |
| 3 | `POST /v1/credits/purchases` | 400 | 9 | `qa-c1c2a262-95e5-4014-87ec-358dedc27115` |
| 4 | `GET /v1/credits/balance` | 200 | 9 | `qa-91e241c9-8414-4f0b-b420-1e9f129d52ff` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0c9d7563-14fd-434d-8b42-16266932c4f5` |
| 6 | `POST /v1/auth/token` | 401 | 10 | `qa-6041aef8-5fa9-4986-9bf2-f5802fd6cfc7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-af602449-ce30-4851-bdf2-0a9fb83796d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af602449-ce30-4851-bdf2-0a9fb83796d3
Content-Type: application/json

--- request body ---
{"handle":"qa-7b95882ecbc0","displayName":"QA 7b95882ecbc0","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-af602449-ce30-4851-bdf2-0a9fb83796d3
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
Location: /v1/accounts/qa-7b95882ecbc0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2184c3b4-2e2a-4921-85bd-a6bfdc096945","handle":"qa-7b95882ecbc0","displayName":"QA 7b95882ecbc0","region":"eu","role":"user","createdAt":"2026-10-28T08:42:59.759298145Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dbc9b576-9a41-406c-b48e-0c2ac8738e1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbc9b576-9a41-406c-b48e-0c2ac8738e1d
Content-Type: application/json

--- request body ---
{"handle":"qa-7b95882ecbc0","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbc9b576-9a41-406c-b48e-0c2ac8738e1d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2184c3b4-2e2a-4921-85bd-a6bfdc096945"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c1c2a262-95e5-4014-87ec-358dedc27115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1c2a262-95e5-4014-87ec-358dedc27115
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1c2a262-95e5-4014-87ec-358dedc27115
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-c1c2a262-95e5-4014-87ec-358dedc27115"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-91e241c9-8414-4f0b-b420-1e9f129d52ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91e241c9-8414-4f0b-b420-1e9f129d52ff
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-91e241c9-8414-4f0b-b420-1e9f129d52ff
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

{"balance":5,"currency":"credits","accountId":"acc_2184c3b4-2e2a-4921-85bd-a6bfdc096945"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c9d7563-14fd-434d-8b42-16266932c4f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c9d7563-14fd-434d-8b42-16266932c4f5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c9d7563-14fd-434d-8b42-16266932c4f5
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
correlation: qa-6041aef8-5fa9-4986-9bf2-f5802fd6cfc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6041aef8-5fa9-4986-9bf2-f5802fd6cfc7
Content-Type: application/json

--- request body ---
{"handle":"qa-7b95882ecbc0","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6041aef8-5fa9-4986-9bf2-f5802fd6cfc7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6041aef8-5fa9-4986-9bf2-f5802fd6cfc7"}
```
