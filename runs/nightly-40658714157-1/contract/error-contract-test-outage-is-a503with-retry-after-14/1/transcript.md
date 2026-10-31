# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-04eca73d-eb1e-4bbe-a99f-b1f21ee5a283` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-90a0c7ac-cc01-4c8d-b470-7a24dc8205dd` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-34ec15e2-9816-4fea-9e5e-4d84007c6929` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-ba35c5d1-572b-4ef9-a06c-84c818845329` |
| 5 | `GET /v1/credits/ledger` | 503 | 15 | `qa-e1cc95ed-9b89-4c5b-a159-00d6fb7e7007` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-3f87437d-cf8d-4477-8e76-c516ac5193c2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-b261620c-02ea-4bf4-8510-d99426470ade` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-07a609c1-cf38-4333-948a-e8995c07811f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-51f3cc7e-7b4c-4574-8b5c-dc52b9e34946` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-09d9b7e4-3fc8-4890-a4a2-630978015477` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04eca73d-eb1e-4bbe-a99f-b1f21ee5a283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04eca73d-eb1e-4bbe-a99f-b1f21ee5a283
Content-Type: application/json

--- request body ---
{"handle":"qa-310fdfc8b0ba","displayName":"QA 310fdfc8b0ba","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-04eca73d-eb1e-4bbe-a99f-b1f21ee5a283
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Location: /v1/accounts/qa-310fdfc8b0ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_981b7e39-4f99-4c3a-b1f3-1958e7da4a15","handle":"qa-310fdfc8b0ba","displayName":"QA 310fdfc8b0ba","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.047670802Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-90a0c7ac-cc01-4c8d-b470-7a24dc8205dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90a0c7ac-cc01-4c8d-b470-7a24dc8205dd
Content-Type: application/json

--- request body ---
{"handle":"qa-361ff9087043","displayName":"QA 361ff9087043","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-90a0c7ac-cc01-4c8d-b470-7a24dc8205dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Location: /v1/accounts/qa-361ff9087043
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3e32f7b-d6e4-4455-ba9c-548e17c88881","handle":"qa-361ff9087043","displayName":"QA 361ff9087043","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.068637532Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-34ec15e2-9816-4fea-9e5e-4d84007c6929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34ec15e2-9816-4fea-9e5e-4d84007c6929
Content-Type: application/json

--- request body ---
{"handle":"qa-310fdfc8b0ba","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-34ec15e2-9816-4fea-9e5e-4d84007c6929
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_981b7e39-4f99-4c3a-b1f3-1958e7da4a15"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ba35c5d1-572b-4ef9-a06c-84c818845329

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba35c5d1-572b-4ef9-a06c-84c818845329
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-361ff9087043","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba35c5d1-572b-4ef9-a06c-84c818845329
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
Location: /v1/conversations/cnv_a4e31f73-5d5e-425b-80ab-5aac06392693
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a4e31f73-5d5e-425b-80ab-5aac06392693","subject":"Error contract","status":"open","region":"eu","participants":["qa-310fdfc8b0ba","qa-361ff9087043"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.107301737Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-e1cc95ed-9b89-4c5b-a159-00d6fb7e7007

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: de8c88d9-4c5d-460a-98bb-23078d5af49a
X-Correlation-Id: qa-e1cc95ed-9b89-4c5b-a159-00d6fb7e7007
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1cc95ed-9b89-4c5b-a159-00d6fb7e7007
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-e1cc95ed-9b89-4c5b-a159-00d6fb7e7007"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3f87437d-cf8d-4477-8e76-c516ac5193c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f87437d-cf8d-4477-8e76-c516ac5193c2
Content-Type: application/json

--- request body ---
{"handle":"qa-361ff9087043","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f87437d-cf8d-4477-8e76-c516ac5193c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3e32f7b-d6e4-4455-ba9c-548e17c88881"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b261620c-02ea-4bf4-8510-d99426470ade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b261620c-02ea-4bf4-8510-d99426470ade
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b261620c-02ea-4bf4-8510-d99426470ade
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-07a609c1-cf38-4333-948a-e8995c07811f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07a609c1-cf38-4333-948a-e8995c07811f
Content-Type: application/json

--- request body ---
{"handle":"qa-361ff9087043","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07a609c1-cf38-4333-948a-e8995c07811f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07a609c1-cf38-4333-948a-e8995c07811f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-51f3cc7e-7b4c-4574-8b5c-dc52b9e34946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51f3cc7e-7b4c-4574-8b5c-dc52b9e34946
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-51f3cc7e-7b4c-4574-8b5c-dc52b9e34946
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-09d9b7e4-3fc8-4890-a4a2-630978015477

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09d9b7e4-3fc8-4890-a4a2-630978015477
Content-Type: application/json

--- request body ---
{"handle":"qa-310fdfc8b0ba","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09d9b7e4-3fc8-4890-a4a2-630978015477
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09d9b7e4-3fc8-4890-a4a2-630978015477"}
```
