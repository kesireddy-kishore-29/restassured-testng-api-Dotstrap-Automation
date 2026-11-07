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
| 1 | `POST /v1/accounts` | 201 | 444 | `qa-2ef28fa8-a175-49e7-97e4-1dd3d8bdf418` |
| 2 | `POST /v1/auth/token` | 200 | 53 | `qa-f6e9aa39-6e23-4b37-b0ea-9aad4e7d9403` |
| 3 | `PATCH /v1/accounts/me` | 200 | 57 | `qa-0f34cd65-e9af-41c3-9794-a1c8d6d06181` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-f49f0412-e33c-4439-a5fb-f0f68755770f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-c7a36b67-5d85-4534-87a7-1b0eb5b1d9d9` |
| 6 | `POST /v1/auth/token` | 401 | 41 | `qa-5445a315-0a81-4d99-807a-5f4f523d1589` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2ef28fa8-a175-49e7-97e4-1dd3d8bdf418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef28fa8-a175-49e7-97e4-1dd3d8bdf418
Content-Type: application/json

--- request body ---
{"handle":"qa-1df0773d2931","displayName":"QA 1df0773d2931","password":"****","region":"eu"}

--- response: 201 in 444 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ef28fa8-a175-49e7-97e4-1dd3d8bdf418
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
Location: /v1/accounts/qa-1df0773d2931
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af1d1c68-2c8c-4c31-bec2-ba35298d8a58","handle":"qa-1df0773d2931","displayName":"QA 1df0773d2931","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.290444384Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f6e9aa39-6e23-4b37-b0ea-9aad4e7d9403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6e9aa39-6e23-4b37-b0ea-9aad4e7d9403
Content-Type: application/json

--- request body ---
{"handle":"qa-1df0773d2931","password":"****"}

--- response: 200 in 53 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6e9aa39-6e23-4b37-b0ea-9aad4e7d9403
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af1d1c68-2c8c-4c31-bec2-ba35298d8a58"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-0f34cd65-e9af-41c3-9794-a1c8d6d06181

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f34cd65-e9af-41c3-9794-a1c8d6d06181
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 57 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f34cd65-e9af-41c3-9794-a1c8d6d06181
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

{"id":"acc_af1d1c68-2c8c-4c31-bec2-ba35298d8a58","handle":"qa-1df0773d2931","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.290444384Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-f49f0412-e33c-4439-a5fb-f0f68755770f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f49f0412-e33c-4439-a5fb-f0f68755770f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f49f0412-e33c-4439-a5fb-f0f68755770f
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

{"id":"acc_af1d1c68-2c8c-4c31-bec2-ba35298d8a58","handle":"qa-1df0773d2931","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.290444384Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7a36b67-5d85-4534-87a7-1b0eb5b1d9d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7a36b67-5d85-4534-87a7-1b0eb5b1d9d9
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7a36b67-5d85-4534-87a7-1b0eb5b1d9d9
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
correlation: qa-5445a315-0a81-4d99-807a-5f4f523d1589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5445a315-0a81-4d99-807a-5f4f523d1589
Content-Type: application/json

--- request body ---
{"handle":"qa-1df0773d2931","password":"****"}

--- response: 401 in 41 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5445a315-0a81-4d99-807a-5f4f523d1589
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5445a315-0a81-4d99-807a-5f4f523d1589"}
```
