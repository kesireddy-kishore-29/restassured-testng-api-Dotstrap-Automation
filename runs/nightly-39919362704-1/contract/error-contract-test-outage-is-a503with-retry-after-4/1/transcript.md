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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-ee772a5f-b926-497f-848a-4a71e37c614d` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-f9e4bd80-24dc-480d-8b12-7cfd257772b8` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-be2c2a50-1856-4afc-af05-c753db397b86` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-5de2deeb-bf79-4864-ab59-7e068a076743` |
| 5 | `DELETE /v1/accounts/me` | 503 | 16 | `qa-c3213c27-177e-4387-a3d1-cd2202e13856` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-96efe2af-e0af-4ad8-b22c-93020592c30d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 59 | `qa-a02e6f7a-62e9-44d4-823f-420061f18ad3` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-08887488-e68c-4f26-9193-20f7f1da66b5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-853099c1-d963-49bc-95b9-1248fa7f52aa` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-8c6ae66b-cfb3-4491-8a64-7240bc9b2d81` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee772a5f-b926-497f-848a-4a71e37c614d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee772a5f-b926-497f-848a-4a71e37c614d
Content-Type: application/json

--- request body ---
{"handle":"qa-383c9a6c9a3b","displayName":"QA 383c9a6c9a3b","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee772a5f-b926-497f-848a-4a71e37c614d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Location: /v1/accounts/qa-383c9a6c9a3b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7f939da-c0fd-4a9b-86d7-8ed62d64fcb6","handle":"qa-383c9a6c9a3b","displayName":"QA 383c9a6c9a3b","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.391600244Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f9e4bd80-24dc-480d-8b12-7cfd257772b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9e4bd80-24dc-480d-8b12-7cfd257772b8
Content-Type: application/json

--- request body ---
{"handle":"qa-57404cbebc6c","displayName":"QA 57404cbebc6c","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9e4bd80-24dc-480d-8b12-7cfd257772b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 7
Location: /v1/accounts/qa-57404cbebc6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b2a1550-6c41-4545-89de-d88651a07019","handle":"qa-57404cbebc6c","displayName":"QA 57404cbebc6c","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.508968027Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-be2c2a50-1856-4afc-af05-c753db397b86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be2c2a50-1856-4afc-af05-c753db397b86
Content-Type: application/json

--- request body ---
{"handle":"qa-383c9a6c9a3b","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-be2c2a50-1856-4afc-af05-c753db397b86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7f939da-c0fd-4a9b-86d7-8ed62d64fcb6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5de2deeb-bf79-4864-ab59-7e068a076743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5de2deeb-bf79-4864-ab59-7e068a076743
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-57404cbebc6c","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-5de2deeb-bf79-4864-ab59-7e068a076743
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
Location: /v1/conversations/cnv_a7ff36be-5a84-43cb-9e0c-55f5832f1dde
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a7ff36be-5a84-43cb-9e0c-55f5832f1dde","subject":"Error contract","status":"open","region":"eu","participants":["qa-383c9a6c9a3b","qa-57404cbebc6c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.588159548Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3213c27-177e-4387-a3d1-cd2202e13856

--- request headers ---
Accept: application/json
X-Fault-Key: 718f56cb-22c8-433e-8ebc-34e0785f4c74
X-Fault: unavailable-once
X-Correlation-Id: qa-c3213c27-177e-4387-a3d1-cd2202e13856
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3213c27-177e-4387-a3d1-cd2202e13856
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-c3213c27-177e-4387-a3d1-cd2202e13856"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-96efe2af-e0af-4ad8-b22c-93020592c30d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96efe2af-e0af-4ad8-b22c-93020592c30d
Content-Type: application/json

--- request body ---
{"handle":"qa-57404cbebc6c","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-96efe2af-e0af-4ad8-b22c-93020592c30d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b2a1550-6c41-4545-89de-d88651a07019"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a02e6f7a-62e9-44d4-823f-420061f18ad3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a02e6f7a-62e9-44d4-823f-420061f18ad3
Content-Type: application/json

--- response: 204 in 59 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a02e6f7a-62e9-44d4-823f-420061f18ad3
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
correlation: qa-08887488-e68c-4f26-9193-20f7f1da66b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08887488-e68c-4f26-9193-20f7f1da66b5
Content-Type: application/json

--- request body ---
{"handle":"qa-57404cbebc6c","password":"****"}

--- response: 401 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08887488-e68c-4f26-9193-20f7f1da66b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08887488-e68c-4f26-9193-20f7f1da66b5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-853099c1-d963-49bc-95b9-1248fa7f52aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-853099c1-d963-49bc-95b9-1248fa7f52aa
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-853099c1-d963-49bc-95b9-1248fa7f52aa
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
correlation: qa-8c6ae66b-cfb3-4491-8a64-7240bc9b2d81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c6ae66b-cfb3-4491-8a64-7240bc9b2d81
Content-Type: application/json

--- request body ---
{"handle":"qa-383c9a6c9a3b","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c6ae66b-cfb3-4491-8a64-7240bc9b2d81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c6ae66b-cfb3-4491-8a64-7240bc9b2d81"}
```
