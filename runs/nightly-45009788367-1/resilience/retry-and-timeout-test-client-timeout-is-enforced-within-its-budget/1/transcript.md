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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-036eb8b3-ae69-4ae7-b670-c55549ea01d6` |
| 2 | `POST /v1/auth/token` | 200 | 35 | `qa-952818bc-7b06-4a95-b075-867b99dab920` |
| 3 | `GET /v1/accounts/me` | error | 816 | `qa-140f4693-7f6e-4dda-a566-59ad3cd7f8a0` |
| 4 | `GET /v1/accounts/me` | error | 807 | `qa-734aaca6-3d18-4167-9666-c291915cd261` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d993d6c1-7d0e-4abf-ac7c-e3e788c9c303` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-cf6a6940-a963-40b5-80c9-12e15c4384b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-036eb8b3-ae69-4ae7-b670-c55549ea01d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-036eb8b3-ae69-4ae7-b670-c55549ea01d6
Content-Type: application/json

--- request body ---
{"handle":"qa-98ae02a3e4e7","displayName":"QA 98ae02a3e4e7","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-036eb8b3-ae69-4ae7-b670-c55549ea01d6
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
Location: /v1/accounts/qa-98ae02a3e4e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea03add8-8f95-4bf4-af3c-d402b407bf3d","handle":"qa-98ae02a3e4e7","displayName":"QA 98ae02a3e4e7","region":"eu","role":"user","createdAt":"2026-11-22T09:54:54.189823757Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-952818bc-7b06-4a95-b075-867b99dab920

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-952818bc-7b06-4a95-b075-867b99dab920
Content-Type: application/json

--- request body ---
{"handle":"qa-98ae02a3e4e7","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-952818bc-7b06-4a95-b075-867b99dab920
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea03add8-8f95-4bf4-af3c-d402b407bf3d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-140f4693-7f6e-4dda-a566-59ad3cd7f8a0

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: a88b1028-d0fd-426e-99e2-084d7e564c69
X-Correlation-Id: qa-140f4693-7f6e-4dda-a566-59ad3cd7f8a0
Content-Type: application/json

--- response: none in 816 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-734aaca6-3d18-4167-9666-c291915cd261

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: a88b1028-d0fd-426e-99e2-084d7e564c69
X-Correlation-Id: qa-734aaca6-3d18-4167-9666-c291915cd261
Content-Type: application/json

--- response: none in 807 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d993d6c1-7d0e-4abf-ac7c-e3e788c9c303

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d993d6c1-7d0e-4abf-ac7c-e3e788c9c303
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d993d6c1-7d0e-4abf-ac7c-e3e788c9c303
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
correlation: qa-cf6a6940-a963-40b5-80c9-12e15c4384b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf6a6940-a963-40b5-80c9-12e15c4384b4
Content-Type: application/json

--- request body ---
{"handle":"qa-98ae02a3e4e7","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf6a6940-a963-40b5-80c9-12e15c4384b4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf6a6940-a963-40b5-80c9-12e15c4384b4"}
```
