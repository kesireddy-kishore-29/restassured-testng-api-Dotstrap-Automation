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
| 1 | `POST /v1/accounts` | 201 | 334 | `qa-6514ac62-f105-4e8c-b564-8ff8633b25e4` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-e40899ea-e380-4784-b6db-6a2773da05ed` |
| 3 | `GET /v1/accounts/me` | 200 | 42 | `qa-1cf83c56-d370-49bc-8ebd-84083e3dd089` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-fc28c14e-65c8-4d69-9e22-b0d5c478a7ae` |
| 5 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-71fc13fd-b6e5-415d-9f9a-57ff57816f4b` |
| 6 | `POST /v1/auth/token` | 401 | 10 | `qa-15d51926-3ad7-4e8e-a4ed-5c2030d731b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6514ac62-f105-4e8c-b564-8ff8633b25e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6514ac62-f105-4e8c-b564-8ff8633b25e4
Content-Type: application/json

--- request body ---
{"handle":"qa-034d55dae0f3","displayName":"QA 034d55dae0f3","password":"****","region":"eu"}

--- response: 201 in 334 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6514ac62-f105-4e8c-b564-8ff8633b25e4
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
Location: /v1/accounts/qa-034d55dae0f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc132559-80f8-4ef7-8f4a-55af3f98e56c","handle":"qa-034d55dae0f3","displayName":"QA 034d55dae0f3","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.043219327Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e40899ea-e380-4784-b6db-6a2773da05ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e40899ea-e380-4784-b6db-6a2773da05ed
Content-Type: application/json

--- request body ---
{"handle":"qa-034d55dae0f3","password":"****"}

--- response: 200 in 55 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e40899ea-e380-4784-b6db-6a2773da05ed
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc132559-80f8-4ef7-8f4a-55af3f98e56c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1cf83c56-d370-49bc-8ebd-84083e3dd089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf83c56-d370-49bc-8ebd-84083e3dd089
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cf83c56-d370-49bc-8ebd-84083e3dd089
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

{"id":"acc_fc132559-80f8-4ef7-8f4a-55af3f98e56c","handle":"qa-034d55dae0f3","displayName":"QA 034d55dae0f3","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.043219327Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc28c14e-65c8-4d69-9e22-b0d5c478a7ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc28c14e-65c8-4d69-9e22-b0d5c478a7ae
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc28c14e-65c8-4d69-9e22-b0d5c478a7ae
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

{"id":"acc_fc132559-80f8-4ef7-8f4a-55af3f98e56c","handle":"qa-034d55dae0f3","displayName":"QA 034d55dae0f3","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.043219327Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71fc13fd-b6e5-415d-9f9a-57ff57816f4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71fc13fd-b6e5-415d-9f9a-57ff57816f4b
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71fc13fd-b6e5-415d-9f9a-57ff57816f4b
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
correlation: qa-15d51926-3ad7-4e8e-a4ed-5c2030d731b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15d51926-3ad7-4e8e-a4ed-5c2030d731b8
Content-Type: application/json

--- request body ---
{"handle":"qa-034d55dae0f3","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15d51926-3ad7-4e8e-a4ed-5c2030d731b8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15d51926-3ad7-4e8e-a4ed-5c2030d731b8"}
```
