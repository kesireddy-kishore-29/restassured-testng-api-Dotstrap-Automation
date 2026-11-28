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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-15841eac-e40f-4e89-bb3c-56e833a8f96e` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-cd96459d-d0f4-4b7e-915c-cfc5d99c73e7` |
| 3 | `POST /v1/credits/purchases` | 503 | 21 | `qa-d3eb80c2-8862-4eee-abd2-48333e992cbd` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-97f9ec12-9368-4a19-a96b-f2f461afba30` |
| 5 | `GET /v1/credits/ledger` | 200 | 23 | `qa-a8e09f4b-fd4f-4752-b123-e3e0e4c1ea6b` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-eba0a749-a56a-4e21-b93e-1b21df2bb0ec` |
| 7 | `POST /v1/auth/token` | 401 | 19 | `qa-bda4ad6c-79d9-4257-af9c-540854f33021` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15841eac-e40f-4e89-bb3c-56e833a8f96e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15841eac-e40f-4e89-bb3c-56e833a8f96e
Content-Type: application/json

--- request body ---
{"handle":"qa-c5bc86d78c2a","displayName":"QA c5bc86d78c2a","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-15841eac-e40f-4e89-bb3c-56e833a8f96e
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
Location: /v1/accounts/qa-c5bc86d78c2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f11a3e7-5955-4e1a-9e9b-e96526ea406e","handle":"qa-c5bc86d78c2a","displayName":"QA c5bc86d78c2a","region":"eu","role":"user","createdAt":"2026-11-22T09:54:54.173739317Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cd96459d-d0f4-4b7e-915c-cfc5d99c73e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd96459d-d0f4-4b7e-915c-cfc5d99c73e7
Content-Type: application/json

--- request body ---
{"handle":"qa-c5bc86d78c2a","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd96459d-d0f4-4b7e-915c-cfc5d99c73e7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f11a3e7-5955-4e1a-9e9b-e96526ea406e"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d3eb80c2-8862-4eee-abd2-48333e992cbd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1e002c5192d94f5e9f9ce4b3ca7dc6c8
X-Fault: drop-response
X-Fault-Key: 38906d8d-f7d7-44ea-8700-885e0ab49dcb
X-Correlation-Id: qa-d3eb80c2-8862-4eee-abd2-48333e992cbd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-d3eb80c2-8862-4eee-abd2-48333e992cbd
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
Location: /v1/credits/purchases/pur_0f01c05a-be7e-4c0f-854e-992b8335a8ab
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-d3eb80c2-8862-4eee-abd2-48333e992cbd"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-97f9ec12-9368-4a19-a96b-f2f461afba30

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1e002c5192d94f5e9f9ce4b3ca7dc6c8
X-Fault: drop-response
X-Fault-Key: 38906d8d-f7d7-44ea-8700-885e0ab49dcb
X-Correlation-Id: qa-97f9ec12-9368-4a19-a96b-f2f461afba30
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-97f9ec12-9368-4a19-a96b-f2f461afba30
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
Location: /v1/credits/purchases/pur_0f01c05a-be7e-4c0f-854e-992b8335a8ab
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_0f01c05a-be7e-4c0f-854e-992b8335a8ab","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:54.265073943Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a8e09f4b-fd4f-4752-b123-e3e0e4c1ea6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8e09f4b-fd4f-4752-b123-e3e0e4c1ea6b
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8e09f4b-fd4f-4752-b123-e3e0e4c1ea6b
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

{"items":[{"id":"led_5a0dd0e7-fca6-49a2-b4b5-a03c43ee8aa5","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-22T09:54:54.173753463Z"},{"id":"led_cef57eb4-045c-4ce3-b9b8-cc29668a42f8","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_0f01c05a-be7e-4c0f-854e-992b8335a8ab","createdAt":"2026-11-22T09:54:54.265073943Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eba0a749-a56a-4e21-b93e-1b21df2bb0ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eba0a749-a56a-4e21-b93e-1b21df2bb0ec
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eba0a749-a56a-4e21-b93e-1b21df2bb0ec
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
correlation: qa-bda4ad6c-79d9-4257-af9c-540854f33021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bda4ad6c-79d9-4257-af9c-540854f33021
Content-Type: application/json

--- request body ---
{"handle":"qa-c5bc86d78c2a","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bda4ad6c-79d9-4257-af9c-540854f33021
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bda4ad6c-79d9-4257-af9c-540854f33021"}
```
