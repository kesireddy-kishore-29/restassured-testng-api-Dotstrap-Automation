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
| 1 | `POST /v1/accounts` | 201 | 401 | `qa-eb954c71-c2d0-4011-be85-d2590d52e8e1` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-d3071c9d-327e-435f-b4b1-f2034e59088f` |
| 3 | `GET /v1/accounts/me` | 200 | 50 | `qa-86f39d73-96e6-4647-b01e-f9d4d2a6d8a8` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-ebe46792-fbe5-4ea2-b5f0-8f92620c90a8` |
| 5 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-8d30ff34-5c0d-4ece-bfa2-d82f59c78d84` |
| 6 | `POST /v1/auth/token` | 401 | 14 | `qa-f35c189c-9b8d-442c-ac9e-48a12c2951f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eb954c71-c2d0-4011-be85-d2590d52e8e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb954c71-c2d0-4011-be85-d2590d52e8e1
Content-Type: application/json

--- request body ---
{"handle":"qa-7a713fa274ae","displayName":"QA 7a713fa274ae","password":"****","region":"eu"}

--- response: 201 in 401 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb954c71-c2d0-4011-be85-d2590d52e8e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Location: /v1/accounts/qa-7a713fa274ae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb747ce5-51db-495d-b7f0-b3609f46585e","handle":"qa-7a713fa274ae","displayName":"QA 7a713fa274ae","region":"eu","role":"user","createdAt":"2026-11-06T09:30:38.778024180Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d3071c9d-327e-435f-b4b1-f2034e59088f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3071c9d-327e-435f-b4b1-f2034e59088f
Content-Type: application/json

--- request body ---
{"handle":"qa-7a713fa274ae","password":"****"}

--- response: 200 in 54 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3071c9d-327e-435f-b4b1-f2034e59088f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb747ce5-51db-495d-b7f0-b3609f46585e"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-86f39d73-96e6-4647-b01e-f9d4d2a6d8a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f39d73-96e6-4647-b01e-f9d4d2a6d8a8
Content-Type: application/json

--- response: 200 in 50 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-86f39d73-96e6-4647-b01e-f9d4d2a6d8a8
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

{"id":"acc_cb747ce5-51db-495d-b7f0-b3609f46585e","handle":"qa-7a713fa274ae","displayName":"QA 7a713fa274ae","region":"eu","role":"user","createdAt":"2026-11-06T09:30:38.778024180Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ebe46792-fbe5-4ea2-b5f0-8f92620c90a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebe46792-fbe5-4ea2-b5f0-8f92620c90a8
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebe46792-fbe5-4ea2-b5f0-8f92620c90a8
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

{"id":"acc_cb747ce5-51db-495d-b7f0-b3609f46585e","handle":"qa-7a713fa274ae","displayName":"QA 7a713fa274ae","region":"eu","role":"user","createdAt":"2026-11-06T09:30:38.778024180Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d30ff34-5c0d-4ece-bfa2-d82f59c78d84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d30ff34-5c0d-4ece-bfa2-d82f59c78d84
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d30ff34-5c0d-4ece-bfa2-d82f59c78d84
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
correlation: qa-f35c189c-9b8d-442c-ac9e-48a12c2951f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f35c189c-9b8d-442c-ac9e-48a12c2951f1
Content-Type: application/json

--- request body ---
{"handle":"qa-7a713fa274ae","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f35c189c-9b8d-442c-ac9e-48a12c2951f1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f35c189c-9b8d-442c-ac9e-48a12c2951f1"}
```
