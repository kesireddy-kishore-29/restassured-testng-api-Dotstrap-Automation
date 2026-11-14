# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-8b6c47f6-81f5-4d5a-9d3b-30e2f7877f5b` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-7f388482-2517-4685-b6de-335ba68a4faa` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-cb16d168-a291-47cf-b4f3-1b67ecae9a90` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-1c48c657-5734-4cd5-a9cb-7d8150a167ba` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-6de3bb71-7f4b-4a21-806b-28c8ff9549ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8b6c47f6-81f5-4d5a-9d3b-30e2f7877f5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b6c47f6-81f5-4d5a-9d3b-30e2f7877f5b
Content-Type: application/json

--- request body ---
{"handle":"qa-83ac3c557562","displayName":"QA 83ac3c557562","password":"****","region":"us"}

--- response: 201 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b6c47f6-81f5-4d5a-9d3b-30e2f7877f5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-83ac3c557562
X-Served-Region: us
Content-Length: 181

{"id":"acc_4282f0c2-08fd-43f0-9c05-c9986e331e39","handle":"qa-83ac3c557562","displayName":"QA 83ac3c557562","region":"us","role":"user","createdAt":"2026-11-10T09:59:34.204644195Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7f388482-2517-4685-b6de-335ba68a4faa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f388482-2517-4685-b6de-335ba68a4faa
Content-Type: application/json

--- request body ---
{"handle":"qa-83ac3c557562","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f388482-2517-4685-b6de-335ba68a4faa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4282f0c2-08fd-43f0-9c05-c9986e331e39"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb16d168-a291-47cf-b4f3-1b67ecae9a90

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-cb16d168-a291-47cf-b4f3-1b67ecae9a90
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb16d168-a291-47cf-b4f3-1b67ecae9a90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_4282f0c2-08fd-43f0-9c05-c9986e331e39","handle":"qa-83ac3c557562","displayName":"QA 83ac3c557562","region":"us","role":"user","createdAt":"2026-11-10T09:59:34.204644195Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c48c657-5734-4cd5-a9cb-7d8150a167ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c48c657-5734-4cd5-a9cb-7d8150a167ba
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c48c657-5734-4cd5-a9cb-7d8150a167ba
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6de3bb71-7f4b-4a21-806b-28c8ff9549ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6de3bb71-7f4b-4a21-806b-28c8ff9549ee
Content-Type: application/json

--- request body ---
{"handle":"qa-83ac3c557562","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6de3bb71-7f4b-4a21-806b-28c8ff9549ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6de3bb71-7f4b-4a21-806b-28c8ff9549ee"}
```
