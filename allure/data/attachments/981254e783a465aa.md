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
| 1 | `POST /v1/accounts` | 201 | 249 | `qa-eab73d49-7c8d-4a58-9f1a-ea97f177278c` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-32dd6877-2722-4829-8d19-318495a78481` |
| 3 | `PATCH /v1/accounts/me` | 200 | 43 | `qa-2d49f154-e360-410c-acac-bedcb835baa4` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-1e70fb0b-0f33-411f-9c79-4feaadc52d8f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d9871560-63b7-43c3-a308-2c01727a8bd0` |
| 6 | `POST /v1/auth/token` | 401 | 21 | `qa-e488a915-a0ca-472e-a97f-6d44edb82e4c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eab73d49-7c8d-4a58-9f1a-ea97f177278c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eab73d49-7c8d-4a58-9f1a-ea97f177278c
Content-Type: application/json

--- request body ---
{"handle":"qa-565111c3f675","displayName":"QA 565111c3f675","password":"****","region":"eu"}

--- response: 201 in 249 ms ---
Date: Sat, 31 Oct 2026 08:31:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-eab73d49-7c8d-4a58-9f1a-ea97f177278c
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
Location: /v1/accounts/qa-565111c3f675
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45eb778a-a1f7-4f03-80cd-c4e680c18596","handle":"qa-565111c3f675","displayName":"QA 565111c3f675","region":"eu","role":"user","createdAt":"2026-10-31T08:31:23.874407976Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-32dd6877-2722-4829-8d19-318495a78481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32dd6877-2722-4829-8d19-318495a78481
Content-Type: application/json

--- request body ---
{"handle":"qa-565111c3f675","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-32dd6877-2722-4829-8d19-318495a78481
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45eb778a-a1f7-4f03-80cd-c4e680c18596"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-2d49f154-e360-410c-acac-bedcb835baa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d49f154-e360-410c-acac-bedcb835baa4
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 43 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d49f154-e360-410c-acac-bedcb835baa4
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

{"id":"acc_45eb778a-a1f7-4f03-80cd-c4e680c18596","handle":"qa-565111c3f675","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-31T08:31:23.874407976Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e70fb0b-0f33-411f-9c79-4feaadc52d8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e70fb0b-0f33-411f-9c79-4feaadc52d8f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e70fb0b-0f33-411f-9c79-4feaadc52d8f
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

{"id":"acc_45eb778a-a1f7-4f03-80cd-c4e680c18596","handle":"qa-565111c3f675","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-31T08:31:23.874407976Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d9871560-63b7-43c3-a308-2c01727a8bd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9871560-63b7-43c3-a308-2c01727a8bd0
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d9871560-63b7-43c3-a308-2c01727a8bd0
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
correlation: qa-e488a915-a0ca-472e-a97f-6d44edb82e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e488a915-a0ca-472e-a97f-6d44edb82e4c
Content-Type: application/json

--- request body ---
{"handle":"qa-565111c3f675","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e488a915-a0ca-472e-a97f-6d44edb82e4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e488a915-a0ca-472e-a97f-6d44edb82e4c"}
```
