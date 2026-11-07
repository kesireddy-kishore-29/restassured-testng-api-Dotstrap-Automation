# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-ff1aef42-16cf-4b8a-9772-30577e08ad5a` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-2b855d70-38ae-4c8a-9696-cf20cc7df4a7` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-800f35f3-4e29-478e-ab38-d7f5628b4e99` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-6f852f48-962b-4689-8476-2d65528a7e32` |
| 5 | `DELETE /v1/accounts/me` | 503 | 51 | `qa-3f556564-c338-42f7-be80-1d8bcbac480d` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-957d0a25-f078-42e3-ba0a-34e8e76f54a2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-719d1f40-1e46-4fce-99d3-3b9477b191f7` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-ca93cb2d-3436-4352-b552-137f14af89c4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6f73ead4-f601-493f-a760-3088acbfa705` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-900bcc59-d078-43c1-b082-066367b9b795` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ff1aef42-16cf-4b8a-9772-30577e08ad5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff1aef42-16cf-4b8a-9772-30577e08ad5a
Content-Type: application/json

--- request body ---
{"handle":"qa-c0435825f0a7","displayName":"QA c0435825f0a7","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff1aef42-16cf-4b8a-9772-30577e08ad5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Location: /v1/accounts/qa-c0435825f0a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0530af2b-ee0b-44f3-9651-c80ddb81c7d1","handle":"qa-c0435825f0a7","displayName":"QA c0435825f0a7","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.290714274Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2b855d70-38ae-4c8a-9696-cf20cc7df4a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b855d70-38ae-4c8a-9696-cf20cc7df4a7
Content-Type: application/json

--- request body ---
{"handle":"qa-ebbc541cbf0d","displayName":"QA ebbc541cbf0d","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b855d70-38ae-4c8a-9696-cf20cc7df4a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Location: /v1/accounts/qa-ebbc541cbf0d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ac3246-74cc-4cb8-a3e1-4898e1662572","handle":"qa-ebbc541cbf0d","displayName":"QA ebbc541cbf0d","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.372186945Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-800f35f3-4e29-478e-ab38-d7f5628b4e99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-800f35f3-4e29-478e-ab38-d7f5628b4e99
Content-Type: application/json

--- request body ---
{"handle":"qa-c0435825f0a7","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-800f35f3-4e29-478e-ab38-d7f5628b4e99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0530af2b-ee0b-44f3-9651-c80ddb81c7d1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6f852f48-962b-4689-8476-2d65528a7e32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f852f48-962b-4689-8476-2d65528a7e32
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ebbc541cbf0d","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f852f48-962b-4689-8476-2d65528a7e32
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
Location: /v1/conversations/cnv_69381ce6-8d0f-4980-b70c-221b38012abe
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_69381ce6-8d0f-4980-b70c-221b38012abe","subject":"Error contract","status":"open","region":"eu","participants":["qa-c0435825f0a7","qa-ebbc541cbf0d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.505576114Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f556564-c338-42f7-be80-1d8bcbac480d

--- request headers ---
Accept: application/json
X-Fault-Key: 8adee78c-4d10-4d92-9338-4ec7d915eba7
X-Fault: unavailable-once
X-Correlation-Id: qa-3f556564-c338-42f7-be80-1d8bcbac480d
Content-Type: application/json

--- response: 503 in 51 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f556564-c338-42f7-be80-1d8bcbac480d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-3f556564-c338-42f7-be80-1d8bcbac480d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-957d0a25-f078-42e3-ba0a-34e8e76f54a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-957d0a25-f078-42e3-ba0a-34e8e76f54a2
Content-Type: application/json

--- request body ---
{"handle":"qa-ebbc541cbf0d","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-957d0a25-f078-42e3-ba0a-34e8e76f54a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3ac3246-74cc-4cb8-a3e1-4898e1662572"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-719d1f40-1e46-4fce-99d3-3b9477b191f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-719d1f40-1e46-4fce-99d3-3b9477b191f7
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-719d1f40-1e46-4fce-99d3-3b9477b191f7
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
correlation: qa-ca93cb2d-3436-4352-b552-137f14af89c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca93cb2d-3436-4352-b552-137f14af89c4
Content-Type: application/json

--- request body ---
{"handle":"qa-ebbc541cbf0d","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca93cb2d-3436-4352-b552-137f14af89c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca93cb2d-3436-4352-b552-137f14af89c4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f73ead4-f601-493f-a760-3088acbfa705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f73ead4-f601-493f-a760-3088acbfa705
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f73ead4-f601-493f-a760-3088acbfa705
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
correlation: qa-900bcc59-d078-43c1-b082-066367b9b795

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900bcc59-d078-43c1-b082-066367b9b795
Content-Type: application/json

--- request body ---
{"handle":"qa-c0435825f0a7","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-900bcc59-d078-43c1-b082-066367b9b795
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-900bcc59-d078-43c1-b082-066367b9b795"}
```
