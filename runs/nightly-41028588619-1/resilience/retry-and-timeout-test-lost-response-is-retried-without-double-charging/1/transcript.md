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
| 1 | `POST /v1/accounts` | 201 | 310 | `qa-70254c6d-90fa-409c-a9e2-6129f067a5b1` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-458d09a2-d6b1-487d-967e-da7b45568559` |
| 3 | `POST /v1/credits/purchases` | 503 | 62 | `qa-ca5ca8ef-29c2-4bfa-af48-c1730669ef74` |
| 4 | `POST /v1/credits/purchases` | 200 | 6 | `qa-70b810b1-205e-4ac9-9d5e-718109fc9f4c` |
| 5 | `GET /v1/credits/ledger` | 200 | 24 | `qa-ec14c1d9-5c50-4451-85c8-60dee114dcf6` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0473caf6-fc8e-4978-b34e-fe31e365edab` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-80110f19-9f8d-4a52-892f-3c335f0e91fc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70254c6d-90fa-409c-a9e2-6129f067a5b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70254c6d-90fa-409c-a9e2-6129f067a5b1
Content-Type: application/json

--- request body ---
{"handle":"qa-1f91026f4e8e","displayName":"QA 1f91026f4e8e","password":"****","region":"eu"}

--- response: 201 in 310 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-70254c6d-90fa-409c-a9e2-6129f067a5b1
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
Location: /v1/accounts/qa-1f91026f4e8e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31ea2f27-36bd-43fc-89d6-c03b513ace94","handle":"qa-1f91026f4e8e","displayName":"QA 1f91026f4e8e","region":"eu","role":"user","createdAt":"2026-10-30T08:45:48.598242469Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-458d09a2-d6b1-487d-967e-da7b45568559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-458d09a2-d6b1-487d-967e-da7b45568559
Content-Type: application/json

--- request body ---
{"handle":"qa-1f91026f4e8e","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-458d09a2-d6b1-487d-967e-da7b45568559
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31ea2f27-36bd-43fc-89d6-c03b513ace94"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ca5ca8ef-29c2-4bfa-af48-c1730669ef74

--- request headers ---
Accept: application/json
X-Fault-Key: 8724c3a3-2ed0-4950-ae33-2f643b4c80c9
X-Fault: drop-response
Idempotency-Key: qa-235afbf56a6d4db8b8071d616ea9db52
X-Correlation-Id: qa-ca5ca8ef-29c2-4bfa-af48-c1730669ef74
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 62 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-ca5ca8ef-29c2-4bfa-af48-c1730669ef74
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
Location: /v1/credits/purchases/pur_cb479ce0-b91e-484c-9907-ff77cdc22588
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-ca5ca8ef-29c2-4bfa-af48-c1730669ef74"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-70b810b1-205e-4ac9-9d5e-718109fc9f4c

--- request headers ---
Accept: application/json
X-Fault-Key: 8724c3a3-2ed0-4950-ae33-2f643b4c80c9
X-Fault: drop-response
Idempotency-Key: qa-235afbf56a6d4db8b8071d616ea9db52
X-Correlation-Id: qa-70b810b1-205e-4ac9-9d5e-718109fc9f4c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-70b810b1-205e-4ac9-9d5e-718109fc9f4c
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
Location: /v1/credits/purchases/pur_cb479ce0-b91e-484c-9907-ff77cdc22588
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_cb479ce0-b91e-484c-9907-ff77cdc22588","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.073923829Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ec14c1d9-5c50-4451-85c8-60dee114dcf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec14c1d9-5c50-4451-85c8-60dee114dcf6
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec14c1d9-5c50-4451-85c8-60dee114dcf6
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

{"items":[{"id":"led_0e25ce3d-5d64-4c42-b9e0-3071dbbd3091","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-30T08:45:48.598540537Z"},{"id":"led_81fbd498-e9f9-47ae-a25e-7e51797abfcc","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_cb479ce0-b91e-484c-9907-ff77cdc22588","createdAt":"2026-10-30T08:45:49.073923829Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0473caf6-fc8e-4978-b34e-fe31e365edab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0473caf6-fc8e-4978-b34e-fe31e365edab
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0473caf6-fc8e-4978-b34e-fe31e365edab
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
correlation: qa-80110f19-9f8d-4a52-892f-3c335f0e91fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80110f19-9f8d-4a52-892f-3c335f0e91fc
Content-Type: application/json

--- request body ---
{"handle":"qa-1f91026f4e8e","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80110f19-9f8d-4a52-892f-3c335f0e91fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80110f19-9f8d-4a52-892f-3c335f0e91fc"}
```
