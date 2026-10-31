# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 401 | `qa-b0d87086-d4a6-4cae-9ef1-790b51ad24d0` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-900145d5-5178-4616-9c56-280e41ea126d` |
| 3 | `GET /v1/admin/stats` | 403 | 38 | `qa-8e31c12c-5fb6-4fec-8f0f-297e1dff6a87` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-04ac4ae7-0507-481e-91e3-1ab72f831ada` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-9edacd83-7e6c-4d10-8b67-61fc2a5f4818` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b0d87086-d4a6-4cae-9ef1-790b51ad24d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0d87086-d4a6-4cae-9ef1-790b51ad24d0
Content-Type: application/json

--- request body ---
{"handle":"qa-f036d0f700ee","displayName":"QA f036d0f700ee","password":"****","region":"eu"}

--- response: 201 in 401 ms ---
Date: Tue, 27 Oct 2026 08:00:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0d87086-d4a6-4cae-9ef1-790b51ad24d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-f036d0f700ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ef76a01-3016-4526-a2f2-7b94947dabb1","handle":"qa-f036d0f700ee","displayName":"QA f036d0f700ee","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.026528723Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-900145d5-5178-4616-9c56-280e41ea126d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900145d5-5178-4616-9c56-280e41ea126d
Content-Type: application/json

--- request body ---
{"handle":"qa-f036d0f700ee","password":"****"}

--- response: 200 in 43 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-900145d5-5178-4616-9c56-280e41ea126d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ef76a01-3016-4526-a2f2-7b94947dabb1"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-8e31c12c-5fb6-4fec-8f0f-297e1dff6a87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e31c12c-5fb6-4fec-8f0f-297e1dff6a87
Content-Type: application/json

--- response: 403 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e31c12c-5fb6-4fec-8f0f-297e1dff6a87
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-8e31c12c-5fb6-4fec-8f0f-297e1dff6a87"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04ac4ae7-0507-481e-91e3-1ab72f831ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04ac4ae7-0507-481e-91e3-1ab72f831ada
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04ac4ae7-0507-481e-91e3-1ab72f831ada
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9edacd83-7e6c-4d10-8b67-61fc2a5f4818

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9edacd83-7e6c-4d10-8b67-61fc2a5f4818
Content-Type: application/json

--- request body ---
{"handle":"qa-f036d0f700ee","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9edacd83-7e6c-4d10-8b67-61fc2a5f4818
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9edacd83-7e6c-4d10-8b67-61fc2a5f4818"}
```
