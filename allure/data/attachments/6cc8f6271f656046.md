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
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-83fdd17e-16ef-4e11-91c4-e92fa22188fe` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-58ec69d0-8fac-4571-8ca0-c350f93c1ed7` |
| 3 | `POST /v1/credits/purchases` | 503 | 24 | `qa-68f76d9e-0324-42d3-94ca-f54c4880a4af` |
| 4 | `POST /v1/credits/purchases` | 200 | 15 | `qa-56c93c84-45c3-46ac-9f83-42647082dc89` |
| 5 | `GET /v1/credits/ledger` | 200 | 23 | `qa-b4ead234-98ef-4b6d-82d2-a06ec7fac2bf` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-845f456c-061b-433c-a0c7-563f27fd6373` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-90fa84c3-ce64-43a9-90ff-75c0a58551a7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-83fdd17e-16ef-4e11-91c4-e92fa22188fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83fdd17e-16ef-4e11-91c4-e92fa22188fe
Content-Type: application/json

--- request body ---
{"handle":"qa-f1ad6efa1970","displayName":"QA f1ad6efa1970","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-83fdd17e-16ef-4e11-91c4-e92fa22188fe
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
Location: /v1/accounts/qa-f1ad6efa1970
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd91b180-6806-4889-af6e-12ad5656cfa6","handle":"qa-f1ad6efa1970","displayName":"QA f1ad6efa1970","region":"eu","role":"user","createdAt":"2026-11-14T09:05:15.474962680Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-58ec69d0-8fac-4571-8ca0-c350f93c1ed7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ec69d0-8fac-4571-8ca0-c350f93c1ed7
Content-Type: application/json

--- request body ---
{"handle":"qa-f1ad6efa1970","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-58ec69d0-8fac-4571-8ca0-c350f93c1ed7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd91b180-6806-4889-af6e-12ad5656cfa6"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-68f76d9e-0324-42d3-94ca-f54c4880a4af

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-b69a8fbe1a4c4236b230476aa3cff008
X-Fault-Key: 4e316fa0-e27d-423d-b93f-4ca1fd1ad613
X-Correlation-Id: qa-68f76d9e-0324-42d3-94ca-f54c4880a4af
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-68f76d9e-0324-42d3-94ca-f54c4880a4af
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
Location: /v1/credits/purchases/pur_eeccdbc7-5a1c-4fbd-a32b-fca646905864
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-68f76d9e-0324-42d3-94ca-f54c4880a4af"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-56c93c84-45c3-46ac-9f83-42647082dc89

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-b69a8fbe1a4c4236b230476aa3cff008
X-Fault-Key: 4e316fa0-e27d-423d-b93f-4ca1fd1ad613
X-Correlation-Id: qa-56c93c84-45c3-46ac-9f83-42647082dc89
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-56c93c84-45c3-46ac-9f83-42647082dc89
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
Location: /v1/credits/purchases/pur_eeccdbc7-5a1c-4fbd-a32b-fca646905864
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_eeccdbc7-5a1c-4fbd-a32b-fca646905864","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:15.545129880Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b4ead234-98ef-4b6d-82d2-a06ec7fac2bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4ead234-98ef-4b6d-82d2-a06ec7fac2bf
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4ead234-98ef-4b6d-82d2-a06ec7fac2bf
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

{"items":[{"id":"led_eceaaa24-7c2c-432c-9dc7-e0b867df3d47","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-14T09:05:15.474983940Z"},{"id":"led_db9249e1-cb2e-415c-83b4-bfee87e36588","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_eeccdbc7-5a1c-4fbd-a32b-fca646905864","createdAt":"2026-11-14T09:05:15.545129880Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-845f456c-061b-433c-a0c7-563f27fd6373

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-845f456c-061b-433c-a0c7-563f27fd6373
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-845f456c-061b-433c-a0c7-563f27fd6373
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
correlation: qa-90fa84c3-ce64-43a9-90ff-75c0a58551a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90fa84c3-ce64-43a9-90ff-75c0a58551a7
Content-Type: application/json

--- request body ---
{"handle":"qa-f1ad6efa1970","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90fa84c3-ce64-43a9-90ff-75c0a58551a7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90fa84c3-ce64-43a9-90ff-75c0a58551a7"}
```
