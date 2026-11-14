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
| 1 | `POST /v1/accounts` | 201 | 562 | `qa-ce379b08-26cf-4cc4-835a-f35b03041a4a` |
| 2 | `POST /v1/auth/token` | 200 | 56 | `qa-67248512-3256-4bcc-a7ff-ff712d9adc3f` |
| 3 | `POST /v1/credits/purchases` | 201 | 76 | `qa-15acc5ee-bfa8-4127-916e-24cf6297b4ff` |
| 4 | `POST /v1/credits/purchases` | 200 | 26 | `qa-b2837be4-4419-4a21-a863-02ac5c7f04b1` |
| 5 | `GET /v1/credits/balance` | 200 | 44 | `qa-7b953f8d-6eb1-4076-a53a-5b29cb7f59f7` |
| 6 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-5990d1e6-f2cd-42e2-9d0a-a1c935d46020` |
| 7 | `POST /v1/auth/token` | 401 | 13 | `qa-26ccc5ac-1d48-4697-b161-a254974edc98` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ce379b08-26cf-4cc4-835a-f35b03041a4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce379b08-26cf-4cc4-835a-f35b03041a4a
Content-Type: application/json

--- request body ---
{"handle":"qa-beb21063ea07","displayName":"QA beb21063ea07","password":"****","region":"eu"}

--- response: 201 in 562 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce379b08-26cf-4cc4-835a-f35b03041a4a
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
Location: /v1/accounts/qa-beb21063ea07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5062f0a7-0912-4312-9240-6d51c1fa671e","handle":"qa-beb21063ea07","displayName":"QA beb21063ea07","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.385761174Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-67248512-3256-4bcc-a7ff-ff712d9adc3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67248512-3256-4bcc-a7ff-ff712d9adc3f
Content-Type: application/json

--- request body ---
{"handle":"qa-beb21063ea07","password":"****"}

--- response: 200 in 56 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-67248512-3256-4bcc-a7ff-ff712d9adc3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5062f0a7-0912-4312-9240-6d51c1fa671e"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-15acc5ee-bfa8-4127-916e-24cf6297b4ff

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6ab28b4bf1af414e8bfaab59da69e7a0
X-Correlation-Id: qa-15acc5ee-bfa8-4127-916e-24cf6297b4ff
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 76 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-15acc5ee-bfa8-4127-916e-24cf6297b4ff
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
Location: /v1/credits/purchases/pur_93358b0a-2e3d-44da-8551-24bfd1b22d80
Content-Length: 144

{"id":"pur_93358b0a-2e3d-44da-8551-24bfd1b22d80","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.079261383Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b2837be4-4419-4a21-a863-02ac5c7f04b1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6ab28b4bf1af414e8bfaab59da69e7a0
X-Correlation-Id: qa-b2837be4-4419-4a21-a863-02ac5c7f04b1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 26 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2837be4-4419-4a21-a863-02ac5c7f04b1
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
Location: /v1/credits/purchases/pur_93358b0a-2e3d-44da-8551-24bfd1b22d80
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_93358b0a-2e3d-44da-8551-24bfd1b22d80","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.079261383Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-7b953f8d-6eb1-4076-a53a-5b29cb7f59f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b953f8d-6eb1-4076-a53a-5b29cb7f59f7
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b953f8d-6eb1-4076-a53a-5b29cb7f59f7
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

{"balance":15,"currency":"credits","accountId":"acc_5062f0a7-0912-4312-9240-6d51c1fa671e"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5990d1e6-f2cd-42e2-9d0a-a1c935d46020

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5990d1e6-f2cd-42e2-9d0a-a1c935d46020
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5990d1e6-f2cd-42e2-9d0a-a1c935d46020
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
correlation: qa-26ccc5ac-1d48-4697-b161-a254974edc98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26ccc5ac-1d48-4697-b161-a254974edc98
Content-Type: application/json

--- request body ---
{"handle":"qa-beb21063ea07","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26ccc5ac-1d48-4697-b161-a254974edc98
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-26ccc5ac-1d48-4697-b161-a254974edc98"}
```
