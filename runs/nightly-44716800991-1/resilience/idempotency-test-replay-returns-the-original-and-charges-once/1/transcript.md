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
| 1 | `POST /v1/accounts` | 201 | 447 | `qa-8eaba750-cd69-4141-91a9-b1fa2d61fc8d` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-00b298d7-e5ee-484a-967d-78261dbbb910` |
| 3 | `POST /v1/credits/purchases` | 201 | 53 | `qa-f21106f2-676b-4fa7-b4c5-fce0afdfbcbe` |
| 4 | `POST /v1/credits/purchases` | 200 | 9 | `qa-c9cfe1c6-4abf-45e8-8635-705ca9c93b01` |
| 5 | `GET /v1/credits/balance` | 200 | 22 | `qa-bc283339-b1a9-4f08-8130-22325790f984` |
| 6 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-88aba7bf-e6df-4576-b7b8-989f58994f23` |
| 7 | `POST /v1/auth/token` | 401 | 12 | `qa-ab07427e-65d9-49a7-bf57-cccec677460b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8eaba750-cd69-4141-91a9-b1fa2d61fc8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8eaba750-cd69-4141-91a9-b1fa2d61fc8d
Content-Type: application/json

--- request body ---
{"handle":"qa-c42b6050e213","displayName":"QA c42b6050e213","password":"****","region":"eu"}

--- response: 201 in 447 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8eaba750-cd69-4141-91a9-b1fa2d61fc8d
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
Location: /v1/accounts/qa-c42b6050e213
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d845077-004c-439d-9492-e5ae5ab56499","handle":"qa-c42b6050e213","displayName":"QA c42b6050e213","region":"eu","role":"user","createdAt":"2026-11-20T10:10:01.391003689Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-00b298d7-e5ee-484a-967d-78261dbbb910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00b298d7-e5ee-484a-967d-78261dbbb910
Content-Type: application/json

--- request body ---
{"handle":"qa-c42b6050e213","password":"****"}

--- response: 200 in 48 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-00b298d7-e5ee-484a-967d-78261dbbb910
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d845077-004c-439d-9492-e5ae5ab56499"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f21106f2-676b-4fa7-b4c5-fce0afdfbcbe

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c39159f82d404a499bc4f09af92a665a
X-Correlation-Id: qa-f21106f2-676b-4fa7-b4c5-fce0afdfbcbe
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f21106f2-676b-4fa7-b4c5-fce0afdfbcbe
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
Location: /v1/credits/purchases/pur_e6222149-fe7b-4d54-9301-69ec568a4246
Content-Length: 144

{"id":"pur_e6222149-fe7b-4d54-9301-69ec568a4246","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.027997862Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c9cfe1c6-4abf-45e8-8635-705ca9c93b01

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c39159f82d404a499bc4f09af92a665a
X-Correlation-Id: qa-c9cfe1c6-4abf-45e8-8635-705ca9c93b01
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9cfe1c6-4abf-45e8-8635-705ca9c93b01
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
Location: /v1/credits/purchases/pur_e6222149-fe7b-4d54-9301-69ec568a4246
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e6222149-fe7b-4d54-9301-69ec568a4246","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.027997862Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-bc283339-b1a9-4f08-8130-22325790f984

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc283339-b1a9-4f08-8130-22325790f984
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc283339-b1a9-4f08-8130-22325790f984
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

{"balance":15,"currency":"credits","accountId":"acc_6d845077-004c-439d-9492-e5ae5ab56499"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88aba7bf-e6df-4576-b7b8-989f58994f23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88aba7bf-e6df-4576-b7b8-989f58994f23
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88aba7bf-e6df-4576-b7b8-989f58994f23
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
correlation: qa-ab07427e-65d9-49a7-bf57-cccec677460b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab07427e-65d9-49a7-bf57-cccec677460b
Content-Type: application/json

--- request body ---
{"handle":"qa-c42b6050e213","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab07427e-65d9-49a7-bf57-cccec677460b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ab07427e-65d9-49a7-bf57-cccec677460b"}
```
