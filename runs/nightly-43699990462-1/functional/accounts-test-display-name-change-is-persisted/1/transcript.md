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
| 1 | `POST /v1/accounts` | 201 | 387 | `qa-348e5fd9-1dad-4dd6-b959-97721afeba79` |
| 2 | `POST /v1/auth/token` | 200 | 64 | `qa-0f07a4ee-3b8b-46f4-b42f-3017a6a4fc6a` |
| 3 | `PATCH /v1/accounts/me` | 200 | 30 | `qa-d3d92bc6-1739-4e33-8193-a5b6ce40a0f7` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-38b5f25f-7eef-4129-9bbc-3d4f7eeb6dda` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-5fa1f409-6cf6-44b2-acb2-2e5c30ad6dbb` |
| 6 | `POST /v1/auth/token` | 401 | 21 | `qa-9c360d42-3ae8-43f2-bef6-523bd8ff157f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-348e5fd9-1dad-4dd6-b959-97721afeba79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-348e5fd9-1dad-4dd6-b959-97721afeba79
Content-Type: application/json

--- request body ---
{"handle":"qa-0fe0ac890f7e","displayName":"QA 0fe0ac890f7e","password":"****","region":"eu"}

--- response: 201 in 387 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-348e5fd9-1dad-4dd6-b959-97721afeba79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-0fe0ac890f7e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc373ff7-18e0-47d1-8e31-865197d0b040","handle":"qa-0fe0ac890f7e","displayName":"QA 0fe0ac890f7e","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.433409746Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0f07a4ee-3b8b-46f4-b42f-3017a6a4fc6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f07a4ee-3b8b-46f4-b42f-3017a6a4fc6a
Content-Type: application/json

--- request body ---
{"handle":"qa-0fe0ac890f7e","password":"****"}

--- response: 200 in 64 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f07a4ee-3b8b-46f4-b42f-3017a6a4fc6a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc373ff7-18e0-47d1-8e31-865197d0b040"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d3d92bc6-1739-4e33-8193-a5b6ce40a0f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3d92bc6-1739-4e33-8193-a5b6ce40a0f7
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3d92bc6-1739-4e33-8193-a5b6ce40a0f7
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

{"id":"acc_cc373ff7-18e0-47d1-8e31-865197d0b040","handle":"qa-0fe0ac890f7e","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.433409746Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-38b5f25f-7eef-4129-9bbc-3d4f7eeb6dda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38b5f25f-7eef-4129-9bbc-3d4f7eeb6dda
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-38b5f25f-7eef-4129-9bbc-3d4f7eeb6dda
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

{"id":"acc_cc373ff7-18e0-47d1-8e31-865197d0b040","handle":"qa-0fe0ac890f7e","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.433409746Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fa1f409-6cf6-44b2-acb2-2e5c30ad6dbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fa1f409-6cf6-44b2-acb2-2e5c30ad6dbb
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fa1f409-6cf6-44b2-acb2-2e5c30ad6dbb
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
correlation: qa-9c360d42-3ae8-43f2-bef6-523bd8ff157f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c360d42-3ae8-43f2-bef6-523bd8ff157f
Content-Type: application/json

--- request body ---
{"handle":"qa-0fe0ac890f7e","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c360d42-3ae8-43f2-bef6-523bd8ff157f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c360d42-3ae8-43f2-bef6-523bd8ff157f"}
```
