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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-a7dcb102-c8c0-47b2-a729-d91d7587a128` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-0dccb8d4-f84e-45ca-9e1b-31c6823b294b` |
| 3 | `GET /v1/accounts/me` | error | 822 | `qa-bfb352c7-e971-4d94-90b2-51b5abf75214` |
| 4 | `GET /v1/accounts/me` | error | 805 | `qa-07d59f91-2b16-410a-95b5-2429e17b5ee3` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-dc32075b-d97d-4100-bef9-b3d751b4c980` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-d10e0f9d-53e2-4969-9227-d9e18a959d52` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a7dcb102-c8c0-47b2-a729-d91d7587a128

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7dcb102-c8c0-47b2-a729-d91d7587a128
Content-Type: application/json

--- request body ---
{"handle":"qa-97eeb59fbefb","displayName":"QA 97eeb59fbefb","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7dcb102-c8c0-47b2-a729-d91d7587a128
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-97eeb59fbefb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b277041-7401-44ae-8642-c8e2dc921f7d","handle":"qa-97eeb59fbefb","displayName":"QA 97eeb59fbefb","region":"eu","role":"user","createdAt":"2026-11-16T09:54:00.986010599Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0dccb8d4-f84e-45ca-9e1b-31c6823b294b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dccb8d4-f84e-45ca-9e1b-31c6823b294b
Content-Type: application/json

--- request body ---
{"handle":"qa-97eeb59fbefb","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dccb8d4-f84e-45ca-9e1b-31c6823b294b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b277041-7401-44ae-8642-c8e2dc921f7d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfb352c7-e971-4d94-90b2-51b5abf75214

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 95dc496a-1cf6-4c01-8d8a-831848caffee
X-Correlation-Id: qa-bfb352c7-e971-4d94-90b2-51b5abf75214
Content-Type: application/json

--- response: none in 822 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-07d59f91-2b16-410a-95b5-2429e17b5ee3

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 95dc496a-1cf6-4c01-8d8a-831848caffee
X-Correlation-Id: qa-07d59f91-2b16-410a-95b5-2429e17b5ee3
Content-Type: application/json

--- response: none in 805 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc32075b-d97d-4100-bef9-b3d751b4c980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc32075b-d97d-4100-bef9-b3d751b4c980
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc32075b-d97d-4100-bef9-b3d751b4c980
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
correlation: qa-d10e0f9d-53e2-4969-9227-d9e18a959d52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d10e0f9d-53e2-4969-9227-d9e18a959d52
Content-Type: application/json

--- request body ---
{"handle":"qa-97eeb59fbefb","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d10e0f9d-53e2-4969-9227-d9e18a959d52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d10e0f9d-53e2-4969-9227-d9e18a959d52"}
```
