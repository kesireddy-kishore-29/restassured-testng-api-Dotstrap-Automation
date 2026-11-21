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
| 1 | `POST /v1/accounts` | 201 | 477 | `qa-bf05d027-d01a-4547-80ed-c304f70c44c1` |
| 2 | `POST /v1/auth/token` | 200 | 78 | `qa-f1db0341-b1dd-41af-9d57-2eaacf70460e` |
| 3 | `POST /v1/credits/purchases` | 201 | 59 | `qa-b1310b15-d42f-4c39-ab3a-449a748a1869` |
| 4 | `POST /v1/credits/purchases` | 200 | 23 | `qa-87f6d16f-eb26-416e-9398-767b74c595d3` |
| 5 | `GET /v1/credits/balance` | 200 | 27 | `qa-abbad396-2a00-4f07-b20b-bc3b2ee4c3a9` |
| 6 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-136897c3-b082-44f5-ab59-7346c09cc0e7` |
| 7 | `POST /v1/auth/token` | 401 | 10 | `qa-4b787923-50a6-42bf-9fe5-d9fb40241c90` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bf05d027-d01a-4547-80ed-c304f70c44c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf05d027-d01a-4547-80ed-c304f70c44c1
Content-Type: application/json

--- request body ---
{"handle":"qa-8505505cdde5","displayName":"QA 8505505cdde5","password":"****","region":"eu"}

--- response: 201 in 477 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf05d027-d01a-4547-80ed-c304f70c44c1
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
Location: /v1/accounts/qa-8505505cdde5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20e222c2-1a66-451e-9961-85693e03253d","handle":"qa-8505505cdde5","displayName":"QA 8505505cdde5","region":"eu","role":"user","createdAt":"2026-11-15T09:36:13.555917012Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f1db0341-b1dd-41af-9d57-2eaacf70460e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1db0341-b1dd-41af-9d57-2eaacf70460e
Content-Type: application/json

--- request body ---
{"handle":"qa-8505505cdde5","password":"****"}

--- response: 200 in 78 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1db0341-b1dd-41af-9d57-2eaacf70460e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20e222c2-1a66-451e-9961-85693e03253d"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b1310b15-d42f-4c39-ab3a-449a748a1869

--- request headers ---
Accept: application/json
Idempotency-Key: qa-28fb7cdf56e8473aaa6b70679d593473
X-Correlation-Id: qa-b1310b15-d42f-4c39-ab3a-449a748a1869
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 59 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1310b15-d42f-4c39-ab3a-449a748a1869
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
Location: /v1/credits/purchases/pur_e59a7f38-ac2f-4c56-a395-7af8886b54d1
Content-Length: 144

{"id":"pur_e59a7f38-ac2f-4c56-a395-7af8886b54d1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.039767013Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-87f6d16f-eb26-416e-9398-767b74c595d3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-28fb7cdf56e8473aaa6b70679d593473
X-Correlation-Id: qa-87f6d16f-eb26-416e-9398-767b74c595d3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-87f6d16f-eb26-416e-9398-767b74c595d3
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
Location: /v1/credits/purchases/pur_e59a7f38-ac2f-4c56-a395-7af8886b54d1
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e59a7f38-ac2f-4c56-a395-7af8886b54d1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.039767013Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-abbad396-2a00-4f07-b20b-bc3b2ee4c3a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abbad396-2a00-4f07-b20b-bc3b2ee4c3a9
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-abbad396-2a00-4f07-b20b-bc3b2ee4c3a9
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

{"balance":15,"currency":"credits","accountId":"acc_20e222c2-1a66-451e-9961-85693e03253d"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-136897c3-b082-44f5-ab59-7346c09cc0e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-136897c3-b082-44f5-ab59-7346c09cc0e7
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-136897c3-b082-44f5-ab59-7346c09cc0e7
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
correlation: qa-4b787923-50a6-42bf-9fe5-d9fb40241c90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b787923-50a6-42bf-9fe5-d9fb40241c90
Content-Type: application/json

--- request body ---
{"handle":"qa-8505505cdde5","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b787923-50a6-42bf-9fe5-d9fb40241c90
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b787923-50a6-42bf-9fe5-d9fb40241c90"}
```
