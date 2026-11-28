# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-a7446f59-580b-4f90-b132-68539ce59679` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-c2abd187-866d-4e46-8295-b259ff1ccbc7` |
| 3 | `POST /v1/accounts` | 201 | 24 | `qa-650d970e-03be-42b1-a33b-610ea0b52dbc` |
| 4 | `POST /v1/auth/token` | 200 | 44 | `qa-4100c871-fb8a-4f73-82e4-24fb2a15023d` |
| 5 | `POST /v1/conversations` | 201 | 28 | `qa-a6f48055-ae13-4a9d-9d8d-2ea9dccad6fb` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-23c8aa4a-5a08-42bd-83bd-7de8a9754611` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 24 | `qa-36cdc1d8-62d1-47eb-b8f1-8b6706c69cf7` |
| 8 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-6761694e-e2f0-4bf8-8e73-317e30021425` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-270fd2e0-7aaf-4ed0-8cf8-eaa4a68c9e3e` |
| 10 | `POST /v1/auth/token` | 200 | 63 | `qa-ecde2614-e3aa-444e-9efe-2340ed38c751` |
| 11 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-9c2dcb5e-a9da-44ef-95c2-ccd5f8e120fa` |
| 12 | `POST /v1/auth/token` | 401 | 25 | `qa-d4ba0028-6354-460f-947e-fbbdeb9ebfc3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-0a58dc31-551b-4c80-9ac6-3b2f0ebb7b09` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-f50ab679-1070-4c6a-a809-9e7948a3ee0e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a7446f59-580b-4f90-b132-68539ce59679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7446f59-580b-4f90-b132-68539ce59679
Content-Type: application/json

--- request body ---
{"handle":"qa-01598b82310b","displayName":"QA 01598b82310b","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7446f59-580b-4f90-b132-68539ce59679
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-01598b82310b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_83553595-fe87-4b57-b482-05ef72ab7aff","handle":"qa-01598b82310b","displayName":"QA 01598b82310b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.813678290Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c2abd187-866d-4e46-8295-b259ff1ccbc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2abd187-866d-4e46-8295-b259ff1ccbc7
Content-Type: application/json

--- request body ---
{"handle":"qa-12eb4e365495","displayName":"QA 12eb4e365495","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2abd187-866d-4e46-8295-b259ff1ccbc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-12eb4e365495
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d39f836c-6c84-46fe-b0b4-da1923c9eb14","handle":"qa-12eb4e365495","displayName":"QA 12eb4e365495","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.830754766Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-650d970e-03be-42b1-a33b-610ea0b52dbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-650d970e-03be-42b1-a33b-610ea0b52dbc
Content-Type: application/json

--- request body ---
{"handle":"qa-340277c48c5e","displayName":"QA 340277c48c5e","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-650d970e-03be-42b1-a33b-610ea0b52dbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-340277c48c5e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30637257-4ec4-45ad-8bb9-e96132399c2e","handle":"qa-340277c48c5e","displayName":"QA 340277c48c5e","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.858915185Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4100c871-fb8a-4f73-82e4-24fb2a15023d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4100c871-fb8a-4f73-82e4-24fb2a15023d
Content-Type: application/json

--- request body ---
{"handle":"qa-01598b82310b","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-4100c871-fb8a-4f73-82e4-24fb2a15023d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_83553595-fe87-4b57-b482-05ef72ab7aff"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a6f48055-ae13-4a9d-9d8d-2ea9dccad6fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6f48055-ae13-4a9d-9d8d-2ea9dccad6fb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12eb4e365495","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6f48055-ae13-4a9d-9d8d-2ea9dccad6fb
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
Location: /v1/conversations/cnv_6c926d6e-2d44-4fb2-9d1c-fe7260519fdc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6c926d6e-2d44-4fb2-9d1c-fe7260519fdc","subject":"Error contract","status":"open","region":"eu","participants":["qa-01598b82310b","qa-12eb4e365495"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.958333602Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-23c8aa4a-5a08-42bd-83bd-7de8a9754611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23c8aa4a-5a08-42bd-83bd-7de8a9754611
Content-Type: application/json

--- request body ---
{"handle":"qa-340277c48c5e","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-23c8aa4a-5a08-42bd-83bd-7de8a9754611
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30637257-4ec4-45ad-8bb9-e96132399c2e"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_6c926d6e-2d44-4fb2-9d1c-fe7260519fdc/messages
correlation: qa-36cdc1d8-62d1-47eb-b8f1-8b6706c69cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36cdc1d8-62d1-47eb-b8f1-8b6706c69cf7
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36cdc1d8-62d1-47eb-b8f1-8b6706c69cf7
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6c926d6e-2d44-4fb2-9d1c-fe7260519fdc/messages","correlationId":"qa-36cdc1d8-62d1-47eb-b8f1-8b6706c69cf7"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6761694e-e2f0-4bf8-8e73-317e30021425

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6761694e-e2f0-4bf8-8e73-317e30021425
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6761694e-e2f0-4bf8-8e73-317e30021425
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-270fd2e0-7aaf-4ed0-8cf8-eaa4a68c9e3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-270fd2e0-7aaf-4ed0-8cf8-eaa4a68c9e3e
Content-Type: application/json

--- request body ---
{"handle":"qa-340277c48c5e","password":"****"}

--- response: 401 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-270fd2e0-7aaf-4ed0-8cf8-eaa4a68c9e3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-270fd2e0-7aaf-4ed0-8cf8-eaa4a68c9e3e"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ecde2614-e3aa-444e-9efe-2340ed38c751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecde2614-e3aa-444e-9efe-2340ed38c751
Content-Type: application/json

--- request body ---
{"handle":"qa-12eb4e365495","password":"****"}

--- response: 200 in 63 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecde2614-e3aa-444e-9efe-2340ed38c751
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d39f836c-6c84-46fe-b0b4-da1923c9eb14"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9c2dcb5e-a9da-44ef-95c2-ccd5f8e120fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c2dcb5e-a9da-44ef-95c2-ccd5f8e120fa
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9c2dcb5e-a9da-44ef-95c2-ccd5f8e120fa
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d4ba0028-6354-460f-947e-fbbdeb9ebfc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4ba0028-6354-460f-947e-fbbdeb9ebfc3
Content-Type: application/json

--- request body ---
{"handle":"qa-12eb4e365495","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4ba0028-6354-460f-947e-fbbdeb9ebfc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4ba0028-6354-460f-947e-fbbdeb9ebfc3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0a58dc31-551b-4c80-9ac6-3b2f0ebb7b09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a58dc31-551b-4c80-9ac6-3b2f0ebb7b09
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0a58dc31-551b-4c80-9ac6-3b2f0ebb7b09
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f50ab679-1070-4c6a-a809-9e7948a3ee0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f50ab679-1070-4c6a-a809-9e7948a3ee0e
Content-Type: application/json

--- request body ---
{"handle":"qa-01598b82310b","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f50ab679-1070-4c6a-a809-9e7948a3ee0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f50ab679-1070-4c6a-a809-9e7948a3ee0e"}
```
