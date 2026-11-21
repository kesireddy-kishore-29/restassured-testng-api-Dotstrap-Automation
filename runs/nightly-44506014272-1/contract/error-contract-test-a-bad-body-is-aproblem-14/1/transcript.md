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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-33a7d064-8c01-433c-b5ac-ca90c74896dc` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-3a87f896-22ce-4290-8d38-2cfd1fefaacc` |
| 3 | `POST /v1/auth/token` | 200 | 74 | `qa-5368c406-69d3-4fee-a5a2-3c6fefe4c26b` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-63275c2f-7356-465f-ac06-fcd64f0ebb60` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 20 | `qa-9fff5b1a-4a07-4717-a5b0-c62fa291e47d` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-51b32f2b-496b-4395-9c5f-64f998eb6573` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-034b51c8-6af1-4051-b2d2-31e91765d3ef` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-5f6a0db2-8b5f-4d76-b98e-e7f8d3cf19d3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-4dab1da8-ebbf-446c-9717-67e2c3a2b803` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-94cacd82-dbd4-4291-8c84-7c0e79d8b620` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-33a7d064-8c01-433c-b5ac-ca90c74896dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a7d064-8c01-433c-b5ac-ca90c74896dc
Content-Type: application/json

--- request body ---
{"handle":"qa-10b43fb57f5b","displayName":"QA 10b43fb57f5b","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-33a7d064-8c01-433c-b5ac-ca90c74896dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Location: /v1/accounts/qa-10b43fb57f5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6e7d9fe-bd30-48de-be24-cc1f848b9545","handle":"qa-10b43fb57f5b","displayName":"QA 10b43fb57f5b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.942143990Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a87f896-22ce-4290-8d38-2cfd1fefaacc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a87f896-22ce-4290-8d38-2cfd1fefaacc
Content-Type: application/json

--- request body ---
{"handle":"qa-555ed73b3621","displayName":"QA 555ed73b3621","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a87f896-22ce-4290-8d38-2cfd1fefaacc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Location: /v1/accounts/qa-555ed73b3621
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6d3234e-ca50-43e9-8cbc-9e6cc137009e","handle":"qa-555ed73b3621","displayName":"QA 555ed73b3621","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.998311425Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5368c406-69d3-4fee-a5a2-3c6fefe4c26b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5368c406-69d3-4fee-a5a2-3c6fefe4c26b
Content-Type: application/json

--- request body ---
{"handle":"qa-10b43fb57f5b","password":"****"}

--- response: 200 in 74 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-5368c406-69d3-4fee-a5a2-3c6fefe4c26b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6e7d9fe-bd30-48de-be24-cc1f848b9545"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-63275c2f-7356-465f-ac06-fcd64f0ebb60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63275c2f-7356-465f-ac06-fcd64f0ebb60
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-555ed73b3621","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-63275c2f-7356-465f-ac06-fcd64f0ebb60
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
Location: /v1/conversations/cnv_5ca77762-e02e-4e8a-9f38-c5c5ab8ce7c6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5ca77762-e02e-4e8a-9f38-c5c5ab8ce7c6","subject":"Error contract","status":"open","region":"eu","participants":["qa-10b43fb57f5b","qa-555ed73b3621"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:27.162755668Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5ca77762-e02e-4e8a-9f38-c5c5ab8ce7c6/messages
correlation: qa-9fff5b1a-4a07-4717-a5b0-c62fa291e47d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fff5b1a-4a07-4717-a5b0-c62fa291e47d
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fff5b1a-4a07-4717-a5b0-c62fa291e47d
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_5ca77762-e02e-4e8a-9f38-c5c5ab8ce7c6/messages","correlationId":"qa-9fff5b1a-4a07-4717-a5b0-c62fa291e47d","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-51b32f2b-496b-4395-9c5f-64f998eb6573

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51b32f2b-496b-4395-9c5f-64f998eb6573
Content-Type: application/json

--- request body ---
{"handle":"qa-555ed73b3621","password":"****"}

--- response: 200 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-51b32f2b-496b-4395-9c5f-64f998eb6573
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c6d3234e-ca50-43e9-8cbc-9e6cc137009e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-034b51c8-6af1-4051-b2d2-31e91765d3ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-034b51c8-6af1-4051-b2d2-31e91765d3ef
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-034b51c8-6af1-4051-b2d2-31e91765d3ef
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
correlation: qa-5f6a0db2-8b5f-4d76-b98e-e7f8d3cf19d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f6a0db2-8b5f-4d76-b98e-e7f8d3cf19d3
Content-Type: application/json

--- request body ---
{"handle":"qa-555ed73b3621","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f6a0db2-8b5f-4d76-b98e-e7f8d3cf19d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f6a0db2-8b5f-4d76-b98e-e7f8d3cf19d3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4dab1da8-ebbf-446c-9717-67e2c3a2b803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dab1da8-ebbf-446c-9717-67e2c3a2b803
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4dab1da8-ebbf-446c-9717-67e2c3a2b803
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
correlation: qa-94cacd82-dbd4-4291-8c84-7c0e79d8b620

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94cacd82-dbd4-4291-8c84-7c0e79d8b620
Content-Type: application/json

--- request body ---
{"handle":"qa-10b43fb57f5b","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94cacd82-dbd4-4291-8c84-7c0e79d8b620
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94cacd82-dbd4-4291-8c84-7c0e79d8b620"}
```
