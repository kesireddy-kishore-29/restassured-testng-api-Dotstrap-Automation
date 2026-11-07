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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-ab8cf025-c963-40cc-9f33-6b45e2df3c25` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-75189612-cf8a-4c75-9544-d1d8a927bd62` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 8 | `qa-ea2566cb-0426-4573-a843-97a7d02a2e4c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-25d99698-0df6-4f3b-a6ea-1190cb93f9c8` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-98447855-ffdf-47c7-be81-2d15a05f326f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ab8cf025-c963-40cc-9f33-6b45e2df3c25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab8cf025-c963-40cc-9f33-6b45e2df3c25
Content-Type: application/json

--- request body ---
{"handle":"qa-132c9816f9bb","displayName":"QA 132c9816f9bb","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab8cf025-c963-40cc-9f33-6b45e2df3c25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Location: /v1/accounts/qa-132c9816f9bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4d4d6aba-0b6e-4aeb-9053-d5a89c7850c7","handle":"qa-132c9816f9bb","displayName":"QA 132c9816f9bb","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.338807176Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-75189612-cf8a-4c75-9544-d1d8a927bd62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75189612-cf8a-4c75-9544-d1d8a927bd62
Content-Type: application/json

--- request body ---
{"handle":"qa-132c9816f9bb","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-75189612-cf8a-4c75-9544-d1d8a927bd62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4d4d6aba-0b6e-4aeb-9053-d5a89c7850c7"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-ea2566cb-0426-4573-a843-97a7d02a2e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea2566cb-0426-4573-a843-97a7d02a2e4c
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea2566cb-0426-4573-a843-97a7d02a2e4c
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-ea2566cb-0426-4573-a843-97a7d02a2e4c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25d99698-0df6-4f3b-a6ea-1190cb93f9c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25d99698-0df6-4f3b-a6ea-1190cb93f9c8
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25d99698-0df6-4f3b-a6ea-1190cb93f9c8
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
correlation: qa-98447855-ffdf-47c7-be81-2d15a05f326f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98447855-ffdf-47c7-be81-2d15a05f326f
Content-Type: application/json

--- request body ---
{"handle":"qa-132c9816f9bb","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98447855-ffdf-47c7-be81-2d15a05f326f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98447855-ffdf-47c7-be81-2d15a05f326f"}
```
