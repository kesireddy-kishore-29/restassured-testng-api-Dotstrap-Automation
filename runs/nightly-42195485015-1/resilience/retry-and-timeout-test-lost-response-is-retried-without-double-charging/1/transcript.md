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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-b4580e9e-9b70-4c17-8b13-1acb5d85a9c7` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-7045c893-48c8-48ea-9744-5b5a64554d00` |
| 3 | `POST /v1/credits/purchases` | 503 | 23 | `qa-ce5d1975-09c0-46c3-8036-7353f0d115b8` |
| 4 | `POST /v1/credits/purchases` | 200 | 10 | `qa-c35ba9d1-a889-4e82-8e4e-ccd56ac75a50` |
| 5 | `GET /v1/credits/ledger` | 200 | 16 | `qa-f850af8e-7b5d-4eec-bd22-6e27ae56afa1` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-bb6b09d0-ff7a-4769-9890-26bc94ecce93` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-c21c8ca5-a443-4903-8fa1-2d70fe502ef1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b4580e9e-9b70-4c17-8b13-1acb5d85a9c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4580e9e-9b70-4c17-8b13-1acb5d85a9c7
Content-Type: application/json

--- request body ---
{"handle":"qa-0a89d7d9fb8f","displayName":"QA 0a89d7d9fb8f","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4580e9e-9b70-4c17-8b13-1acb5d85a9c7
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
Location: /v1/accounts/qa-0a89d7d9fb8f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5372675a-9355-4871-9db3-579d176773e2","handle":"qa-0a89d7d9fb8f","displayName":"QA 0a89d7d9fb8f","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.292299441Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7045c893-48c8-48ea-9744-5b5a64554d00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7045c893-48c8-48ea-9744-5b5a64554d00
Content-Type: application/json

--- request body ---
{"handle":"qa-0a89d7d9fb8f","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7045c893-48c8-48ea-9744-5b5a64554d00
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5372675a-9355-4871-9db3-579d176773e2"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ce5d1975-09c0-46c3-8036-7353f0d115b8

--- request headers ---
Accept: application/json
X-Fault-Key: 2033f833-1802-4b2a-9bc6-e495553048e9
X-Fault: drop-response
Idempotency-Key: qa-024048bf618f4059a277024dc8b83aa2
X-Correlation-Id: qa-ce5d1975-09c0-46c3-8036-7353f0d115b8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-ce5d1975-09c0-46c3-8036-7353f0d115b8
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
Location: /v1/credits/purchases/pur_7c664ed5-919b-4270-8cff-13208616d8b0
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-ce5d1975-09c0-46c3-8036-7353f0d115b8"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c35ba9d1-a889-4e82-8e4e-ccd56ac75a50

--- request headers ---
Accept: application/json
X-Fault-Key: 2033f833-1802-4b2a-9bc6-e495553048e9
X-Fault: drop-response
Idempotency-Key: qa-024048bf618f4059a277024dc8b83aa2
X-Correlation-Id: qa-c35ba9d1-a889-4e82-8e4e-ccd56ac75a50
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c35ba9d1-a889-4e82-8e4e-ccd56ac75a50
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
Location: /v1/credits/purchases/pur_7c664ed5-919b-4270-8cff-13208616d8b0
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_7c664ed5-919b-4270-8cff-13208616d8b0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:32.373217881Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-f850af8e-7b5d-4eec-bd22-6e27ae56afa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f850af8e-7b5d-4eec-bd22-6e27ae56afa1
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f850af8e-7b5d-4eec-bd22-6e27ae56afa1
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

{"items":[{"id":"led_985db587-ba55-4c9d-9b2b-6a4acec27bf0","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-06T09:30:32.292305422Z"},{"id":"led_b8786b5c-0b23-4646-a612-a96c7dd34b21","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_7c664ed5-919b-4270-8cff-13208616d8b0","createdAt":"2026-11-06T09:30:32.373217881Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb6b09d0-ff7a-4769-9890-26bc94ecce93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb6b09d0-ff7a-4769-9890-26bc94ecce93
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb6b09d0-ff7a-4769-9890-26bc94ecce93
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
correlation: qa-c21c8ca5-a443-4903-8fa1-2d70fe502ef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c21c8ca5-a443-4903-8fa1-2d70fe502ef1
Content-Type: application/json

--- request body ---
{"handle":"qa-0a89d7d9fb8f","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c21c8ca5-a443-4903-8fa1-2d70fe502ef1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c21c8ca5-a443-4903-8fa1-2d70fe502ef1"}
```
