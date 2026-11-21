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
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-8e19e5a2-8b40-48af-820e-b4a016d621d7` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-839332bf-852b-4b58-bb69-a5708d67c813` |
| 3 | `GET /v1/accounts/me` | 503 | 19 | `qa-af6d9ea6-7137-437e-a6bd-921fd42ab625` |
| 4 | `GET /v1/accounts/me` | 200 | 11 | `qa-88dda3f2-ba0b-4803-80bb-92d16f045d31` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-035c1b93-8e80-48d7-8d4f-542730d95489` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-7e6eb4b8-33ca-4f76-8450-fbfc40e7c5bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8e19e5a2-8b40-48af-820e-b4a016d621d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e19e5a2-8b40-48af-820e-b4a016d621d7
Content-Type: application/json

--- request body ---
{"handle":"qa-04feea236d51","displayName":"QA 04feea236d51","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e19e5a2-8b40-48af-820e-b4a016d621d7
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
Location: /v1/accounts/qa-04feea236d51
X-Served-Region: eu
Content-Length: 181

{"id":"acc_766fdee6-be38-4903-8b87-a3859a625468","handle":"qa-04feea236d51","displayName":"QA 04feea236d51","region":"eu","role":"user","createdAt":"2026-11-16T09:54:00.984078865Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-839332bf-852b-4b58-bb69-a5708d67c813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-839332bf-852b-4b58-bb69-a5708d67c813
Content-Type: application/json

--- request body ---
{"handle":"qa-04feea236d51","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-839332bf-852b-4b58-bb69-a5708d67c813
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_766fdee6-be38-4903-8b87-a3859a625468"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-af6d9ea6-7137-437e-a6bd-921fd42ab625

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: db98aeb9-4bed-4696-9ffc-35d3ed4296c1
X-Correlation-Id: qa-af6d9ea6-7137-437e-a6bd-921fd42ab625
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af6d9ea6-7137-437e-a6bd-921fd42ab625
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-af6d9ea6-7137-437e-a6bd-921fd42ab625"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-88dda3f2-ba0b-4803-80bb-92d16f045d31

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: db98aeb9-4bed-4696-9ffc-35d3ed4296c1
X-Correlation-Id: qa-88dda3f2-ba0b-4803-80bb-92d16f045d31
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-88dda3f2-ba0b-4803-80bb-92d16f045d31
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

{"id":"acc_766fdee6-be38-4903-8b87-a3859a625468","handle":"qa-04feea236d51","displayName":"QA 04feea236d51","region":"eu","role":"user","createdAt":"2026-11-16T09:54:00.984078865Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-035c1b93-8e80-48d7-8d4f-542730d95489

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-035c1b93-8e80-48d7-8d4f-542730d95489
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-035c1b93-8e80-48d7-8d4f-542730d95489
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
correlation: qa-7e6eb4b8-33ca-4f76-8450-fbfc40e7c5bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e6eb4b8-33ca-4f76-8450-fbfc40e7c5bf
Content-Type: application/json

--- request body ---
{"handle":"qa-04feea236d51","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e6eb4b8-33ca-4f76-8450-fbfc40e7c5bf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e6eb4b8-33ca-4f76-8450-fbfc40e7c5bf"}
```
