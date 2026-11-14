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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-24127cee-c520-4a39-92c5-460f1fe2e49b` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-9a9f0c21-47e7-43b6-80ff-eb852460b85a` |
| 3 | `GET /v1/accounts/me` | 503 | 14 | `qa-07db6799-231d-48a6-a934-e4d1691f021a` |
| 4 | `GET /v1/accounts/me` | 200 | 6 | `qa-cc636325-61c4-481b-8ab3-38b3ed51f551` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3ba048a1-afb7-4b63-82a2-2750645ed825` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-9245e7b8-4e7a-4769-ac57-2d0ca4853f83` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-24127cee-c520-4a39-92c5-460f1fe2e49b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24127cee-c520-4a39-92c5-460f1fe2e49b
Content-Type: application/json

--- request body ---
{"handle":"qa-9b5f20be4647","displayName":"QA 9b5f20be4647","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-24127cee-c520-4a39-92c5-460f1fe2e49b
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
Location: /v1/accounts/qa-9b5f20be4647
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d36152c-eed0-466c-a6f5-4d4eec68633b","handle":"qa-9b5f20be4647","displayName":"QA 9b5f20be4647","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.648913422Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9a9f0c21-47e7-43b6-80ff-eb852460b85a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a9f0c21-47e7-43b6-80ff-eb852460b85a
Content-Type: application/json

--- request body ---
{"handle":"qa-9b5f20be4647","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a9f0c21-47e7-43b6-80ff-eb852460b85a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d36152c-eed0-466c-a6f5-4d4eec68633b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-07db6799-231d-48a6-a934-e4d1691f021a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 29430a7f-3f1a-4a51-adf4-39cb89db15a4
X-Correlation-Id: qa-07db6799-231d-48a6-a934-e4d1691f021a
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07db6799-231d-48a6-a934-e4d1691f021a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-07db6799-231d-48a6-a934-e4d1691f021a"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc636325-61c4-481b-8ab3-38b3ed51f551

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 29430a7f-3f1a-4a51-adf4-39cb89db15a4
X-Correlation-Id: qa-cc636325-61c4-481b-8ab3-38b3ed51f551
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc636325-61c4-481b-8ab3-38b3ed51f551
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

{"id":"acc_2d36152c-eed0-466c-a6f5-4d4eec68633b","handle":"qa-9b5f20be4647","displayName":"QA 9b5f20be4647","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.648913422Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ba048a1-afb7-4b63-82a2-2750645ed825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ba048a1-afb7-4b63-82a2-2750645ed825
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ba048a1-afb7-4b63-82a2-2750645ed825
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
correlation: qa-9245e7b8-4e7a-4769-ac57-2d0ca4853f83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9245e7b8-4e7a-4769-ac57-2d0ca4853f83
Content-Type: application/json

--- request body ---
{"handle":"qa-9b5f20be4647","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9245e7b8-4e7a-4769-ac57-2d0ca4853f83
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9245e7b8-4e7a-4769-ac57-2d0ca4853f83"}
```
