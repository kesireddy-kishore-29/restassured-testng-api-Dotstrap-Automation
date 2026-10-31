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
| 1 | `POST /v1/accounts` | 201 | 257 | `qa-5af2e2a2-81a4-4eb9-a003-bacbf9bac689` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-8553126a-5299-49dd-86c1-f985b286d3a5` |
| 3 | `GET /v1/accounts/me` | error | 829 | `qa-fe67e4e3-da2c-41a8-9771-483cca5887a8` |
| 4 | `GET /v1/accounts/me` | error | 809 | `qa-1a9335b5-5dee-42ca-8925-ac418ee4075f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-6c9d2fae-8791-4fac-809f-1fc9455ac74d` |
| 6 | `POST /v1/auth/token` | 401 | 2 | `qa-b4c139ac-2515-4ec4-97ee-c72d4ab006db` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5af2e2a2-81a4-4eb9-a003-bacbf9bac689

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5af2e2a2-81a4-4eb9-a003-bacbf9bac689
Content-Type: application/json

--- request body ---
{"handle":"qa-76828a39e9c1","displayName":"QA 76828a39e9c1","password":"****","region":"eu"}

--- response: 201 in 257 ms ---
Date: Tue, 27 Oct 2026 08:00:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-5af2e2a2-81a4-4eb9-a003-bacbf9bac689
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
Location: /v1/accounts/qa-76828a39e9c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e3c85df3-99e8-4bd5-8d9f-de5fecef6546","handle":"qa-76828a39e9c1","displayName":"QA 76828a39e9c1","region":"eu","role":"user","createdAt":"2026-10-27T08:00:18.919741409Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8553126a-5299-49dd-86c1-f985b286d3a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8553126a-5299-49dd-86c1-f985b286d3a5
Content-Type: application/json

--- request body ---
{"handle":"qa-76828a39e9c1","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8553126a-5299-49dd-86c1-f985b286d3a5
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3c85df3-99e8-4bd5-8d9f-de5fecef6546"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe67e4e3-da2c-41a8-9771-483cca5887a8

--- request headers ---
Accept: application/json
X-Fault-Key: 6898ffd8-9dd5-4e91-b9a8-eb90c219bf6c
X-Fault: latency=4000
X-Correlation-Id: qa-fe67e4e3-da2c-41a8-9771-483cca5887a8
Content-Type: application/json

--- response: none in 829 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a9335b5-5dee-42ca-8925-ac418ee4075f

--- request headers ---
Accept: application/json
X-Fault-Key: 6898ffd8-9dd5-4e91-b9a8-eb90c219bf6c
X-Fault: latency=4000
X-Correlation-Id: qa-1a9335b5-5dee-42ca-8925-ac418ee4075f
Content-Type: application/json

--- response: none in 809 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c9d2fae-8791-4fac-809f-1fc9455ac74d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c9d2fae-8791-4fac-809f-1fc9455ac74d
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c9d2fae-8791-4fac-809f-1fc9455ac74d
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
correlation: qa-b4c139ac-2515-4ec4-97ee-c72d4ab006db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4c139ac-2515-4ec4-97ee-c72d4ab006db
Content-Type: application/json

--- request body ---
{"handle":"qa-76828a39e9c1","password":"****"}

--- response: 401 in 2 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4c139ac-2515-4ec4-97ee-c72d4ab006db
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4c139ac-2515-4ec4-97ee-c72d4ab006db"}
```
