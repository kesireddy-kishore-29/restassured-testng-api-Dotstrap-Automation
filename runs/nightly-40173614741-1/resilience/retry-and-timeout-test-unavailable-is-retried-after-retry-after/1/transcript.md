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
| 1 | `POST /v1/accounts` | 201 | 472 | `qa-15929288-d6ee-4122-a3a2-26b0aac2a074` |
| 2 | `POST /v1/auth/token` | 200 | 53 | `qa-b4895a47-fe07-4b8d-89cf-0e76a984141a` |
| 3 | `GET /v1/accounts/me` | 503 | 68 | `qa-facf179a-5530-42a7-b6c4-d910b527dd73` |
| 4 | `GET /v1/accounts/me` | 200 | 24 | `qa-61968c7f-168f-4678-8c9c-ae5a59cbf512` |
| 5 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-83f966b2-1f26-450d-acc3-d946ad779fb3` |
| 6 | `POST /v1/auth/token` | 401 | 17 | `qa-52b6ad84-8220-4ed3-9f0c-22178981b166` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15929288-d6ee-4122-a3a2-26b0aac2a074

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15929288-d6ee-4122-a3a2-26b0aac2a074
Content-Type: application/json

--- request body ---
{"handle":"qa-4fc17fff7942","displayName":"QA 4fc17fff7942","password":"****","region":"eu"}

--- response: 201 in 472 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-15929288-d6ee-4122-a3a2-26b0aac2a074
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
Location: /v1/accounts/qa-4fc17fff7942
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9e51049-7ee9-4ba4-a412-39a859eb9699","handle":"qa-4fc17fff7942","displayName":"QA 4fc17fff7942","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.235999597Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b4895a47-fe07-4b8d-89cf-0e76a984141a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4895a47-fe07-4b8d-89cf-0e76a984141a
Content-Type: application/json

--- request body ---
{"handle":"qa-4fc17fff7942","password":"****"}

--- response: 200 in 53 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4895a47-fe07-4b8d-89cf-0e76a984141a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9e51049-7ee9-4ba4-a412-39a859eb9699"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-facf179a-5530-42a7-b6c4-d910b527dd73

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5279111e-1c1b-4dc0-97ae-5337c0d2c8fb
X-Correlation-Id: qa-facf179a-5530-42a7-b6c4-d910b527dd73
Content-Type: application/json

--- response: 503 in 68 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-facf179a-5530-42a7-b6c4-d910b527dd73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-facf179a-5530-42a7-b6c4-d910b527dd73"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-61968c7f-168f-4678-8c9c-ae5a59cbf512

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5279111e-1c1b-4dc0-97ae-5337c0d2c8fb
X-Correlation-Id: qa-61968c7f-168f-4678-8c9c-ae5a59cbf512
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-61968c7f-168f-4678-8c9c-ae5a59cbf512
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

{"id":"acc_b9e51049-7ee9-4ba4-a412-39a859eb9699","handle":"qa-4fc17fff7942","displayName":"QA 4fc17fff7942","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.235999597Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83f966b2-1f26-450d-acc3-d946ad779fb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83f966b2-1f26-450d-acc3-d946ad779fb3
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83f966b2-1f26-450d-acc3-d946ad779fb3
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
correlation: qa-52b6ad84-8220-4ed3-9f0c-22178981b166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52b6ad84-8220-4ed3-9f0c-22178981b166
Content-Type: application/json

--- request body ---
{"handle":"qa-4fc17fff7942","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52b6ad84-8220-4ed3-9f0c-22178981b166
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52b6ad84-8220-4ed3-9f0c-22178981b166"}
```
