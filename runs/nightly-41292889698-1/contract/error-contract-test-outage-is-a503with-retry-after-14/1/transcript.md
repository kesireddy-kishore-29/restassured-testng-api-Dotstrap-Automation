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
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-32500c77-5abf-4a39-8fea-588272d703da` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-79b2c4a7-0ec0-4e39-9a51-864b40342990` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-db193d34-62a3-471a-9b6e-765c5742ea49` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-45b4c107-2dc5-4c43-97fe-17c354f202f0` |
| 5 | `GET /v1/credits/ledger` | 503 | 14 | `qa-6a8ad433-07a5-41f9-b0d9-b659f13c31ce` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-2d7829ad-730a-4155-a2d2-c5e15767a878` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-a2a05a59-e66c-4cd6-bc05-6ddf47e5de03` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-5825c0f5-aaed-4511-a747-110d199654bb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c7f3a9d5-0d98-4a9b-a566-01254f1f2921` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-17012900-48fd-4450-9f7b-d1b472485082` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-32500c77-5abf-4a39-8fea-588272d703da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32500c77-5abf-4a39-8fea-588272d703da
Content-Type: application/json

--- request body ---
{"handle":"qa-d84f6fb879a2","displayName":"QA d84f6fb879a2","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-32500c77-5abf-4a39-8fea-588272d703da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Location: /v1/accounts/qa-d84f6fb879a2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_678f2912-9ba0-4bc7-9064-ff224eb2fddc","handle":"qa-d84f6fb879a2","displayName":"QA d84f6fb879a2","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.565065360Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-79b2c4a7-0ec0-4e39-9a51-864b40342990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79b2c4a7-0ec0-4e39-9a51-864b40342990
Content-Type: application/json

--- request body ---
{"handle":"qa-2fcfd60e069d","displayName":"QA 2fcfd60e069d","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-79b2c4a7-0ec0-4e39-9a51-864b40342990
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Location: /v1/accounts/qa-2fcfd60e069d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_049d3c13-599a-48b0-b40f-6194ede3ea3e","handle":"qa-2fcfd60e069d","displayName":"QA 2fcfd60e069d","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.626798912Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-db193d34-62a3-471a-9b6e-765c5742ea49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db193d34-62a3-471a-9b6e-765c5742ea49
Content-Type: application/json

--- request body ---
{"handle":"qa-d84f6fb879a2","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-db193d34-62a3-471a-9b6e-765c5742ea49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_678f2912-9ba0-4bc7-9064-ff224eb2fddc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-45b4c107-2dc5-4c43-97fe-17c354f202f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45b4c107-2dc5-4c43-97fe-17c354f202f0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2fcfd60e069d","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-45b4c107-2dc5-4c43-97fe-17c354f202f0
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
Location: /v1/conversations/cnv_79f61b1d-e972-452a-86ad-92fcd1d29d93
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_79f61b1d-e972-452a-86ad-92fcd1d29d93","subject":"Error contract","status":"open","region":"eu","participants":["qa-d84f6fb879a2","qa-2fcfd60e069d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.716320801Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6a8ad433-07a5-41f9-b0d9-b659f13c31ce

--- request headers ---
Accept: application/json
X-Fault-Key: 25d08742-0a0e-42e6-b387-32f63a2f9038
X-Fault: unavailable-once
X-Correlation-Id: qa-6a8ad433-07a5-41f9-b0d9-b659f13c31ce
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a8ad433-07a5-41f9-b0d9-b659f13c31ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-6a8ad433-07a5-41f9-b0d9-b659f13c31ce"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2d7829ad-730a-4155-a2d2-c5e15767a878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d7829ad-730a-4155-a2d2-c5e15767a878
Content-Type: application/json

--- request body ---
{"handle":"qa-2fcfd60e069d","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d7829ad-730a-4155-a2d2-c5e15767a878
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_049d3c13-599a-48b0-b40f-6194ede3ea3e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2a05a59-e66c-4cd6-bc05-6ddf47e5de03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2a05a59-e66c-4cd6-bc05-6ddf47e5de03
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2a05a59-e66c-4cd6-bc05-6ddf47e5de03
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
correlation: qa-5825c0f5-aaed-4511-a747-110d199654bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5825c0f5-aaed-4511-a747-110d199654bb
Content-Type: application/json

--- request body ---
{"handle":"qa-2fcfd60e069d","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5825c0f5-aaed-4511-a747-110d199654bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5825c0f5-aaed-4511-a747-110d199654bb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7f3a9d5-0d98-4a9b-a566-01254f1f2921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7f3a9d5-0d98-4a9b-a566-01254f1f2921
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7f3a9d5-0d98-4a9b-a566-01254f1f2921
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
correlation: qa-17012900-48fd-4450-9f7b-d1b472485082

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17012900-48fd-4450-9f7b-d1b472485082
Content-Type: application/json

--- request body ---
{"handle":"qa-d84f6fb879a2","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17012900-48fd-4450-9f7b-d1b472485082
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-17012900-48fd-4450-9f7b-d1b472485082"}
```
