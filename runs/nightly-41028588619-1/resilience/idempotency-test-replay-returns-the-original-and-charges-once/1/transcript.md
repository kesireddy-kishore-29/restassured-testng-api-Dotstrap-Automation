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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-40ce0b52-fc36-4a6c-a9fc-37432993afe2` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-e5314a2a-ceed-4810-8bcc-d56fb1371c6e` |
| 3 | `POST /v1/credits/purchases` | 201 | 11 | `qa-6ca0dde2-1082-4433-8eba-9b4b08a0e00b` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-31f5ed4e-539a-4e1d-9ff7-e5cf3ade6857` |
| 5 | `GET /v1/credits/balance` | 200 | 8 | `qa-9eaec07e-d71c-453f-8f2c-f2f7572f54ba` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a3da6b3f-16db-4593-96f2-c33f76db3db4` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-6b0d7f1e-f6d3-43ec-bea9-35d63042ab13` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-40ce0b52-fc36-4a6c-a9fc-37432993afe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40ce0b52-fc36-4a6c-a9fc-37432993afe2
Content-Type: application/json

--- request body ---
{"handle":"qa-7984ea8699bf","displayName":"QA 7984ea8699bf","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-40ce0b52-fc36-4a6c-a9fc-37432993afe2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Location: /v1/accounts/qa-7984ea8699bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1a3b4ff-aa4a-4ff3-88a5-ba1c83a55b78","handle":"qa-7984ea8699bf","displayName":"QA 7984ea8699bf","region":"eu","role":"user","createdAt":"2026-10-30T08:45:49.312333359Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e5314a2a-ceed-4810-8bcc-d56fb1371c6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5314a2a-ceed-4810-8bcc-d56fb1371c6e
Content-Type: application/json

--- request body ---
{"handle":"qa-7984ea8699bf","password":"****"}

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5314a2a-ceed-4810-8bcc-d56fb1371c6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1a3b4ff-aa4a-4ff3-88a5-ba1c83a55b78"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6ca0dde2-1082-4433-8eba-9b4b08a0e00b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-543fd349c01349e0bcc1108f8ba2e365
X-Correlation-Id: qa-6ca0dde2-1082-4433-8eba-9b4b08a0e00b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ca0dde2-1082-4433-8eba-9b4b08a0e00b
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
Location: /v1/credits/purchases/pur_13e94b9b-5364-4ac0-b205-964b6a4eb7c9
Content-Length: 144

{"id":"pur_13e94b9b-5364-4ac0-b205-964b6a4eb7c9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.345838489Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-31f5ed4e-539a-4e1d-9ff7-e5cf3ade6857

--- request headers ---
Accept: application/json
Idempotency-Key: qa-543fd349c01349e0bcc1108f8ba2e365
X-Correlation-Id: qa-31f5ed4e-539a-4e1d-9ff7-e5cf3ade6857
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-31f5ed4e-539a-4e1d-9ff7-e5cf3ade6857
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
Location: /v1/credits/purchases/pur_13e94b9b-5364-4ac0-b205-964b6a4eb7c9
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_13e94b9b-5364-4ac0-b205-964b6a4eb7c9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.345838489Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-9eaec07e-d71c-453f-8f2c-f2f7572f54ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eaec07e-d71c-453f-8f2c-f2f7572f54ba
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-9eaec07e-d71c-453f-8f2c-f2f7572f54ba
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

{"balance":15,"currency":"credits","accountId":"acc_e1a3b4ff-aa4a-4ff3-88a5-ba1c83a55b78"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3da6b3f-16db-4593-96f2-c33f76db3db4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3da6b3f-16db-4593-96f2-c33f76db3db4
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3da6b3f-16db-4593-96f2-c33f76db3db4
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
correlation: qa-6b0d7f1e-f6d3-43ec-bea9-35d63042ab13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b0d7f1e-f6d3-43ec-bea9-35d63042ab13
Content-Type: application/json

--- request body ---
{"handle":"qa-7984ea8699bf","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b0d7f1e-f6d3-43ec-bea9-35d63042ab13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b0d7f1e-f6d3-43ec-bea9-35d63042ab13"}
```
