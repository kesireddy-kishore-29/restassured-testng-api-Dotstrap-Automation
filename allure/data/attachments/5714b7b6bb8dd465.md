# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-9365fb09-24c0-4517-a2f2-7dd613b68fa2` |
| 2 | `POST /v1/auth/token` | 200 | 6 | `qa-4548c053-572d-4f3f-a7dd-b5a13d1118b8` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 12 | `qa-9a7572a4-7571-4b69-8300-f7982fc5845e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-1b28aa61-b7c2-4ef9-badd-c3187dd2c580` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-2c77c02f-1ae7-4a7f-abdb-1cef205ae18a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9365fb09-24c0-4517-a2f2-7dd613b68fa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9365fb09-24c0-4517-a2f2-7dd613b68fa2
Content-Type: application/json

--- request body ---
{"handle":"qa-f8d79312a485","displayName":"QA f8d79312a485","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9365fb09-24c0-4517-a2f2-7dd613b68fa2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-f8d79312a485
X-Served-Region: eu
Content-Length: 181

{"id":"acc_656ab8d0-e5ac-4084-8610-8597299e5785","handle":"qa-f8d79312a485","displayName":"QA f8d79312a485","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.821463785Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4548c053-572d-4f3f-a7dd-b5a13d1118b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4548c053-572d-4f3f-a7dd-b5a13d1118b8
Content-Type: application/json

--- request body ---
{"handle":"qa-f8d79312a485","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4548c053-572d-4f3f-a7dd-b5a13d1118b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_656ab8d0-e5ac-4084-8610-8597299e5785"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-9a7572a4-7571-4b69-8300-f7982fc5845e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a7572a4-7571-4b69-8300-f7982fc5845e
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a7572a4-7571-4b69-8300-f7982fc5845e
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-9a7572a4-7571-4b69-8300-f7982fc5845e"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b28aa61-b7c2-4ef9-badd-c3187dd2c580

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b28aa61-b7c2-4ef9-badd-c3187dd2c580
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b28aa61-b7c2-4ef9-badd-c3187dd2c580
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
correlation: qa-2c77c02f-1ae7-4a7f-abdb-1cef205ae18a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c77c02f-1ae7-4a7f-abdb-1cef205ae18a
Content-Type: application/json

--- request body ---
{"handle":"qa-f8d79312a485","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c77c02f-1ae7-4a7f-abdb-1cef205ae18a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c77c02f-1ae7-4a7f-abdb-1cef205ae18a"}
```
