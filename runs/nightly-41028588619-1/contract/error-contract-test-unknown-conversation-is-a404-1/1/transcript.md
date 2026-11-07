# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-18e429f5-6af3-4001-a010-0c59ab9cbf82` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-fe0d043a-2346-445b-a880-f4e6c6f24cd5` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 20 | `qa-78b66f59-04b8-4a44-8d61-1390cd5aaf48` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-245dacdf-a5da-42ee-b494-9cce070d39f9` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-b87758c8-f355-49d5-b3e1-2f1dc462f4a0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18e429f5-6af3-4001-a010-0c59ab9cbf82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18e429f5-6af3-4001-a010-0c59ab9cbf82
Content-Type: application/json

--- request body ---
{"handle":"qa-dbe3566252c2","displayName":"QA dbe3566252c2","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-18e429f5-6af3-4001-a010-0c59ab9cbf82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Location: /v1/accounts/qa-dbe3566252c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_26b74880-7162-41ef-8c2c-d0f0d36bff5a","handle":"qa-dbe3566252c2","displayName":"QA dbe3566252c2","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.122141448Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fe0d043a-2346-445b-a880-f4e6c6f24cd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe0d043a-2346-445b-a880-f4e6c6f24cd5
Content-Type: application/json

--- request body ---
{"handle":"qa-dbe3566252c2","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe0d043a-2346-445b-a880-f4e6c6f24cd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_26b74880-7162-41ef-8c2c-d0f0d36bff5a"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-78b66f59-04b8-4a44-8d61-1390cd5aaf48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78b66f59-04b8-4a44-8d61-1390cd5aaf48
Content-Type: application/json

--- response: 404 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78b66f59-04b8-4a44-8d61-1390cd5aaf48
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-78b66f59-04b8-4a44-8d61-1390cd5aaf48"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-245dacdf-a5da-42ee-b494-9cce070d39f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-245dacdf-a5da-42ee-b494-9cce070d39f9
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-245dacdf-a5da-42ee-b494-9cce070d39f9
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b87758c8-f355-49d5-b3e1-2f1dc462f4a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b87758c8-f355-49d5-b3e1-2f1dc462f4a0
Content-Type: application/json

--- request body ---
{"handle":"qa-dbe3566252c2","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b87758c8-f355-49d5-b3e1-2f1dc462f4a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b87758c8-f355-49d5-b3e1-2f1dc462f4a0"}
```
