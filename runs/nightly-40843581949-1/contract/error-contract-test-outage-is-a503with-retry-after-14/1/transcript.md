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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-bb7928de-b225-4985-beaf-1f740fc6b909` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-61dd8cea-3ac5-439c-8108-fad8ab543d35` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-7831861f-9b52-4025-875a-e352da1baa2a` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-25ca79db-ac1b-4898-80b3-bd6a9c6c4740` |
| 5 | `GET /v1/credits/ledger` | 503 | 36 | `qa-a16d89e9-f870-42eb-98bd-02d6ec688612` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-8c4d69e0-a769-4a2f-a618-fe4d0bef457c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-bf3687c9-685d-47ed-b218-10ff352e5bc7` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-1e85c8b4-a2e2-4ce5-a6bc-db9169f5fa7d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-ae77e56d-d30a-40d7-b278-a343a75bcff6` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-46af73c3-34f1-4d51-b5af-626d36cf1b75` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb7928de-b225-4985-beaf-1f740fc6b909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb7928de-b225-4985-beaf-1f740fc6b909
Content-Type: application/json

--- request body ---
{"handle":"qa-f2b6fff642e4","displayName":"QA f2b6fff642e4","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb7928de-b225-4985-beaf-1f740fc6b909
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Location: /v1/accounts/qa-f2b6fff642e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_91081f1f-7d87-460e-a240-593c06dcd592","handle":"qa-f2b6fff642e4","displayName":"QA f2b6fff642e4","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.959050193Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-61dd8cea-3ac5-439c-8108-fad8ab543d35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61dd8cea-3ac5-439c-8108-fad8ab543d35
Content-Type: application/json

--- request body ---
{"handle":"qa-50ff1e2baabd","displayName":"QA 50ff1e2baabd","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-61dd8cea-3ac5-439c-8108-fad8ab543d35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Location: /v1/accounts/qa-50ff1e2baabd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee616831-5fde-4d09-9ded-b8a8e6873887","handle":"qa-50ff1e2baabd","displayName":"QA 50ff1e2baabd","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.005504535Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7831861f-9b52-4025-875a-e352da1baa2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7831861f-9b52-4025-875a-e352da1baa2a
Content-Type: application/json

--- request body ---
{"handle":"qa-f2b6fff642e4","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7831861f-9b52-4025-875a-e352da1baa2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_91081f1f-7d87-460e-a240-593c06dcd592"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-25ca79db-ac1b-4898-80b3-bd6a9c6c4740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25ca79db-ac1b-4898-80b3-bd6a9c6c4740
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-50ff1e2baabd","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-25ca79db-ac1b-4898-80b3-bd6a9c6c4740
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
Location: /v1/conversations/cnv_45b2eed8-f0a0-4567-971e-727696e972a4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_45b2eed8-f0a0-4567-971e-727696e972a4","subject":"Error contract","status":"open","region":"eu","participants":["qa-f2b6fff642e4","qa-50ff1e2baabd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.056324999Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a16d89e9-f870-42eb-98bd-02d6ec688612

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9cc429db-08f2-4daf-a4b7-544bd55ba70e
X-Correlation-Id: qa-a16d89e9-f870-42eb-98bd-02d6ec688612
Content-Type: application/json

--- response: 503 in 36 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a16d89e9-f870-42eb-98bd-02d6ec688612
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-a16d89e9-f870-42eb-98bd-02d6ec688612"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8c4d69e0-a769-4a2f-a618-fe4d0bef457c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c4d69e0-a769-4a2f-a618-fe4d0bef457c
Content-Type: application/json

--- request body ---
{"handle":"qa-50ff1e2baabd","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c4d69e0-a769-4a2f-a618-fe4d0bef457c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee616831-5fde-4d09-9ded-b8a8e6873887"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf3687c9-685d-47ed-b218-10ff352e5bc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf3687c9-685d-47ed-b218-10ff352e5bc7
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf3687c9-685d-47ed-b218-10ff352e5bc7
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
correlation: qa-1e85c8b4-a2e2-4ce5-a6bc-db9169f5fa7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e85c8b4-a2e2-4ce5-a6bc-db9169f5fa7d
Content-Type: application/json

--- request body ---
{"handle":"qa-50ff1e2baabd","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e85c8b4-a2e2-4ce5-a6bc-db9169f5fa7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e85c8b4-a2e2-4ce5-a6bc-db9169f5fa7d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae77e56d-d30a-40d7-b278-a343a75bcff6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae77e56d-d30a-40d7-b278-a343a75bcff6
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae77e56d-d30a-40d7-b278-a343a75bcff6
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
correlation: qa-46af73c3-34f1-4d51-b5af-626d36cf1b75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46af73c3-34f1-4d51-b5af-626d36cf1b75
Content-Type: application/json

--- request body ---
{"handle":"qa-f2b6fff642e4","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46af73c3-34f1-4d51-b5af-626d36cf1b75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46af73c3-34f1-4d51-b5af-626d36cf1b75"}
```
