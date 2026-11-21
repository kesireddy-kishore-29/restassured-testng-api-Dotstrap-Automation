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
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-9dcdb2c8-f733-4def-9805-7e4766a6a6e4` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-a81c2b6a-86cd-467e-890f-be68c5f71859` |
| 3 | `POST /v1/credits/purchases` | 503 | 13 | `qa-0e8eb2e4-f96b-4be8-867a-2daf3a6917c5` |
| 4 | `POST /v1/credits/purchases` | 200 | 9 | `qa-72577ed9-c40f-4a32-9658-d13342fa0e33` |
| 5 | `GET /v1/credits/ledger` | 200 | 21 | `qa-e4aae146-1b44-4eae-a835-52e82fcbbf59` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-b577c10d-b1eb-4161-8a83-0a8e2e8bfc5a` |
| 7 | `POST /v1/auth/token` | 401 | 9 | `qa-261465f7-ba82-4f4d-b492-c108e3dd40db` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9dcdb2c8-f733-4def-9805-7e4766a6a6e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dcdb2c8-f733-4def-9805-7e4766a6a6e4
Content-Type: application/json

--- request body ---
{"handle":"qa-42544dce1f5b","displayName":"QA 42544dce1f5b","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dcdb2c8-f733-4def-9805-7e4766a6a6e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-42544dce1f5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9612450-6905-44d1-83c6-9b537536b57d","handle":"qa-42544dce1f5b","displayName":"QA 42544dce1f5b","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.365299385Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a81c2b6a-86cd-467e-890f-be68c5f71859

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a81c2b6a-86cd-467e-890f-be68c5f71859
Content-Type: application/json

--- request body ---
{"handle":"qa-42544dce1f5b","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-a81c2b6a-86cd-467e-890f-be68c5f71859
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9612450-6905-44d1-83c6-9b537536b57d"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0e8eb2e4-f96b-4be8-867a-2daf3a6917c5

--- request headers ---
Accept: application/json
X-Fault: drop-response
X-Fault-Key: c93eec20-a959-45ae-8df7-038de5ebedc9
Idempotency-Key: qa-45cf815ffc994980ae0bc85a4dd8dbe6
X-Correlation-Id: qa-0e8eb2e4-f96b-4be8-867a-2daf3a6917c5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-0e8eb2e4-f96b-4be8-867a-2daf3a6917c5
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
Location: /v1/credits/purchases/pur_2c435865-d079-4bf6-b6c3-d97003b78d93
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-0e8eb2e4-f96b-4be8-867a-2daf3a6917c5"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-72577ed9-c40f-4a32-9658-d13342fa0e33

--- request headers ---
Accept: application/json
X-Fault: drop-response
X-Fault-Key: c93eec20-a959-45ae-8df7-038de5ebedc9
Idempotency-Key: qa-45cf815ffc994980ae0bc85a4dd8dbe6
X-Correlation-Id: qa-72577ed9-c40f-4a32-9658-d13342fa0e33
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-72577ed9-c40f-4a32-9658-d13342fa0e33
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
Location: /v1/credits/purchases/pur_2c435865-d079-4bf6-b6c3-d97003b78d93
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_2c435865-d079-4bf6-b6c3-d97003b78d93","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:18.440036511Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-e4aae146-1b44-4eae-a835-52e82fcbbf59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4aae146-1b44-4eae-a835-52e82fcbbf59
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4aae146-1b44-4eae-a835-52e82fcbbf59
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

{"items":[{"id":"led_0ef71928-4634-4974-9d26-9bd0b99691ab","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-17T10:50:18.365312189Z"},{"id":"led_dca04752-378b-4814-a883-346037852958","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_2c435865-d079-4bf6-b6c3-d97003b78d93","createdAt":"2026-11-17T10:50:18.440036511Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b577c10d-b1eb-4161-8a83-0a8e2e8bfc5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b577c10d-b1eb-4161-8a83-0a8e2e8bfc5a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b577c10d-b1eb-4161-8a83-0a8e2e8bfc5a
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
correlation: qa-261465f7-ba82-4f4d-b492-c108e3dd40db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-261465f7-ba82-4f4d-b492-c108e3dd40db
Content-Type: application/json

--- request body ---
{"handle":"qa-42544dce1f5b","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-261465f7-ba82-4f4d-b492-c108e3dd40db
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-261465f7-ba82-4f4d-b492-c108e3dd40db"}
```
