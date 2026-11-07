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
| 1 | `POST /v1/accounts` | 201 | 439 | `qa-37750723-0063-4078-9295-20ec99d4bfaa` |
| 2 | `POST /v1/auth/token` | 200 | 59 | `qa-60d332b3-1f66-43b2-a6dc-4c6b950304cf` |
| 3 | `GET /v1/accounts/me` | error | 841 | `qa-157ff5d1-e2f0-4086-939a-7b97ccd5ec84` |
| 4 | `GET /v1/accounts/me` | error | 810 | `qa-46c57c0b-e57b-4022-9784-d8dbcd3a3a2b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-2e6caf16-ed71-462a-8f15-c12c1965c7d8` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-23cc90c6-6341-4b4a-bc5d-4c3a6461b70f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-37750723-0063-4078-9295-20ec99d4bfaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37750723-0063-4078-9295-20ec99d4bfaa
Content-Type: application/json

--- request body ---
{"handle":"qa-37d14a9883a5","displayName":"QA 37d14a9883a5","password":"****","region":"eu"}

--- response: 201 in 439 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-37750723-0063-4078-9295-20ec99d4bfaa
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
Location: /v1/accounts/qa-37d14a9883a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50350be3-fcd0-4465-b97f-c8be700fbd24","handle":"qa-37d14a9883a5","displayName":"QA 37d14a9883a5","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.006168036Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-60d332b3-1f66-43b2-a6dc-4c6b950304cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60d332b3-1f66-43b2-a6dc-4c6b950304cf
Content-Type: application/json

--- request body ---
{"handle":"qa-37d14a9883a5","password":"****"}

--- response: 200 in 59 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-60d332b3-1f66-43b2-a6dc-4c6b950304cf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50350be3-fcd0-4465-b97f-c8be700fbd24"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-157ff5d1-e2f0-4086-939a-7b97ccd5ec84

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 4f0f072b-0028-4dbe-8f10-b20a69e3e212
X-Correlation-Id: qa-157ff5d1-e2f0-4086-939a-7b97ccd5ec84
Content-Type: application/json

--- response: none in 841 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-46c57c0b-e57b-4022-9784-d8dbcd3a3a2b

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 4f0f072b-0028-4dbe-8f10-b20a69e3e212
X-Correlation-Id: qa-46c57c0b-e57b-4022-9784-d8dbcd3a3a2b
Content-Type: application/json

--- response: none in 810 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e6caf16-ed71-462a-8f15-c12c1965c7d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e6caf16-ed71-462a-8f15-c12c1965c7d8
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e6caf16-ed71-462a-8f15-c12c1965c7d8
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
correlation: qa-23cc90c6-6341-4b4a-bc5d-4c3a6461b70f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23cc90c6-6341-4b4a-bc5d-4c3a6461b70f
Content-Type: application/json

--- request body ---
{"handle":"qa-37d14a9883a5","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23cc90c6-6341-4b4a-bc5d-4c3a6461b70f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-23cc90c6-6341-4b4a-bc5d-4c3a6461b70f"}
```
