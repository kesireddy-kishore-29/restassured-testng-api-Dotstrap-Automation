# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-61d105b2-79b2-46a3-8b46-9bc2ea9f6142` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-04ba643a-372c-4cac-84f4-b2cadf8df052` |
| 3 | `GET /v1/accounts/me` | error | 810 | `qa-584d4e4d-73ba-4ab3-badd-8ef33aaf448e` |
| 4 | `GET /v1/accounts/me` | error | 804 | `qa-e12836be-1d47-4628-85b9-48dc0ec6f20b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-69965315-1418-4dad-a608-69a2aa5105d0` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-795a798c-cd40-4377-a887-43f1a31f2682` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-61d105b2-79b2-46a3-8b46-9bc2ea9f6142

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61d105b2-79b2-46a3-8b46-9bc2ea9f6142
Content-Type: application/json

--- request body ---
{"handle":"qa-fed46edf2947","displayName":"QA fed46edf2947","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-61d105b2-79b2-46a3-8b46-9bc2ea9f6142
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-fed46edf2947
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6817a109-3c51-45cb-a7ef-e0e740507b5a","handle":"qa-fed46edf2947","displayName":"QA fed46edf2947","region":"eu","role":"user","createdAt":"2026-11-26T11:02:30.336829006Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-04ba643a-372c-4cac-84f4-b2cadf8df052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04ba643a-372c-4cac-84f4-b2cadf8df052
Content-Type: application/json

--- request body ---
{"handle":"qa-fed46edf2947","password":"****"}

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-04ba643a-372c-4cac-84f4-b2cadf8df052
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6817a109-3c51-45cb-a7ef-e0e740507b5a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-584d4e4d-73ba-4ab3-badd-8ef33aaf448e

--- request headers ---
Accept: application/json
X-Fault-Key: f13479b2-27a3-4f7e-b9eb-65bb8b3196d9
X-Fault: latency=4000
X-Correlation-Id: qa-584d4e4d-73ba-4ab3-badd-8ef33aaf448e
Content-Type: application/json

--- response: none in 810 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-e12836be-1d47-4628-85b9-48dc0ec6f20b

--- request headers ---
Accept: application/json
X-Fault-Key: f13479b2-27a3-4f7e-b9eb-65bb8b3196d9
X-Fault: latency=4000
X-Correlation-Id: qa-e12836be-1d47-4628-85b9-48dc0ec6f20b
Content-Type: application/json

--- response: none in 804 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69965315-1418-4dad-a608-69a2aa5105d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69965315-1418-4dad-a608-69a2aa5105d0
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69965315-1418-4dad-a608-69a2aa5105d0
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-795a798c-cd40-4377-a887-43f1a31f2682

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795a798c-cd40-4377-a887-43f1a31f2682
Content-Type: application/json

--- request body ---
{"handle":"qa-fed46edf2947","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-795a798c-cd40-4377-a887-43f1a31f2682
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-795a798c-cd40-4377-a887-43f1a31f2682"}
```
