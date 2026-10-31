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
| 1 | `POST /v1/accounts` | 201 | 408 | `qa-ec7e91b7-8599-4c9b-bbe5-81c7c91eb479` |
| 2 | `POST /v1/auth/token` | 200 | 78 | `qa-cb0357c8-58fa-436e-b250-f3d0b43adeb4` |
| 3 | `GET /v1/accounts/me` | 503 | 74 | `qa-18a169e0-c335-4a3c-8171-fe5387096365` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-6ed0c6bd-0841-4b3d-ac16-102975038150` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-14e7482a-bae0-49e0-bfec-2d4c4f74920b` |
| 6 | `POST /v1/auth/token` | 401 | 15 | `qa-3dac938a-d093-4ea8-b0c0-b9c94c90b1ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ec7e91b7-8599-4c9b-bbe5-81c7c91eb479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec7e91b7-8599-4c9b-bbe5-81c7c91eb479
Content-Type: application/json

--- request body ---
{"handle":"qa-3e38473847ed","displayName":"QA 3e38473847ed","password":"****","region":"eu"}

--- response: 201 in 408 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec7e91b7-8599-4c9b-bbe5-81c7c91eb479
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
Location: /v1/accounts/qa-3e38473847ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1b7cd51-1b67-4f7e-be43-e411982ca0db","handle":"qa-3e38473847ed","displayName":"QA 3e38473847ed","region":"eu","role":"user","createdAt":"2026-10-26T07:54:42.609092231Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cb0357c8-58fa-436e-b250-f3d0b43adeb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb0357c8-58fa-436e-b250-f3d0b43adeb4
Content-Type: application/json

--- request body ---
{"handle":"qa-3e38473847ed","password":"****"}

--- response: 200 in 78 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb0357c8-58fa-436e-b250-f3d0b43adeb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1b7cd51-1b67-4f7e-be43-e411982ca0db"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-18a169e0-c335-4a3c-8171-fe5387096365

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6beb0e43-a293-4fe2-b371-1d425bbe68f5
X-Correlation-Id: qa-18a169e0-c335-4a3c-8171-fe5387096365
Content-Type: application/json

--- response: 503 in 74 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18a169e0-c335-4a3c-8171-fe5387096365
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-18a169e0-c335-4a3c-8171-fe5387096365"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ed0c6bd-0841-4b3d-ac16-102975038150

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6beb0e43-a293-4fe2-b371-1d425bbe68f5
X-Correlation-Id: qa-6ed0c6bd-0841-4b3d-ac16-102975038150
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ed0c6bd-0841-4b3d-ac16-102975038150
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

{"id":"acc_f1b7cd51-1b67-4f7e-be43-e411982ca0db","handle":"qa-3e38473847ed","displayName":"QA 3e38473847ed","region":"eu","role":"user","createdAt":"2026-10-26T07:54:42.609092231Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-14e7482a-bae0-49e0-bfec-2d4c4f74920b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14e7482a-bae0-49e0-bfec-2d4c4f74920b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-14e7482a-bae0-49e0-bfec-2d4c4f74920b
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
correlation: qa-3dac938a-d093-4ea8-b0c0-b9c94c90b1ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dac938a-d093-4ea8-b0c0-b9c94c90b1ff
Content-Type: application/json

--- request body ---
{"handle":"qa-3e38473847ed","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dac938a-d093-4ea8-b0c0-b9c94c90b1ff
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3dac938a-d093-4ea8-b0c0-b9c94c90b1ff"}
```
