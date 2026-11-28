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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-3fb84410-e05d-4118-9647-f45de502be1b` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-fd12c4a1-284a-4075-9094-7df64fe54e1f` |
| 3 | `POST /v1/credits/purchases` | 503 | 18 | `qa-5cdb30e2-0026-487b-baa8-92d4f33d0959` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-c29787df-6134-475d-8d91-3b48d4c4726c` |
| 5 | `GET /v1/credits/ledger` | 200 | 20 | `qa-96b97e05-3e78-45fa-a71a-f5d983f3ed06` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-fca77c2b-53f3-45dc-97ef-19e608f76af6` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-2c2a1f9c-e208-4889-9ec3-6d5a5669710f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3fb84410-e05d-4118-9647-f45de502be1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fb84410-e05d-4118-9647-f45de502be1b
Content-Type: application/json

--- request body ---
{"handle":"qa-3a4ed4cb8aac","displayName":"QA 3a4ed4cb8aac","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fb84410-e05d-4118-9647-f45de502be1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-3a4ed4cb8aac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55d0c34e-eebb-4f72-bace-a500f56c71c4","handle":"qa-3a4ed4cb8aac","displayName":"QA 3a4ed4cb8aac","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.528343753Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fd12c4a1-284a-4075-9094-7df64fe54e1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd12c4a1-284a-4075-9094-7df64fe54e1f
Content-Type: application/json

--- request body ---
{"handle":"qa-3a4ed4cb8aac","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd12c4a1-284a-4075-9094-7df64fe54e1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55d0c34e-eebb-4f72-bace-a500f56c71c4"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5cdb30e2-0026-487b-baa8-92d4f33d0959

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-e18a558ddf944c8c8c9594041198f535
X-Fault-Key: 2e4af43c-563a-423b-96d7-c406a2f67f75
X-Correlation-Id: qa-5cdb30e2-0026-487b-baa8-92d4f33d0959
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-5cdb30e2-0026-487b-baa8-92d4f33d0959
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
Location: /v1/credits/purchases/pur_698c93f6-de85-4249-95bc-c604575c6633
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-5cdb30e2-0026-487b-baa8-92d4f33d0959"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c29787df-6134-475d-8d91-3b48d4c4726c

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-e18a558ddf944c8c8c9594041198f535
X-Fault-Key: 2e4af43c-563a-423b-96d7-c406a2f67f75
X-Correlation-Id: qa-c29787df-6134-475d-8d91-3b48d4c4726c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c29787df-6134-475d-8d91-3b48d4c4726c
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
Location: /v1/credits/purchases/pur_698c93f6-de85-4249-95bc-c604575c6633
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_698c93f6-de85-4249-95bc-c604575c6633","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.607479199Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-96b97e05-3e78-45fa-a71a-f5d983f3ed06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96b97e05-3e78-45fa-a71a-f5d983f3ed06
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-96b97e05-3e78-45fa-a71a-f5d983f3ed06
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

{"items":[{"id":"led_5d93892e-46b4-4573-987f-2ddd3cfdab27","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-20T10:10:02.528357188Z"},{"id":"led_83b2c8d8-cc1a-43b1-af41-3bd09ec75465","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_698c93f6-de85-4249-95bc-c604575c6633","createdAt":"2026-11-20T10:10:02.607479199Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fca77c2b-53f3-45dc-97ef-19e608f76af6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fca77c2b-53f3-45dc-97ef-19e608f76af6
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fca77c2b-53f3-45dc-97ef-19e608f76af6
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
correlation: qa-2c2a1f9c-e208-4889-9ec3-6d5a5669710f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c2a1f9c-e208-4889-9ec3-6d5a5669710f
Content-Type: application/json

--- request body ---
{"handle":"qa-3a4ed4cb8aac","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c2a1f9c-e208-4889-9ec3-6d5a5669710f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c2a1f9c-e208-4889-9ec3-6d5a5669710f"}
```
