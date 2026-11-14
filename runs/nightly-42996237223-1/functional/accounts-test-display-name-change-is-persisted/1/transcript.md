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
| 1 | `POST /v1/accounts` | 201 | 458 | `qa-8a071e0d-a155-41b0-b63d-54d89f7a0a57` |
| 2 | `POST /v1/auth/token` | 200 | 67 | `qa-4da5ceb7-a35e-4979-891c-d239ee9123d3` |
| 3 | `PATCH /v1/accounts/me` | 200 | 50 | `qa-5ee77e13-d1c1-492f-9960-7a88ae9d3b6f` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-1094a31e-5e92-4f09-9df1-56eaa8584a1a` |
| 5 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-7e40049e-5aad-4018-8056-3dc3085dd284` |
| 6 | `POST /v1/auth/token` | 401 | 37 | `qa-ec66eb40-20f5-424c-b718-26e4d15a259c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8a071e0d-a155-41b0-b63d-54d89f7a0a57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a071e0d-a155-41b0-b63d-54d89f7a0a57
Content-Type: application/json

--- request body ---
{"handle":"qa-21a53ab7802d","displayName":"QA 21a53ab7802d","password":"****","region":"eu"}

--- response: 201 in 458 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a071e0d-a155-41b0-b63d-54d89f7a0a57
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
Location: /v1/accounts/qa-21a53ab7802d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_afc98ca4-0be2-4b4a-b7c7-66b1201e5de4","handle":"qa-21a53ab7802d","displayName":"QA 21a53ab7802d","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.174146547Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4da5ceb7-a35e-4979-891c-d239ee9123d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4da5ceb7-a35e-4979-891c-d239ee9123d3
Content-Type: application/json

--- request body ---
{"handle":"qa-21a53ab7802d","password":"****"}

--- response: 200 in 67 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4da5ceb7-a35e-4979-891c-d239ee9123d3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afc98ca4-0be2-4b4a-b7c7-66b1201e5de4"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-5ee77e13-d1c1-492f-9960-7a88ae9d3b6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ee77e13-d1c1-492f-9960-7a88ae9d3b6f
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 50 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ee77e13-d1c1-492f-9960-7a88ae9d3b6f
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

{"id":"acc_afc98ca4-0be2-4b4a-b7c7-66b1201e5de4","handle":"qa-21a53ab7802d","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.174146547Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-1094a31e-5e92-4f09-9df1-56eaa8584a1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1094a31e-5e92-4f09-9df1-56eaa8584a1a
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1094a31e-5e92-4f09-9df1-56eaa8584a1a
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

{"id":"acc_afc98ca4-0be2-4b4a-b7c7-66b1201e5de4","handle":"qa-21a53ab7802d","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.174146547Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e40049e-5aad-4018-8056-3dc3085dd284

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e40049e-5aad-4018-8056-3dc3085dd284
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e40049e-5aad-4018-8056-3dc3085dd284
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
correlation: qa-ec66eb40-20f5-424c-b718-26e4d15a259c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec66eb40-20f5-424c-b718-26e4d15a259c
Content-Type: application/json

--- request body ---
{"handle":"qa-21a53ab7802d","password":"****"}

--- response: 401 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec66eb40-20f5-424c-b718-26e4d15a259c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec66eb40-20f5-424c-b718-26e4d15a259c"}
```
