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
| 1 | `POST /v1/accounts` | 201 | 401 | `qa-b3572910-ef16-4a3c-ab09-25b4c8f60f8f` |
| 2 | `POST /v1/auth/token` | 200 | 72 | `qa-00d1b8e2-aabd-40e3-834d-4007579321a0` |
| 3 | `PATCH /v1/accounts/me` | 200 | 44 | `qa-012bba06-25a1-4d10-9461-528a9d7d65a3` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-9f45c4bd-f2bc-48bb-bc44-6b81807b7d8a` |
| 5 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c41c1c38-1431-46bc-8580-14a3b73b6a94` |
| 6 | `POST /v1/auth/token` | 401 | 26 | `qa-8c171252-88b6-45a9-84fb-fa0033acf002` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3572910-ef16-4a3c-ab09-25b4c8f60f8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3572910-ef16-4a3c-ab09-25b4c8f60f8f
Content-Type: application/json

--- request body ---
{"handle":"qa-e6d573094d1a","displayName":"QA e6d573094d1a","password":"****","region":"eu"}

--- response: 201 in 401 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3572910-ef16-4a3c-ab09-25b4c8f60f8f
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
Location: /v1/accounts/qa-e6d573094d1a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1e9c8289-6090-411d-bec6-85e1fd4e08f8","handle":"qa-e6d573094d1a","displayName":"QA e6d573094d1a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.164254229Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-00d1b8e2-aabd-40e3-834d-4007579321a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00d1b8e2-aabd-40e3-834d-4007579321a0
Content-Type: application/json

--- request body ---
{"handle":"qa-e6d573094d1a","password":"****"}

--- response: 200 in 72 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-00d1b8e2-aabd-40e3-834d-4007579321a0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1e9c8289-6090-411d-bec6-85e1fd4e08f8"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-012bba06-25a1-4d10-9461-528a9d7d65a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-012bba06-25a1-4d10-9461-528a9d7d65a3
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 44 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-012bba06-25a1-4d10-9461-528a9d7d65a3
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

{"id":"acc_1e9c8289-6090-411d-bec6-85e1fd4e08f8","handle":"qa-e6d573094d1a","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.164254229Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f45c4bd-f2bc-48bb-bc44-6b81807b7d8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f45c4bd-f2bc-48bb-bc44-6b81807b7d8a
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f45c4bd-f2bc-48bb-bc44-6b81807b7d8a
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

{"id":"acc_1e9c8289-6090-411d-bec6-85e1fd4e08f8","handle":"qa-e6d573094d1a","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.164254229Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c41c1c38-1431-46bc-8580-14a3b73b6a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c41c1c38-1431-46bc-8580-14a3b73b6a94
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c41c1c38-1431-46bc-8580-14a3b73b6a94
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
correlation: qa-8c171252-88b6-45a9-84fb-fa0033acf002

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c171252-88b6-45a9-84fb-fa0033acf002
Content-Type: application/json

--- request body ---
{"handle":"qa-e6d573094d1a","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c171252-88b6-45a9-84fb-fa0033acf002
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c171252-88b6-45a9-84fb-fa0033acf002"}
```
