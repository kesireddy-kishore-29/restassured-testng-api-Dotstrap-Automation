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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-fd9a6587-30e9-4f68-9640-dc11f9411553` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-738f52fc-8392-4462-95c7-e69f94c29a53` |
| 3 | `GET /v1/accounts/me` | 503 | 16 | `qa-edb1b05c-8ebb-4bd9-9b5c-dbff15b51142` |
| 4 | `GET /v1/accounts/me` | 200 | 8 | `qa-be399ddb-cd8d-4240-9150-0780ccc8fa21` |
| 5 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-2e75bd27-bcff-4ff1-96d9-77fcdc8abbfe` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-f8524263-2610-44d1-81d0-746941a8d6f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd9a6587-30e9-4f68-9640-dc11f9411553

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd9a6587-30e9-4f68-9640-dc11f9411553
Content-Type: application/json

--- request body ---
{"handle":"qa-630e6689e000","displayName":"QA 630e6689e000","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd9a6587-30e9-4f68-9640-dc11f9411553
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-630e6689e000
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d3328506-2996-46ba-aeb6-ea322a15f9b2","handle":"qa-630e6689e000","displayName":"QA 630e6689e000","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.007721192Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-738f52fc-8392-4462-95c7-e69f94c29a53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-738f52fc-8392-4462-95c7-e69f94c29a53
Content-Type: application/json

--- request body ---
{"handle":"qa-630e6689e000","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-738f52fc-8392-4462-95c7-e69f94c29a53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3328506-2996-46ba-aeb6-ea322a15f9b2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-edb1b05c-8ebb-4bd9-9b5c-dbff15b51142

--- request headers ---
Accept: application/json
X-Fault-Key: 1181b210-bd8d-4f55-a2bf-beedbe4699af
X-Fault: unavailable-once
X-Correlation-Id: qa-edb1b05c-8ebb-4bd9-9b5c-dbff15b51142
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-edb1b05c-8ebb-4bd9-9b5c-dbff15b51142
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-edb1b05c-8ebb-4bd9-9b5c-dbff15b51142"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-be399ddb-cd8d-4240-9150-0780ccc8fa21

--- request headers ---
Accept: application/json
X-Fault-Key: 1181b210-bd8d-4f55-a2bf-beedbe4699af
X-Fault: unavailable-once
X-Correlation-Id: qa-be399ddb-cd8d-4240-9150-0780ccc8fa21
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-be399ddb-cd8d-4240-9150-0780ccc8fa21
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

{"id":"acc_d3328506-2996-46ba-aeb6-ea322a15f9b2","handle":"qa-630e6689e000","displayName":"QA 630e6689e000","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.007721192Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e75bd27-bcff-4ff1-96d9-77fcdc8abbfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e75bd27-bcff-4ff1-96d9-77fcdc8abbfe
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e75bd27-bcff-4ff1-96d9-77fcdc8abbfe
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
correlation: qa-f8524263-2610-44d1-81d0-746941a8d6f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8524263-2610-44d1-81d0-746941a8d6f1
Content-Type: application/json

--- request body ---
{"handle":"qa-630e6689e000","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8524263-2610-44d1-81d0-746941a8d6f1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8524263-2610-44d1-81d0-746941a8d6f1"}
```
