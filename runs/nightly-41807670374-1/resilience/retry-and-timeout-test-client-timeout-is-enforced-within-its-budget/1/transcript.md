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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-848cdfc8-8f07-4f82-bffd-8268fe0f6def` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-674ad8a8-636a-4543-875d-d8a319870602` |
| 3 | `GET /v1/accounts/me` | error | 822 | `qa-5b03ca6f-6010-4788-be43-85a62d754a96` |
| 4 | `GET /v1/accounts/me` | error | 803 | `qa-3d472113-6be6-4ace-8f6d-5d0b6aec324e` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-fb6e6955-3d45-4e56-a2cb-263a2846dd06` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-2042ac11-6cbb-44f4-a31f-cdc353e32812` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-848cdfc8-8f07-4f82-bffd-8268fe0f6def

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-848cdfc8-8f07-4f82-bffd-8268fe0f6def
Content-Type: application/json

--- request body ---
{"handle":"qa-99b48ecd326e","displayName":"QA 99b48ecd326e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-848cdfc8-8f07-4f82-bffd-8268fe0f6def
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
Location: /v1/accounts/qa-99b48ecd326e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_463c2cf0-5f47-4952-a54d-dfd98ce36a41","handle":"qa-99b48ecd326e","displayName":"QA 99b48ecd326e","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.278177486Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-674ad8a8-636a-4543-875d-d8a319870602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-674ad8a8-636a-4543-875d-d8a319870602
Content-Type: application/json

--- request body ---
{"handle":"qa-99b48ecd326e","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-674ad8a8-636a-4543-875d-d8a319870602
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_463c2cf0-5f47-4952-a54d-dfd98ce36a41"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b03ca6f-6010-4788-be43-85a62d754a96

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 3ce3ec69-1681-4b95-920d-a638c2d40bf4
X-Correlation-Id: qa-5b03ca6f-6010-4788-be43-85a62d754a96
Content-Type: application/json

--- response: none in 822 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d472113-6be6-4ace-8f6d-5d0b6aec324e

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 3ce3ec69-1681-4b95-920d-a638c2d40bf4
X-Correlation-Id: qa-3d472113-6be6-4ace-8f6d-5d0b6aec324e
Content-Type: application/json

--- response: none in 803 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb6e6955-3d45-4e56-a2cb-263a2846dd06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb6e6955-3d45-4e56-a2cb-263a2846dd06
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb6e6955-3d45-4e56-a2cb-263a2846dd06
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
correlation: qa-2042ac11-6cbb-44f4-a31f-cdc353e32812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2042ac11-6cbb-44f4-a31f-cdc353e32812
Content-Type: application/json

--- request body ---
{"handle":"qa-99b48ecd326e","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2042ac11-6cbb-44f4-a31f-cdc353e32812
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2042ac11-6cbb-44f4-a31f-cdc353e32812"}
```
