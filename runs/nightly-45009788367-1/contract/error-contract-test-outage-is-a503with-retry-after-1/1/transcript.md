# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-653e1062-b5e6-479f-8244-e46e57ca6792` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-bd04bee0-2720-42c8-b71d-51b551b67c67` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-be60781a-5208-42f5-90f1-89990a158ba1` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-d8e71ab7-dc4c-49e0-ba46-77de61a3623a` |
| 5 | `POST /v1/accounts` | 503 | 4 | `qa-e4880e65-c084-4bd8-880a-91a71afb9af7` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-b9eeef8f-7e8d-4a3a-a3fb-1e75aaedf78f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-4e57a8c9-e9a7-4809-a635-812e04251fa2` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-8309859f-108b-467d-95d7-fff30a33f55f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-a29bce17-a3b2-4c27-8f1f-d333edc6dfc7` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-1c4cd02e-9943-4815-b995-01b58b3a65d4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-653e1062-b5e6-479f-8244-e46e57ca6792

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-653e1062-b5e6-479f-8244-e46e57ca6792
Content-Type: application/json

--- request body ---
{"handle":"qa-a368bd016a25","displayName":"QA a368bd016a25","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-653e1062-b5e6-479f-8244-e46e57ca6792
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-a368bd016a25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b954054-5dd4-4404-a0bc-35d288ea27af","handle":"qa-a368bd016a25","displayName":"QA a368bd016a25","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.380037803Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bd04bee0-2720-42c8-b71d-51b551b67c67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd04bee0-2720-42c8-b71d-51b551b67c67
Content-Type: application/json

--- request body ---
{"handle":"qa-665a67aff150","displayName":"QA 665a67aff150","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd04bee0-2720-42c8-b71d-51b551b67c67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-665a67aff150
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f29329c-9053-4206-84f0-5824acf6047b","handle":"qa-665a67aff150","displayName":"QA 665a67aff150","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.419041700Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-be60781a-5208-42f5-90f1-89990a158ba1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be60781a-5208-42f5-90f1-89990a158ba1
Content-Type: application/json

--- request body ---
{"handle":"qa-a368bd016a25","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-be60781a-5208-42f5-90f1-89990a158ba1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b954054-5dd4-4404-a0bc-35d288ea27af"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d8e71ab7-dc4c-49e0-ba46-77de61a3623a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8e71ab7-dc4c-49e0-ba46-77de61a3623a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-665a67aff150","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8e71ab7-dc4c-49e0-ba46-77de61a3623a
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
Location: /v1/conversations/cnv_4397712c-bdc2-4442-ba2c-374d9d0c714a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4397712c-bdc2-4442-ba2c-374d9d0c714a","subject":"Error contract","status":"open","region":"eu","participants":["qa-a368bd016a25","qa-665a67aff150"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.468624318Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-e4880e65-c084-4bd8-880a-91a71afb9af7

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1a1e6460-3fa4-414e-8b21-128645393a72
X-Correlation-Id: qa-e4880e65-c084-4bd8-880a-91a71afb9af7
Content-Type: application/json

--- request body ---
{"handle":"qa-dbfd7cd2491d","displayName":"QA dbfd7cd2491d","password":"****","region":"eu"}

--- response: 503 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4880e65-c084-4bd8-880a-91a71afb9af7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-e4880e65-c084-4bd8-880a-91a71afb9af7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9eeef8f-7e8d-4a3a-a3fb-1e75aaedf78f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9eeef8f-7e8d-4a3a-a3fb-1e75aaedf78f
Content-Type: application/json

--- request body ---
{"handle":"qa-665a67aff150","password":"****"}

--- response: 200 in 62 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9eeef8f-7e8d-4a3a-a3fb-1e75aaedf78f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f29329c-9053-4206-84f0-5824acf6047b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e57a8c9-e9a7-4809-a635-812e04251fa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e57a8c9-e9a7-4809-a635-812e04251fa2
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e57a8c9-e9a7-4809-a635-812e04251fa2
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
correlation: qa-8309859f-108b-467d-95d7-fff30a33f55f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8309859f-108b-467d-95d7-fff30a33f55f
Content-Type: application/json

--- request body ---
{"handle":"qa-665a67aff150","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8309859f-108b-467d-95d7-fff30a33f55f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8309859f-108b-467d-95d7-fff30a33f55f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a29bce17-a3b2-4c27-8f1f-d333edc6dfc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a29bce17-a3b2-4c27-8f1f-d333edc6dfc7
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a29bce17-a3b2-4c27-8f1f-d333edc6dfc7
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
correlation: qa-1c4cd02e-9943-4815-b995-01b58b3a65d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c4cd02e-9943-4815-b995-01b58b3a65d4
Content-Type: application/json

--- request body ---
{"handle":"qa-a368bd016a25","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c4cd02e-9943-4815-b995-01b58b3a65d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c4cd02e-9943-4815-b995-01b58b3a65d4"}
```
