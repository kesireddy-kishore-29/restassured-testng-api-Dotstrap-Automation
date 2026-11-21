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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-f67a825c-f03f-4f2b-9630-6b364f413483` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-b29610f4-3c3c-4310-8ceb-5b1ff9053963` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-3d1cf263-be04-4a8c-8e3f-fa9ab9ffea9a` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-be5314e7-6d3f-443a-ba4d-78287c24e507` |
| 5 | `GET /v1/credits/ledger` | 503 | 13 | `qa-5bd00d4b-0f45-45cb-9bf2-eb95400fcb78` |
| 6 | `POST /v1/auth/token` | 200 | 75 | `qa-d362bae4-3bd0-4b1e-a709-362ca74abdd0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-7ccaca1e-4197-4df5-ab9f-ad095a09a7af` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-ba1b1c6f-7299-49f2-8973-6d78e2fd6c7f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-a531ce7c-0788-4095-95de-f6c0ef796a76` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-c4dbf786-be14-4531-b2a7-9da8ab08c1b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f67a825c-f03f-4f2b-9630-6b364f413483

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f67a825c-f03f-4f2b-9630-6b364f413483
Content-Type: application/json

--- request body ---
{"handle":"qa-a1c4dc8bdcc3","displayName":"QA a1c4dc8bdcc3","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f67a825c-f03f-4f2b-9630-6b364f413483
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Location: /v1/accounts/qa-a1c4dc8bdcc3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_70bea389-45e7-4c96-a5f0-df697c27977a","handle":"qa-a1c4dc8bdcc3","displayName":"QA a1c4dc8bdcc3","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.916050465Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b29610f4-3c3c-4310-8ceb-5b1ff9053963

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b29610f4-3c3c-4310-8ceb-5b1ff9053963
Content-Type: application/json

--- request body ---
{"handle":"qa-8903790f7932","displayName":"QA 8903790f7932","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b29610f4-3c3c-4310-8ceb-5b1ff9053963
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-8903790f7932
X-Served-Region: eu
Content-Length: 181

{"id":"acc_965b92e9-40ad-49f7-be5e-d036abbaad34","handle":"qa-8903790f7932","displayName":"QA 8903790f7932","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.990899150Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3d1cf263-be04-4a8c-8e3f-fa9ab9ffea9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d1cf263-be04-4a8c-8e3f-fa9ab9ffea9a
Content-Type: application/json

--- request body ---
{"handle":"qa-a1c4dc8bdcc3","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d1cf263-be04-4a8c-8e3f-fa9ab9ffea9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_70bea389-45e7-4c96-a5f0-df697c27977a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-be5314e7-6d3f-443a-ba4d-78287c24e507

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be5314e7-6d3f-443a-ba4d-78287c24e507
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8903790f7932","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-be5314e7-6d3f-443a-ba4d-78287c24e507
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
Location: /v1/conversations/cnv_fdda1f29-7609-4b01-a544-1be094f2973a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fdda1f29-7609-4b01-a544-1be094f2973a","subject":"Error contract","status":"open","region":"eu","participants":["qa-a1c4dc8bdcc3","qa-8903790f7932"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.048803337Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5bd00d4b-0f45-45cb-9bf2-eb95400fcb78

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9b265a90-b54e-408d-b789-f442e562ce49
X-Correlation-Id: qa-5bd00d4b-0f45-45cb-9bf2-eb95400fcb78
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bd00d4b-0f45-45cb-9bf2-eb95400fcb78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-5bd00d4b-0f45-45cb-9bf2-eb95400fcb78"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d362bae4-3bd0-4b1e-a709-362ca74abdd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d362bae4-3bd0-4b1e-a709-362ca74abdd0
Content-Type: application/json

--- request body ---
{"handle":"qa-8903790f7932","password":"****"}

--- response: 200 in 75 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d362bae4-3bd0-4b1e-a709-362ca74abdd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_965b92e9-40ad-49f7-be5e-d036abbaad34"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ccaca1e-4197-4df5-ab9f-ad095a09a7af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ccaca1e-4197-4df5-ab9f-ad095a09a7af
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ccaca1e-4197-4df5-ab9f-ad095a09a7af
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
correlation: qa-ba1b1c6f-7299-49f2-8973-6d78e2fd6c7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba1b1c6f-7299-49f2-8973-6d78e2fd6c7f
Content-Type: application/json

--- request body ---
{"handle":"qa-8903790f7932","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba1b1c6f-7299-49f2-8973-6d78e2fd6c7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba1b1c6f-7299-49f2-8973-6d78e2fd6c7f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a531ce7c-0788-4095-95de-f6c0ef796a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a531ce7c-0788-4095-95de-f6c0ef796a76
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a531ce7c-0788-4095-95de-f6c0ef796a76
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
correlation: qa-c4dbf786-be14-4531-b2a7-9da8ab08c1b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4dbf786-be14-4531-b2a7-9da8ab08c1b8
Content-Type: application/json

--- request body ---
{"handle":"qa-a1c4dc8bdcc3","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4dbf786-be14-4531-b2a7-9da8ab08c1b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c4dbf786-be14-4531-b2a7-9da8ab08c1b8"}
```
