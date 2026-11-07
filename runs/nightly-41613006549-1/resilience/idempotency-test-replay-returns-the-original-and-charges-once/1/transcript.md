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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-0879bdda-c50d-42b0-8f57-f2d3bbc41800` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-8584ebe1-8f81-4a8a-9571-342eafa4e6cd` |
| 3 | `POST /v1/credits/purchases` | 201 | 12 | `qa-c3ca14db-d36e-465f-a311-2de09bb1d7e2` |
| 4 | `POST /v1/credits/purchases` | 200 | 7 | `qa-95ccf411-798d-4de9-b846-40d24fabbe01` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-b5b6eb16-74a4-4d14-9bd1-9647b7066dc3` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-999ceb93-1257-465a-9e4f-860d0c95ac4e` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-138a1184-15c2-48a6-b874-891824cb2bd6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0879bdda-c50d-42b0-8f57-f2d3bbc41800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0879bdda-c50d-42b0-8f57-f2d3bbc41800
Content-Type: application/json

--- request body ---
{"handle":"qa-c6d70c6f4214","displayName":"QA c6d70c6f4214","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-0879bdda-c50d-42b0-8f57-f2d3bbc41800
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
Location: /v1/accounts/qa-c6d70c6f4214
X-Served-Region: eu
Content-Length: 181

{"id":"acc_830d84c8-da03-4d8f-b49e-4ddebaaf2a4f","handle":"qa-c6d70c6f4214","displayName":"QA c6d70c6f4214","region":"eu","role":"user","createdAt":"2026-11-03T09:41:39.381818625Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8584ebe1-8f81-4a8a-9571-342eafa4e6cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8584ebe1-8f81-4a8a-9571-342eafa4e6cd
Content-Type: application/json

--- request body ---
{"handle":"qa-c6d70c6f4214","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-8584ebe1-8f81-4a8a-9571-342eafa4e6cd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_830d84c8-da03-4d8f-b49e-4ddebaaf2a4f"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c3ca14db-d36e-465f-a311-2de09bb1d7e2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2c29289f788f49d181bd189b4bcf843a
X-Correlation-Id: qa-c3ca14db-d36e-465f-a311-2de09bb1d7e2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3ca14db-d36e-465f-a311-2de09bb1d7e2
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
Location: /v1/credits/purchases/pur_edb95a7a-8ca8-417b-928f-0c3ef19f7d0c
Content-Length: 144

{"id":"pur_edb95a7a-8ca8-417b-928f-0c3ef19f7d0c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.416888281Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-95ccf411-798d-4de9-b846-40d24fabbe01

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2c29289f788f49d181bd189b4bcf843a
X-Correlation-Id: qa-95ccf411-798d-4de9-b846-40d24fabbe01
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-95ccf411-798d-4de9-b846-40d24fabbe01
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
Location: /v1/credits/purchases/pur_edb95a7a-8ca8-417b-928f-0c3ef19f7d0c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_edb95a7a-8ca8-417b-928f-0c3ef19f7d0c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.416888281Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-b5b6eb16-74a4-4d14-9bd1-9647b7066dc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5b6eb16-74a4-4d14-9bd1-9647b7066dc3
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5b6eb16-74a4-4d14-9bd1-9647b7066dc3
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

{"balance":15,"currency":"credits","accountId":"acc_830d84c8-da03-4d8f-b49e-4ddebaaf2a4f"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-999ceb93-1257-465a-9e4f-860d0c95ac4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999ceb93-1257-465a-9e4f-860d0c95ac4e
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-999ceb93-1257-465a-9e4f-860d0c95ac4e
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
correlation: qa-138a1184-15c2-48a6-b874-891824cb2bd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-138a1184-15c2-48a6-b874-891824cb2bd6
Content-Type: application/json

--- request body ---
{"handle":"qa-c6d70c6f4214","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-138a1184-15c2-48a6-b874-891824cb2bd6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-138a1184-15c2-48a6-b874-891824cb2bd6"}
```
