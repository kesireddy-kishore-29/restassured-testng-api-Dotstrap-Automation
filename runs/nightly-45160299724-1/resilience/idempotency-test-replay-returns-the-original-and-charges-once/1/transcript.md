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
| 1 | `POST /v1/accounts` | 201 | 485 | `qa-2a094abf-c330-45f1-b59b-93eb0c7b1221` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-083f13ea-85cd-450b-bd01-8c853c9e243a` |
| 3 | `POST /v1/credits/purchases` | 201 | 66 | `qa-2a2c9385-6933-4a78-af0a-09720e290d40` |
| 4 | `POST /v1/credits/purchases` | 200 | 13 | `qa-cdc8feb7-786e-4f56-b356-c37c9746caf8` |
| 5 | `GET /v1/credits/balance` | 200 | 36 | `qa-fa295022-d133-4c58-be82-fa4d3025dd3c` |
| 6 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6f6abd9d-a53b-4bb7-971f-4d9739c519c1` |
| 7 | `POST /v1/auth/token` | 401 | 11 | `qa-43018fc3-5bd5-472a-a229-5514f3320e9a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2a094abf-c330-45f1-b59b-93eb0c7b1221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a094abf-c330-45f1-b59b-93eb0c7b1221
Content-Type: application/json

--- request body ---
{"handle":"qa-76b8c41a19ff","displayName":"QA 76b8c41a19ff","password":"****","region":"eu"}

--- response: 201 in 485 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a094abf-c330-45f1-b59b-93eb0c7b1221
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
Location: /v1/accounts/qa-76b8c41a19ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_012ce343-c388-4030-aa98-cf921922ee46","handle":"qa-76b8c41a19ff","displayName":"QA 76b8c41a19ff","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.676178425Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-083f13ea-85cd-450b-bd01-8c853c9e243a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-083f13ea-85cd-450b-bd01-8c853c9e243a
Content-Type: application/json

--- request body ---
{"handle":"qa-76b8c41a19ff","password":"****"}

--- response: 200 in 49 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-083f13ea-85cd-450b-bd01-8c853c9e243a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_012ce343-c388-4030-aa98-cf921922ee46"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2a2c9385-6933-4a78-af0a-09720e290d40

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cb32f1e7ce3b4e02a9fb601cc255b484
X-Correlation-Id: qa-2a2c9385-6933-4a78-af0a-09720e290d40
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 66 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a2c9385-6933-4a78-af0a-09720e290d40
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
Location: /v1/credits/purchases/pur_cc5436d5-3111-411f-83ae-dd79e422e662
Content-Length: 144

{"id":"pur_cc5436d5-3111-411f-83ae-dd79e422e662","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.272999907Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cdc8feb7-786e-4f56-b356-c37c9746caf8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cb32f1e7ce3b4e02a9fb601cc255b484
X-Correlation-Id: qa-cdc8feb7-786e-4f56-b356-c37c9746caf8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdc8feb7-786e-4f56-b356-c37c9746caf8
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
Location: /v1/credits/purchases/pur_cc5436d5-3111-411f-83ae-dd79e422e662
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_cc5436d5-3111-411f-83ae-dd79e422e662","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.272999907Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-fa295022-d133-4c58-be82-fa4d3025dd3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa295022-d133-4c58-be82-fa4d3025dd3c
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa295022-d133-4c58-be82-fa4d3025dd3c
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

{"balance":15,"currency":"credits","accountId":"acc_012ce343-c388-4030-aa98-cf921922ee46"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f6abd9d-a53b-4bb7-971f-4d9739c519c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f6abd9d-a53b-4bb7-971f-4d9739c519c1
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f6abd9d-a53b-4bb7-971f-4d9739c519c1
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
correlation: qa-43018fc3-5bd5-472a-a229-5514f3320e9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43018fc3-5bd5-472a-a229-5514f3320e9a
Content-Type: application/json

--- request body ---
{"handle":"qa-76b8c41a19ff","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43018fc3-5bd5-472a-a229-5514f3320e9a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43018fc3-5bd5-472a-a229-5514f3320e9a"}
```
