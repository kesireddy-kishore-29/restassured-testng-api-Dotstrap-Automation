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
| 1 | `POST /v1/accounts` | 201 | 390 | `qa-1a9d20c2-13fc-497b-86f7-8d9cd4d187d8` |
| 2 | `POST /v1/auth/token` | 200 | 67 | `qa-974ab548-f494-4ea5-a3fd-86dc658d6b72` |
| 3 | `GET /v1/accounts/me` | 200 | 59 | `qa-5f58bd28-2b6f-45ef-9f45-7d339d25dc36` |
| 4 | `GET /v1/accounts/me` | 200 | 22 | `qa-0d6ee2e4-741e-4fce-a2b4-008132655c28` |
| 5 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-70e8f1ad-6b1c-423c-8a0a-34258c0326e0` |
| 6 | `POST /v1/auth/token` | 401 | 19 | `qa-63e2110a-934b-47cd-b896-d5e4845b5675` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1a9d20c2-13fc-497b-86f7-8d9cd4d187d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a9d20c2-13fc-497b-86f7-8d9cd4d187d8
Content-Type: application/json

--- request body ---
{"handle":"qa-495f411f50d3","displayName":"QA 495f411f50d3","password":"****","region":"eu"}

--- response: 201 in 390 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a9d20c2-13fc-497b-86f7-8d9cd4d187d8
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
Location: /v1/accounts/qa-495f411f50d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b1aefcf-1a85-4b55-8f7b-109684c97792","handle":"qa-495f411f50d3","displayName":"QA 495f411f50d3","region":"eu","role":"user","createdAt":"2026-11-17T10:50:21.127833317Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-974ab548-f494-4ea5-a3fd-86dc658d6b72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-974ab548-f494-4ea5-a3fd-86dc658d6b72
Content-Type: application/json

--- request body ---
{"handle":"qa-495f411f50d3","password":"****"}

--- response: 200 in 67 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-974ab548-f494-4ea5-a3fd-86dc658d6b72
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b1aefcf-1a85-4b55-8f7b-109684c97792"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f58bd28-2b6f-45ef-9f45-7d339d25dc36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f58bd28-2b6f-45ef-9f45-7d339d25dc36
Content-Type: application/json

--- response: 200 in 59 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f58bd28-2b6f-45ef-9f45-7d339d25dc36
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

{"id":"acc_1b1aefcf-1a85-4b55-8f7b-109684c97792","handle":"qa-495f411f50d3","displayName":"QA 495f411f50d3","region":"eu","role":"user","createdAt":"2026-11-17T10:50:21.127833317Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d6ee2e4-741e-4fce-a2b4-008132655c28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d6ee2e4-741e-4fce-a2b4-008132655c28
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d6ee2e4-741e-4fce-a2b4-008132655c28
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

{"id":"acc_1b1aefcf-1a85-4b55-8f7b-109684c97792","handle":"qa-495f411f50d3","displayName":"QA 495f411f50d3","region":"eu","role":"user","createdAt":"2026-11-17T10:50:21.127833317Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70e8f1ad-6b1c-423c-8a0a-34258c0326e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70e8f1ad-6b1c-423c-8a0a-34258c0326e0
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70e8f1ad-6b1c-423c-8a0a-34258c0326e0
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
correlation: qa-63e2110a-934b-47cd-b896-d5e4845b5675

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63e2110a-934b-47cd-b896-d5e4845b5675
Content-Type: application/json

--- request body ---
{"handle":"qa-495f411f50d3","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63e2110a-934b-47cd-b896-d5e4845b5675
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63e2110a-934b-47cd-b896-d5e4845b5675"}
```
