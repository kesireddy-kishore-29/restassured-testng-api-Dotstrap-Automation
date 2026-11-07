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
| 1 | `POST /v1/accounts` | 201 | 402 | `qa-da810df3-3cfc-442f-a06e-5930ed668430` |
| 2 | `POST /v1/auth/token` | 200 | 91 | `qa-ff900b38-0f35-44aa-916b-863456515bb7` |
| 3 | `POST /v1/credits/purchases` | 503 | 100 | `qa-0903925b-5dfe-49fd-aa5f-2164acde720c` |
| 4 | `POST /v1/credits/purchases` | 200 | 14 | `qa-0935b847-8f44-4eb9-8134-802b3fccba4b` |
| 5 | `GET /v1/credits/ledger` | 200 | 17 | `qa-76e4db79-33f1-4fc7-83c5-72c2ffd66db0` |
| 6 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-7e8af423-4178-4df8-bb63-e7cb15f96493` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-9072c44b-60b9-42a9-b134-fb5e0b10ed36` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-da810df3-3cfc-442f-a06e-5930ed668430

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da810df3-3cfc-442f-a06e-5930ed668430
Content-Type: application/json

--- request body ---
{"handle":"qa-0419cfbe3e5f","displayName":"QA 0419cfbe3e5f","password":"****","region":"eu"}

--- response: 201 in 402 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-da810df3-3cfc-442f-a06e-5930ed668430
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
Location: /v1/accounts/qa-0419cfbe3e5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_918fdffc-35e8-4836-a72a-113a1205e5e1","handle":"qa-0419cfbe3e5f","displayName":"QA 0419cfbe3e5f","region":"eu","role":"user","createdAt":"2026-11-03T09:41:38.395001923Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ff900b38-0f35-44aa-916b-863456515bb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff900b38-0f35-44aa-916b-863456515bb7
Content-Type: application/json

--- request body ---
{"handle":"qa-0419cfbe3e5f","password":"****"}

--- response: 200 in 91 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff900b38-0f35-44aa-916b-863456515bb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_918fdffc-35e8-4836-a72a-113a1205e5e1"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0903925b-5dfe-49fd-aa5f-2164acde720c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-98c64c884fae47ae955268669838811e
X-Fault: drop-response
X-Fault-Key: 5a7d809c-94f9-4f62-ad83-83654abfa2bb
X-Correlation-Id: qa-0903925b-5dfe-49fd-aa5f-2164acde720c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 100 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-0903925b-5dfe-49fd-aa5f-2164acde720c
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
Location: /v1/credits/purchases/pur_94bcbd69-f741-4b86-b727-d96e1a70ddac
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-0903925b-5dfe-49fd-aa5f-2164acde720c"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0935b847-8f44-4eb9-8134-802b3fccba4b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-98c64c884fae47ae955268669838811e
X-Fault: drop-response
X-Fault-Key: 5a7d809c-94f9-4f62-ad83-83654abfa2bb
X-Correlation-Id: qa-0935b847-8f44-4eb9-8134-802b3fccba4b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-0935b847-8f44-4eb9-8134-802b3fccba4b
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
Location: /v1/credits/purchases/pur_94bcbd69-f741-4b86-b727-d96e1a70ddac
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_94bcbd69-f741-4b86-b727-d96e1a70ddac","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.081452597Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-76e4db79-33f1-4fc7-83c5-72c2ffd66db0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76e4db79-33f1-4fc7-83c5-72c2ffd66db0
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-76e4db79-33f1-4fc7-83c5-72c2ffd66db0
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

{"items":[{"id":"led_5ad5b1e3-4810-4c0e-87f1-9b9aee81c748","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-03T09:41:38.395012592Z"},{"id":"led_70103331-0c9a-426a-b6b9-4a9d2b9985e2","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_94bcbd69-f741-4b86-b727-d96e1a70ddac","createdAt":"2026-11-03T09:41:39.081452597Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e8af423-4178-4df8-bb63-e7cb15f96493

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e8af423-4178-4df8-bb63-e7cb15f96493
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e8af423-4178-4df8-bb63-e7cb15f96493
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
correlation: qa-9072c44b-60b9-42a9-b134-fb5e0b10ed36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9072c44b-60b9-42a9-b134-fb5e0b10ed36
Content-Type: application/json

--- request body ---
{"handle":"qa-0419cfbe3e5f","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9072c44b-60b9-42a9-b134-fb5e0b10ed36
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9072c44b-60b9-42a9-b134-fb5e0b10ed36"}
```
