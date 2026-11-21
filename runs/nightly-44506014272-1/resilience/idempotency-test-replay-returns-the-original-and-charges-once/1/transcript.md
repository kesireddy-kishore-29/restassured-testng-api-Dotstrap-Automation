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
| 1 | `POST /v1/accounts` | 201 | 368 | `qa-5797cd09-1f97-4e97-86fe-7584c816d364` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-6462c053-a7fc-4433-9479-e916ec57c938` |
| 3 | `POST /v1/credits/purchases` | 201 | 35 | `qa-6270eb72-cf5d-4d5e-bb8e-8de0e14437c9` |
| 4 | `POST /v1/credits/purchases` | 200 | 9 | `qa-3ee7cd19-0345-4668-b748-bbffc200b89a` |
| 5 | `GET /v1/credits/balance` | 200 | 41 | `qa-29bebc04-34b7-473f-b4d5-21fb1a55843b` |
| 6 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-c2c49a51-6c76-4913-ab28-177b2b618702` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-9724a6d6-dc30-4f2b-9ac4-244ac6c00150` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5797cd09-1f97-4e97-86fe-7584c816d364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5797cd09-1f97-4e97-86fe-7584c816d364
Content-Type: application/json

--- request body ---
{"handle":"qa-5474a59456ca","displayName":"QA 5474a59456ca","password":"****","region":"eu"}

--- response: 201 in 368 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5797cd09-1f97-4e97-86fe-7584c816d364
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
Location: /v1/accounts/qa-5474a59456ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_be5deed6-f5cb-4cee-a336-c74e9e9b74fa","handle":"qa-5474a59456ca","displayName":"QA 5474a59456ca","region":"eu","role":"user","createdAt":"2026-11-19T10:29:12.104110885Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6462c053-a7fc-4433-9479-e916ec57c938

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6462c053-a7fc-4433-9479-e916ec57c938
Content-Type: application/json

--- request body ---
{"handle":"qa-5474a59456ca","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6462c053-a7fc-4433-9479-e916ec57c938
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be5deed6-f5cb-4cee-a336-c74e9e9b74fa"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6270eb72-cf5d-4d5e-bb8e-8de0e14437c9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-42f7443753f54b909bd8ca37178c9640
X-Correlation-Id: qa-6270eb72-cf5d-4d5e-bb8e-8de0e14437c9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6270eb72-cf5d-4d5e-bb8e-8de0e14437c9
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
Location: /v1/credits/purchases/pur_383173e7-b70a-4ccf-855b-c5f1ca97b8c5
Content-Length: 144

{"id":"pur_383173e7-b70a-4ccf-855b-c5f1ca97b8c5","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.593169094Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3ee7cd19-0345-4668-b748-bbffc200b89a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-42f7443753f54b909bd8ca37178c9640
X-Correlation-Id: qa-3ee7cd19-0345-4668-b748-bbffc200b89a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ee7cd19-0345-4668-b748-bbffc200b89a
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
Location: /v1/credits/purchases/pur_383173e7-b70a-4ccf-855b-c5f1ca97b8c5
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_383173e7-b70a-4ccf-855b-c5f1ca97b8c5","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.593169094Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-29bebc04-34b7-473f-b4d5-21fb1a55843b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29bebc04-34b7-473f-b4d5-21fb1a55843b
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-29bebc04-34b7-473f-b4d5-21fb1a55843b
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

{"balance":15,"currency":"credits","accountId":"acc_be5deed6-f5cb-4cee-a336-c74e9e9b74fa"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2c49a51-6c76-4913-ab28-177b2b618702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2c49a51-6c76-4913-ab28-177b2b618702
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2c49a51-6c76-4913-ab28-177b2b618702
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
correlation: qa-9724a6d6-dc30-4f2b-9ac4-244ac6c00150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9724a6d6-dc30-4f2b-9ac4-244ac6c00150
Content-Type: application/json

--- request body ---
{"handle":"qa-5474a59456ca","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9724a6d6-dc30-4f2b-9ac4-244ac6c00150
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9724a6d6-dc30-4f2b-9ac4-244ac6c00150"}
```
