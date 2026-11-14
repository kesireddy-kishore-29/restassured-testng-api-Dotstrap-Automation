# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-cb19c25e-011d-48f8-9c7a-ae76bdb04b6e` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-4d598cc5-b860-4ba1-a5d5-52ca04a71113` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-3e303a5e-c999-4084-9347-1e92e6f770c2` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-785852c3-ee99-4b52-8523-5665d3311098` |
| 5 | `POST /v1/credits/purchases` | 415 | 7 | `qa-3299bfee-72d9-4b1e-bd91-fbb53fccfe0c` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-0be5b323-c1f1-4dee-b0f6-c29371ea3195` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e0e5cfc7-4b6d-4b2b-b3d0-7dd13bab8cfd` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-0f6ff9d8-1e62-480c-b44f-9ae95c2bec9c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-ee718c90-da97-4995-92a1-419112e9864a` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-629481b8-e17f-4642-aee1-a992261811a6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb19c25e-011d-48f8-9c7a-ae76bdb04b6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb19c25e-011d-48f8-9c7a-ae76bdb04b6e
Content-Type: application/json

--- request body ---
{"handle":"qa-0be16a7eda6c","displayName":"QA 0be16a7eda6c","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb19c25e-011d-48f8-9c7a-ae76bdb04b6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Location: /v1/accounts/qa-0be16a7eda6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5eb40fdf-c61d-4cfc-931c-0a0806e7cde4","handle":"qa-0be16a7eda6c","displayName":"QA 0be16a7eda6c","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.622187941Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4d598cc5-b860-4ba1-a5d5-52ca04a71113

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d598cc5-b860-4ba1-a5d5-52ca04a71113
Content-Type: application/json

--- request body ---
{"handle":"qa-8bf266c01028","displayName":"QA 8bf266c01028","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d598cc5-b860-4ba1-a5d5-52ca04a71113
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Location: /v1/accounts/qa-8bf266c01028
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8976a63-5693-4898-91ce-adf119e50b50","handle":"qa-8bf266c01028","displayName":"QA 8bf266c01028","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.642277695Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3e303a5e-c999-4084-9347-1e92e6f770c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e303a5e-c999-4084-9347-1e92e6f770c2
Content-Type: application/json

--- request body ---
{"handle":"qa-0be16a7eda6c","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e303a5e-c999-4084-9347-1e92e6f770c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5eb40fdf-c61d-4cfc-931c-0a0806e7cde4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-785852c3-ee99-4b52-8523-5665d3311098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-785852c3-ee99-4b52-8523-5665d3311098
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8bf266c01028","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-785852c3-ee99-4b52-8523-5665d3311098
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
Location: /v1/conversations/cnv_41614612-3b64-498a-93fd-403d8c541be3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_41614612-3b64-498a-93fd-403d8c541be3","subject":"Error contract","status":"open","region":"eu","participants":["qa-0be16a7eda6c","qa-8bf266c01028"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.701463476Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3299bfee-72d9-4b1e-bd91-fbb53fccfe0c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1ba8d494030a49aaa39cff147fe92ab7
X-Correlation-Id: qa-3299bfee-72d9-4b1e-bd91-fbb53fccfe0c
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3299bfee-72d9-4b1e-bd91-fbb53fccfe0c
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-3299bfee-72d9-4b1e-bd91-fbb53fccfe0c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0be5b323-c1f1-4dee-b0f6-c29371ea3195

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0be5b323-c1f1-4dee-b0f6-c29371ea3195
Content-Type: application/json

--- request body ---
{"handle":"qa-8bf266c01028","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0be5b323-c1f1-4dee-b0f6-c29371ea3195
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8976a63-5693-4898-91ce-adf119e50b50"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e0e5cfc7-4b6d-4b2b-b3d0-7dd13bab8cfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0e5cfc7-4b6d-4b2b-b3d0-7dd13bab8cfd
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e0e5cfc7-4b6d-4b2b-b3d0-7dd13bab8cfd
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
correlation: qa-0f6ff9d8-1e62-480c-b44f-9ae95c2bec9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f6ff9d8-1e62-480c-b44f-9ae95c2bec9c
Content-Type: application/json

--- request body ---
{"handle":"qa-8bf266c01028","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f6ff9d8-1e62-480c-b44f-9ae95c2bec9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f6ff9d8-1e62-480c-b44f-9ae95c2bec9c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee718c90-da97-4995-92a1-419112e9864a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee718c90-da97-4995-92a1-419112e9864a
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee718c90-da97-4995-92a1-419112e9864a
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
correlation: qa-629481b8-e17f-4642-aee1-a992261811a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-629481b8-e17f-4642-aee1-a992261811a6
Content-Type: application/json

--- request body ---
{"handle":"qa-0be16a7eda6c","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-629481b8-e17f-4642-aee1-a992261811a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-629481b8-e17f-4642-aee1-a992261811a6"}
```
