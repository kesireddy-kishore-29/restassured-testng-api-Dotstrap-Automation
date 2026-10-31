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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-43102dae-4d95-45d3-81ba-8ede11aba5c7` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-5f6c13ef-4155-43df-892b-cf0ef5ac4f46` |
| 3 | `POST /v1/credits/purchases` | 201 | 8 | `qa-44d912be-66b1-4942-b983-ca9dacbfb1d0` |
| 4 | `POST /v1/credits/purchases` | 200 | 7 | `qa-52a04539-612c-4908-940a-590c34d769b5` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-d82fc513-9162-4959-9c3a-4f13b20a1288` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d319b060-0071-4a8d-9585-575049d21abd` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-ed91f9d6-21f2-4067-b340-ff8c305a5ff0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43102dae-4d95-45d3-81ba-8ede11aba5c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43102dae-4d95-45d3-81ba-8ede11aba5c7
Content-Type: application/json

--- request body ---
{"handle":"qa-d0bb6fe6b2ea","displayName":"QA d0bb6fe6b2ea","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-43102dae-4d95-45d3-81ba-8ede11aba5c7
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
Location: /v1/accounts/qa-d0bb6fe6b2ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_091e902a-0ff0-4cde-be6f-19c50ba58a6c","handle":"qa-d0bb6fe6b2ea","displayName":"QA d0bb6fe6b2ea","region":"eu","role":"user","createdAt":"2026-10-23T07:41:15.960757032Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5f6c13ef-4155-43df-892b-cf0ef5ac4f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f6c13ef-4155-43df-892b-cf0ef5ac4f46
Content-Type: application/json

--- request body ---
{"handle":"qa-d0bb6fe6b2ea","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f6c13ef-4155-43df-892b-cf0ef5ac4f46
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_091e902a-0ff0-4cde-be6f-19c50ba58a6c"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-44d912be-66b1-4942-b983-ca9dacbfb1d0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3b518cff64394e5d81afe2cad11df32d
X-Correlation-Id: qa-44d912be-66b1-4942-b983-ca9dacbfb1d0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-44d912be-66b1-4942-b983-ca9dacbfb1d0
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
Location: /v1/credits/purchases/pur_1e81bf83-5d29-444c-a1da-562e6d029e08
Content-Length: 144

{"id":"pur_1e81bf83-5d29-444c-a1da-562e6d029e08","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:16.002774920Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-52a04539-612c-4908-940a-590c34d769b5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3b518cff64394e5d81afe2cad11df32d
X-Correlation-Id: qa-52a04539-612c-4908-940a-590c34d769b5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-52a04539-612c-4908-940a-590c34d769b5
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
Location: /v1/credits/purchases/pur_1e81bf83-5d29-444c-a1da-562e6d029e08
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_1e81bf83-5d29-444c-a1da-562e6d029e08","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:16.002774920Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-d82fc513-9162-4959-9c3a-4f13b20a1288

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d82fc513-9162-4959-9c3a-4f13b20a1288
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-d82fc513-9162-4959-9c3a-4f13b20a1288
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

{"balance":15,"currency":"credits","accountId":"acc_091e902a-0ff0-4cde-be6f-19c50ba58a6c"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d319b060-0071-4a8d-9585-575049d21abd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d319b060-0071-4a8d-9585-575049d21abd
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d319b060-0071-4a8d-9585-575049d21abd
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
correlation: qa-ed91f9d6-21f2-4067-b340-ff8c305a5ff0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed91f9d6-21f2-4067-b340-ff8c305a5ff0
Content-Type: application/json

--- request body ---
{"handle":"qa-d0bb6fe6b2ea","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed91f9d6-21f2-4067-b340-ff8c305a5ff0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed91f9d6-21f2-4067-b340-ff8c305a5ff0"}
```
