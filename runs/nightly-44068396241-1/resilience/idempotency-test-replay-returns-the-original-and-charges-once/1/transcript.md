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
| 1 | `POST /v1/accounts` | 201 | 455 | `qa-a8ed33d0-f4fc-4721-87c3-881a870be449` |
| 2 | `POST /v1/auth/token` | 200 | 60 | `qa-c409e81d-a27c-4b2e-b885-4d0b3bece7b7` |
| 3 | `POST /v1/credits/purchases` | 201 | 61 | `qa-d2ff0ca5-ed03-4111-8407-6349afa1e479` |
| 4 | `POST /v1/credits/purchases` | 200 | 17 | `qa-1d189566-9280-4f54-968a-c3f4c669889f` |
| 5 | `GET /v1/credits/balance` | 200 | 36 | `qa-8b29375c-b4d2-489b-b757-a4dd649b5d45` |
| 6 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-56968eb9-1e1d-437d-a894-2cfcd2d61765` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-146f7f67-2497-4cad-97a8-efa50cb22f90` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a8ed33d0-f4fc-4721-87c3-881a870be449

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8ed33d0-f4fc-4721-87c3-881a870be449
Content-Type: application/json

--- request body ---
{"handle":"qa-895c01ff346b","displayName":"QA 895c01ff346b","password":"****","region":"eu"}

--- response: 201 in 455 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8ed33d0-f4fc-4721-87c3-881a870be449
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
Location: /v1/accounts/qa-895c01ff346b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a405c92-fb3e-4956-98ec-960828e85dcb","handle":"qa-895c01ff346b","displayName":"QA 895c01ff346b","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.133813281Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c409e81d-a27c-4b2e-b885-4d0b3bece7b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c409e81d-a27c-4b2e-b885-4d0b3bece7b7
Content-Type: application/json

--- request body ---
{"handle":"qa-895c01ff346b","password":"****"}

--- response: 200 in 60 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-c409e81d-a27c-4b2e-b885-4d0b3bece7b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a405c92-fb3e-4956-98ec-960828e85dcb"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d2ff0ca5-ed03-4111-8407-6349afa1e479

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9dc86561f1b547b69b6b27a4a7d3a55a
X-Correlation-Id: qa-d2ff0ca5-ed03-4111-8407-6349afa1e479
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 61 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2ff0ca5-ed03-4111-8407-6349afa1e479
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
Location: /v1/credits/purchases/pur_5b123cd1-8ffe-4cc0-b863-3b4a9fcf266e
Content-Length: 144

{"id":"pur_5b123cd1-8ffe-4cc0-b863-3b4a9fcf266e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.669113411Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1d189566-9280-4f54-968a-c3f4c669889f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9dc86561f1b547b69b6b27a4a7d3a55a
X-Correlation-Id: qa-1d189566-9280-4f54-968a-c3f4c669889f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d189566-9280-4f54-968a-c3f4c669889f
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
Location: /v1/credits/purchases/pur_5b123cd1-8ffe-4cc0-b863-3b4a9fcf266e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5b123cd1-8ffe-4cc0-b863-3b4a9fcf266e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.669113411Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-8b29375c-b4d2-489b-b757-a4dd649b5d45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b29375c-b4d2-489b-b757-a4dd649b5d45
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b29375c-b4d2-489b-b757-a4dd649b5d45
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

{"balance":15,"currency":"credits","accountId":"acc_4a405c92-fb3e-4956-98ec-960828e85dcb"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56968eb9-1e1d-437d-a894-2cfcd2d61765

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56968eb9-1e1d-437d-a894-2cfcd2d61765
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56968eb9-1e1d-437d-a894-2cfcd2d61765
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
correlation: qa-146f7f67-2497-4cad-97a8-efa50cb22f90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-146f7f67-2497-4cad-97a8-efa50cb22f90
Content-Type: application/json

--- request body ---
{"handle":"qa-895c01ff346b","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-146f7f67-2497-4cad-97a8-efa50cb22f90
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-146f7f67-2497-4cad-97a8-efa50cb22f90"}
```
