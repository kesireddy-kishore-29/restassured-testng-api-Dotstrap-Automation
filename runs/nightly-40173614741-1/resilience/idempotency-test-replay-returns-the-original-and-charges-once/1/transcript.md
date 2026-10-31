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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-48bea466-6262-474d-82a4-63b940f3db25` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-73e3750c-031a-4421-bc04-fc8bd64eb30a` |
| 3 | `POST /v1/credits/purchases` | 201 | 9 | `qa-61cf452c-3b6f-4ea7-9550-22752d4d5257` |
| 4 | `POST /v1/credits/purchases` | 200 | 6 | `qa-7e18a52c-db78-4bd3-bf72-7e9101b9ccb7` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-2e570282-5a8f-4e1a-9757-c957bc6f127e` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-40c4a4cf-a619-4147-adca-56d3a75ecb69` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-e02f05f2-3a1e-42d0-9d40-465c4b3b7ab2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-48bea466-6262-474d-82a4-63b940f3db25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48bea466-6262-474d-82a4-63b940f3db25
Content-Type: application/json

--- request body ---
{"handle":"qa-0dc2eb0b260e","displayName":"QA 0dc2eb0b260e","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-48bea466-6262-474d-82a4-63b940f3db25
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
Location: /v1/accounts/qa-0dc2eb0b260e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13178681-ac17-42a7-b99c-fda626b60e97","handle":"qa-0dc2eb0b260e","displayName":"QA 0dc2eb0b260e","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.225381948Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-73e3750c-031a-4421-bc04-fc8bd64eb30a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73e3750c-031a-4421-bc04-fc8bd64eb30a
Content-Type: application/json

--- request body ---
{"handle":"qa-0dc2eb0b260e","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-73e3750c-031a-4421-bc04-fc8bd64eb30a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13178681-ac17-42a7-b99c-fda626b60e97"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-61cf452c-3b6f-4ea7-9550-22752d4d5257

--- request headers ---
Accept: application/json
Idempotency-Key: qa-77d593e4afc44a02a3f9de3e59d4aa64
X-Correlation-Id: qa-61cf452c-3b6f-4ea7-9550-22752d4d5257
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-61cf452c-3b6f-4ea7-9550-22752d4d5257
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
Location: /v1/credits/purchases/pur_27bc8a65-cfad-458b-a370-62f8c0c59ab5
Content-Length: 144

{"id":"pur_27bc8a65-cfad-458b-a370-62f8c0c59ab5","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:28.260100619Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7e18a52c-db78-4bd3-bf72-7e9101b9ccb7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-77d593e4afc44a02a3f9de3e59d4aa64
X-Correlation-Id: qa-7e18a52c-db78-4bd3-bf72-7e9101b9ccb7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e18a52c-db78-4bd3-bf72-7e9101b9ccb7
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
Location: /v1/credits/purchases/pur_27bc8a65-cfad-458b-a370-62f8c0c59ab5
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_27bc8a65-cfad-458b-a370-62f8c0c59ab5","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:28.260100619Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-2e570282-5a8f-4e1a-9757-c957bc6f127e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e570282-5a8f-4e1a-9757-c957bc6f127e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e570282-5a8f-4e1a-9757-c957bc6f127e
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

{"balance":15,"currency":"credits","accountId":"acc_13178681-ac17-42a7-b99c-fda626b60e97"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40c4a4cf-a619-4147-adca-56d3a75ecb69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c4a4cf-a619-4147-adca-56d3a75ecb69
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40c4a4cf-a619-4147-adca-56d3a75ecb69
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
correlation: qa-e02f05f2-3a1e-42d0-9d40-465c4b3b7ab2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e02f05f2-3a1e-42d0-9d40-465c4b3b7ab2
Content-Type: application/json

--- request body ---
{"handle":"qa-0dc2eb0b260e","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e02f05f2-3a1e-42d0-9d40-465c4b3b7ab2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e02f05f2-3a1e-42d0-9d40-465c4b3b7ab2"}
```
