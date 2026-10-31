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
| 1 | `POST /v1/accounts` | 201 | 373 | `qa-8f2e6f94-f5c3-41d0-a255-4f24573ebf49` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-a001da27-1ab1-446d-91de-ec8cd03183c7` |
| 3 | `GET /v1/accounts/me` | 200 | 47 | `qa-372cf304-f5d4-46dd-a886-151971f3ab02` |
| 4 | `GET /v1/accounts/me` | 200 | 23 | `qa-ed33fa37-9fc6-40c1-a90d-2cb582217da0` |
| 5 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-1c484f8f-6166-4206-96be-3b286b52ec14` |
| 6 | `POST /v1/auth/token` | 401 | 23 | `qa-a1cb6a72-8268-45a6-bd03-dd44dc75e473` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f2e6f94-f5c3-41d0-a255-4f24573ebf49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2e6f94-f5c3-41d0-a255-4f24573ebf49
Content-Type: application/json

--- request body ---
{"handle":"qa-a228e9da8acd","displayName":"QA a228e9da8acd","password":"****","region":"eu"}

--- response: 201 in 373 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f2e6f94-f5c3-41d0-a255-4f24573ebf49
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
Location: /v1/accounts/qa-a228e9da8acd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8451305-541d-42bd-8dda-db3014f9b95a","handle":"qa-a228e9da8acd","displayName":"QA a228e9da8acd","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.059791995Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a001da27-1ab1-446d-91de-ec8cd03183c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a001da27-1ab1-446d-91de-ec8cd03183c7
Content-Type: application/json

--- request body ---
{"handle":"qa-a228e9da8acd","password":"****"}

--- response: 200 in 54 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a001da27-1ab1-446d-91de-ec8cd03183c7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8451305-541d-42bd-8dda-db3014f9b95a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-372cf304-f5d4-46dd-a886-151971f3ab02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-372cf304-f5d4-46dd-a886-151971f3ab02
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-372cf304-f5d4-46dd-a886-151971f3ab02
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

{"id":"acc_b8451305-541d-42bd-8dda-db3014f9b95a","handle":"qa-a228e9da8acd","displayName":"QA a228e9da8acd","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.059791995Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed33fa37-9fc6-40c1-a90d-2cb582217da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed33fa37-9fc6-40c1-a90d-2cb582217da0
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed33fa37-9fc6-40c1-a90d-2cb582217da0
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

{"id":"acc_b8451305-541d-42bd-8dda-db3014f9b95a","handle":"qa-a228e9da8acd","displayName":"QA a228e9da8acd","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.059791995Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c484f8f-6166-4206-96be-3b286b52ec14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c484f8f-6166-4206-96be-3b286b52ec14
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c484f8f-6166-4206-96be-3b286b52ec14
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
correlation: qa-a1cb6a72-8268-45a6-bd03-dd44dc75e473

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1cb6a72-8268-45a6-bd03-dd44dc75e473
Content-Type: application/json

--- request body ---
{"handle":"qa-a228e9da8acd","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1cb6a72-8268-45a6-bd03-dd44dc75e473
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1cb6a72-8268-45a6-bd03-dd44dc75e473"}
```
