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
| 1 | `POST /v1/accounts` | 201 | 374 | `qa-92b48262-99db-4097-a0ce-0b88837e2d6f` |
| 2 | `POST /v1/auth/token` | 200 | 74 | `qa-9b354651-14f9-49e7-a3cd-ce0571009ce0` |
| 3 | `POST /v1/credits/purchases` | 201 | 50 | `qa-59917e2f-b419-404f-9dd7-3def427cebef` |
| 4 | `POST /v1/credits/purchases` | 200 | 12 | `qa-6996beab-cd3a-4e9a-a688-d28c9e9d8bbd` |
| 5 | `GET /v1/credits/balance` | 200 | 36 | `qa-12017292-1c23-4973-b1af-17e27203b4f5` |
| 6 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-0f451f33-752b-44d7-ae5d-37699b293ff7` |
| 7 | `POST /v1/auth/token` | 401 | 11 | `qa-3e2aff10-08ae-48ac-99b8-e8c702214c65` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-92b48262-99db-4097-a0ce-0b88837e2d6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92b48262-99db-4097-a0ce-0b88837e2d6f
Content-Type: application/json

--- request body ---
{"handle":"qa-ebf95b5bb0be","displayName":"QA ebf95b5bb0be","password":"****","region":"eu"}

--- response: 201 in 374 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-92b48262-99db-4097-a0ce-0b88837e2d6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-ebf95b5bb0be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_459f0ff7-e254-4a1b-a963-da7a471695cc","handle":"qa-ebf95b5bb0be","displayName":"QA ebf95b5bb0be","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.312664505Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9b354651-14f9-49e7-a3cd-ce0571009ce0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b354651-14f9-49e7-a3cd-ce0571009ce0
Content-Type: application/json

--- request body ---
{"handle":"qa-ebf95b5bb0be","password":"****"}

--- response: 200 in 74 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b354651-14f9-49e7-a3cd-ce0571009ce0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_459f0ff7-e254-4a1b-a963-da7a471695cc"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-59917e2f-b419-404f-9dd7-3def427cebef

--- request headers ---
Accept: application/json
Idempotency-Key: qa-330d9c923cb843f3b5619696c5144af8
X-Correlation-Id: qa-59917e2f-b419-404f-9dd7-3def427cebef
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-59917e2f-b419-404f-9dd7-3def427cebef
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
Location: /v1/credits/purchases/pur_2e5515fe-6ac6-4060-8d33-46e5b54257c4
Content-Length: 144

{"id":"pur_2e5515fe-6ac6-4060-8d33-46e5b54257c4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.781738752Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6996beab-cd3a-4e9a-a688-d28c9e9d8bbd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-330d9c923cb843f3b5619696c5144af8
X-Correlation-Id: qa-6996beab-cd3a-4e9a-a688-d28c9e9d8bbd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6996beab-cd3a-4e9a-a688-d28c9e9d8bbd
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
Location: /v1/credits/purchases/pur_2e5515fe-6ac6-4060-8d33-46e5b54257c4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_2e5515fe-6ac6-4060-8d33-46e5b54257c4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.781738752Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-12017292-1c23-4973-b1af-17e27203b4f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12017292-1c23-4973-b1af-17e27203b4f5
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-12017292-1c23-4973-b1af-17e27203b4f5
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

{"balance":15,"currency":"credits","accountId":"acc_459f0ff7-e254-4a1b-a963-da7a471695cc"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f451f33-752b-44d7-ae5d-37699b293ff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f451f33-752b-44d7-ae5d-37699b293ff7
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f451f33-752b-44d7-ae5d-37699b293ff7
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
correlation: qa-3e2aff10-08ae-48ac-99b8-e8c702214c65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e2aff10-08ae-48ac-99b8-e8c702214c65
Content-Type: application/json

--- request body ---
{"handle":"qa-ebf95b5bb0be","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e2aff10-08ae-48ac-99b8-e8c702214c65
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e2aff10-08ae-48ac-99b8-e8c702214c65"}
```
