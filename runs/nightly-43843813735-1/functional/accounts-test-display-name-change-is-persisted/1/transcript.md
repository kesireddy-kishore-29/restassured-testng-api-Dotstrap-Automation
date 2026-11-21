# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 405 | `qa-1beda069-9141-4485-ac55-4ac7ab9c8ad2` |
| 2 | `POST /v1/auth/token` | 200 | 53 | `qa-4709edc3-d7d5-4753-a11d-87aebe9aa0cf` |
| 3 | `PATCH /v1/accounts/me` | 200 | 34 | `qa-e1fa2e5a-37ab-4f28-8abb-517a308ea0c0` |
| 4 | `GET /v1/accounts/me` | 200 | 27 | `qa-ddd9c41a-1d00-4d51-bbb6-60a07db57f1b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-34092b74-e718-4d34-b841-8131860a8d2c` |
| 6 | `POST /v1/auth/token` | 401 | 43 | `qa-7241cce8-d05c-4ba0-b710-1ae249d35056` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1beda069-9141-4485-ac55-4ac7ab9c8ad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1beda069-9141-4485-ac55-4ac7ab9c8ad2
Content-Type: application/json

--- request body ---
{"handle":"qa-2f4f72207430","displayName":"QA 2f4f72207430","password":"****","region":"eu"}

--- response: 201 in 405 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1beda069-9141-4485-ac55-4ac7ab9c8ad2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-2f4f72207430
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d286309-b179-485d-be58-5388de941dc2","handle":"qa-2f4f72207430","displayName":"QA 2f4f72207430","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.783619776Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4709edc3-d7d5-4753-a11d-87aebe9aa0cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4709edc3-d7d5-4753-a11d-87aebe9aa0cf
Content-Type: application/json

--- request body ---
{"handle":"qa-2f4f72207430","password":"****"}

--- response: 200 in 53 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4709edc3-d7d5-4753-a11d-87aebe9aa0cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d286309-b179-485d-be58-5388de941dc2"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e1fa2e5a-37ab-4f28-8abb-517a308ea0c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1fa2e5a-37ab-4f28-8abb-517a308ea0c0
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 34 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1fa2e5a-37ab-4f28-8abb-517a308ea0c0
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
Content-Length: 179

{"id":"acc_2d286309-b179-485d-be58-5388de941dc2","handle":"qa-2f4f72207430","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.783619776Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ddd9c41a-1d00-4d51-bbb6-60a07db57f1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddd9c41a-1d00-4d51-bbb6-60a07db57f1b
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddd9c41a-1d00-4d51-bbb6-60a07db57f1b
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
Content-Length: 179

{"id":"acc_2d286309-b179-485d-be58-5388de941dc2","handle":"qa-2f4f72207430","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.783619776Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-34092b74-e718-4d34-b841-8131860a8d2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34092b74-e718-4d34-b841-8131860a8d2c
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-34092b74-e718-4d34-b841-8131860a8d2c
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7241cce8-d05c-4ba0-b710-1ae249d35056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7241cce8-d05c-4ba0-b710-1ae249d35056
Content-Type: application/json

--- request body ---
{"handle":"qa-2f4f72207430","password":"****"}

--- response: 401 in 43 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7241cce8-d05c-4ba0-b710-1ae249d35056
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7241cce8-d05c-4ba0-b710-1ae249d35056"}
```
