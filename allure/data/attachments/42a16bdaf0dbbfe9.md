# Transcript: Same key + same body replays the original purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 335 | `qa-728b2cab-1826-4d4c-bc32-8a1d4bcbb9dd` |
| 2 | `POST /v1/auth/token` | 200 | 51 | `qa-80b16540-e96f-4a43-872d-66a09bb9cdca` |
| 3 | `POST /v1/credits/purchases` | 201 | 53 | `qa-331d3063-8013-467a-a428-2f043001f351` |
| 4 | `POST /v1/credits/purchases` | 200 | 23 | `qa-17197bae-808b-47cf-badf-bc0ec6957a6b` |
| 5 | `GET /v1/credits/balance` | 200 | 36 | `qa-c821ea0d-1737-4e15-97da-7a43d5a45838` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-596ca22b-b8fb-45c6-89ee-fe96d19040d6` |
| 7 | `POST /v1/auth/token` | 401 | 12 | `qa-167d52da-2687-4a69-a1b7-22dcabcf09c4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-728b2cab-1826-4d4c-bc32-8a1d4bcbb9dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-728b2cab-1826-4d4c-bc32-8a1d4bcbb9dd
Content-Type: application/json

--- request body ---
{"handle":"qa-aa80d757953c","displayName":"QA aa80d757953c","password":"****","region":"eu"}

--- response: 201 in 335 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-728b2cab-1826-4d4c-bc32-8a1d4bcbb9dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-aa80d757953c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ca1fb55-ceac-46b7-8bc6-bdf814b1980f","handle":"qa-aa80d757953c","displayName":"QA aa80d757953c","region":"eu","role":"user","createdAt":"2026-11-28T10:37:12.202671957Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-80b16540-e96f-4a43-872d-66a09bb9cdca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b16540-e96f-4a43-872d-66a09bb9cdca
Content-Type: application/json

--- request body ---
{"handle":"qa-aa80d757953c","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-80b16540-e96f-4a43-872d-66a09bb9cdca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ca1fb55-ceac-46b7-8bc6-bdf814b1980f"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-331d3063-8013-467a-a428-2f043001f351

--- request headers ---
Accept: application/json
Idempotency-Key: qa-26ae274df6894cf89bce524fffa6f800
X-Correlation-Id: qa-331d3063-8013-467a-a428-2f043001f351
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-331d3063-8013-467a-a428-2f043001f351
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
Location: /v1/credits/purchases/pur_9f510451-f43e-4bf3-8a15-de4ae6badf9f
Content-Length: 144

{"id":"pur_9f510451-f43e-4bf3-8a15-de4ae6badf9f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.694568810Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-17197bae-808b-47cf-badf-bc0ec6957a6b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-26ae274df6894cf89bce524fffa6f800
X-Correlation-Id: qa-17197bae-808b-47cf-badf-bc0ec6957a6b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-17197bae-808b-47cf-badf-bc0ec6957a6b
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
Location: /v1/credits/purchases/pur_9f510451-f43e-4bf3-8a15-de4ae6badf9f
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_9f510451-f43e-4bf3-8a15-de4ae6badf9f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.694568810Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-c821ea0d-1737-4e15-97da-7a43d5a45838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c821ea0d-1737-4e15-97da-7a43d5a45838
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c821ea0d-1737-4e15-97da-7a43d5a45838
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
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_5ca1fb55-ceac-46b7-8bc6-bdf814b1980f"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-596ca22b-b8fb-45c6-89ee-fe96d19040d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-596ca22b-b8fb-45c6-89ee-fe96d19040d6
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-596ca22b-b8fb-45c6-89ee-fe96d19040d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-167d52da-2687-4a69-a1b7-22dcabcf09c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167d52da-2687-4a69-a1b7-22dcabcf09c4
Content-Type: application/json

--- request body ---
{"handle":"qa-aa80d757953c","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-167d52da-2687-4a69-a1b7-22dcabcf09c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-167d52da-2687-4a69-a1b7-22dcabcf09c4"}
```
