# Transcript: A lost response is retried with the same key and the purchase is charged once

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#lostResponseIsRetriedWithoutDoubleCharging` |
| Features | FEAT-RES-01, FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-1985e521-38ae-4a4e-a184-b430da036d17` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-ada77f8b-6bc3-4080-9e29-a2879d36c263` |
| 3 | `POST /v1/credits/purchases` | 503 | 17 | `qa-209602da-f48a-4782-b816-433aaf1da646` |
| 4 | `POST /v1/credits/purchases` | 200 | 12 | `qa-86c9ac75-8b9f-48eb-a860-caf59e27e859` |
| 5 | `GET /v1/credits/ledger` | 200 | 18 | `qa-078fcf6c-3865-4589-b790-9a492c1de364` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-03bf7f70-d4dd-4b74-acb5-ef483146ceb3` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-7ebe55ad-bb4c-4d7d-ae1f-3e5adf72a4be` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1985e521-38ae-4a4e-a184-b430da036d17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1985e521-38ae-4a4e-a184-b430da036d17
Content-Type: application/json

--- request body ---
{"handle":"qa-570d1ca730ee","displayName":"QA 570d1ca730ee","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1985e521-38ae-4a4e-a184-b430da036d17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-570d1ca730ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_084b5e0c-8e5d-4411-bc0b-9c3efb0fc3c5","handle":"qa-570d1ca730ee","displayName":"QA 570d1ca730ee","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.577424586Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ada77f8b-6bc3-4080-9e29-a2879d36c263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ada77f8b-6bc3-4080-9e29-a2879d36c263
Content-Type: application/json

--- request body ---
{"handle":"qa-570d1ca730ee","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ada77f8b-6bc3-4080-9e29-a2879d36c263
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_084b5e0c-8e5d-4411-bc0b-9c3efb0fc3c5"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-209602da-f48a-4782-b816-433aaf1da646

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-3a064f42e35f453f8d7bd1565d7abed9
X-Fault-Key: bfa68865-b1c2-41c3-b347-c6dd184d09fd
X-Correlation-Id: qa-209602da-f48a-4782-b816-433aaf1da646
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-209602da-f48a-4782-b816-433aaf1da646
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
Location: /v1/credits/purchases/pur_32c35720-97da-42b7-bcb3-19f0b1f7d3dd
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-209602da-f48a-4782-b816-433aaf1da646"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-86c9ac75-8b9f-48eb-a860-caf59e27e859

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-3a064f42e35f453f8d7bd1565d7abed9
X-Fault-Key: bfa68865-b1c2-41c3-b347-c6dd184d09fd
X-Correlation-Id: qa-86c9ac75-8b9f-48eb-a860-caf59e27e859
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-86c9ac75-8b9f-48eb-a860-caf59e27e859
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
Location: /v1/credits/purchases/pur_32c35720-97da-42b7-bcb3-19f0b1f7d3dd
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_32c35720-97da-42b7-bcb3-19f0b1f7d3dd","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:11.652447205Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-078fcf6c-3865-4589-b790-9a492c1de364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-078fcf6c-3865-4589-b790-9a492c1de364
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-078fcf6c-3865-4589-b790-9a492c1de364
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 398

{"items":[{"id":"led_292c3b98-7362-4ec7-a438-a8f140159dee","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-21T09:57:11.577441939Z"},{"id":"led_c55dc31c-d4a5-4ea9-a6e8-b17a37b4f376","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_32c35720-97da-42b7-bcb3-19f0b1f7d3dd","createdAt":"2026-11-21T09:57:11.652447205Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03bf7f70-d4dd-4b74-acb5-ef483146ceb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03bf7f70-d4dd-4b74-acb5-ef483146ceb3
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03bf7f70-d4dd-4b74-acb5-ef483146ceb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 9
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-7ebe55ad-bb4c-4d7d-ae1f-3e5adf72a4be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ebe55ad-bb4c-4d7d-ae1f-3e5adf72a4be
Content-Type: application/json

--- request body ---
{"handle":"qa-570d1ca730ee","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ebe55ad-bb4c-4d7d-ae1f-3e5adf72a4be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ebe55ad-bb4c-4d7d-ae1f-3e5adf72a4be"}
```
