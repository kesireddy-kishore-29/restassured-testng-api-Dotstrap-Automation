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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-9ca63186-3929-4d13-ad9f-4e5d497d7ead` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-67e1a3a6-1f05-4aa3-be1f-60ca35ace050` |
| 3 | `POST /v1/credits/purchases` | 201 | 8 | `qa-0bc105ae-c3c2-4991-ab61-f542f31ecec1` |
| 4 | `POST /v1/credits/purchases` | 200 | 7 | `qa-f0528e1d-5faf-4062-9f09-8a9654eae526` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-5a879d0d-4bf3-450c-806c-59fa0b707f5a` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-95f3e159-d16c-4e4a-9730-54a9c1e1f1c6` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-c32a9f4b-bfbc-4611-8af7-755fc284dc9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ca63186-3929-4d13-ad9f-4e5d497d7ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ca63186-3929-4d13-ad9f-4e5d497d7ead
Content-Type: application/json

--- request body ---
{"handle":"qa-2021513f3f73","displayName":"QA 2021513f3f73","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ca63186-3929-4d13-ad9f-4e5d497d7ead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Location: /v1/accounts/qa-2021513f3f73
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa8c4130-b184-4f7b-83e6-2a792be360c1","handle":"qa-2021513f3f73","displayName":"QA 2021513f3f73","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.059922915Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-67e1a3a6-1f05-4aa3-be1f-60ca35ace050

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67e1a3a6-1f05-4aa3-be1f-60ca35ace050
Content-Type: application/json

--- request body ---
{"handle":"qa-2021513f3f73","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-67e1a3a6-1f05-4aa3-be1f-60ca35ace050
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa8c4130-b184-4f7b-83e6-2a792be360c1"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0bc105ae-c3c2-4991-ab61-f542f31ecec1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-77d4519211ab42f19628f3ca837bb67b
X-Correlation-Id: qa-0bc105ae-c3c2-4991-ab61-f542f31ecec1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bc105ae-c3c2-4991-ab61-f542f31ecec1
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
Location: /v1/credits/purchases/pur_38b05b19-edf1-42d7-9c42-d2e8e6e270f0
Content-Length: 144

{"id":"pur_38b05b19-edf1-42d7-9c42-d2e8e6e270f0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:44.098372709Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f0528e1d-5faf-4062-9f09-8a9654eae526

--- request headers ---
Accept: application/json
Idempotency-Key: qa-77d4519211ab42f19628f3ca837bb67b
X-Correlation-Id: qa-f0528e1d-5faf-4062-9f09-8a9654eae526
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0528e1d-5faf-4062-9f09-8a9654eae526
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
Location: /v1/credits/purchases/pur_38b05b19-edf1-42d7-9c42-d2e8e6e270f0
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_38b05b19-edf1-42d7-9c42-d2e8e6e270f0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:44.098372709Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-5a879d0d-4bf3-450c-806c-59fa0b707f5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a879d0d-4bf3-450c-806c-59fa0b707f5a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a879d0d-4bf3-450c-806c-59fa0b707f5a
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

{"balance":15,"currency":"credits","accountId":"acc_fa8c4130-b184-4f7b-83e6-2a792be360c1"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95f3e159-d16c-4e4a-9730-54a9c1e1f1c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95f3e159-d16c-4e4a-9730-54a9c1e1f1c6
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95f3e159-d16c-4e4a-9730-54a9c1e1f1c6
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
correlation: qa-c32a9f4b-bfbc-4611-8af7-755fc284dc9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c32a9f4b-bfbc-4611-8af7-755fc284dc9d
Content-Type: application/json

--- request body ---
{"handle":"qa-2021513f3f73","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c32a9f4b-bfbc-4611-8af7-755fc284dc9d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c32a9f4b-bfbc-4611-8af7-755fc284dc9d"}
```
