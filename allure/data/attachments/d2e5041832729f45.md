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
| 1 | `POST /v1/accounts` | 201 | 308 | `qa-1b08d513-f6d1-4e86-b9cc-f412d28158d7` |
| 2 | `POST /v1/auth/token` | 200 | 38 | `qa-aa4b374c-55cc-49ad-a32d-8a6c2f931cb3` |
| 3 | `GET /v1/accounts/me` | 200 | 37 | `qa-4d43c741-5581-4491-8779-49004426fa49` |
| 4 | `GET /v1/accounts/me` | 200 | 22 | `qa-33a29f16-0f3f-4888-b333-f7fd38af9553` |
| 5 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-66273aea-944b-47a5-b55f-105ef1fc0e33` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-7e1708f7-4deb-428e-8d44-e10d720d6c50` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1b08d513-f6d1-4e86-b9cc-f412d28158d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b08d513-f6d1-4e86-b9cc-f412d28158d7
Content-Type: application/json

--- request body ---
{"handle":"qa-005beb5796d8","displayName":"QA 005beb5796d8","password":"****","region":"eu"}

--- response: 201 in 308 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b08d513-f6d1-4e86-b9cc-f412d28158d7
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
Location: /v1/accounts/qa-005beb5796d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd689fed-1f19-403a-bc94-8e4bafebfb2a","handle":"qa-005beb5796d8","displayName":"QA 005beb5796d8","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.598725763Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-aa4b374c-55cc-49ad-a32d-8a6c2f931cb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa4b374c-55cc-49ad-a32d-8a6c2f931cb3
Content-Type: application/json

--- request body ---
{"handle":"qa-005beb5796d8","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa4b374c-55cc-49ad-a32d-8a6c2f931cb3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd689fed-1f19-403a-bc94-8e4bafebfb2a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d43c741-5581-4491-8779-49004426fa49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d43c741-5581-4491-8779-49004426fa49
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d43c741-5581-4491-8779-49004426fa49
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

{"id":"acc_bd689fed-1f19-403a-bc94-8e4bafebfb2a","handle":"qa-005beb5796d8","displayName":"QA 005beb5796d8","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.598725763Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-33a29f16-0f3f-4888-b333-f7fd38af9553

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a29f16-0f3f-4888-b333-f7fd38af9553
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-33a29f16-0f3f-4888-b333-f7fd38af9553
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

{"id":"acc_bd689fed-1f19-403a-bc94-8e4bafebfb2a","handle":"qa-005beb5796d8","displayName":"QA 005beb5796d8","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.598725763Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66273aea-944b-47a5-b55f-105ef1fc0e33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66273aea-944b-47a5-b55f-105ef1fc0e33
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66273aea-944b-47a5-b55f-105ef1fc0e33
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
correlation: qa-7e1708f7-4deb-428e-8d44-e10d720d6c50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e1708f7-4deb-428e-8d44-e10d720d6c50
Content-Type: application/json

--- request body ---
{"handle":"qa-005beb5796d8","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e1708f7-4deb-428e-8d44-e10d720d6c50
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e1708f7-4deb-428e-8d44-e10d720d6c50"}
```
