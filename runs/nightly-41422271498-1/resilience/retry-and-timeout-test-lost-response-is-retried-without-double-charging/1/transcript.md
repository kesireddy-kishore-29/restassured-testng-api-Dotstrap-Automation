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
| 1 | `POST /v1/accounts` | 201 | 439 | `qa-0b4c66c3-f508-4737-801f-e0c81db0aa39` |
| 2 | `POST /v1/auth/token` | 200 | 114 | `qa-cd54f698-3a30-4eee-ba32-c4f20d9a3a8f` |
| 3 | `POST /v1/credits/purchases` | 503 | 94 | `qa-95656287-48b5-468f-b680-40cd275f4636` |
| 4 | `POST /v1/credits/purchases` | 200 | 14 | `qa-552f13e3-4a43-47a7-977f-28c0beb62d07` |
| 5 | `GET /v1/credits/ledger` | 200 | 15 | `qa-4aaefd1b-b478-4139-b0c8-54e6e367aff4` |
| 6 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-63bda007-8735-4272-9f66-9ed2696f657c` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-be7e1266-8a34-41eb-a59b-5c37f58b783f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0b4c66c3-f508-4737-801f-e0c81db0aa39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b4c66c3-f508-4737-801f-e0c81db0aa39
Content-Type: application/json

--- request body ---
{"handle":"qa-60e8c54e98da","displayName":"QA 60e8c54e98da","password":"****","region":"eu"}

--- response: 201 in 439 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b4c66c3-f508-4737-801f-e0c81db0aa39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-60e8c54e98da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_42250bf9-5263-4dca-818b-76d7a15d260c","handle":"qa-60e8c54e98da","displayName":"QA 60e8c54e98da","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.005277847Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cd54f698-3a30-4eee-ba32-c4f20d9a3a8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd54f698-3a30-4eee-ba32-c4f20d9a3a8f
Content-Type: application/json

--- request body ---
{"handle":"qa-60e8c54e98da","password":"****"}

--- response: 200 in 114 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd54f698-3a30-4eee-ba32-c4f20d9a3a8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_42250bf9-5263-4dca-818b-76d7a15d260c"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-95656287-48b5-468f-b680-40cd275f4636

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a65ac998a6ce4305a6d8b2f2db7f6027
X-Fault-Key: e6942e35-14a0-4db6-8d40-a2e4b667c8e5
X-Fault: drop-response
X-Correlation-Id: qa-95656287-48b5-468f-b680-40cd275f4636
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 94 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-95656287-48b5-468f-b680-40cd275f4636
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
Location: /v1/credits/purchases/pur_3450fbcb-d1ab-477a-8e9d-26ec4f95597c
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-95656287-48b5-468f-b680-40cd275f4636"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-552f13e3-4a43-47a7-977f-28c0beb62d07

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a65ac998a6ce4305a6d8b2f2db7f6027
X-Fault-Key: e6942e35-14a0-4db6-8d40-a2e4b667c8e5
X-Fault: drop-response
X-Correlation-Id: qa-552f13e3-4a43-47a7-977f-28c0beb62d07
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-552f13e3-4a43-47a7-977f-28c0beb62d07
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
Location: /v1/credits/purchases/pur_3450fbcb-d1ab-477a-8e9d-26ec4f95597c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3450fbcb-d1ab-477a-8e9d-26ec4f95597c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:43.691758083Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4aaefd1b-b478-4139-b0c8-54e6e367aff4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aaefd1b-b478-4139-b0c8-54e6e367aff4
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aaefd1b-b478-4139-b0c8-54e6e367aff4
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

{"items":[{"id":"led_da73cd54-6c1c-4285-a2bf-e6d60b0d9525","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-02T09:38:43.005634357Z"},{"id":"led_3c825382-be06-4b05-b53f-464785275707","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_3450fbcb-d1ab-477a-8e9d-26ec4f95597c","createdAt":"2026-11-02T09:38:43.691758083Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63bda007-8735-4272-9f66-9ed2696f657c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63bda007-8735-4272-9f66-9ed2696f657c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63bda007-8735-4272-9f66-9ed2696f657c
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
correlation: qa-be7e1266-8a34-41eb-a59b-5c37f58b783f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be7e1266-8a34-41eb-a59b-5c37f58b783f
Content-Type: application/json

--- request body ---
{"handle":"qa-60e8c54e98da","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be7e1266-8a34-41eb-a59b-5c37f58b783f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be7e1266-8a34-41eb-a59b-5c37f58b783f"}
```
