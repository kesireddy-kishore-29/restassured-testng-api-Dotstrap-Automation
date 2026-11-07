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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-8ad4e5bb-c451-4095-af33-ae54fe834a70` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-12e71489-3ece-438d-acf9-070dd892996c` |
| 3 | `POST /v1/credits/purchases` | 503 | 15 | `qa-5242fe3f-ffad-4322-9d48-778c5b82c506` |
| 4 | `POST /v1/credits/purchases` | 200 | 9 | `qa-86dccd5b-bcfa-49df-aa9a-cdd99d8c7a1c` |
| 5 | `GET /v1/credits/ledger` | 200 | 16 | `qa-33ae4ea9-4849-4be1-b6d2-4dbe43edfa1e` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c083497a-c5a4-4e53-9ac5-cbe74bde44bf` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-95d90958-90ed-4e58-a92a-c6032a2cf236` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8ad4e5bb-c451-4095-af33-ae54fe834a70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad4e5bb-c451-4095-af33-ae54fe834a70
Content-Type: application/json

--- request body ---
{"handle":"qa-cd3cd96573d2","displayName":"QA cd3cd96573d2","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ad4e5bb-c451-4095-af33-ae54fe834a70
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
Location: /v1/accounts/qa-cd3cd96573d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_246d7da7-c98a-47e0-b050-59c4a07b9ff0","handle":"qa-cd3cd96573d2","displayName":"QA cd3cd96573d2","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.967090973Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-12e71489-3ece-438d-acf9-070dd892996c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12e71489-3ece-438d-acf9-070dd892996c
Content-Type: application/json

--- request body ---
{"handle":"qa-cd3cd96573d2","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-12e71489-3ece-438d-acf9-070dd892996c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_246d7da7-c98a-47e0-b050-59c4a07b9ff0"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5242fe3f-ffad-4322-9d48-778c5b82c506

--- request headers ---
Accept: application/json
Idempotency-Key: qa-86e569ab6b3f402f87d130dcc613d6be
X-Fault-Key: 78810931-1ac4-4f8e-8e77-b95ccaf83fb0
X-Fault: drop-response
X-Correlation-Id: qa-5242fe3f-ffad-4322-9d48-778c5b82c506
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 15 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-5242fe3f-ffad-4322-9d48-778c5b82c506
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
Location: /v1/credits/purchases/pur_95013937-0b56-49df-a02d-b65c5fa157c5
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-5242fe3f-ffad-4322-9d48-778c5b82c506"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-86dccd5b-bcfa-49df-aa9a-cdd99d8c7a1c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-86e569ab6b3f402f87d130dcc613d6be
X-Fault-Key: 78810931-1ac4-4f8e-8e77-b95ccaf83fb0
X-Fault: drop-response
X-Correlation-Id: qa-86dccd5b-bcfa-49df-aa9a-cdd99d8c7a1c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-86dccd5b-bcfa-49df-aa9a-cdd99d8c7a1c
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
Location: /v1/credits/purchases/pur_95013937-0b56-49df-a02d-b65c5fa157c5
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_95013937-0b56-49df-a02d-b65c5fa157c5","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:04.047447729Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-33ae4ea9-4849-4be1-b6d2-4dbe43edfa1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33ae4ea9-4849-4be1-b6d2-4dbe43edfa1e
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-33ae4ea9-4849-4be1-b6d2-4dbe43edfa1e
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

{"items":[{"id":"led_badce474-d39c-4143-828b-33d5bbaff3f7","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-07T08:55:03.967098096Z"},{"id":"led_38802508-1118-43d7-b56c-8e9912ef04b7","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_95013937-0b56-49df-a02d-b65c5fa157c5","createdAt":"2026-11-07T08:55:04.047447729Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c083497a-c5a4-4e53-9ac5-cbe74bde44bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c083497a-c5a4-4e53-9ac5-cbe74bde44bf
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c083497a-c5a4-4e53-9ac5-cbe74bde44bf
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
correlation: qa-95d90958-90ed-4e58-a92a-c6032a2cf236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d90958-90ed-4e58-a92a-c6032a2cf236
Content-Type: application/json

--- request body ---
{"handle":"qa-cd3cd96573d2","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95d90958-90ed-4e58-a92a-c6032a2cf236
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95d90958-90ed-4e58-a92a-c6032a2cf236"}
```
