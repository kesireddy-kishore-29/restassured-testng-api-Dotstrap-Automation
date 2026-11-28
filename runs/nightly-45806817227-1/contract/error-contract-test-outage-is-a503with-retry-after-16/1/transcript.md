# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-0eb7002c-00b5-47d9-82ba-a8cc4dad436f` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-05f9f5a7-74a8-4465-b95c-e801c3950f5e` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-743e69fd-a27c-42f1-87e3-47e49837292b` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-d83d5d8b-e686-4758-9264-bfb0171c69dd` |
| 5 | `GET /v1/admin/stats` | 503 | 11 | `qa-82f9c25a-cee2-4d0d-a840-a1895db76d28` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-241d3dbb-0bfd-4e00-9e11-1b40cfdd4e17` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a64ba290-1b1f-438a-9aa9-be0109fae966` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-31a5f44c-82c5-4437-9017-d9c8c9a8ddb5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-b1bbad09-c6b2-4e71-b133-da949ec29976` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-8ec38a01-694c-4fd6-82e6-43b70758cc08` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0eb7002c-00b5-47d9-82ba-a8cc4dad436f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eb7002c-00b5-47d9-82ba-a8cc4dad436f
Content-Type: application/json

--- request body ---
{"handle":"qa-18f0d05e3e48","displayName":"QA 18f0d05e3e48","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0eb7002c-00b5-47d9-82ba-a8cc4dad436f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Location: /v1/accounts/qa-18f0d05e3e48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bffdc785-6eb4-4402-a2f0-975754c47932","handle":"qa-18f0d05e3e48","displayName":"QA 18f0d05e3e48","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.965026474Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-05f9f5a7-74a8-4465-b95c-e801c3950f5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05f9f5a7-74a8-4465-b95c-e801c3950f5e
Content-Type: application/json

--- request body ---
{"handle":"qa-ef30e0c10379","displayName":"QA ef30e0c10379","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-05f9f5a7-74a8-4465-b95c-e801c3950f5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Location: /v1/accounts/qa-ef30e0c10379
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e54cd478-cf26-49ff-8ff3-5d9f54c5f3d9","handle":"qa-ef30e0c10379","displayName":"QA ef30e0c10379","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.009487540Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-743e69fd-a27c-42f1-87e3-47e49837292b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-743e69fd-a27c-42f1-87e3-47e49837292b
Content-Type: application/json

--- request body ---
{"handle":"qa-18f0d05e3e48","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-743e69fd-a27c-42f1-87e3-47e49837292b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bffdc785-6eb4-4402-a2f0-975754c47932"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d83d5d8b-e686-4758-9264-bfb0171c69dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d83d5d8b-e686-4758-9264-bfb0171c69dd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ef30e0c10379","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-d83d5d8b-e686-4758-9264-bfb0171c69dd
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
Location: /v1/conversations/cnv_edb99ad2-aec5-4541-a0e8-33e483a46845
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_edb99ad2-aec5-4541-a0e8-33e483a46845","subject":"Error contract","status":"open","region":"eu","participants":["qa-18f0d05e3e48","qa-ef30e0c10379"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:47.059833676Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-82f9c25a-cee2-4d0d-a840-a1895db76d28

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0fc960f0-5294-4d0c-a592-e4fa3d916785
X-Correlation-Id: qa-82f9c25a-cee2-4d0d-a840-a1895db76d28
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82f9c25a-cee2-4d0d-a840-a1895db76d28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-82f9c25a-cee2-4d0d-a840-a1895db76d28"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-241d3dbb-0bfd-4e00-9e11-1b40cfdd4e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-241d3dbb-0bfd-4e00-9e11-1b40cfdd4e17
Content-Type: application/json

--- request body ---
{"handle":"qa-ef30e0c10379","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-241d3dbb-0bfd-4e00-9e11-1b40cfdd4e17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e54cd478-cf26-49ff-8ff3-5d9f54c5f3d9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a64ba290-1b1f-438a-9aa9-be0109fae966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a64ba290-1b1f-438a-9aa9-be0109fae966
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a64ba290-1b1f-438a-9aa9-be0109fae966
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-31a5f44c-82c5-4437-9017-d9c8c9a8ddb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31a5f44c-82c5-4437-9017-d9c8c9a8ddb5
Content-Type: application/json

--- request body ---
{"handle":"qa-ef30e0c10379","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31a5f44c-82c5-4437-9017-d9c8c9a8ddb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31a5f44c-82c5-4437-9017-d9c8c9a8ddb5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b1bbad09-c6b2-4e71-b133-da949ec29976

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1bbad09-c6b2-4e71-b133-da949ec29976
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b1bbad09-c6b2-4e71-b133-da949ec29976
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8ec38a01-694c-4fd6-82e6-43b70758cc08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ec38a01-694c-4fd6-82e6-43b70758cc08
Content-Type: application/json

--- request body ---
{"handle":"qa-18f0d05e3e48","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ec38a01-694c-4fd6-82e6-43b70758cc08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ec38a01-694c-4fd6-82e6-43b70758cc08"}
```
