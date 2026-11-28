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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-22dca97b-a6f8-4740-a139-4ee9cb75621c` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-8c963994-6d48-47bd-a7c5-63b37a3996bc` |
| 3 | `GET /v1/accounts/me` | error | 809 | `qa-2a080c95-a715-462d-87ee-f1ffa0d661af` |
| 4 | `GET /v1/accounts/me` | error | 804 | `qa-e72cf173-6194-435c-8031-bf029572e8ed` |
| 5 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-c726bc99-280a-4956-b394-07de263f07bf` |
| 6 | `POST /v1/auth/token` | 401 | 3 | `qa-dbc14d12-87dd-43c5-b9c3-224200c9a855` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-22dca97b-a6f8-4740-a139-4ee9cb75621c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22dca97b-a6f8-4740-a139-4ee9cb75621c
Content-Type: application/json

--- request body ---
{"handle":"qa-967ed409c4f9","displayName":"QA 967ed409c4f9","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-22dca97b-a6f8-4740-a139-4ee9cb75621c
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
Location: /v1/accounts/qa-967ed409c4f9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9558120-d74b-4fa0-b5a6-449cc495f3f2","handle":"qa-967ed409c4f9","displayName":"QA 967ed409c4f9","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.011593579Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8c963994-6d48-47bd-a7c5-63b37a3996bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c963994-6d48-47bd-a7c5-63b37a3996bc
Content-Type: application/json

--- request body ---
{"handle":"qa-967ed409c4f9","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c963994-6d48-47bd-a7c5-63b37a3996bc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9558120-d74b-4fa0-b5a6-449cc495f3f2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a080c95-a715-462d-87ee-f1ffa0d661af

--- request headers ---
Accept: application/json
X-Fault-Key: 726ec271-f0e4-4d40-99d7-5fa100ee9a38
X-Fault: latency=4000
X-Correlation-Id: qa-2a080c95-a715-462d-87ee-f1ffa0d661af
Content-Type: application/json

--- response: none in 809 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-e72cf173-6194-435c-8031-bf029572e8ed

--- request headers ---
Accept: application/json
X-Fault-Key: 726ec271-f0e4-4d40-99d7-5fa100ee9a38
X-Fault: latency=4000
X-Correlation-Id: qa-e72cf173-6194-435c-8031-bf029572e8ed
Content-Type: application/json

--- response: none in 804 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c726bc99-280a-4956-b394-07de263f07bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c726bc99-280a-4956-b394-07de263f07bf
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c726bc99-280a-4956-b394-07de263f07bf
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
correlation: qa-dbc14d12-87dd-43c5-b9c3-224200c9a855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbc14d12-87dd-43c5-b9c3-224200c9a855
Content-Type: application/json

--- request body ---
{"handle":"qa-967ed409c4f9","password":"****"}

--- response: 401 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbc14d12-87dd-43c5-b9c3-224200c9a855
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dbc14d12-87dd-43c5-b9c3-224200c9a855"}
```
