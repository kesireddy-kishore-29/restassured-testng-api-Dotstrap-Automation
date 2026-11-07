# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-8d9ce6c4-9f92-4bf8-b887-4983d18dfdee` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-fb7fd302-3b7d-447c-a4a8-a8f050d762aa` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-1ecba6fa-ad77-40d3-9449-ebab80b41cea` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-c40febb4-8bb1-45f2-9754-713efc1a1d71` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 16 | `qa-c4aa35ce-f8ee-488a-9737-59088c0a5b2e` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-4c5fe186-c95b-40d6-9c37-347dd429bcdd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-42d12046-4a77-42db-bd8e-ad7546e3a391` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-1392c4c8-91de-48bf-b3fe-2ce59d46bb93` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-d6f41089-85b6-4a72-83cf-3b17b6df457f` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-dfeee868-d76b-4d23-b577-64ed951f1ba5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8d9ce6c4-9f92-4bf8-b887-4983d18dfdee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d9ce6c4-9f92-4bf8-b887-4983d18dfdee
Content-Type: application/json

--- request body ---
{"handle":"qa-1872d1c39695","displayName":"QA 1872d1c39695","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d9ce6c4-9f92-4bf8-b887-4983d18dfdee
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
Location: /v1/accounts/qa-1872d1c39695
X-Served-Region: eu
Content-Length: 181

{"id":"acc_710c3931-4330-401f-8453-2fc9da91c5ed","handle":"qa-1872d1c39695","displayName":"QA 1872d1c39695","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.623374769Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fb7fd302-3b7d-447c-a4a8-a8f050d762aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb7fd302-3b7d-447c-a4a8-a8f050d762aa
Content-Type: application/json

--- request body ---
{"handle":"qa-0ebe182bdf78","displayName":"QA 0ebe182bdf78","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb7fd302-3b7d-447c-a4a8-a8f050d762aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Location: /v1/accounts/qa-0ebe182bdf78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b232bf54-ee0a-48a0-9b06-93464ee246ac","handle":"qa-0ebe182bdf78","displayName":"QA 0ebe182bdf78","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.663070777Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1ecba6fa-ad77-40d3-9449-ebab80b41cea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ecba6fa-ad77-40d3-9449-ebab80b41cea
Content-Type: application/json

--- request body ---
{"handle":"qa-1872d1c39695","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ecba6fa-ad77-40d3-9449-ebab80b41cea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_710c3931-4330-401f-8453-2fc9da91c5ed"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c40febb4-8bb1-45f2-9754-713efc1a1d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40febb4-8bb1-45f2-9754-713efc1a1d71
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0ebe182bdf78","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c40febb4-8bb1-45f2-9754-713efc1a1d71
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
Location: /v1/conversations/cnv_e18d74f2-93f0-4d24-838b-58bd6738c326
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e18d74f2-93f0-4d24-838b-58bd6738c326","subject":"Error contract","status":"open","region":"eu","participants":["qa-1872d1c39695","qa-0ebe182bdf78"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.734148986Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e18d74f2-93f0-4d24-838b-58bd6738c326/messages
correlation: qa-c4aa35ce-f8ee-488a-9737-59088c0a5b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4aa35ce-f8ee-488a-9737-59088c0a5b2e
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4aa35ce-f8ee-488a-9737-59088c0a5b2e
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_e18d74f2-93f0-4d24-838b-58bd6738c326/messages","correlationId":"qa-c4aa35ce-f8ee-488a-9737-59088c0a5b2e","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4c5fe186-c95b-40d6-9c37-347dd429bcdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c5fe186-c95b-40d6-9c37-347dd429bcdd
Content-Type: application/json

--- request body ---
{"handle":"qa-0ebe182bdf78","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c5fe186-c95b-40d6-9c37-347dd429bcdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b232bf54-ee0a-48a0-9b06-93464ee246ac"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42d12046-4a77-42db-bd8e-ad7546e3a391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42d12046-4a77-42db-bd8e-ad7546e3a391
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42d12046-4a77-42db-bd8e-ad7546e3a391
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
correlation: qa-1392c4c8-91de-48bf-b3fe-2ce59d46bb93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1392c4c8-91de-48bf-b3fe-2ce59d46bb93
Content-Type: application/json

--- request body ---
{"handle":"qa-0ebe182bdf78","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1392c4c8-91de-48bf-b3fe-2ce59d46bb93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1392c4c8-91de-48bf-b3fe-2ce59d46bb93"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d6f41089-85b6-4a72-83cf-3b17b6df457f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6f41089-85b6-4a72-83cf-3b17b6df457f
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d6f41089-85b6-4a72-83cf-3b17b6df457f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-dfeee868-d76b-4d23-b577-64ed951f1ba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfeee868-d76b-4d23-b577-64ed951f1ba5
Content-Type: application/json

--- request body ---
{"handle":"qa-1872d1c39695","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfeee868-d76b-4d23-b577-64ed951f1ba5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dfeee868-d76b-4d23-b577-64ed951f1ba5"}
```
