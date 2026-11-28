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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-8c4bac73-aacd-478b-8d9b-adb6917bfb02` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-70f41687-5508-4c71-83f5-8119d063b6ee` |
| 3 | `GET /v1/accounts/me` | 503 | 9 | `qa-0df1136f-5206-4f0a-b254-9f8c686fab10` |
| 4 | `GET /v1/accounts/me` | 200 | 4 | `qa-9d51d1d2-67e8-4646-8489-bcf2557837b8` |
| 5 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-feae2d64-3c84-4911-8b99-37b5406cc699` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-f9bed80d-6ece-4eaf-8467-d3608e67d98c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c4bac73-aacd-478b-8d9b-adb6917bfb02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c4bac73-aacd-478b-8d9b-adb6917bfb02
Content-Type: application/json

--- request body ---
{"handle":"qa-8209b03b4942","displayName":"QA 8209b03b4942","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c4bac73-aacd-478b-8d9b-adb6917bfb02
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
Location: /v1/accounts/qa-8209b03b4942
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa2861b4-24ae-4e6f-93ea-abdadbcb0cc6","handle":"qa-8209b03b4942","displayName":"QA 8209b03b4942","region":"eu","role":"user","createdAt":"2026-11-26T11:02:30.336087883Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-70f41687-5508-4c71-83f5-8119d063b6ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70f41687-5508-4c71-83f5-8119d063b6ee
Content-Type: application/json

--- request body ---
{"handle":"qa-8209b03b4942","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-70f41687-5508-4c71-83f5-8119d063b6ee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa2861b4-24ae-4e6f-93ea-abdadbcb0cc6"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-0df1136f-5206-4f0a-b254-9f8c686fab10

--- request headers ---
Accept: application/json
X-Fault-Key: d36b71f3-117f-4937-bbc3-6e8812eb640d
X-Fault: unavailable-once
X-Correlation-Id: qa-0df1136f-5206-4f0a-b254-9f8c686fab10
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0df1136f-5206-4f0a-b254-9f8c686fab10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-0df1136f-5206-4f0a-b254-9f8c686fab10"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d51d1d2-67e8-4646-8489-bcf2557837b8

--- request headers ---
Accept: application/json
X-Fault-Key: d36b71f3-117f-4937-bbc3-6e8812eb640d
X-Fault: unavailable-once
X-Correlation-Id: qa-9d51d1d2-67e8-4646-8489-bcf2557837b8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d51d1d2-67e8-4646-8489-bcf2557837b8
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

{"id":"acc_fa2861b4-24ae-4e6f-93ea-abdadbcb0cc6","handle":"qa-8209b03b4942","displayName":"QA 8209b03b4942","region":"eu","role":"user","createdAt":"2026-11-26T11:02:30.336087883Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-feae2d64-3c84-4911-8b99-37b5406cc699

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feae2d64-3c84-4911-8b99-37b5406cc699
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-feae2d64-3c84-4911-8b99-37b5406cc699
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
correlation: qa-f9bed80d-6ece-4eaf-8467-d3608e67d98c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9bed80d-6ece-4eaf-8467-d3608e67d98c
Content-Type: application/json

--- request body ---
{"handle":"qa-8209b03b4942","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9bed80d-6ece-4eaf-8467-d3608e67d98c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9bed80d-6ece-4eaf-8467-d3608e67d98c"}
```
