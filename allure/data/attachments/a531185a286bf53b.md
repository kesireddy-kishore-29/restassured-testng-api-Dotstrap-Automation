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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-61486235-d052-4309-8997-ba8c5740603c` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-fae78ed8-e874-4c48-be4e-9afd89cd289e` |
| 3 | `POST /v1/credits/purchases` | 503 | 12 | `qa-076e4c32-d76e-4de6-ab20-f02d011f278a` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-36907f2e-3f3b-44d0-a09d-ea85cb9e1a6f` |
| 5 | `GET /v1/credits/ledger` | 200 | 10 | `qa-19202202-dde2-4c3a-844a-eee1ce9d374c` |
| 6 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-7292dce3-7f96-44ca-b6b9-635f0cdbb0df` |
| 7 | `POST /v1/auth/token` | 401 | 3 | `qa-5bbdb9d0-1390-4b33-ae3d-8c4f6ab9cddd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-61486235-d052-4309-8997-ba8c5740603c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61486235-d052-4309-8997-ba8c5740603c
Content-Type: application/json

--- request body ---
{"handle":"qa-1dc5e5e39d88","displayName":"QA 1dc5e5e39d88","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-61486235-d052-4309-8997-ba8c5740603c
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
Location: /v1/accounts/qa-1dc5e5e39d88
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f9636e1-a53a-4878-98a3-45e81384858e","handle":"qa-1dc5e5e39d88","displayName":"QA 1dc5e5e39d88","region":"eu","role":"user","createdAt":"2026-11-28T10:37:13.226776016Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fae78ed8-e874-4c48-be4e-9afd89cd289e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fae78ed8-e874-4c48-be4e-9afd89cd289e
Content-Type: application/json

--- request body ---
{"handle":"qa-1dc5e5e39d88","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-fae78ed8-e874-4c48-be4e-9afd89cd289e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f9636e1-a53a-4878-98a3-45e81384858e"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-076e4c32-d76e-4de6-ab20-f02d011f278a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6c0b48b68ee747adaaefce3e33b125b0
X-Fault-Key: 59e53e7b-a085-45f9-8b4a-19a60b9a9a4e
X-Fault: drop-response
X-Correlation-Id: qa-076e4c32-d76e-4de6-ab20-f02d011f278a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-076e4c32-d76e-4de6-ab20-f02d011f278a
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
Location: /v1/credits/purchases/pur_413c9e69-629b-4c38-aa60-bfb27e0c2e9d
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-076e4c32-d76e-4de6-ab20-f02d011f278a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-36907f2e-3f3b-44d0-a09d-ea85cb9e1a6f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6c0b48b68ee747adaaefce3e33b125b0
X-Fault-Key: 59e53e7b-a085-45f9-8b4a-19a60b9a9a4e
X-Fault: drop-response
X-Correlation-Id: qa-36907f2e-3f3b-44d0-a09d-ea85cb9e1a6f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-36907f2e-3f3b-44d0-a09d-ea85cb9e1a6f
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
Location: /v1/credits/purchases/pur_413c9e69-629b-4c38-aa60-bfb27e0c2e9d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_413c9e69-629b-4c38-aa60-bfb27e0c2e9d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:13.269571008Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-19202202-dde2-4c3a-844a-eee1ce9d374c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19202202-dde2-4c3a-844a-eee1ce9d374c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-19202202-dde2-4c3a-844a-eee1ce9d374c
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

{"items":[{"id":"led_26d48273-dcd3-42e7-a8fa-770455974eb4","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-28T10:37:13.226787823Z"},{"id":"led_f7900c49-af28-4a3a-ad32-76f9ff2bf616","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_413c9e69-629b-4c38-aa60-bfb27e0c2e9d","createdAt":"2026-11-28T10:37:13.269571008Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7292dce3-7f96-44ca-b6b9-635f0cdbb0df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7292dce3-7f96-44ca-b6b9-635f0cdbb0df
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7292dce3-7f96-44ca-b6b9-635f0cdbb0df
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
correlation: qa-5bbdb9d0-1390-4b33-ae3d-8c4f6ab9cddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bbdb9d0-1390-4b33-ae3d-8c4f6ab9cddd
Content-Type: application/json

--- request body ---
{"handle":"qa-1dc5e5e39d88","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bbdb9d0-1390-4b33-ae3d-8c4f6ab9cddd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5bbdb9d0-1390-4b33-ae3d-8c4f6ab9cddd"}
```
