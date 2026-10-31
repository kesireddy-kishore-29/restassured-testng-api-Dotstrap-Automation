# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-d0ec9c13-151a-46af-af19-70d0fd448052` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-a8050e03-062f-42fa-ab66-1e54aac212d4` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-9976718d-c161-466b-b8b3-5357b54252bd` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-2aeb87ab-8878-4ad9-9a3f-6afbadbb9aaf` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 18 | `qa-3d229def-b242-4508-b1d5-7390ea5a27e6` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-5dae5a61-4c66-4627-9a8f-380e1d7b95a1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-450c32db-6932-4ffc-b739-65cb3deb4ed1` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-a1387620-748d-4778-9ed8-f0927ceb9e65` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-079158b5-2f11-4c0a-8948-af6d314b4db9` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-9acd4c86-4e44-43d9-9f72-130aa24925ec` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d0ec9c13-151a-46af-af19-70d0fd448052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0ec9c13-151a-46af-af19-70d0fd448052
Content-Type: application/json

--- request body ---
{"handle":"qa-12733817a2e4","displayName":"QA 12733817a2e4","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0ec9c13-151a-46af-af19-70d0fd448052
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Location: /v1/accounts/qa-12733817a2e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f435b02e-2a0c-4c4b-959a-84736fd2b210","handle":"qa-12733817a2e4","displayName":"QA 12733817a2e4","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.148470317Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a8050e03-062f-42fa-ab66-1e54aac212d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8050e03-062f-42fa-ab66-1e54aac212d4
Content-Type: application/json

--- request body ---
{"handle":"qa-8bfc591bc731","displayName":"QA 8bfc591bc731","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8050e03-062f-42fa-ab66-1e54aac212d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Location: /v1/accounts/qa-8bfc591bc731
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ff95800-095d-48b8-9d55-85ac81a79198","handle":"qa-8bfc591bc731","displayName":"QA 8bfc591bc731","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.220284542Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9976718d-c161-466b-b8b3-5357b54252bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9976718d-c161-466b-b8b3-5357b54252bd
Content-Type: application/json

--- request body ---
{"handle":"qa-12733817a2e4","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9976718d-c161-466b-b8b3-5357b54252bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f435b02e-2a0c-4c4b-959a-84736fd2b210"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2aeb87ab-8878-4ad9-9a3f-6afbadbb9aaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aeb87ab-8878-4ad9-9a3f-6afbadbb9aaf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8bfc591bc731","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aeb87ab-8878-4ad9-9a3f-6afbadbb9aaf
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
Location: /v1/conversations/cnv_5b8d1696-ee6a-4f1e-a1a1-accbc890476f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5b8d1696-ee6a-4f1e-a1a1-accbc890476f","subject":"Error contract","status":"open","region":"eu","participants":["qa-12733817a2e4","qa-8bfc591bc731"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.362178015Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5b8d1696-ee6a-4f1e-a1a1-accbc890476f/messages
correlation: qa-3d229def-b242-4508-b1d5-7390ea5a27e6

--- request headers ---
Accept: application/json
X-Fault-Key: 2be261b0-d35d-4118-a565-486437786fd3
X-Fault: unavailable-once
X-Correlation-Id: qa-3d229def-b242-4508-b1d5-7390ea5a27e6
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d229def-b242-4508-b1d5-7390ea5a27e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_5b8d1696-ee6a-4f1e-a1a1-accbc890476f/messages","correlationId":"qa-3d229def-b242-4508-b1d5-7390ea5a27e6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5dae5a61-4c66-4627-9a8f-380e1d7b95a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dae5a61-4c66-4627-9a8f-380e1d7b95a1
Content-Type: application/json

--- request body ---
{"handle":"qa-8bfc591bc731","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dae5a61-4c66-4627-9a8f-380e1d7b95a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ff95800-095d-48b8-9d55-85ac81a79198"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-450c32db-6932-4ffc-b739-65cb3deb4ed1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-450c32db-6932-4ffc-b739-65cb3deb4ed1
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-450c32db-6932-4ffc-b739-65cb3deb4ed1
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
correlation: qa-a1387620-748d-4778-9ed8-f0927ceb9e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1387620-748d-4778-9ed8-f0927ceb9e65
Content-Type: application/json

--- request body ---
{"handle":"qa-8bfc591bc731","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1387620-748d-4778-9ed8-f0927ceb9e65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1387620-748d-4778-9ed8-f0927ceb9e65"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-079158b5-2f11-4c0a-8948-af6d314b4db9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-079158b5-2f11-4c0a-8948-af6d314b4db9
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-079158b5-2f11-4c0a-8948-af6d314b4db9
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
correlation: qa-9acd4c86-4e44-43d9-9f72-130aa24925ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9acd4c86-4e44-43d9-9f72-130aa24925ec
Content-Type: application/json

--- request body ---
{"handle":"qa-12733817a2e4","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9acd4c86-4e44-43d9-9f72-130aa24925ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9acd4c86-4e44-43d9-9f72-130aa24925ec"}
```
