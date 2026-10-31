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
| 1 | `POST /v1/accounts` | 201 | 471 | `qa-798af651-7d07-432e-affc-efcb2fca0cd3` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-99e6f54b-ec81-473e-8432-c0bfd93a8a3d` |
| 3 | `GET /v1/accounts/me` | error | 849 | `qa-85b29504-822c-4dec-87a4-c8894f73404a` |
| 4 | `GET /v1/accounts/me` | error | 809 | `qa-068643d7-8e3d-42a6-a450-48c3d4d1f8d4` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e7b7fb59-c244-42c7-a287-9fea2b772707` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-35d4b03e-8f3f-4731-ad9c-d3e02c8300ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-798af651-7d07-432e-affc-efcb2fca0cd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-798af651-7d07-432e-affc-efcb2fca0cd3
Content-Type: application/json

--- request body ---
{"handle":"qa-8fd9b8407370","displayName":"QA 8fd9b8407370","password":"****","region":"eu"}

--- response: 201 in 471 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-798af651-7d07-432e-affc-efcb2fca0cd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-8fd9b8407370
X-Served-Region: eu
Content-Length: 181

{"id":"acc_35d61d86-feff-43fe-aca4-3e6c143cf6d0","handle":"qa-8fd9b8407370","displayName":"QA 8fd9b8407370","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.334546006Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-99e6f54b-ec81-473e-8432-c0bfd93a8a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99e6f54b-ec81-473e-8432-c0bfd93a8a3d
Content-Type: application/json

--- request body ---
{"handle":"qa-8fd9b8407370","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-99e6f54b-ec81-473e-8432-c0bfd93a8a3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_35d61d86-feff-43fe-aca4-3e6c143cf6d0"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-85b29504-822c-4dec-87a4-c8894f73404a

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 2f2c88c4-81f3-4aa9-b8f4-a07d300e6bc4
X-Correlation-Id: qa-85b29504-822c-4dec-87a4-c8894f73404a
Content-Type: application/json

--- response: none in 849 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-068643d7-8e3d-42a6-a450-48c3d4d1f8d4

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 2f2c88c4-81f3-4aa9-b8f4-a07d300e6bc4
X-Correlation-Id: qa-068643d7-8e3d-42a6-a450-48c3d4d1f8d4
Content-Type: application/json

--- response: none in 809 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7b7fb59-c244-42c7-a287-9fea2b772707

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7b7fb59-c244-42c7-a287-9fea2b772707
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7b7fb59-c244-42c7-a287-9fea2b772707
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
correlation: qa-35d4b03e-8f3f-4731-ad9c-d3e02c8300ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35d4b03e-8f3f-4731-ad9c-d3e02c8300ac
Content-Type: application/json

--- request body ---
{"handle":"qa-8fd9b8407370","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35d4b03e-8f3f-4731-ad9c-d3e02c8300ac
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35d4b03e-8f3f-4731-ad9c-d3e02c8300ac"}
```
