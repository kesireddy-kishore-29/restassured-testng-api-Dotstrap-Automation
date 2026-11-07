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
| 1 | `POST /v1/accounts` | 201 | 295 | `qa-77576a33-ce03-4680-bac7-f15b2126da81` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-401e6bf0-97bc-49ec-8ee9-07b35944e44e` |
| 3 | `POST /v1/credits/purchases` | 503 | 76 | `qa-e9112957-b264-4bdc-ac7f-ab2a1be562f6` |
| 4 | `POST /v1/credits/purchases` | 200 | 5 | `qa-1489e873-f71c-4039-80b5-012b59b9d6a7` |
| 5 | `GET /v1/credits/ledger` | 200 | 13 | `qa-b9f46f87-eed6-45cf-aeb6-62712e15d06e` |
| 6 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-d8b97903-661f-45e1-b411-c8846dde0f73` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-f299bec7-39b5-4cc5-915b-e965a87ad3a4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-77576a33-ce03-4680-bac7-f15b2126da81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77576a33-ce03-4680-bac7-f15b2126da81
Content-Type: application/json

--- request body ---
{"handle":"qa-bb312261abcb","displayName":"QA bb312261abcb","password":"****","region":"eu"}

--- response: 201 in 295 ms ---
Date: Thu, 05 Nov 2026 09:37:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-77576a33-ce03-4680-bac7-f15b2126da81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-bb312261abcb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c7bdfa9-c1a3-4b8f-9e66-28d7e8b23de1","handle":"qa-bb312261abcb","displayName":"QA bb312261abcb","region":"eu","role":"user","createdAt":"2026-11-05T09:37:42.682976049Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-401e6bf0-97bc-49ec-8ee9-07b35944e44e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-401e6bf0-97bc-49ec-8ee9-07b35944e44e
Content-Type: application/json

--- request body ---
{"handle":"qa-bb312261abcb","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-401e6bf0-97bc-49ec-8ee9-07b35944e44e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c7bdfa9-c1a3-4b8f-9e66-28d7e8b23de1"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e9112957-b264-4bdc-ac7f-ab2a1be562f6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c629062a70fc459fb1c80f9298f9481a
X-Fault: drop-response
X-Fault-Key: 45b8dda7-ec02-4a5f-af3c-9455261237c2
X-Correlation-Id: qa-e9112957-b264-4bdc-ac7f-ab2a1be562f6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 76 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-e9112957-b264-4bdc-ac7f-ab2a1be562f6
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
Location: /v1/credits/purchases/pur_61357b49-6d33-4ef9-8286-d517d9faa44b
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-e9112957-b264-4bdc-ac7f-ab2a1be562f6"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1489e873-f71c-4039-80b5-012b59b9d6a7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c629062a70fc459fb1c80f9298f9481a
X-Fault: drop-response
X-Fault-Key: 45b8dda7-ec02-4a5f-af3c-9455261237c2
X-Correlation-Id: qa-1489e873-f71c-4039-80b5-012b59b9d6a7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-1489e873-f71c-4039-80b5-012b59b9d6a7
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
Location: /v1/credits/purchases/pur_61357b49-6d33-4ef9-8286-d517d9faa44b
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_61357b49-6d33-4ef9-8286-d517d9faa44b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.132149844Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b9f46f87-eed6-45cf-aeb6-62712e15d06e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9f46f87-eed6-45cf-aeb6-62712e15d06e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9f46f87-eed6-45cf-aeb6-62712e15d06e
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

{"items":[{"id":"led_d0e7b07d-5906-4c57-8408-5794706a6a4c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-05T09:37:42.682981707Z"},{"id":"led_8215bac0-3aee-4c7b-84a8-e05d4088341e","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_61357b49-6d33-4ef9-8286-d517d9faa44b","createdAt":"2026-11-05T09:37:43.132149844Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8b97903-661f-45e1-b411-c8846dde0f73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8b97903-661f-45e1-b411-c8846dde0f73
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8b97903-661f-45e1-b411-c8846dde0f73
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
correlation: qa-f299bec7-39b5-4cc5-915b-e965a87ad3a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f299bec7-39b5-4cc5-915b-e965a87ad3a4
Content-Type: application/json

--- request body ---
{"handle":"qa-bb312261abcb","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f299bec7-39b5-4cc5-915b-e965a87ad3a4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f299bec7-39b5-4cc5-915b-e965a87ad3a4"}
```
