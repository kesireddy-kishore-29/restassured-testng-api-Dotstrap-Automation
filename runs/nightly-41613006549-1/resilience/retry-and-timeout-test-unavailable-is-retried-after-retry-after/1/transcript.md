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
| 1 | `POST /v1/accounts` | 201 | 398 | `qa-e9f54dc1-5c7a-4fc4-96ac-cff4436ebf14` |
| 2 | `POST /v1/auth/token` | 200 | 111 | `qa-b0cdd1bb-5dd3-455f-9092-440f6f4a0e1e` |
| 3 | `GET /v1/accounts/me` | 503 | 106 | `qa-32bff799-cc8a-4abd-b1ce-f96a7e45d808` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-e72b1e4a-ce96-452b-b69d-8688c6b78eca` |
| 5 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-45745039-e7d6-4d02-aaf0-b219e0a2595b` |
| 6 | `POST /v1/auth/token` | 401 | 17 | `qa-a27c7d5c-39fa-4785-978e-e3430d5e9f57` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e9f54dc1-5c7a-4fc4-96ac-cff4436ebf14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9f54dc1-5c7a-4fc4-96ac-cff4436ebf14
Content-Type: application/json

--- request body ---
{"handle":"qa-48a086a41756","displayName":"QA 48a086a41756","password":"****","region":"eu"}

--- response: 201 in 398 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9f54dc1-5c7a-4fc4-96ac-cff4436ebf14
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
Location: /v1/accounts/qa-48a086a41756
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac4fb921-87db-4d28-b949-dd9aa3e086d5","handle":"qa-48a086a41756","displayName":"QA 48a086a41756","region":"eu","role":"user","createdAt":"2026-11-03T09:41:38.397056850Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b0cdd1bb-5dd3-455f-9092-440f6f4a0e1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0cdd1bb-5dd3-455f-9092-440f6f4a0e1e
Content-Type: application/json

--- request body ---
{"handle":"qa-48a086a41756","password":"****"}

--- response: 200 in 111 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0cdd1bb-5dd3-455f-9092-440f6f4a0e1e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac4fb921-87db-4d28-b949-dd9aa3e086d5"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-32bff799-cc8a-4abd-b1ce-f96a7e45d808

--- request headers ---
Accept: application/json
X-Fault-Key: f9257574-0d3b-4c10-9bf3-8c89e5578e80
X-Fault: unavailable-once
X-Correlation-Id: qa-32bff799-cc8a-4abd-b1ce-f96a7e45d808
Content-Type: application/json

--- response: 503 in 106 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32bff799-cc8a-4abd-b1ce-f96a7e45d808
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-32bff799-cc8a-4abd-b1ce-f96a7e45d808"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-e72b1e4a-ce96-452b-b69d-8688c6b78eca

--- request headers ---
Accept: application/json
X-Fault-Key: f9257574-0d3b-4c10-9bf3-8c89e5578e80
X-Fault: unavailable-once
X-Correlation-Id: qa-e72b1e4a-ce96-452b-b69d-8688c6b78eca
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-e72b1e4a-ce96-452b-b69d-8688c6b78eca
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

{"id":"acc_ac4fb921-87db-4d28-b949-dd9aa3e086d5","handle":"qa-48a086a41756","displayName":"QA 48a086a41756","region":"eu","role":"user","createdAt":"2026-11-03T09:41:38.397056850Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45745039-e7d6-4d02-aaf0-b219e0a2595b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45745039-e7d6-4d02-aaf0-b219e0a2595b
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45745039-e7d6-4d02-aaf0-b219e0a2595b
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
correlation: qa-a27c7d5c-39fa-4785-978e-e3430d5e9f57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a27c7d5c-39fa-4785-978e-e3430d5e9f57
Content-Type: application/json

--- request body ---
{"handle":"qa-48a086a41756","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a27c7d5c-39fa-4785-978e-e3430d5e9f57
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a27c7d5c-39fa-4785-978e-e3430d5e9f57"}
```
