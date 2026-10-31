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
| 1 | `POST /v1/accounts` | 201 | 453 | `qa-0e72407f-1fe5-468f-a486-942cff71897b` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-a10f2c69-dab4-4468-ae14-f41aeccfa0b0` |
| 3 | `GET /v1/accounts/me` | 503 | 128 | `qa-f5e63fb4-0d3c-4715-a546-272ffe18bbbc` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-7de4a8b2-bd53-4ddd-82d2-af5bb19f8df5` |
| 5 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ed7e11ff-de58-4f40-bb34-6707ede9c6f2` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-e06332a5-06cb-4045-899a-27213d675cf0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0e72407f-1fe5-468f-a486-942cff71897b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e72407f-1fe5-468f-a486-942cff71897b
Content-Type: application/json

--- request body ---
{"handle":"qa-6fb05d83128e","displayName":"QA 6fb05d83128e","password":"****","region":"eu"}

--- response: 201 in 453 ms ---
Date: Fri, 23 Oct 2026 07:41:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e72407f-1fe5-468f-a486-942cff71897b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-6fb05d83128e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60792241-7b3f-4313-ae54-d9b521808b0c","handle":"qa-6fb05d83128e","displayName":"QA 6fb05d83128e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:15.024613853Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a10f2c69-dab4-4468-ae14-f41aeccfa0b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a10f2c69-dab4-4468-ae14-f41aeccfa0b0
Content-Type: application/json

--- request body ---
{"handle":"qa-6fb05d83128e","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a10f2c69-dab4-4468-ae14-f41aeccfa0b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60792241-7b3f-4313-ae54-d9b521808b0c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5e63fb4-0d3c-4715-a546-272ffe18bbbc

--- request headers ---
Accept: application/json
X-Fault-Key: 0fb10da8-bee3-4075-9170-e076c4a941bd
X-Fault: unavailable-once
X-Correlation-Id: qa-f5e63fb4-0d3c-4715-a546-272ffe18bbbc
Content-Type: application/json

--- response: 503 in 128 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5e63fb4-0d3c-4715-a546-272ffe18bbbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-f5e63fb4-0d3c-4715-a546-272ffe18bbbc"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-7de4a8b2-bd53-4ddd-82d2-af5bb19f8df5

--- request headers ---
Accept: application/json
X-Fault-Key: 0fb10da8-bee3-4075-9170-e076c4a941bd
X-Fault: unavailable-once
X-Correlation-Id: qa-7de4a8b2-bd53-4ddd-82d2-af5bb19f8df5
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-7de4a8b2-bd53-4ddd-82d2-af5bb19f8df5
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

{"id":"acc_60792241-7b3f-4313-ae54-d9b521808b0c","handle":"qa-6fb05d83128e","displayName":"QA 6fb05d83128e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:15.024613853Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed7e11ff-de58-4f40-bb34-6707ede9c6f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed7e11ff-de58-4f40-bb34-6707ede9c6f2
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed7e11ff-de58-4f40-bb34-6707ede9c6f2
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
correlation: qa-e06332a5-06cb-4045-899a-27213d675cf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e06332a5-06cb-4045-899a-27213d675cf0
Content-Type: application/json

--- request body ---
{"handle":"qa-6fb05d83128e","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e06332a5-06cb-4045-899a-27213d675cf0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e06332a5-06cb-4045-899a-27213d675cf0"}
```
