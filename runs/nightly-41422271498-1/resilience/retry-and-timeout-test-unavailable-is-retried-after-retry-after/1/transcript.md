# Transcript: A 503 with Retry-After is retried after the wait

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#unavailableIsRetriedAfterRetryAfter` |
| Features | FEAT-RES-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 441 | `qa-c59605b4-4c39-4b9e-a7ec-daf0e41bcfe3` |
| 2 | `POST /v1/auth/token` | 200 | 111 | `qa-ccb1122c-3d07-4e9a-9760-e73620ae08f8` |
| 3 | `GET /v1/accounts/me` | 503 | 83 | `qa-584eda87-73ea-4a15-bb98-282f080b3b15` |
| 4 | `GET /v1/accounts/me` | 200 | 20 | `qa-b2a7f29a-48b9-4e11-805c-766f7ce580d1` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-6b8aa804-6a86-444e-ad42-4806a7851c05` |
| 6 | `POST /v1/auth/token` | 401 | 14 | `qa-033f7dd8-632f-4315-b1a5-bb938874471c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c59605b4-4c39-4b9e-a7ec-daf0e41bcfe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c59605b4-4c39-4b9e-a7ec-daf0e41bcfe3
Content-Type: application/json

--- request body ---
{"handle":"qa-daa21ceb0519","displayName":"QA daa21ceb0519","password":"****","region":"eu"}

--- response: 201 in 441 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c59605b4-4c39-4b9e-a7ec-daf0e41bcfe3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-daa21ceb0519
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b266708d-d94d-4def-907a-e40388976417","handle":"qa-daa21ceb0519","displayName":"QA daa21ceb0519","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.012259806Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ccb1122c-3d07-4e9a-9760-e73620ae08f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccb1122c-3d07-4e9a-9760-e73620ae08f8
Content-Type: application/json

--- request body ---
{"handle":"qa-daa21ceb0519","password":"****"}

--- response: 200 in 111 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccb1122c-3d07-4e9a-9760-e73620ae08f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b266708d-d94d-4def-907a-e40388976417"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-584eda87-73ea-4a15-bb98-282f080b3b15

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8cc8f0b7-cdbc-41c2-b02f-7e700bbc1deb
X-Correlation-Id: qa-584eda87-73ea-4a15-bb98-282f080b3b15
Content-Type: application/json

--- response: 503 in 83 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-584eda87-73ea-4a15-bb98-282f080b3b15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-584eda87-73ea-4a15-bb98-282f080b3b15"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2a7f29a-48b9-4e11-805c-766f7ce580d1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8cc8f0b7-cdbc-41c2-b02f-7e700bbc1deb
X-Correlation-Id: qa-b2a7f29a-48b9-4e11-805c-766f7ce580d1
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2a7f29a-48b9-4e11-805c-766f7ce580d1
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

{"id":"acc_b266708d-d94d-4def-907a-e40388976417","handle":"qa-daa21ceb0519","displayName":"QA daa21ceb0519","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.012259806Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b8aa804-6a86-444e-ad42-4806a7851c05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b8aa804-6a86-444e-ad42-4806a7851c05
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b8aa804-6a86-444e-ad42-4806a7851c05
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-033f7dd8-632f-4315-b1a5-bb938874471c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-033f7dd8-632f-4315-b1a5-bb938874471c
Content-Type: application/json

--- request body ---
{"handle":"qa-daa21ceb0519","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-033f7dd8-632f-4315-b1a5-bb938874471c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-033f7dd8-632f-4315-b1a5-bb938874471c"}
```
