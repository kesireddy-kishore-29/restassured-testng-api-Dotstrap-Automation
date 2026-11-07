# Transcript: The owner reads back exactly what was created

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#ownerReadsBackTheAccountAsCreated` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 438 | `qa-e5a5ca0d-d9af-4e77-adde-9015934f73be` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-8ccb52ff-c7fd-4070-96d6-1ba6dbe7a3b7` |
| 3 | `GET /v1/accounts/me` | 200 | 62 | `qa-efac2208-9e37-4247-828a-5c1c288587f2` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-573252d9-612c-4717-bcb8-db322ab80982` |
| 5 | `POST /v1/auth/token` | 401 | 45 | `qa-3d1f09c5-977a-4a1e-b8f6-c5418196b113` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5a5ca0d-d9af-4e77-adde-9015934f73be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5a5ca0d-d9af-4e77-adde-9015934f73be
Content-Type: application/json

--- request body ---
{"handle":"qa-de184d4281da","displayName":"QA de184d4281da","password":"****","region":"in"}

--- response: 201 in 438 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5a5ca0d-d9af-4e77-adde-9015934f73be
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
Location: /v1/accounts/qa-de184d4281da
X-Served-Region: in
Content-Length: 181

{"id":"acc_b7434c03-388d-412d-89fb-609889e8df13","handle":"qa-de184d4281da","displayName":"QA de184d4281da","region":"in","role":"user","createdAt":"2026-11-01T09:23:24.299359600Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8ccb52ff-c7fd-4070-96d6-1ba6dbe7a3b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ccb52ff-c7fd-4070-96d6-1ba6dbe7a3b7
Content-Type: application/json

--- request body ---
{"handle":"qa-de184d4281da","password":"****"}

--- response: 200 in 43 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ccb52ff-c7fd-4070-96d6-1ba6dbe7a3b7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7434c03-388d-412d-89fb-609889e8df13"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-efac2208-9e37-4247-828a-5c1c288587f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efac2208-9e37-4247-828a-5c1c288587f2
Content-Type: application/json

--- response: 200 in 62 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-efac2208-9e37-4247-828a-5c1c288587f2
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
X-Served-Region: in
Content-Length: 181

{"id":"acc_b7434c03-388d-412d-89fb-609889e8df13","handle":"qa-de184d4281da","displayName":"QA de184d4281da","region":"in","role":"user","createdAt":"2026-11-01T09:23:24.299359600Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-573252d9-612c-4717-bcb8-db322ab80982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-573252d9-612c-4717-bcb8-db322ab80982
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-573252d9-612c-4717-bcb8-db322ab80982
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-3d1f09c5-977a-4a1e-b8f6-c5418196b113

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d1f09c5-977a-4a1e-b8f6-c5418196b113
Content-Type: application/json

--- request body ---
{"handle":"qa-de184d4281da","password":"****"}

--- response: 401 in 45 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d1f09c5-977a-4a1e-b8f6-c5418196b113
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d1f09c5-977a-4a1e-b8f6-c5418196b113"}
```
