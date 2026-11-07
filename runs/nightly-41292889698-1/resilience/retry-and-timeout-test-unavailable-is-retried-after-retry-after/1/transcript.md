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
| 1 | `POST /v1/accounts` | 201 | 488 | `qa-02dd2e8f-1587-4546-831a-d35aecf55c7e` |
| 2 | `POST /v1/auth/token` | 200 | 90 | `qa-c7f8b97b-c8a8-4a38-9bdb-9bed749a2ccf` |
| 3 | `GET /v1/accounts/me` | 503 | 131 | `qa-c5d0ffa1-6fc1-4e34-a486-7c07ee6e7de0` |
| 4 | `GET /v1/accounts/me` | 200 | 24 | `qa-c684f3e0-bc93-4d48-8c3b-eecbe976c914` |
| 5 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-4433a91e-f732-4429-8dae-7936a87af150` |
| 6 | `POST /v1/auth/token` | 401 | 34 | `qa-b2243ceb-1f36-4f62-8700-652b9f605e4f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-02dd2e8f-1587-4546-831a-d35aecf55c7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02dd2e8f-1587-4546-831a-d35aecf55c7e
Content-Type: application/json

--- request body ---
{"handle":"qa-e94e1348716b","displayName":"QA e94e1348716b","password":"****","region":"eu"}

--- response: 201 in 488 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-02dd2e8f-1587-4546-831a-d35aecf55c7e
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
Location: /v1/accounts/qa-e94e1348716b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_deb5c7ba-dcb2-4f19-ac1d-8543b2e0a5d8","handle":"qa-e94e1348716b","displayName":"QA e94e1348716b","region":"eu","role":"user","createdAt":"2026-11-01T09:23:29.285013391Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c7f8b97b-c8a8-4a38-9bdb-9bed749a2ccf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7f8b97b-c8a8-4a38-9bdb-9bed749a2ccf
Content-Type: application/json

--- request body ---
{"handle":"qa-e94e1348716b","password":"****"}

--- response: 200 in 90 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7f8b97b-c8a8-4a38-9bdb-9bed749a2ccf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_deb5c7ba-dcb2-4f19-ac1d-8543b2e0a5d8"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5d0ffa1-6fc1-4e34-a486-7c07ee6e7de0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e88e7cd8-a389-4035-878f-89a458fffcfa
X-Correlation-Id: qa-c5d0ffa1-6fc1-4e34-a486-7c07ee6e7de0
Content-Type: application/json

--- response: 503 in 131 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5d0ffa1-6fc1-4e34-a486-7c07ee6e7de0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-c5d0ffa1-6fc1-4e34-a486-7c07ee6e7de0"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-c684f3e0-bc93-4d48-8c3b-eecbe976c914

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e88e7cd8-a389-4035-878f-89a458fffcfa
X-Correlation-Id: qa-c684f3e0-bc93-4d48-8c3b-eecbe976c914
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c684f3e0-bc93-4d48-8c3b-eecbe976c914
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

{"id":"acc_deb5c7ba-dcb2-4f19-ac1d-8543b2e0a5d8","handle":"qa-e94e1348716b","displayName":"QA e94e1348716b","region":"eu","role":"user","createdAt":"2026-11-01T09:23:29.285013391Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4433a91e-f732-4429-8dae-7936a87af150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4433a91e-f732-4429-8dae-7936a87af150
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4433a91e-f732-4429-8dae-7936a87af150
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
correlation: qa-b2243ceb-1f36-4f62-8700-652b9f605e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2243ceb-1f36-4f62-8700-652b9f605e4f
Content-Type: application/json

--- request body ---
{"handle":"qa-e94e1348716b","password":"****"}

--- response: 401 in 34 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2243ceb-1f36-4f62-8700-652b9f605e4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2243ceb-1f36-4f62-8700-652b9f605e4f"}
```
