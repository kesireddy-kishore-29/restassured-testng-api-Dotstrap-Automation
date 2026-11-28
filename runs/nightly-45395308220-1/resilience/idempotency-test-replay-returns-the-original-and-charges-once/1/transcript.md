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
| 1 | `POST /v1/accounts` | 201 | 321 | `qa-90c63fc1-0c4d-4132-b7cb-fcd12b0a6b07` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-44657c15-bdbb-44ac-b9ab-1dd223a04924` |
| 3 | `POST /v1/credits/purchases` | 201 | 34 | `qa-b9d5a246-03fe-4d54-b386-d4b1826c456e` |
| 4 | `POST /v1/credits/purchases` | 200 | 10 | `qa-447a8ad7-7312-4ba5-be46-2ccd2b739fdb` |
| 5 | `GET /v1/credits/balance` | 200 | 26 | `qa-8919bcbd-b2f2-43be-8c87-494c279f104b` |
| 6 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-be6fafc8-9d53-4376-b2f4-73d02e10c778` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-954a8117-ad02-4a14-8a47-6d89e6c61475` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-90c63fc1-0c4d-4132-b7cb-fcd12b0a6b07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90c63fc1-0c4d-4132-b7cb-fcd12b0a6b07
Content-Type: application/json

--- request body ---
{"handle":"qa-5d81694b1d3b","displayName":"QA 5d81694b1d3b","password":"****","region":"eu"}

--- response: 201 in 321 ms ---
Date: Tue, 24 Nov 2026 12:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-90c63fc1-0c4d-4132-b7cb-fcd12b0a6b07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-5d81694b1d3b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a6ddb42-b785-4103-a7d1-35444705487a","handle":"qa-5d81694b1d3b","displayName":"QA 5d81694b1d3b","region":"eu","role":"user","createdAt":"2026-11-24T12:37:58.832208153Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-44657c15-bdbb-44ac-b9ab-1dd223a04924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44657c15-bdbb-44ac-b9ab-1dd223a04924
Content-Type: application/json

--- request body ---
{"handle":"qa-5d81694b1d3b","password":"****"}

--- response: 200 in 43 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-44657c15-bdbb-44ac-b9ab-1dd223a04924
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a6ddb42-b785-4103-a7d1-35444705487a"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b9d5a246-03fe-4d54-b386-d4b1826c456e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d57fd8ae41de44edb212df94c2f6a287
X-Correlation-Id: qa-b9d5a246-03fe-4d54-b386-d4b1826c456e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9d5a246-03fe-4d54-b386-d4b1826c456e
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
Location: /v1/credits/purchases/pur_cefc933a-d01d-467e-a756-d63ab73a020b
Content-Length: 144

{"id":"pur_cefc933a-d01d-467e-a756-d63ab73a020b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.195779017Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-447a8ad7-7312-4ba5-be46-2ccd2b739fdb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d57fd8ae41de44edb212df94c2f6a287
X-Correlation-Id: qa-447a8ad7-7312-4ba5-be46-2ccd2b739fdb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-447a8ad7-7312-4ba5-be46-2ccd2b739fdb
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
Location: /v1/credits/purchases/pur_cefc933a-d01d-467e-a756-d63ab73a020b
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_cefc933a-d01d-467e-a756-d63ab73a020b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.195779017Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-8919bcbd-b2f2-43be-8c87-494c279f104b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8919bcbd-b2f2-43be-8c87-494c279f104b
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8919bcbd-b2f2-43be-8c87-494c279f104b
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

{"balance":15,"currency":"credits","accountId":"acc_4a6ddb42-b785-4103-a7d1-35444705487a"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be6fafc8-9d53-4376-b2f4-73d02e10c778

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be6fafc8-9d53-4376-b2f4-73d02e10c778
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be6fafc8-9d53-4376-b2f4-73d02e10c778
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
correlation: qa-954a8117-ad02-4a14-8a47-6d89e6c61475

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-954a8117-ad02-4a14-8a47-6d89e6c61475
Content-Type: application/json

--- request body ---
{"handle":"qa-5d81694b1d3b","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-954a8117-ad02-4a14-8a47-6d89e6c61475
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-954a8117-ad02-4a14-8a47-6d89e6c61475"}
```
