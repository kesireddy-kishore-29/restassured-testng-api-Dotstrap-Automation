# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 383 | `qa-5212663b-9dfb-41c7-b3d5-fe5a94f472c1` |
| 2 | `POST /v1/auth/token` | 200 | 41 | `qa-d97850f2-568d-441a-8aac-d153fc3e3f3a` |
| 3 | `GET /v1/accounts/me` | 200 | 36 | `qa-379463aa-1873-497d-854b-6856e6d23fce` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-9fc04d7d-d250-4b2f-a127-151ce5d03685` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-0b5089f9-9b68-41a5-8dcc-b317b9f702ba` |
| 6 | `POST /v1/auth/token` | 401 | 39 | `qa-41919b2b-51f2-4b40-9da5-b5ce4aeb495d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5212663b-9dfb-41c7-b3d5-fe5a94f472c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5212663b-9dfb-41c7-b3d5-fe5a94f472c1
Content-Type: application/json

--- request body ---
{"handle":"qa-275aa2b2c7a8","displayName":"QA 275aa2b2c7a8","password":"****","region":"eu"}

--- response: 201 in 383 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-5212663b-9dfb-41c7-b3d5-fe5a94f472c1
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
Location: /v1/accounts/qa-275aa2b2c7a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_343a6dd2-1354-4d58-a4c7-4759bf2819c1","handle":"qa-275aa2b2c7a8","displayName":"QA 275aa2b2c7a8","region":"eu","role":"user","createdAt":"2026-11-14T09:05:22.385676712Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d97850f2-568d-441a-8aac-d153fc3e3f3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d97850f2-568d-441a-8aac-d153fc3e3f3a
Content-Type: application/json

--- request body ---
{"handle":"qa-275aa2b2c7a8","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-d97850f2-568d-441a-8aac-d153fc3e3f3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_343a6dd2-1354-4d58-a4c7-4759bf2819c1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-379463aa-1873-497d-854b-6856e6d23fce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-379463aa-1873-497d-854b-6856e6d23fce
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-379463aa-1873-497d-854b-6856e6d23fce
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
Content-Length: 181

{"id":"acc_343a6dd2-1354-4d58-a4c7-4759bf2819c1","handle":"qa-275aa2b2c7a8","displayName":"QA 275aa2b2c7a8","region":"eu","role":"user","createdAt":"2026-11-14T09:05:22.385676712Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fc04d7d-d250-4b2f-a127-151ce5d03685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fc04d7d-d250-4b2f-a127-151ce5d03685
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fc04d7d-d250-4b2f-a127-151ce5d03685
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
Content-Length: 181

{"id":"acc_343a6dd2-1354-4d58-a4c7-4759bf2819c1","handle":"qa-275aa2b2c7a8","displayName":"QA 275aa2b2c7a8","region":"eu","role":"user","createdAt":"2026-11-14T09:05:22.385676712Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b5089f9-9b68-41a5-8dcc-b317b9f702ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b5089f9-9b68-41a5-8dcc-b317b9f702ba
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b5089f9-9b68-41a5-8dcc-b317b9f702ba
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
correlation: qa-41919b2b-51f2-4b40-9da5-b5ce4aeb495d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41919b2b-51f2-4b40-9da5-b5ce4aeb495d
Content-Type: application/json

--- request body ---
{"handle":"qa-275aa2b2c7a8","password":"****"}

--- response: 401 in 39 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41919b2b-51f2-4b40-9da5-b5ce4aeb495d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-41919b2b-51f2-4b40-9da5-b5ce4aeb495d"}
```
