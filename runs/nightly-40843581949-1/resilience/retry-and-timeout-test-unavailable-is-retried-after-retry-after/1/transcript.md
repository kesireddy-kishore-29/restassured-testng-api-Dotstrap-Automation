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
| 1 | `POST /v1/accounts` | 201 | 399 | `qa-f05e46bc-bcad-427a-a218-d029febbf0b1` |
| 2 | `POST /v1/auth/token` | 200 | 63 | `qa-fec1d626-dda2-4f0b-a5cb-19e608cd41ee` |
| 3 | `GET /v1/accounts/me` | 503 | 107 | `qa-89b84da5-455d-4de5-820a-78f18d273f09` |
| 4 | `GET /v1/accounts/me` | 200 | 25 | `qa-449f62bc-9feb-4c54-a655-5d80db8282ba` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-e1341f31-e114-48dd-a636-cf1f6a19891d` |
| 6 | `POST /v1/auth/token` | 401 | 10 | `qa-0468ce2b-afe0-4431-94e8-032383bff652` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f05e46bc-bcad-427a-a218-d029febbf0b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f05e46bc-bcad-427a-a218-d029febbf0b1
Content-Type: application/json

--- request body ---
{"handle":"qa-8ea2a8d5df36","displayName":"QA 8ea2a8d5df36","password":"****","region":"eu"}

--- response: 201 in 399 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f05e46bc-bcad-427a-a218-d029febbf0b1
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
Location: /v1/accounts/qa-8ea2a8d5df36
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1fc2a70d-b4a6-48df-a5e1-7c7c43074874","handle":"qa-8ea2a8d5df36","displayName":"QA 8ea2a8d5df36","region":"eu","role":"user","createdAt":"2026-10-29T08:38:56.643480596Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fec1d626-dda2-4f0b-a5cb-19e608cd41ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fec1d626-dda2-4f0b-a5cb-19e608cd41ee
Content-Type: application/json

--- request body ---
{"handle":"qa-8ea2a8d5df36","password":"****"}

--- response: 200 in 63 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fec1d626-dda2-4f0b-a5cb-19e608cd41ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1fc2a70d-b4a6-48df-a5e1-7c7c43074874"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-89b84da5-455d-4de5-820a-78f18d273f09

--- request headers ---
Accept: application/json
X-Fault-Key: 942913a0-752e-47e7-ad65-1df13000c75d
X-Fault: unavailable-once
X-Correlation-Id: qa-89b84da5-455d-4de5-820a-78f18d273f09
Content-Type: application/json

--- response: 503 in 107 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89b84da5-455d-4de5-820a-78f18d273f09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-89b84da5-455d-4de5-820a-78f18d273f09"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-449f62bc-9feb-4c54-a655-5d80db8282ba

--- request headers ---
Accept: application/json
X-Fault-Key: 942913a0-752e-47e7-ad65-1df13000c75d
X-Fault: unavailable-once
X-Correlation-Id: qa-449f62bc-9feb-4c54-a655-5d80db8282ba
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-449f62bc-9feb-4c54-a655-5d80db8282ba
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

{"id":"acc_1fc2a70d-b4a6-48df-a5e1-7c7c43074874","handle":"qa-8ea2a8d5df36","displayName":"QA 8ea2a8d5df36","region":"eu","role":"user","createdAt":"2026-10-29T08:38:56.643480596Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1341f31-e114-48dd-a636-cf1f6a19891d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1341f31-e114-48dd-a636-cf1f6a19891d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1341f31-e114-48dd-a636-cf1f6a19891d
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
correlation: qa-0468ce2b-afe0-4431-94e8-032383bff652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0468ce2b-afe0-4431-94e8-032383bff652
Content-Type: application/json

--- request body ---
{"handle":"qa-8ea2a8d5df36","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0468ce2b-afe0-4431-94e8-032383bff652
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0468ce2b-afe0-4431-94e8-032383bff652"}
```
