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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-4117ce40-4021-4f90-a3e9-fc29d0caf75f` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-4375f01d-1d00-4bbd-8aa5-ebb034315dbe` |
| 3 | `POST /v1/credits/purchases` | 503 | 8 | `qa-b3ed4e86-f0c6-4c83-a391-2856d2f4949d` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-98758b3b-5c90-4de0-8a42-85bd334037c7` |
| 5 | `GET /v1/credits/ledger` | 200 | 39 | `qa-ef65d820-2409-465f-a398-68b7702c8811` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f4c43bb0-a5eb-4a79-a392-52509d87c2c9` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-d291da1e-3aee-4850-9d6c-8adfe4fa193a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4117ce40-4021-4f90-a3e9-fc29d0caf75f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4117ce40-4021-4f90-a3e9-fc29d0caf75f
Content-Type: application/json

--- request body ---
{"handle":"qa-a65f9eba71f7","displayName":"QA a65f9eba71f7","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-4117ce40-4021-4f90-a3e9-fc29d0caf75f
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
Location: /v1/accounts/qa-a65f9eba71f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b364612b-63e6-4bcd-8578-3d5e9554f67b","handle":"qa-a65f9eba71f7","displayName":"QA a65f9eba71f7","region":"eu","role":"user","createdAt":"2026-11-25T11:27:50.459823193Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4375f01d-1d00-4bbd-8aa5-ebb034315dbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4375f01d-1d00-4bbd-8aa5-ebb034315dbe
Content-Type: application/json

--- request body ---
{"handle":"qa-a65f9eba71f7","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-4375f01d-1d00-4bbd-8aa5-ebb034315dbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b364612b-63e6-4bcd-8578-3d5e9554f67b"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b3ed4e86-f0c6-4c83-a391-2856d2f4949d

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-daacca60540f4a2c9560386411c66951
X-Fault-Key: 514958b8-4e30-4645-935f-19df956958cd
X-Correlation-Id: qa-b3ed4e86-f0c6-4c83-a391-2856d2f4949d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-b3ed4e86-f0c6-4c83-a391-2856d2f4949d
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
Location: /v1/credits/purchases/pur_49f58169-9d5e-4476-938f-7cc98870450d
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-b3ed4e86-f0c6-4c83-a391-2856d2f4949d"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-98758b3b-5c90-4de0-8a42-85bd334037c7

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-daacca60540f4a2c9560386411c66951
X-Fault-Key: 514958b8-4e30-4645-935f-19df956958cd
X-Correlation-Id: qa-98758b3b-5c90-4de0-8a42-85bd334037c7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-98758b3b-5c90-4de0-8a42-85bd334037c7
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
Location: /v1/credits/purchases/pur_49f58169-9d5e-4476-938f-7cc98870450d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_49f58169-9d5e-4476-938f-7cc98870450d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:50.511701566Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ef65d820-2409-465f-a398-68b7702c8811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef65d820-2409-465f-a398-68b7702c8811
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef65d820-2409-465f-a398-68b7702c8811
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

{"items":[{"id":"led_cb31952f-7d64-4b8d-9edb-3982a6aba25a","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-25T11:27:50.459831989Z"},{"id":"led_625f18ad-cab0-4ad1-a203-df847f7b86ca","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_49f58169-9d5e-4476-938f-7cc98870450d","createdAt":"2026-11-25T11:27:50.511701566Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f4c43bb0-a5eb-4a79-a392-52509d87c2c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4c43bb0-a5eb-4a79-a392-52509d87c2c9
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f4c43bb0-a5eb-4a79-a392-52509d87c2c9
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
correlation: qa-d291da1e-3aee-4850-9d6c-8adfe4fa193a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d291da1e-3aee-4850-9d6c-8adfe4fa193a
Content-Type: application/json

--- request body ---
{"handle":"qa-a65f9eba71f7","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d291da1e-3aee-4850-9d6c-8adfe4fa193a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d291da1e-3aee-4850-9d6c-8adfe4fa193a"}
```
