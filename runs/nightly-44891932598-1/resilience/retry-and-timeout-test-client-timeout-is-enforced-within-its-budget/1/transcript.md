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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-4dac5097-b834-4c7c-b580-5d30647a4714` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-3dcc3f9b-9f5c-4d80-b0da-029536a9f1c9` |
| 3 | `GET /v1/accounts/me` | error | 810 | `qa-dc4fbc38-ffde-44f5-99c0-81b2a9e30f43` |
| 4 | `GET /v1/accounts/me` | error | 806 | `qa-c2013cbf-2669-4779-82cb-f87ba7f71e6c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-97ac81b0-2177-4ecc-aac4-6a5e1ffeda9f` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-8edc5ebf-6230-4e30-8f3c-18fb6df1a4c3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4dac5097-b834-4c7c-b580-5d30647a4714

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dac5097-b834-4c7c-b580-5d30647a4714
Content-Type: application/json

--- request body ---
{"handle":"qa-7cf77e502364","displayName":"QA 7cf77e502364","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dac5097-b834-4c7c-b580-5d30647a4714
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
Location: /v1/accounts/qa-7cf77e502364
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b846fe26-ed43-469c-8ebf-41dd01812b8b","handle":"qa-7cf77e502364","displayName":"QA 7cf77e502364","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.573819901Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3dcc3f9b-9f5c-4d80-b0da-029536a9f1c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dcc3f9b-9f5c-4d80-b0da-029536a9f1c9
Content-Type: application/json

--- request body ---
{"handle":"qa-7cf77e502364","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dcc3f9b-9f5c-4d80-b0da-029536a9f1c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b846fe26-ed43-469c-8ebf-41dd01812b8b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc4fbc38-ffde-44f5-99c0-81b2a9e30f43

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: dbd78eed-fada-408c-9ce5-c20cdf2453ca
X-Correlation-Id: qa-dc4fbc38-ffde-44f5-99c0-81b2a9e30f43
Content-Type: application/json

--- response: none in 810 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-c2013cbf-2669-4779-82cb-f87ba7f71e6c

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: dbd78eed-fada-408c-9ce5-c20cdf2453ca
X-Correlation-Id: qa-c2013cbf-2669-4779-82cb-f87ba7f71e6c
Content-Type: application/json

--- response: none in 806 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97ac81b0-2177-4ecc-aac4-6a5e1ffeda9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97ac81b0-2177-4ecc-aac4-6a5e1ffeda9f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97ac81b0-2177-4ecc-aac4-6a5e1ffeda9f
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
correlation: qa-8edc5ebf-6230-4e30-8f3c-18fb6df1a4c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8edc5ebf-6230-4e30-8f3c-18fb6df1a4c3
Content-Type: application/json

--- request body ---
{"handle":"qa-7cf77e502364","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8edc5ebf-6230-4e30-8f3c-18fb6df1a4c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8edc5ebf-6230-4e30-8f3c-18fb6df1a4c3"}
```
