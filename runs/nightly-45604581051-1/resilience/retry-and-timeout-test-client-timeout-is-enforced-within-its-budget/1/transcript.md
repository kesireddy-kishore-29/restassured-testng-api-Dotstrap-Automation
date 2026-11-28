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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-a5fc243f-a2a9-44fd-b65f-660d26b34c48` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-bdc14e95-0222-459e-9bbf-e15bf4d5a0a7` |
| 3 | `GET /v1/accounts/me` | error | 808 | `qa-326a7df0-bc98-415a-a035-fb811010b65c` |
| 4 | `GET /v1/accounts/me` | error | 805 | `qa-82413117-29a9-4e94-8aac-6e137efd6e4a` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-95477dd4-5c76-4282-ad42-7b389aad0ce9` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-2f8c95ba-09ac-473e-b3ba-390d736be2ad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a5fc243f-a2a9-44fd-b65f-660d26b34c48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5fc243f-a2a9-44fd-b65f-660d26b34c48
Content-Type: application/json

--- request body ---
{"handle":"qa-0219ac759844","displayName":"QA 0219ac759844","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5fc243f-a2a9-44fd-b65f-660d26b34c48
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
Location: /v1/accounts/qa-0219ac759844
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f37afac1-2ebf-49e9-8e13-1adfb4b18841","handle":"qa-0219ac759844","displayName":"QA 0219ac759844","region":"eu","role":"user","createdAt":"2026-11-25T11:27:50.454826477Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bdc14e95-0222-459e-9bbf-e15bf4d5a0a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdc14e95-0222-459e-9bbf-e15bf4d5a0a7
Content-Type: application/json

--- request body ---
{"handle":"qa-0219ac759844","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdc14e95-0222-459e-9bbf-e15bf4d5a0a7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f37afac1-2ebf-49e9-8e13-1adfb4b18841"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-326a7df0-bc98-415a-a035-fb811010b65c

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 7c887078-e9b1-45f5-8716-ae98fd483652
X-Correlation-Id: qa-326a7df0-bc98-415a-a035-fb811010b65c
Content-Type: application/json

--- response: none in 808 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-82413117-29a9-4e94-8aac-6e137efd6e4a

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 7c887078-e9b1-45f5-8716-ae98fd483652
X-Correlation-Id: qa-82413117-29a9-4e94-8aac-6e137efd6e4a
Content-Type: application/json

--- response: none in 805 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95477dd4-5c76-4282-ad42-7b389aad0ce9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95477dd4-5c76-4282-ad42-7b389aad0ce9
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95477dd4-5c76-4282-ad42-7b389aad0ce9
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
correlation: qa-2f8c95ba-09ac-473e-b3ba-390d736be2ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f8c95ba-09ac-473e-b3ba-390d736be2ad
Content-Type: application/json

--- request body ---
{"handle":"qa-0219ac759844","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f8c95ba-09ac-473e-b3ba-390d736be2ad
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f8c95ba-09ac-473e-b3ba-390d736be2ad"}
```
