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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-26603a05-20b7-45d9-950b-671afb22e199` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-d57e3036-3eef-4e0a-8a4a-5309d78bd431` |
| 3 | `GET /v1/accounts/me` | 503 | 14 | `qa-82d5ba44-f6b5-46a2-b83a-4b912195d9d8` |
| 4 | `GET /v1/accounts/me` | 200 | 7 | `qa-62572079-fc47-4647-9c53-821dfe542949` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-86f7400f-b1e8-4bf2-bbaa-46c6c0c08ef1` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-f745cae2-49dc-4d0f-a9cd-589cf6ef1e4c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-26603a05-20b7-45d9-950b-671afb22e199

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26603a05-20b7-45d9-950b-671afb22e199
Content-Type: application/json

--- request body ---
{"handle":"qa-39d149725bb8","displayName":"QA 39d149725bb8","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-26603a05-20b7-45d9-950b-671afb22e199
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
Location: /v1/accounts/qa-39d149725bb8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c4e9f4c-0248-45ac-889e-be70091b5831","handle":"qa-39d149725bb8","displayName":"QA 39d149725bb8","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.535019178Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d57e3036-3eef-4e0a-8a4a-5309d78bd431

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d57e3036-3eef-4e0a-8a4a-5309d78bd431
Content-Type: application/json

--- request body ---
{"handle":"qa-39d149725bb8","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d57e3036-3eef-4e0a-8a4a-5309d78bd431
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c4e9f4c-0248-45ac-889e-be70091b5831"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-82d5ba44-f6b5-46a2-b83a-4b912195d9d8

--- request headers ---
Accept: application/json
X-Fault-Key: 4b9c7af1-c785-4e3a-a75e-32957f3a5806
X-Fault: unavailable-once
X-Correlation-Id: qa-82d5ba44-f6b5-46a2-b83a-4b912195d9d8
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82d5ba44-f6b5-46a2-b83a-4b912195d9d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-82d5ba44-f6b5-46a2-b83a-4b912195d9d8"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-62572079-fc47-4647-9c53-821dfe542949

--- request headers ---
Accept: application/json
X-Fault-Key: 4b9c7af1-c785-4e3a-a75e-32957f3a5806
X-Fault: unavailable-once
X-Correlation-Id: qa-62572079-fc47-4647-9c53-821dfe542949
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-62572079-fc47-4647-9c53-821dfe542949
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

{"id":"acc_0c4e9f4c-0248-45ac-889e-be70091b5831","handle":"qa-39d149725bb8","displayName":"QA 39d149725bb8","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.535019178Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-86f7400f-b1e8-4bf2-bbaa-46c6c0c08ef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f7400f-b1e8-4bf2-bbaa-46c6c0c08ef1
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-86f7400f-b1e8-4bf2-bbaa-46c6c0c08ef1
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
correlation: qa-f745cae2-49dc-4d0f-a9cd-589cf6ef1e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f745cae2-49dc-4d0f-a9cd-589cf6ef1e4c
Content-Type: application/json

--- request body ---
{"handle":"qa-39d149725bb8","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f745cae2-49dc-4d0f-a9cd-589cf6ef1e4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f745cae2-49dc-4d0f-a9cd-589cf6ef1e4c"}
```
