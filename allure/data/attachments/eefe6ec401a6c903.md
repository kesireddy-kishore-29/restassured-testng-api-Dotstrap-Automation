# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-1df65e40-7180-41b5-9971-15367a93c0c8` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-000c98d9-8e03-4008-bdc3-bd8e02a740d3` |
| 3 | `GET /v1/accounts/me` | error | 818 | `qa-bc9e5eb5-f932-4569-a13b-cd73683d8932` |
| 4 | `GET /v1/accounts/me` | error | 814 | `qa-70f447c0-6b40-454c-964c-638e5837f039` |
| 5 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-a2597d59-7905-468f-ad55-ae86550d38a2` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-d2b33f67-1ad8-4e83-8de6-66d2cbf8bfb8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1df65e40-7180-41b5-9971-15367a93c0c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1df65e40-7180-41b5-9971-15367a93c0c8
Content-Type: application/json

--- request body ---
{"handle":"qa-603e4961ab50","displayName":"QA 603e4961ab50","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-1df65e40-7180-41b5-9971-15367a93c0c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-603e4961ab50
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e434dd96-d0d8-45d9-914e-e30b47e8ba67","handle":"qa-603e4961ab50","displayName":"QA 603e4961ab50","region":"eu","role":"user","createdAt":"2026-11-28T10:37:13.220348079Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-000c98d9-8e03-4008-bdc3-bd8e02a740d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-000c98d9-8e03-4008-bdc3-bd8e02a740d3
Content-Type: application/json

--- request body ---
{"handle":"qa-603e4961ab50","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-000c98d9-8e03-4008-bdc3-bd8e02a740d3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e434dd96-d0d8-45d9-914e-e30b47e8ba67"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc9e5eb5-f932-4569-a13b-cd73683d8932

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 9704552b-6796-48dc-b7b5-57c1b0f94b81
X-Correlation-Id: qa-bc9e5eb5-f932-4569-a13b-cd73683d8932
Content-Type: application/json

--- response: none in 818 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-70f447c0-6b40-454c-964c-638e5837f039

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 9704552b-6796-48dc-b7b5-57c1b0f94b81
X-Correlation-Id: qa-70f447c0-6b40-454c-964c-638e5837f039
Content-Type: application/json

--- response: none in 814 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2597d59-7905-468f-ad55-ae86550d38a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2597d59-7905-468f-ad55-ae86550d38a2
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2597d59-7905-468f-ad55-ae86550d38a2
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d2b33f67-1ad8-4e83-8de6-66d2cbf8bfb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2b33f67-1ad8-4e83-8de6-66d2cbf8bfb8
Content-Type: application/json

--- request body ---
{"handle":"qa-603e4961ab50","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2b33f67-1ad8-4e83-8de6-66d2cbf8bfb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2b33f67-1ad8-4e83-8de6-66d2cbf8bfb8"}
```
