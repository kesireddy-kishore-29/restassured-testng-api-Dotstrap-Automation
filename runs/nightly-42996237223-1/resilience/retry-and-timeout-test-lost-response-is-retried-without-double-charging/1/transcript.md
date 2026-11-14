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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-3ebc1818-9aeb-4a99-9f64-6828df203037` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-c5197ec3-22ed-4bf9-a01e-da0a480d5cb8` |
| 3 | `POST /v1/credits/purchases` | 503 | 9 | `qa-c02b2945-cc47-4005-84d5-bc73edf5bfbd` |
| 4 | `POST /v1/credits/purchases` | 200 | 11 | `qa-923abbeb-c9a3-4614-875b-d8a47f19a4da` |
| 5 | `GET /v1/credits/ledger` | 200 | 10 | `qa-9006362c-9c9b-4cda-b3a2-ecbbf2acc4db` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ee69b838-6f3f-45e7-8947-e261a2ca194e` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-68f66f80-aa25-4940-8d00-e2b777685011` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ebc1818-9aeb-4a99-9f64-6828df203037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ebc1818-9aeb-4a99-9f64-6828df203037
Content-Type: application/json

--- request body ---
{"handle":"qa-71ef2e038c08","displayName":"QA 71ef2e038c08","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ebc1818-9aeb-4a99-9f64-6828df203037
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-71ef2e038c08
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43bc8708-f5fa-4bc3-8fe9-1b4e4b6ea892","handle":"qa-71ef2e038c08","displayName":"QA 71ef2e038c08","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.322913918Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c5197ec3-22ed-4bf9-a01e-da0a480d5cb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5197ec3-22ed-4bf9-a01e-da0a480d5cb8
Content-Type: application/json

--- request body ---
{"handle":"qa-71ef2e038c08","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5197ec3-22ed-4bf9-a01e-da0a480d5cb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43bc8708-f5fa-4bc3-8fe9-1b4e4b6ea892"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c02b2945-cc47-4005-84d5-bc73edf5bfbd

--- request headers ---
Accept: application/json
X-Fault: drop-response
X-Fault-Key: e0791f93-c025-4c53-9139-6df6c812b49b
Idempotency-Key: qa-279faa9a42f04762a17b2341ed9bf690
X-Correlation-Id: qa-c02b2945-cc47-4005-84d5-bc73edf5bfbd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-c02b2945-cc47-4005-84d5-bc73edf5bfbd
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
Location: /v1/credits/purchases/pur_c4ee81eb-5c69-4efc-a4ea-ff75587f48fa
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-c02b2945-cc47-4005-84d5-bc73edf5bfbd"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-923abbeb-c9a3-4614-875b-d8a47f19a4da

--- request headers ---
Accept: application/json
X-Fault: drop-response
X-Fault-Key: e0791f93-c025-4c53-9139-6df6c812b49b
Idempotency-Key: qa-279faa9a42f04762a17b2341ed9bf690
X-Correlation-Id: qa-923abbeb-c9a3-4614-875b-d8a47f19a4da
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-923abbeb-c9a3-4614-875b-d8a47f19a4da
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
Location: /v1/credits/purchases/pur_c4ee81eb-5c69-4efc-a4ea-ff75587f48fa
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_c4ee81eb-5c69-4efc-a4ea-ff75587f48fa","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:31.382606763Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9006362c-9c9b-4cda-b3a2-ecbbf2acc4db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9006362c-9c9b-4cda-b3a2-ecbbf2acc4db
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9006362c-9c9b-4cda-b3a2-ecbbf2acc4db
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

{"items":[{"id":"led_191a5759-2c93-4f6f-a6b3-dc3fcb8e9098","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-11T09:34:31.322921939Z"},{"id":"led_0cdddf7a-5b5b-4654-b760-1f9c6217304a","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_c4ee81eb-5c69-4efc-a4ea-ff75587f48fa","createdAt":"2026-11-11T09:34:31.382606763Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee69b838-6f3f-45e7-8947-e261a2ca194e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee69b838-6f3f-45e7-8947-e261a2ca194e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee69b838-6f3f-45e7-8947-e261a2ca194e
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
correlation: qa-68f66f80-aa25-4940-8d00-e2b777685011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f66f80-aa25-4940-8d00-e2b777685011
Content-Type: application/json

--- request body ---
{"handle":"qa-71ef2e038c08","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68f66f80-aa25-4940-8d00-e2b777685011
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68f66f80-aa25-4940-8d00-e2b777685011"}
```
