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
| 1 | `POST /v1/accounts` | 201 | 412 | `qa-f5b48acb-5b56-4a3b-a774-a29bc6f72c11` |
| 2 | `POST /v1/auth/token` | 200 | 67 | `qa-feae1b64-d15e-454f-9232-d576107732e9` |
| 3 | `POST /v1/credits/purchases` | 201 | 70 | `qa-b9b633b6-c1ed-4438-8243-ef201e99a732` |
| 4 | `POST /v1/credits/purchases` | 200 | 23 | `qa-bd8593c1-ee06-492d-a066-c96401d1a6e8` |
| 5 | `GET /v1/credits/balance` | 200 | 50 | `qa-8a8a8f9b-76e7-49b1-b1fa-8fbe3e52c021` |
| 6 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e747f3f7-b2c1-406a-ad6f-7e1c3a7c5699` |
| 7 | `POST /v1/auth/token` | 401 | 12 | `qa-267c4e96-99a2-428f-bf87-0c3c7305c5a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f5b48acb-5b56-4a3b-a774-a29bc6f72c11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5b48acb-5b56-4a3b-a774-a29bc6f72c11
Content-Type: application/json

--- request body ---
{"handle":"qa-639bd2b9d0f1","displayName":"QA 639bd2b9d0f1","password":"****","region":"eu"}

--- response: 201 in 412 ms ---
Date: Sun, 22 Nov 2026 09:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5b48acb-5b56-4a3b-a774-a29bc6f72c11
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
Location: /v1/accounts/qa-639bd2b9d0f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c79613b-09d9-4a3e-8b42-43b6b0124d47","handle":"qa-639bd2b9d0f1","displayName":"QA 639bd2b9d0f1","region":"eu","role":"user","createdAt":"2026-11-22T09:54:53.016500811Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-feae1b64-d15e-454f-9232-d576107732e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feae1b64-d15e-454f-9232-d576107732e9
Content-Type: application/json

--- request body ---
{"handle":"qa-639bd2b9d0f1","password":"****"}

--- response: 200 in 67 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-feae1b64-d15e-454f-9232-d576107732e9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c79613b-09d9-4a3e-8b42-43b6b0124d47"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b9b633b6-c1ed-4438-8243-ef201e99a732

--- request headers ---
Accept: application/json
Idempotency-Key: qa-382da1a69fdc4f3cbcd7343b208c0bfb
X-Correlation-Id: qa-b9b633b6-c1ed-4438-8243-ef201e99a732
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 70 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9b633b6-c1ed-4438-8243-ef201e99a732
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
Location: /v1/credits/purchases/pur_56079236-ec04-4967-bc71-76fc4032d243
Content-Length: 144

{"id":"pur_56079236-ec04-4967-bc71-76fc4032d243","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.689108581Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bd8593c1-ee06-492d-a066-c96401d1a6e8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-382da1a69fdc4f3cbcd7343b208c0bfb
X-Correlation-Id: qa-bd8593c1-ee06-492d-a066-c96401d1a6e8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd8593c1-ee06-492d-a066-c96401d1a6e8
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
Location: /v1/credits/purchases/pur_56079236-ec04-4967-bc71-76fc4032d243
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_56079236-ec04-4967-bc71-76fc4032d243","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.689108581Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-8a8a8f9b-76e7-49b1-b1fa-8fbe3e52c021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a8a8f9b-76e7-49b1-b1fa-8fbe3e52c021
Content-Type: application/json

--- response: 200 in 50 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a8a8f9b-76e7-49b1-b1fa-8fbe3e52c021
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

{"balance":15,"currency":"credits","accountId":"acc_4c79613b-09d9-4a3e-8b42-43b6b0124d47"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e747f3f7-b2c1-406a-ad6f-7e1c3a7c5699

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e747f3f7-b2c1-406a-ad6f-7e1c3a7c5699
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e747f3f7-b2c1-406a-ad6f-7e1c3a7c5699
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
correlation: qa-267c4e96-99a2-428f-bf87-0c3c7305c5a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-267c4e96-99a2-428f-bf87-0c3c7305c5a1
Content-Type: application/json

--- request body ---
{"handle":"qa-639bd2b9d0f1","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-267c4e96-99a2-428f-bf87-0c3c7305c5a1
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-267c4e96-99a2-428f-bf87-0c3c7305c5a1"}
```
