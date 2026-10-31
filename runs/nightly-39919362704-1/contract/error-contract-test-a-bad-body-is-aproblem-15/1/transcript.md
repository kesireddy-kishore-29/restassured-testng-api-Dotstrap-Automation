# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-af0d5690-99f3-4dfb-9af7-87b02b2496b8` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-d9038d0c-a28f-4dc2-bdf5-4b92598d1754` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-b60ad49d-f49b-46ce-905e-3cd7541b623b` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-33f9da5c-ab66-4c9c-9d8e-b62b65e073d3` |
| 5 | `POST /v1/credits/purchases` | 400 | 16 | `qa-33e2cae5-c85d-4ba6-829e-d74238c2770e` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-8c6e9aa2-6515-45b8-87bb-682630ac42fc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-62996d16-55e4-4faa-a498-94fb33b08f5e` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-8835692a-6bbe-41b5-af89-599e631bf82f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-5f5cf3e4-ecb9-4d34-94dc-1c10d0cd9585` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-70a27a9d-577a-4ac8-b441-d89c11c8d5e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-af0d5690-99f3-4dfb-9af7-87b02b2496b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af0d5690-99f3-4dfb-9af7-87b02b2496b8
Content-Type: application/json

--- request body ---
{"handle":"qa-26985b58cc3b","displayName":"QA 26985b58cc3b","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-af0d5690-99f3-4dfb-9af7-87b02b2496b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Location: /v1/accounts/qa-26985b58cc3b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff18e706-1c99-47bc-a6bb-d046f7fbdb38","handle":"qa-26985b58cc3b","displayName":"QA 26985b58cc3b","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.812989481Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9038d0c-a28f-4dc2-bdf5-4b92598d1754

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9038d0c-a28f-4dc2-bdf5-4b92598d1754
Content-Type: application/json

--- request body ---
{"handle":"qa-c691e3a413f3","displayName":"QA c691e3a413f3","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9038d0c-a28f-4dc2-bdf5-4b92598d1754
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Location: /v1/accounts/qa-c691e3a413f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6c04c23-f3bf-4c92-ae13-1579414d54cf","handle":"qa-c691e3a413f3","displayName":"QA c691e3a413f3","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.839240031Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b60ad49d-f49b-46ce-905e-3cd7541b623b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b60ad49d-f49b-46ce-905e-3cd7541b623b
Content-Type: application/json

--- request body ---
{"handle":"qa-26985b58cc3b","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b60ad49d-f49b-46ce-905e-3cd7541b623b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff18e706-1c99-47bc-a6bb-d046f7fbdb38"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-33f9da5c-ab66-4c9c-9d8e-b62b65e073d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33f9da5c-ab66-4c9c-9d8e-b62b65e073d3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c691e3a413f3","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-33f9da5c-ab66-4c9c-9d8e-b62b65e073d3
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
Location: /v1/conversations/cnv_bf2ec308-da68-40a4-87b0-8b092a62fd61
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bf2ec308-da68-40a4-87b0-8b092a62fd61","subject":"Error contract","status":"open","region":"eu","participants":["qa-26985b58cc3b","qa-c691e3a413f3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.961728099Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-33e2cae5-c85d-4ba6-829e-d74238c2770e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5a02746fcd7c4d27a01042360ecff2e9
X-Correlation-Id: qa-33e2cae5-c85d-4ba6-829e-d74238c2770e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33e2cae5-c85d-4ba6-829e-d74238c2770e
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-33e2cae5-c85d-4ba6-829e-d74238c2770e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8c6e9aa2-6515-45b8-87bb-682630ac42fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c6e9aa2-6515-45b8-87bb-682630ac42fc
Content-Type: application/json

--- request body ---
{"handle":"qa-c691e3a413f3","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c6e9aa2-6515-45b8-87bb-682630ac42fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6c04c23-f3bf-4c92-ae13-1579414d54cf"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62996d16-55e4-4faa-a498-94fb33b08f5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62996d16-55e4-4faa-a498-94fb33b08f5e
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62996d16-55e4-4faa-a498-94fb33b08f5e
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
correlation: qa-8835692a-6bbe-41b5-af89-599e631bf82f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8835692a-6bbe-41b5-af89-599e631bf82f
Content-Type: application/json

--- request body ---
{"handle":"qa-c691e3a413f3","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8835692a-6bbe-41b5-af89-599e631bf82f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8835692a-6bbe-41b5-af89-599e631bf82f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f5cf3e4-ecb9-4d34-94dc-1c10d0cd9585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f5cf3e4-ecb9-4d34-94dc-1c10d0cd9585
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f5cf3e4-ecb9-4d34-94dc-1c10d0cd9585
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
correlation: qa-70a27a9d-577a-4ac8-b441-d89c11c8d5e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a27a9d-577a-4ac8-b441-d89c11c8d5e0
Content-Type: application/json

--- request body ---
{"handle":"qa-26985b58cc3b","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70a27a9d-577a-4ac8-b441-d89c11c8d5e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70a27a9d-577a-4ac8-b441-d89c11c8d5e0"}
```
