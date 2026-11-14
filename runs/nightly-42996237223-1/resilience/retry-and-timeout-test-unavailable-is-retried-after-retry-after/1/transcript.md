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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-d963b250-42d2-4938-b6d3-0e7caec51dc9` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-0e91af61-97e2-4b0c-8b51-33c0aeb1362c` |
| 3 | `GET /v1/accounts/me` | 503 | 6 | `qa-a59db695-2ab7-4256-95f5-a71cbbc3314e` |
| 4 | `GET /v1/accounts/me` | 200 | 5 | `qa-a264fed0-02bf-4449-b0c1-0dc426183d8e` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-7afbdda6-bcd9-4663-b848-008ce8a6ece6` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-40966159-766b-4b77-b1a5-fd8edfd498b7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d963b250-42d2-4938-b6d3-0e7caec51dc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d963b250-42d2-4938-b6d3-0e7caec51dc9
Content-Type: application/json

--- request body ---
{"handle":"qa-2e744d0c87dd","displayName":"QA 2e744d0c87dd","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d963b250-42d2-4938-b6d3-0e7caec51dc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-2e744d0c87dd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_acf8e44c-45a7-4bc0-b1c6-46000b066316","handle":"qa-2e744d0c87dd","displayName":"QA 2e744d0c87dd","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.324938426Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0e91af61-97e2-4b0c-8b51-33c0aeb1362c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e91af61-97e2-4b0c-8b51-33c0aeb1362c
Content-Type: application/json

--- request body ---
{"handle":"qa-2e744d0c87dd","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e91af61-97e2-4b0c-8b51-33c0aeb1362c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_acf8e44c-45a7-4bc0-b1c6-46000b066316"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a59db695-2ab7-4256-95f5-a71cbbc3314e

--- request headers ---
Accept: application/json
X-Fault-Key: fb753e32-3da6-4441-9faa-0aff4e348599
X-Fault: unavailable-once
X-Correlation-Id: qa-a59db695-2ab7-4256-95f5-a71cbbc3314e
Content-Type: application/json

--- response: 503 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a59db695-2ab7-4256-95f5-a71cbbc3314e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-a59db695-2ab7-4256-95f5-a71cbbc3314e"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-a264fed0-02bf-4449-b0c1-0dc426183d8e

--- request headers ---
Accept: application/json
X-Fault-Key: fb753e32-3da6-4441-9faa-0aff4e348599
X-Fault: unavailable-once
X-Correlation-Id: qa-a264fed0-02bf-4449-b0c1-0dc426183d8e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a264fed0-02bf-4449-b0c1-0dc426183d8e
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

{"id":"acc_acf8e44c-45a7-4bc0-b1c6-46000b066316","handle":"qa-2e744d0c87dd","displayName":"QA 2e744d0c87dd","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.324938426Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7afbdda6-bcd9-4663-b848-008ce8a6ece6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7afbdda6-bcd9-4663-b848-008ce8a6ece6
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7afbdda6-bcd9-4663-b848-008ce8a6ece6
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
correlation: qa-40966159-766b-4b77-b1a5-fd8edfd498b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40966159-766b-4b77-b1a5-fd8edfd498b7
Content-Type: application/json

--- request body ---
{"handle":"qa-2e744d0c87dd","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40966159-766b-4b77-b1a5-fd8edfd498b7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40966159-766b-4b77-b1a5-fd8edfd498b7"}
```
