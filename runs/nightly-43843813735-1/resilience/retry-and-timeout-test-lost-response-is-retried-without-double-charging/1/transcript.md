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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-540b1719-176d-4f53-a981-e21e91f9ee32` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-d153bc32-c6fc-4618-8f2e-68fafdc7f28f` |
| 3 | `POST /v1/credits/purchases` | 503 | 15 | `qa-9dae3afd-0303-4377-9bf4-ada015799808` |
| 4 | `POST /v1/credits/purchases` | 200 | 10 | `qa-05f09133-835f-43d3-9d2b-fcbd6f85b4a7` |
| 5 | `GET /v1/credits/ledger` | 200 | 25 | `qa-926b84ef-a694-4302-a324-7a242ecae75c` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-cc684c21-56f9-49a4-a9e4-8dee5d43cec5` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-d4045d4e-f7d6-42ae-81d9-942f7a79c549` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-540b1719-176d-4f53-a981-e21e91f9ee32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-540b1719-176d-4f53-a981-e21e91f9ee32
Content-Type: application/json

--- request body ---
{"handle":"qa-d38dd41cf600","displayName":"QA d38dd41cf600","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-540b1719-176d-4f53-a981-e21e91f9ee32
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
Location: /v1/accounts/qa-d38dd41cf600
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c28b042a-26c6-465f-9034-3564919ca945","handle":"qa-d38dd41cf600","displayName":"QA d38dd41cf600","region":"eu","role":"user","createdAt":"2026-11-16T09:54:00.962979177Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d153bc32-c6fc-4618-8f2e-68fafdc7f28f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d153bc32-c6fc-4618-8f2e-68fafdc7f28f
Content-Type: application/json

--- request body ---
{"handle":"qa-d38dd41cf600","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d153bc32-c6fc-4618-8f2e-68fafdc7f28f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c28b042a-26c6-465f-9034-3564919ca945"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9dae3afd-0303-4377-9bf4-ada015799808

--- request headers ---
Accept: application/json
X-Fault-Key: ce47be01-084b-4e0d-94e8-b97f8012f1eb
Idempotency-Key: qa-61eb3881095143dc868f01747096fe8f
X-Fault: drop-response
X-Correlation-Id: qa-9dae3afd-0303-4377-9bf4-ada015799808
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 15 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-9dae3afd-0303-4377-9bf4-ada015799808
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
Location: /v1/credits/purchases/pur_323210bd-d023-450f-bfad-bf25748ffbd6
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-9dae3afd-0303-4377-9bf4-ada015799808"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-05f09133-835f-43d3-9d2b-fcbd6f85b4a7

--- request headers ---
Accept: application/json
X-Fault-Key: ce47be01-084b-4e0d-94e8-b97f8012f1eb
Idempotency-Key: qa-61eb3881095143dc868f01747096fe8f
X-Fault: drop-response
X-Correlation-Id: qa-05f09133-835f-43d3-9d2b-fcbd6f85b4a7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-05f09133-835f-43d3-9d2b-fcbd6f85b4a7
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
Location: /v1/credits/purchases/pur_323210bd-d023-450f-bfad-bf25748ffbd6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_323210bd-d023-450f-bfad-bf25748ffbd6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:01.045871804Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-926b84ef-a694-4302-a324-7a242ecae75c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-926b84ef-a694-4302-a324-7a242ecae75c
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-926b84ef-a694-4302-a324-7a242ecae75c
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

{"items":[{"id":"led_5f5b2559-763d-4a51-91a9-9290fce02e14","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-16T09:54:00.962997302Z"},{"id":"led_b6c222cb-916e-4496-8b35-fdbd0ac74419","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_323210bd-d023-450f-bfad-bf25748ffbd6","createdAt":"2026-11-16T09:54:01.045871804Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc684c21-56f9-49a4-a9e4-8dee5d43cec5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc684c21-56f9-49a4-a9e4-8dee5d43cec5
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc684c21-56f9-49a4-a9e4-8dee5d43cec5
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
correlation: qa-d4045d4e-f7d6-42ae-81d9-942f7a79c549

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4045d4e-f7d6-42ae-81d9-942f7a79c549
Content-Type: application/json

--- request body ---
{"handle":"qa-d38dd41cf600","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4045d4e-f7d6-42ae-81d9-942f7a79c549
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4045d4e-f7d6-42ae-81d9-942f7a79c549"}
```
