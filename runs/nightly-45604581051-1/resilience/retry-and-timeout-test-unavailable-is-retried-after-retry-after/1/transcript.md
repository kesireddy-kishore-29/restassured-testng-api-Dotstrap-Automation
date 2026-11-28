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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-d43cfa88-a4d8-480a-86fd-9d6d55f11622` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-a0af0b80-b80a-4b45-bf31-753cfeb33ce2` |
| 3 | `GET /v1/accounts/me` | 503 | 12 | `qa-ebdbb6e4-fe6c-4566-b5ae-189cb393a523` |
| 4 | `GET /v1/accounts/me` | 200 | 11 | `qa-554496a3-d983-4d31-ae06-16178fdf473c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0410d958-9072-435b-8326-b47b7e7c84fb` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-0091ff96-5480-4f39-88d2-a2c8f9715388` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d43cfa88-a4d8-480a-86fd-9d6d55f11622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d43cfa88-a4d8-480a-86fd-9d6d55f11622
Content-Type: application/json

--- request body ---
{"handle":"qa-c522bbea3373","displayName":"QA c522bbea3373","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-d43cfa88-a4d8-480a-86fd-9d6d55f11622
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-c522bbea3373
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69bfdaad-2e7a-4a6f-8cc1-222be2b55286","handle":"qa-c522bbea3373","displayName":"QA c522bbea3373","region":"eu","role":"user","createdAt":"2026-11-25T11:27:50.463232396Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a0af0b80-b80a-4b45-bf31-753cfeb33ce2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0af0b80-b80a-4b45-bf31-753cfeb33ce2
Content-Type: application/json

--- request body ---
{"handle":"qa-c522bbea3373","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0af0b80-b80a-4b45-bf31-753cfeb33ce2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69bfdaad-2e7a-4a6f-8cc1-222be2b55286"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ebdbb6e4-fe6c-4566-b5ae-189cb393a523

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bd9a8659-5c7a-4abf-a51a-0fd242ade151
X-Correlation-Id: qa-ebdbb6e4-fe6c-4566-b5ae-189cb393a523
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebdbb6e4-fe6c-4566-b5ae-189cb393a523
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-ebdbb6e4-fe6c-4566-b5ae-189cb393a523"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-554496a3-d983-4d31-ae06-16178fdf473c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bd9a8659-5c7a-4abf-a51a-0fd242ade151
X-Correlation-Id: qa-554496a3-d983-4d31-ae06-16178fdf473c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-554496a3-d983-4d31-ae06-16178fdf473c
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

{"id":"acc_69bfdaad-2e7a-4a6f-8cc1-222be2b55286","handle":"qa-c522bbea3373","displayName":"QA c522bbea3373","region":"eu","role":"user","createdAt":"2026-11-25T11:27:50.463232396Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0410d958-9072-435b-8326-b47b7e7c84fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0410d958-9072-435b-8326-b47b7e7c84fb
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0410d958-9072-435b-8326-b47b7e7c84fb
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
correlation: qa-0091ff96-5480-4f39-88d2-a2c8f9715388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0091ff96-5480-4f39-88d2-a2c8f9715388
Content-Type: application/json

--- request body ---
{"handle":"qa-c522bbea3373","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0091ff96-5480-4f39-88d2-a2c8f9715388
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0091ff96-5480-4f39-88d2-a2c8f9715388"}
```
