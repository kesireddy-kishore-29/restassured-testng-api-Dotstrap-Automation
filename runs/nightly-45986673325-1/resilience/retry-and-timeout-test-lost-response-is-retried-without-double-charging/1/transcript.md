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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-dc39e385-03ac-4b5f-9d7b-ac30fc8a7c2a` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-7cef1662-9827-4955-88af-1cfa8f7802ac` |
| 3 | `POST /v1/credits/purchases` | 503 | 8 | `qa-d8bcf98d-b582-4d05-950c-85cb58a9631a` |
| 4 | `POST /v1/credits/purchases` | 200 | 10 | `qa-68d6f760-d9a8-4032-9878-9e67f32646b4` |
| 5 | `GET /v1/credits/ledger` | 200 | 10 | `qa-2cb384ae-841f-48f7-939b-b0041ddd95d6` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2e559176-6ce8-461e-a32a-483e15a0511d` |
| 7 | `POST /v1/auth/token` | 401 | 4 | `qa-627df8ed-fd7b-4f09-8815-803c5e4b581a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dc39e385-03ac-4b5f-9d7b-ac30fc8a7c2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc39e385-03ac-4b5f-9d7b-ac30fc8a7c2a
Content-Type: application/json

--- request body ---
{"handle":"qa-035b0f248bdc","displayName":"QA 035b0f248bdc","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc39e385-03ac-4b5f-9d7b-ac30fc8a7c2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-035b0f248bdc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc95bf67-0b32-4ae8-a778-0d6b63b7d2bb","handle":"qa-035b0f248bdc","displayName":"QA 035b0f248bdc","region":"eu","role":"user","createdAt":"2026-11-27T10:59:48.978526769Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7cef1662-9827-4955-88af-1cfa8f7802ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cef1662-9827-4955-88af-1cfa8f7802ac
Content-Type: application/json

--- request body ---
{"handle":"qa-035b0f248bdc","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cef1662-9827-4955-88af-1cfa8f7802ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc95bf67-0b32-4ae8-a778-0d6b63b7d2bb"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d8bcf98d-b582-4d05-950c-85cb58a9631a

--- request headers ---
Accept: application/json
X-Fault-Key: 21be4fd9-aedd-4161-a696-775f97c7b3d3
X-Fault: drop-response
Idempotency-Key: qa-fcf9520f5c20460287b2c6d5e998d6bb
X-Correlation-Id: qa-d8bcf98d-b582-4d05-950c-85cb58a9631a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:49 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-d8bcf98d-b582-4d05-950c-85cb58a9631a
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
Location: /v1/credits/purchases/pur_4b1d432b-d505-464d-bc3e-f47e98f1f840
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-d8bcf98d-b582-4d05-950c-85cb58a9631a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-68d6f760-d9a8-4032-9878-9e67f32646b4

--- request headers ---
Accept: application/json
X-Fault-Key: 21be4fd9-aedd-4161-a696-775f97c7b3d3
X-Fault: drop-response
Idempotency-Key: qa-fcf9520f5c20460287b2c6d5e998d6bb
X-Correlation-Id: qa-68d6f760-d9a8-4032-9878-9e67f32646b4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-68d6f760-d9a8-4032-9878-9e67f32646b4
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
Location: /v1/credits/purchases/pur_4b1d432b-d505-464d-bc3e-f47e98f1f840
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_4b1d432b-d505-464d-bc3e-f47e98f1f840","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:49.031147625Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-2cb384ae-841f-48f7-939b-b0041ddd95d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cb384ae-841f-48f7-939b-b0041ddd95d6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cb384ae-841f-48f7-939b-b0041ddd95d6
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

{"items":[{"id":"led_61187fe6-2a03-4c1b-8d9b-b42b62b13f38","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-27T10:59:48.978538176Z"},{"id":"led_0ae01e99-227c-4cee-82c1-a84458c9cb8a","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_4b1d432b-d505-464d-bc3e-f47e98f1f840","createdAt":"2026-11-27T10:59:49.031147625Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e559176-6ce8-461e-a32a-483e15a0511d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e559176-6ce8-461e-a32a-483e15a0511d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e559176-6ce8-461e-a32a-483e15a0511d
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
correlation: qa-627df8ed-fd7b-4f09-8815-803c5e4b581a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-627df8ed-fd7b-4f09-8815-803c5e4b581a
Content-Type: application/json

--- request body ---
{"handle":"qa-035b0f248bdc","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-627df8ed-fd7b-4f09-8815-803c5e4b581a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-627df8ed-fd7b-4f09-8815-803c5e4b581a"}
```
