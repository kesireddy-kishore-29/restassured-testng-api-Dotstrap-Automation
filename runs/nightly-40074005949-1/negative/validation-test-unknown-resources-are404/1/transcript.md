# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 390 | `qa-aed6f13e-446c-4cb4-9773-05f06222aa3d` |
| 2 | `POST /v1/auth/token` | 200 | 45 | `qa-1bf33961-88f6-4d7c-adf2-5f898d9ba525` |
| 3 | `GET /v1/conversations/{id}` | 404 | 55 | `qa-58a37948-93e0-4303-b287-db42d523561f` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 31 | `qa-55f62264-2430-4eda-b620-1838c185c3f3` |
| 5 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-43b60497-66d6-4c6d-bd85-b0dd88e57a29` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-7563b903-1b8b-4a30-9492-744c72734b8c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aed6f13e-446c-4cb4-9773-05f06222aa3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aed6f13e-446c-4cb4-9773-05f06222aa3d
Content-Type: application/json

--- request body ---
{"handle":"qa-8a09bb5708d5","displayName":"QA 8a09bb5708d5","password":"****","region":"eu"}

--- response: 201 in 390 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-aed6f13e-446c-4cb4-9773-05f06222aa3d
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
Location: /v1/accounts/qa-8a09bb5708d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7343e87e-a49a-4873-8c1d-5c51a973b702","handle":"qa-8a09bb5708d5","displayName":"QA 8a09bb5708d5","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.400217383Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1bf33961-88f6-4d7c-adf2-5f898d9ba525

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bf33961-88f6-4d7c-adf2-5f898d9ba525
Content-Type: application/json

--- request body ---
{"handle":"qa-8a09bb5708d5","password":"****"}

--- response: 200 in 45 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bf33961-88f6-4d7c-adf2-5f898d9ba525
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7343e87e-a49a-4873-8c1d-5c51a973b702"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-58a37948-93e0-4303-b287-db42d523561f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58a37948-93e0-4303-b287-db42d523561f
Content-Type: application/json

--- response: 404 in 55 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58a37948-93e0-4303-b287-db42d523561f
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-58a37948-93e0-4303-b287-db42d523561f"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-55f62264-2430-4eda-b620-1838c185c3f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55f62264-2430-4eda-b620-1838c185c3f3
Content-Type: application/json

--- response: 404 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55f62264-2430-4eda-b620-1838c185c3f3
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-55f62264-2430-4eda-b620-1838c185c3f3"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43b60497-66d6-4c6d-bd85-b0dd88e57a29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43b60497-66d6-4c6d-bd85-b0dd88e57a29
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43b60497-66d6-4c6d-bd85-b0dd88e57a29
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
correlation: qa-7563b903-1b8b-4a30-9492-744c72734b8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7563b903-1b8b-4a30-9492-744c72734b8c
Content-Type: application/json

--- request body ---
{"handle":"qa-8a09bb5708d5","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7563b903-1b8b-4a30-9492-744c72734b8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7563b903-1b8b-4a30-9492-744c72734b8c"}
```
