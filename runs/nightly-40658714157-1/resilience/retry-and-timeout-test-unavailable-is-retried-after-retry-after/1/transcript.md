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
| 1 | `POST /v1/accounts` | 201 | 302 | `qa-15872254-adcc-4eca-a04e-e7d68b00469a` |
| 2 | `POST /v1/auth/token` | 200 | 63 | `qa-db5a02bf-46aa-4be9-9c27-4cabfcadb5ac` |
| 3 | `GET /v1/accounts/me` | 503 | 65 | `qa-4bcaee21-a35d-4282-af89-ae8da33ec8bb` |
| 4 | `GET /v1/accounts/me` | 200 | 4 | `qa-4aa07eaa-31eb-4a8c-99a5-fc1a17d0be50` |
| 5 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-e72b83a7-c227-4d05-be9f-761f444bdb1f` |
| 6 | `POST /v1/auth/token` | 401 | 3 | `qa-01ee1052-2ea8-4a89-9a22-e90b46f1d8c0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15872254-adcc-4eca-a04e-e7d68b00469a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15872254-adcc-4eca-a04e-e7d68b00469a
Content-Type: application/json

--- request body ---
{"handle":"qa-f5d3cc604dd8","displayName":"QA f5d3cc604dd8","password":"****","region":"eu"}

--- response: 201 in 302 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-15872254-adcc-4eca-a04e-e7d68b00469a
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
Location: /v1/accounts/qa-f5d3cc604dd8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1b4ba4c-97c0-4a88-9bbb-86b9191a8a7b","handle":"qa-f5d3cc604dd8","displayName":"QA f5d3cc604dd8","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.264162170Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-db5a02bf-46aa-4be9-9c27-4cabfcadb5ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db5a02bf-46aa-4be9-9c27-4cabfcadb5ac
Content-Type: application/json

--- request body ---
{"handle":"qa-f5d3cc604dd8","password":"****"}

--- response: 200 in 63 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-db5a02bf-46aa-4be9-9c27-4cabfcadb5ac
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1b4ba4c-97c0-4a88-9bbb-86b9191a8a7b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4bcaee21-a35d-4282-af89-ae8da33ec8bb

--- request headers ---
Accept: application/json
X-Fault-Key: b19ee8c7-7ca1-4783-93f0-9ddf21dc642c
X-Fault: unavailable-once
X-Correlation-Id: qa-4bcaee21-a35d-4282-af89-ae8da33ec8bb
Content-Type: application/json

--- response: 503 in 65 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4bcaee21-a35d-4282-af89-ae8da33ec8bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-4bcaee21-a35d-4282-af89-ae8da33ec8bb"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-4aa07eaa-31eb-4a8c-99a5-fc1a17d0be50

--- request headers ---
Accept: application/json
X-Fault-Key: b19ee8c7-7ca1-4783-93f0-9ddf21dc642c
X-Fault: unavailable-once
X-Correlation-Id: qa-4aa07eaa-31eb-4a8c-99a5-fc1a17d0be50
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aa07eaa-31eb-4a8c-99a5-fc1a17d0be50
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

{"id":"acc_c1b4ba4c-97c0-4a88-9bbb-86b9191a8a7b","handle":"qa-f5d3cc604dd8","displayName":"QA f5d3cc604dd8","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.264162170Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e72b83a7-c227-4d05-be9f-761f444bdb1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e72b83a7-c227-4d05-be9f-761f444bdb1f
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e72b83a7-c227-4d05-be9f-761f444bdb1f
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
correlation: qa-01ee1052-2ea8-4a89-9a22-e90b46f1d8c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ee1052-2ea8-4a89-9a22-e90b46f1d8c0
Content-Type: application/json

--- request body ---
{"handle":"qa-f5d3cc604dd8","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01ee1052-2ea8-4a89-9a22-e90b46f1d8c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-01ee1052-2ea8-4a89-9a22-e90b46f1d8c0"}
```
