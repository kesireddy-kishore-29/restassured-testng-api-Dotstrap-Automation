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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-777ca6ab-cb4e-4b3d-9146-4efe84de181d` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-a81c75a5-961c-4da3-9bf7-f3a55a08c45e` |
| 3 | `POST /v1/credits/purchases` | 503 | 14 | `qa-0ca717bf-fb84-48be-9faf-e407bc14233a` |
| 4 | `POST /v1/credits/purchases` | 200 | 7 | `qa-15ac1bda-72eb-4852-8f09-19abed5f9616` |
| 5 | `GET /v1/credits/ledger` | 200 | 12 | `qa-4236ac4b-a188-42c4-a3f0-b4ef54461fc8` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9a547ab9-9aa7-462e-ab26-6afdd70b9717` |
| 7 | `POST /v1/auth/token` | 401 | 12 | `qa-999fc32a-41a6-466a-a685-3a8cd1761c57` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-777ca6ab-cb4e-4b3d-9146-4efe84de181d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-777ca6ab-cb4e-4b3d-9146-4efe84de181d
Content-Type: application/json

--- request body ---
{"handle":"qa-32113009d60b","displayName":"QA 32113009d60b","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-777ca6ab-cb4e-4b3d-9146-4efe84de181d
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
Location: /v1/accounts/qa-32113009d60b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a93c07e1-1ca3-4e0a-9040-1035f73614b4","handle":"qa-32113009d60b","displayName":"QA 32113009d60b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:09.538406384Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a81c75a5-961c-4da3-9bf7-f3a55a08c45e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a81c75a5-961c-4da3-9bf7-f3a55a08c45e
Content-Type: application/json

--- request body ---
{"handle":"qa-32113009d60b","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-a81c75a5-961c-4da3-9bf7-f3a55a08c45e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a93c07e1-1ca3-4e0a-9040-1035f73614b4"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0ca717bf-fb84-48be-9faf-e407bc14233a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0acd373f659d48b9a7012cce02d4c1bb
X-Fault: drop-response
X-Fault-Key: 3cd4fa0f-f74d-4df2-8bd2-75cdd121a3ea
X-Correlation-Id: qa-0ca717bf-fb84-48be-9faf-e407bc14233a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-0ca717bf-fb84-48be-9faf-e407bc14233a
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
Location: /v1/credits/purchases/pur_04ba436a-04c9-4b78-83dd-33eafce4358d
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-0ca717bf-fb84-48be-9faf-e407bc14233a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-15ac1bda-72eb-4852-8f09-19abed5f9616

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0acd373f659d48b9a7012cce02d4c1bb
X-Fault: drop-response
X-Fault-Key: 3cd4fa0f-f74d-4df2-8bd2-75cdd121a3ea
X-Correlation-Id: qa-15ac1bda-72eb-4852-8f09-19abed5f9616
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-15ac1bda-72eb-4852-8f09-19abed5f9616
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
Location: /v1/credits/purchases/pur_04ba436a-04c9-4b78-83dd-33eafce4358d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_04ba436a-04c9-4b78-83dd-33eafce4358d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.596558456Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4236ac4b-a188-42c4-a3f0-b4ef54461fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4236ac4b-a188-42c4-a3f0-b4ef54461fc8
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4236ac4b-a188-42c4-a3f0-b4ef54461fc8
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

{"items":[{"id":"led_48f5848c-16bb-4b70-a0ce-1f67fae205a2","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-13T09:42:09.538420865Z"},{"id":"led_e49a6e2d-a9e6-45ab-a143-454b55abe5b4","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_04ba436a-04c9-4b78-83dd-33eafce4358d","createdAt":"2026-11-13T09:42:09.596558456Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a547ab9-9aa7-462e-ab26-6afdd70b9717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a547ab9-9aa7-462e-ab26-6afdd70b9717
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a547ab9-9aa7-462e-ab26-6afdd70b9717
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
correlation: qa-999fc32a-41a6-466a-a685-3a8cd1761c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999fc32a-41a6-466a-a685-3a8cd1761c57
Content-Type: application/json

--- request body ---
{"handle":"qa-32113009d60b","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-999fc32a-41a6-466a-a685-3a8cd1761c57
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-999fc32a-41a6-466a-a685-3a8cd1761c57"}
```
