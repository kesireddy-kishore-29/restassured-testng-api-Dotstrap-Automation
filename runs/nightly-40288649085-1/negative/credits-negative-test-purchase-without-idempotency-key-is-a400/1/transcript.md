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
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-1229fbdc-fa03-4ee4-a514-a2876b45de8c` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-c6c55b4f-f518-4958-89b0-38486c10fe04` |
| 3 | `POST /v1/credits/purchases` | 400 | 17 | `qa-d69e70dd-89b8-4309-8bd2-90d74adf3e11` |
| 4 | `GET /v1/credits/balance` | 200 | 25 | `qa-6814b7ff-1915-4934-811d-943551e6b123` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-4a9cb5e8-a758-436d-b104-db394a717e29` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-2fbdb3db-2e4d-4c22-980e-91bb4cff93d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1229fbdc-fa03-4ee4-a514-a2876b45de8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1229fbdc-fa03-4ee4-a514-a2876b45de8c
Content-Type: application/json

--- request body ---
{"handle":"qa-541447360a79","displayName":"QA 541447360a79","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1229fbdc-fa03-4ee4-a514-a2876b45de8c
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
Location: /v1/accounts/qa-541447360a79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_056b551c-26fc-48d3-8226-d5946b5ba437","handle":"qa-541447360a79","displayName":"QA 541447360a79","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.995288458Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c6c55b4f-f518-4958-89b0-38486c10fe04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c55b4f-f518-4958-89b0-38486c10fe04
Content-Type: application/json

--- request body ---
{"handle":"qa-541447360a79","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6c55b4f-f518-4958-89b0-38486c10fe04
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_056b551c-26fc-48d3-8226-d5946b5ba437"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d69e70dd-89b8-4309-8bd2-90d74adf3e11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d69e70dd-89b8-4309-8bd2-90d74adf3e11
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d69e70dd-89b8-4309-8bd2-90d74adf3e11
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-d69e70dd-89b8-4309-8bd2-90d74adf3e11"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-6814b7ff-1915-4934-811d-943551e6b123

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6814b7ff-1915-4934-811d-943551e6b123
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-6814b7ff-1915-4934-811d-943551e6b123
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

{"balance":5,"currency":"credits","accountId":"acc_056b551c-26fc-48d3-8226-d5946b5ba437"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a9cb5e8-a758-436d-b104-db394a717e29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a9cb5e8-a758-436d-b104-db394a717e29
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a9cb5e8-a758-436d-b104-db394a717e29
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
correlation: qa-2fbdb3db-2e4d-4c22-980e-91bb4cff93d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fbdb3db-2e4d-4c22-980e-91bb4cff93d5
Content-Type: application/json

--- request body ---
{"handle":"qa-541447360a79","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fbdb3db-2e4d-4c22-980e-91bb4cff93d5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2fbdb3db-2e4d-4c22-980e-91bb4cff93d5"}
```
