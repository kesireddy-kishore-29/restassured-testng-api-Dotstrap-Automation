# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-cb816957-90b4-41e9-be49-ee1d2fa77b82` |
| 2 | `POST /v1/auth/token` | 200 | 41 | `qa-8dee6999-2376-4c39-a2ca-a8d9cca224e7` |
| 3 | `GET /v1/conversations/{id}` | 404 | 10 | `qa-dde6220b-9a62-4024-94bc-19d334602005` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 16 | `qa-c21a78e3-3d52-4718-b159-e14bb8dc993f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-4f0a9559-c460-494a-9b2e-53a3c8142d47` |
| 6 | `POST /v1/auth/token` | 401 | 9 | `qa-13dde4b7-f0e6-4be1-a1ef-33077fcab104` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb816957-90b4-41e9-be49-ee1d2fa77b82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb816957-90b4-41e9-be49-ee1d2fa77b82
Content-Type: application/json

--- request body ---
{"handle":"qa-e01451432723","displayName":"QA e01451432723","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb816957-90b4-41e9-be49-ee1d2fa77b82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Location: /v1/accounts/qa-e01451432723
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3da3c55a-0071-4709-aa13-9c733ca7caa8","handle":"qa-e01451432723","displayName":"QA e01451432723","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.481617749Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8dee6999-2376-4c39-a2ca-a8d9cca224e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dee6999-2376-4c39-a2ca-a8d9cca224e7
Content-Type: application/json

--- request body ---
{"handle":"qa-e01451432723","password":"****"}

--- response: 200 in 41 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dee6999-2376-4c39-a2ca-a8d9cca224e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3da3c55a-0071-4709-aa13-9c733ca7caa8"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-dde6220b-9a62-4024-94bc-19d334602005

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde6220b-9a62-4024-94bc-19d334602005
Content-Type: application/json

--- response: 404 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dde6220b-9a62-4024-94bc-19d334602005
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-dde6220b-9a62-4024-94bc-19d334602005"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-c21a78e3-3d52-4718-b159-e14bb8dc993f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c21a78e3-3d52-4718-b159-e14bb8dc993f
Content-Type: application/json

--- response: 404 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c21a78e3-3d52-4718-b159-e14bb8dc993f
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-c21a78e3-3d52-4718-b159-e14bb8dc993f"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f0a9559-c460-494a-9b2e-53a3c8142d47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f0a9559-c460-494a-9b2e-53a3c8142d47
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f0a9559-c460-494a-9b2e-53a3c8142d47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-13dde4b7-f0e6-4be1-a1ef-33077fcab104

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13dde4b7-f0e6-4be1-a1ef-33077fcab104
Content-Type: application/json

--- request body ---
{"handle":"qa-e01451432723","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13dde4b7-f0e6-4be1-a1ef-33077fcab104
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-13dde4b7-f0e6-4be1-a1ef-33077fcab104"}
```
