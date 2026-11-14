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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-d3da3c7d-f558-46c3-b246-8245471cc618` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-f525b351-f647-434f-ac69-c14d7100e332` |
| 3 | `POST /v1/credits/purchases` | 503 | 21 | `qa-48eecc5a-7f48-4d0d-a160-fec723177f25` |
| 4 | `POST /v1/credits/purchases` | 200 | 13 | `qa-a07d886f-393f-4a21-b849-43804db3473d` |
| 5 | `GET /v1/credits/ledger` | 200 | 17 | `qa-ed923309-9f69-44ca-ac35-b450f5ba2bd5` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f9571201-5825-4a87-bdae-93ed049eb355` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-b80d2a0e-138a-4436-9d7c-4a3c8954d636` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d3da3c7d-f558-46c3-b246-8245471cc618

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3da3c7d-f558-46c3-b246-8245471cc618
Content-Type: application/json

--- request body ---
{"handle":"qa-a7789c0a2dfe","displayName":"QA a7789c0a2dfe","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3da3c7d-f558-46c3-b246-8245471cc618
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-a7789c0a2dfe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f043bb68-ba34-4f09-b21e-9268dfccc164","handle":"qa-a7789c0a2dfe","displayName":"QA a7789c0a2dfe","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.658265972Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f525b351-f647-434f-ac69-c14d7100e332

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f525b351-f647-434f-ac69-c14d7100e332
Content-Type: application/json

--- request body ---
{"handle":"qa-a7789c0a2dfe","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f525b351-f647-434f-ac69-c14d7100e332
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f043bb68-ba34-4f09-b21e-9268dfccc164"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-48eecc5a-7f48-4d0d-a160-fec723177f25

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b5a999bf9b734cc292f3d9ad2955f782
X-Fault-Key: 8440f2da-e26c-4cb3-a62a-e6378dc90f6b
X-Fault: drop-response
X-Correlation-Id: qa-48eecc5a-7f48-4d0d-a160-fec723177f25
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 21 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-48eecc5a-7f48-4d0d-a160-fec723177f25
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
Location: /v1/credits/purchases/pur_640be39d-862d-4f6f-863f-310b56f93b00
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-48eecc5a-7f48-4d0d-a160-fec723177f25"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a07d886f-393f-4a21-b849-43804db3473d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b5a999bf9b734cc292f3d9ad2955f782
X-Fault-Key: 8440f2da-e26c-4cb3-a62a-e6378dc90f6b
X-Fault: drop-response
X-Correlation-Id: qa-a07d886f-393f-4a21-b849-43804db3473d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a07d886f-393f-4a21-b849-43804db3473d
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
Location: /v1/credits/purchases/pur_640be39d-862d-4f6f-863f-310b56f93b00
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_640be39d-862d-4f6f-863f-310b56f93b00","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.733345337Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ed923309-9f69-44ca-ac35-b450f5ba2bd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed923309-9f69-44ca-ac35-b450f5ba2bd5
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed923309-9f69-44ca-ac35-b450f5ba2bd5
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

{"items":[{"id":"led_9a6ae76a-308a-44a6-b21d-07c0a8938b3e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-09T09:55:59.658277824Z"},{"id":"led_9037b863-4890-4314-bcb4-52928f29d5ed","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_640be39d-862d-4f6f-863f-310b56f93b00","createdAt":"2026-11-09T09:55:59.733345337Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9571201-5825-4a87-bdae-93ed049eb355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9571201-5825-4a87-bdae-93ed049eb355
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9571201-5825-4a87-bdae-93ed049eb355
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
correlation: qa-b80d2a0e-138a-4436-9d7c-4a3c8954d636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b80d2a0e-138a-4436-9d7c-4a3c8954d636
Content-Type: application/json

--- request body ---
{"handle":"qa-a7789c0a2dfe","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b80d2a0e-138a-4436-9d7c-4a3c8954d636
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b80d2a0e-138a-4436-9d7c-4a3c8954d636"}
```
