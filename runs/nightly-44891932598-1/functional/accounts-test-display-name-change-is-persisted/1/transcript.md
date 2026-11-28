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
| 1 | `POST /v1/accounts` | 201 | 406 | `qa-a4003a6d-66cc-4915-afd5-cb31635202db` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-03dc0948-7abc-4495-b97e-1f0ff6bc51f0` |
| 3 | `PATCH /v1/accounts/me` | 200 | 40 | `qa-2358570c-fd3f-4b81-bc7e-5d1dd779b5a2` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-2e5dceb6-9e9f-46d7-8637-90706f67caa6` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-9fc411a8-6fe9-467f-9e43-f24dcee35d09` |
| 6 | `POST /v1/auth/token` | 401 | 32 | `qa-6582d33e-fcb5-48a0-b40e-50ae8d9ca0c6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4003a6d-66cc-4915-afd5-cb31635202db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4003a6d-66cc-4915-afd5-cb31635202db
Content-Type: application/json

--- request body ---
{"handle":"qa-7dca5c0fd620","displayName":"QA 7dca5c0fd620","password":"****","region":"eu"}

--- response: 201 in 406 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4003a6d-66cc-4915-afd5-cb31635202db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-7dca5c0fd620
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c0b19d3b-0174-4610-8175-e1ef3bfcbefa","handle":"qa-7dca5c0fd620","displayName":"QA 7dca5c0fd620","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.343151879Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-03dc0948-7abc-4495-b97e-1f0ff6bc51f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03dc0948-7abc-4495-b97e-1f0ff6bc51f0
Content-Type: application/json

--- request body ---
{"handle":"qa-7dca5c0fd620","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-03dc0948-7abc-4495-b97e-1f0ff6bc51f0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0b19d3b-0174-4610-8175-e1ef3bfcbefa"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-2358570c-fd3f-4b81-bc7e-5d1dd779b5a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2358570c-fd3f-4b81-bc7e-5d1dd779b5a2
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2358570c-fd3f-4b81-bc7e-5d1dd779b5a2
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

{"id":"acc_c0b19d3b-0174-4610-8175-e1ef3bfcbefa","handle":"qa-7dca5c0fd620","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.343151879Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e5dceb6-9e9f-46d7-8637-90706f67caa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e5dceb6-9e9f-46d7-8637-90706f67caa6
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e5dceb6-9e9f-46d7-8637-90706f67caa6
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

{"id":"acc_c0b19d3b-0174-4610-8175-e1ef3bfcbefa","handle":"qa-7dca5c0fd620","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.343151879Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9fc411a8-6fe9-467f-9e43-f24dcee35d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fc411a8-6fe9-467f-9e43-f24dcee35d09
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9fc411a8-6fe9-467f-9e43-f24dcee35d09
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
correlation: qa-6582d33e-fcb5-48a0-b40e-50ae8d9ca0c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6582d33e-fcb5-48a0-b40e-50ae8d9ca0c6
Content-Type: application/json

--- request body ---
{"handle":"qa-7dca5c0fd620","password":"****"}

--- response: 401 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6582d33e-fcb5-48a0-b40e-50ae8d9ca0c6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6582d33e-fcb5-48a0-b40e-50ae8d9ca0c6"}
```
