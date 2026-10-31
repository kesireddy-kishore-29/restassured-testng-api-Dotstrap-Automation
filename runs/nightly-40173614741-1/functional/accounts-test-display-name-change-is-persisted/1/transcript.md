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
| 1 | `POST /v1/accounts` | 201 | 467 | `qa-86790b77-6ebf-4d8d-a73c-7cd26fffa539` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-eaf53a51-6d70-422d-8f2c-2e7acaebd316` |
| 3 | `PATCH /v1/accounts/me` | 200 | 46 | `qa-47b21911-6abb-4cd1-9bbe-287c25731c88` |
| 4 | `GET /v1/accounts/me` | 200 | 21 | `qa-b9f540f7-eeb5-4eb2-8b5f-6bccbda3abd3` |
| 5 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-3b2a5804-9cf3-462d-b228-f1c9f33afa85` |
| 6 | `POST /v1/auth/token` | 401 | 34 | `qa-4f2b61bc-8f83-43ad-9518-2adb7d1b5531` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-86790b77-6ebf-4d8d-a73c-7cd26fffa539

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86790b77-6ebf-4d8d-a73c-7cd26fffa539
Content-Type: application/json

--- request body ---
{"handle":"qa-41b3ebadabda","displayName":"QA 41b3ebadabda","password":"****","region":"eu"}

--- response: 201 in 467 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-86790b77-6ebf-4d8d-a73c-7cd26fffa539
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-41b3ebadabda
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5d43876-3887-463a-b864-a031743f0b1c","handle":"qa-41b3ebadabda","displayName":"QA 41b3ebadabda","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.176774621Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-eaf53a51-6d70-422d-8f2c-2e7acaebd316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaf53a51-6d70-422d-8f2c-2e7acaebd316
Content-Type: application/json

--- request body ---
{"handle":"qa-41b3ebadabda","password":"****"}

--- response: 200 in 44 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaf53a51-6d70-422d-8f2c-2e7acaebd316
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5d43876-3887-463a-b864-a031743f0b1c"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-47b21911-6abb-4cd1-9bbe-287c25731c88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47b21911-6abb-4cd1-9bbe-287c25731c88
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 46 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-47b21911-6abb-4cd1-9bbe-287c25731c88
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

{"id":"acc_b5d43876-3887-463a-b864-a031743f0b1c","handle":"qa-41b3ebadabda","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.176774621Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9f540f7-eeb5-4eb2-8b5f-6bccbda3abd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9f540f7-eeb5-4eb2-8b5f-6bccbda3abd3
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9f540f7-eeb5-4eb2-8b5f-6bccbda3abd3
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

{"id":"acc_b5d43876-3887-463a-b864-a031743f0b1c","handle":"qa-41b3ebadabda","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.176774621Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b2a5804-9cf3-462d-b228-f1c9f33afa85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b2a5804-9cf3-462d-b228-f1c9f33afa85
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b2a5804-9cf3-462d-b228-f1c9f33afa85
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
correlation: qa-4f2b61bc-8f83-43ad-9518-2adb7d1b5531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f2b61bc-8f83-43ad-9518-2adb7d1b5531
Content-Type: application/json

--- request body ---
{"handle":"qa-41b3ebadabda","password":"****"}

--- response: 401 in 34 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f2b61bc-8f83-43ad-9518-2adb7d1b5531
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f2b61bc-8f83-43ad-9518-2adb7d1b5531"}
```
