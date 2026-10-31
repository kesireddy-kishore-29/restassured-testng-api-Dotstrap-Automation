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
| 1 | `POST /v1/accounts` | 201 | 308 | `qa-d418acb2-8ec0-4977-ab82-5f22fc600cce` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-52e9b0ba-2b83-4ffc-af7a-f8bb9ecbea9d` |
| 3 | `POST /v1/credits/purchases` | 503 | 59 | `qa-df36aec4-d90e-441d-b92b-f35ebc28d5e8` |
| 4 | `POST /v1/credits/purchases` | 200 | 3 | `qa-d328567f-86de-4551-8415-0ace0d9872fe` |
| 5 | `GET /v1/credits/ledger` | 200 | 10 | `qa-2c5c064e-9065-4a0c-95f1-c8fc876a7118` |
| 6 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-2b863ca5-383a-4d02-9eb0-5e4b45d524e3` |
| 7 | `POST /v1/auth/token` | 401 | 3 | `qa-195317ae-6163-4e41-b6ad-5d43dd3d1c98` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d418acb2-8ec0-4977-ab82-5f22fc600cce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d418acb2-8ec0-4977-ab82-5f22fc600cce
Content-Type: application/json

--- request body ---
{"handle":"qa-88857393bb43","displayName":"QA 88857393bb43","password":"****","region":"eu"}

--- response: 201 in 308 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-d418acb2-8ec0-4977-ab82-5f22fc600cce
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
Location: /v1/accounts/qa-88857393bb43
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af062f34-7bc4-4d0a-bdd3-2e67d4dcb566","handle":"qa-88857393bb43","displayName":"QA 88857393bb43","region":"eu","role":"user","createdAt":"2026-10-31T08:31:29.543077828Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-52e9b0ba-2b83-4ffc-af7a-f8bb9ecbea9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52e9b0ba-2b83-4ffc-af7a-f8bb9ecbea9d
Content-Type: application/json

--- request body ---
{"handle":"qa-88857393bb43","password":"****"}

--- response: 200 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-52e9b0ba-2b83-4ffc-af7a-f8bb9ecbea9d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af062f34-7bc4-4d0a-bdd3-2e67d4dcb566"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-df36aec4-d90e-441d-b92b-f35ebc28d5e8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-179796df2caf44e1bee975bd86ca797a
X-Fault-Key: afada95c-c3e3-42d8-97e4-806fcdda5551
X-Fault: drop-response
X-Correlation-Id: qa-df36aec4-d90e-441d-b92b-f35ebc28d5e8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 59 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-df36aec4-d90e-441d-b92b-f35ebc28d5e8
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
Location: /v1/credits/purchases/pur_1e9aab98-f9c2-402f-83a6-716bb1ca084c
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-df36aec4-d90e-441d-b92b-f35ebc28d5e8"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d328567f-86de-4551-8415-0ace0d9872fe

--- request headers ---
Accept: application/json
Idempotency-Key: qa-179796df2caf44e1bee975bd86ca797a
X-Fault-Key: afada95c-c3e3-42d8-97e4-806fcdda5551
X-Fault: drop-response
X-Correlation-Id: qa-d328567f-86de-4551-8415-0ace0d9872fe
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d328567f-86de-4551-8415-0ace0d9872fe
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
Location: /v1/credits/purchases/pur_1e9aab98-f9c2-402f-83a6-716bb1ca084c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_1e9aab98-f9c2-402f-83a6-716bb1ca084c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:29.954679138Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-2c5c064e-9065-4a0c-95f1-c8fc876a7118

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c5c064e-9065-4a0c-95f1-c8fc876a7118
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c5c064e-9065-4a0c-95f1-c8fc876a7118
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

{"items":[{"id":"led_43fad4f3-4c8d-4eb4-8a9c-3937f9431deb","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-31T08:31:29.543101593Z"},{"id":"led_0167daa9-f7a8-41f8-9763-72e1b0b1ddb9","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_1e9aab98-f9c2-402f-83a6-716bb1ca084c","createdAt":"2026-10-31T08:31:29.954679138Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b863ca5-383a-4d02-9eb0-5e4b45d524e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b863ca5-383a-4d02-9eb0-5e4b45d524e3
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b863ca5-383a-4d02-9eb0-5e4b45d524e3
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
correlation: qa-195317ae-6163-4e41-b6ad-5d43dd3d1c98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-195317ae-6163-4e41-b6ad-5d43dd3d1c98
Content-Type: application/json

--- request body ---
{"handle":"qa-88857393bb43","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-195317ae-6163-4e41-b6ad-5d43dd3d1c98
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-195317ae-6163-4e41-b6ad-5d43dd3d1c98"}
```
