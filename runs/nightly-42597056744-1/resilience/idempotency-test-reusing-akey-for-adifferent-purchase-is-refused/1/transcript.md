# Transcript: Same key + different body is a 409 and charges nothing

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#reusingAKeyForADifferentPurchaseIsRefused` |
| Features | FEAT-IDEMP-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 559 | `qa-aca02025-4ad2-4630-8d5d-4bf3568b1a5a` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-96fb1219-d70b-4ad7-85a5-469624012f15` |
| 3 | `POST /v1/credits/purchases` | 201 | 83 | `qa-ff046b2d-3c1b-4a8c-8c6c-775fb2ca4098` |
| 4 | `POST /v1/credits/purchases` | 409 | 55 | `qa-fbc61399-1b6d-4728-9d2f-ef6f7f220acb` |
| 5 | `GET /v1/credits/balance` | 200 | 22 | `qa-c314b1ab-60ab-4290-9955-fb8678a26e6e` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9c2f1ef9-6587-4bcb-88bb-87cca6f20b3a` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-e916ad36-f2a2-4573-9d9b-befd77ba9f9b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aca02025-4ad2-4630-8d5d-4bf3568b1a5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aca02025-4ad2-4630-8d5d-4bf3568b1a5a
Content-Type: application/json

--- request body ---
{"handle":"qa-b73b125209eb","displayName":"QA b73b125209eb","password":"****","region":"eu"}

--- response: 201 in 559 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-aca02025-4ad2-4630-8d5d-4bf3568b1a5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-b73b125209eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04586d27-1f6e-4aee-b178-6ed6621526bf","handle":"qa-b73b125209eb","displayName":"QA b73b125209eb","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.415269700Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-96fb1219-d70b-4ad7-85a5-469624012f15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96fb1219-d70b-4ad7-85a5-469624012f15
Content-Type: application/json

--- request body ---
{"handle":"qa-b73b125209eb","password":"****"}

--- response: 200 in 54 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-96fb1219-d70b-4ad7-85a5-469624012f15
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04586d27-1f6e-4aee-b178-6ed6621526bf"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ff046b2d-3c1b-4a8c-8c6c-775fb2ca4098

--- request headers ---
Accept: application/json
Idempotency-Key: qa-669b05ffe26a47569607ca776194449a
X-Correlation-Id: qa-ff046b2d-3c1b-4a8c-8c6c-775fb2ca4098
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 83 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff046b2d-3c1b-4a8c-8c6c-775fb2ca4098
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
Location: /v1/credits/purchases/pur_8f213d15-3983-462e-824f-565bc916df22
Content-Length: 144

{"id":"pur_8f213d15-3983-462e-824f-565bc916df22","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.079687987Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fbc61399-1b6d-4728-9d2f-ef6f7f220acb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-669b05ffe26a47569607ca776194449a
X-Correlation-Id: qa-fbc61399-1b6d-4728-9d2f-ef6f7f220acb
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 55 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbc61399-1b6d-4728-9d2f-ef6f7f220acb
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
Content-Length: 334

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-fbc61399-1b6d-4728-9d2f-ef6f7f220acb"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-c314b1ab-60ab-4290-9955-fb8678a26e6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c314b1ab-60ab-4290-9955-fb8678a26e6e
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c314b1ab-60ab-4290-9955-fb8678a26e6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_04586d27-1f6e-4aee-b178-6ed6621526bf"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9c2f1ef9-6587-4bcb-88bb-87cca6f20b3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c2f1ef9-6587-4bcb-88bb-87cca6f20b3a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9c2f1ef9-6587-4bcb-88bb-87cca6f20b3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 9
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e916ad36-f2a2-4573-9d9b-befd77ba9f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e916ad36-f2a2-4573-9d9b-befd77ba9f9b
Content-Type: application/json

--- request body ---
{"handle":"qa-b73b125209eb","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e916ad36-f2a2-4573-9d9b-befd77ba9f9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e916ad36-f2a2-4573-9d9b-befd77ba9f9b"}
```
