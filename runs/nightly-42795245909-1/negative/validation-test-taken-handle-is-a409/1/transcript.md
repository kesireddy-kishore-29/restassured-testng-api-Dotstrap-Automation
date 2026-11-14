# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 555 | `qa-2465ded0-69c7-48d3-8717-0a4a54abd92e` |
| 2 | `POST /v1/accounts` | 409 | 35 | `qa-3180c836-5e0f-4cb3-a2a8-7b633042b0e6` |
| 3 | `POST /v1/auth/token` | 200 | 63 | `qa-3e1b8969-1239-424b-8ac5-80b567afa39e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-bbb3ba94-a1bd-424d-90d7-13d6d097fe6d` |
| 5 | `POST /v1/auth/token` | 401 | 23 | `qa-000d9b44-cbcc-42b3-ab06-9c248839aa80` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2465ded0-69c7-48d3-8717-0a4a54abd92e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2465ded0-69c7-48d3-8717-0a4a54abd92e
Content-Type: application/json

--- request body ---
{"handle":"qa-955657730718","displayName":"QA 955657730718","password":"****","region":"eu"}

--- response: 201 in 555 ms ---
Date: Tue, 10 Nov 2026 09:59:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2465ded0-69c7-48d3-8717-0a4a54abd92e
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
Location: /v1/accounts/qa-955657730718
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1e607f47-315e-4f46-8947-72574202dc2e","handle":"qa-955657730718","displayName":"QA 955657730718","region":"eu","role":"user","createdAt":"2026-11-10T09:59:45.893684207Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3180c836-5e0f-4cb3-a2a8-7b633042b0e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3180c836-5e0f-4cb3-a2a8-7b633042b0e6
Content-Type: application/json

--- request body ---
{"handle":"qa-955657730718","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 35 ms ---
Date: Tue, 10 Nov 2026 09:59:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3180c836-5e0f-4cb3-a2a8-7b633042b0e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-955657730718' is in use.","instance":"/v1/accounts","correlationId":"qa-3180c836-5e0f-4cb3-a2a8-7b633042b0e6"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3e1b8969-1239-424b-8ac5-80b567afa39e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e1b8969-1239-424b-8ac5-80b567afa39e
Content-Type: application/json

--- request body ---
{"handle":"qa-955657730718","password":"****"}

--- response: 200 in 63 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e1b8969-1239-424b-8ac5-80b567afa39e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1e607f47-315e-4f46-8947-72574202dc2e"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bbb3ba94-a1bd-424d-90d7-13d6d097fe6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbb3ba94-a1bd-424d-90d7-13d6d097fe6d
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bbb3ba94-a1bd-424d-90d7-13d6d097fe6d
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-000d9b44-cbcc-42b3-ab06-9c248839aa80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-000d9b44-cbcc-42b3-ab06-9c248839aa80
Content-Type: application/json

--- request body ---
{"handle":"qa-955657730718","password":"****"}

--- response: 401 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-000d9b44-cbcc-42b3-ab06-9c248839aa80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-000d9b44-cbcc-42b3-ab06-9c248839aa80"}
```
