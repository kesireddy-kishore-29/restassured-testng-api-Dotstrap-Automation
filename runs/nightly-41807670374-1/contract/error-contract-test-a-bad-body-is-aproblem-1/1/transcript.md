# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 461 | `qa-037fe734-dc1e-4e65-81bb-92717e868b12` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-9ab05b29-ee01-434d-af15-2d1ac1c3cc55` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-6c5787ae-dd63-47b3-bfab-fff7d44cc59e` |
| 4 | `POST /v1/conversations` | 201 | 50 | `qa-89d48cd9-8cd4-4eb0-a684-03e92dbbaba2` |
| 5 | `POST /v1/auth/token` | 415 | 37 | `qa-89d25d93-d9e0-49a0-ba6e-984ffc860bb7` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-9d40cf95-3973-4f1a-8237-07f3ff58ffd3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-ea80e291-70f8-49fb-95ce-51bb99928834` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-bb98af92-ce8e-477b-b2aa-ce5e467efeb8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-f680fd2f-3bb0-40d5-ba8f-9cfd29e00d78` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-c47ac1d0-421e-454c-9a54-84c3ff810a64` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-037fe734-dc1e-4e65-81bb-92717e868b12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-037fe734-dc1e-4e65-81bb-92717e868b12
Content-Type: application/json

--- request body ---
{"handle":"qa-1f7282c94b1d","displayName":"QA 1f7282c94b1d","password":"****","region":"eu"}

--- response: 201 in 461 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-037fe734-dc1e-4e65-81bb-92717e868b12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-1f7282c94b1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea95b192-cb35-4aa9-81c9-db9ceeace7cb","handle":"qa-1f7282c94b1d","displayName":"QA 1f7282c94b1d","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.116567381Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9ab05b29-ee01-434d-af15-2d1ac1c3cc55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ab05b29-ee01-434d-af15-2d1ac1c3cc55
Content-Type: application/json

--- request body ---
{"handle":"qa-2b94d256f2a9","displayName":"QA 2b94d256f2a9","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ab05b29-ee01-434d-af15-2d1ac1c3cc55
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
Location: /v1/accounts/qa-2b94d256f2a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9973dff6-bc2f-4ffd-a1ac-4fc66fc342f8","handle":"qa-2b94d256f2a9","displayName":"QA 2b94d256f2a9","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.374710138Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6c5787ae-dd63-47b3-bfab-fff7d44cc59e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c5787ae-dd63-47b3-bfab-fff7d44cc59e
Content-Type: application/json

--- request body ---
{"handle":"qa-1f7282c94b1d","password":"****"}

--- response: 200 in 46 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c5787ae-dd63-47b3-bfab-fff7d44cc59e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea95b192-cb35-4aa9-81c9-db9ceeace7cb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-89d48cd9-8cd4-4eb0-a684-03e92dbbaba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89d48cd9-8cd4-4eb0-a684-03e92dbbaba2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2b94d256f2a9","subject":"Error contract","message":"Hi"}

--- response: 201 in 50 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-89d48cd9-8cd4-4eb0-a684-03e92dbbaba2
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
Location: /v1/conversations/cnv_79a0aa1b-a6e9-4e6b-950f-b6a138b66276
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_79a0aa1b-a6e9-4e6b-950f-b6a138b66276","subject":"Error contract","status":"open","region":"eu","participants":["qa-1f7282c94b1d","qa-2b94d256f2a9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.523838319Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-89d25d93-d9e0-49a0-ba6e-984ffc860bb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89d25d93-d9e0-49a0-ba6e-984ffc860bb7
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 37 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89d25d93-d9e0-49a0-ba6e-984ffc860bb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-89d25d93-d9e0-49a0-ba6e-984ffc860bb7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9d40cf95-3973-4f1a-8237-07f3ff58ffd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d40cf95-3973-4f1a-8237-07f3ff58ffd3
Content-Type: application/json

--- request body ---
{"handle":"qa-2b94d256f2a9","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d40cf95-3973-4f1a-8237-07f3ff58ffd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9973dff6-bc2f-4ffd-a1ac-4fc66fc342f8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea80e291-70f8-49fb-95ce-51bb99928834

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea80e291-70f8-49fb-95ce-51bb99928834
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea80e291-70f8-49fb-95ce-51bb99928834
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
correlation: qa-bb98af92-ce8e-477b-b2aa-ce5e467efeb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb98af92-ce8e-477b-b2aa-ce5e467efeb8
Content-Type: application/json

--- request body ---
{"handle":"qa-2b94d256f2a9","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb98af92-ce8e-477b-b2aa-ce5e467efeb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb98af92-ce8e-477b-b2aa-ce5e467efeb8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f680fd2f-3bb0-40d5-ba8f-9cfd29e00d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f680fd2f-3bb0-40d5-ba8f-9cfd29e00d78
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f680fd2f-3bb0-40d5-ba8f-9cfd29e00d78
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
correlation: qa-c47ac1d0-421e-454c-9a54-84c3ff810a64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c47ac1d0-421e-454c-9a54-84c3ff810a64
Content-Type: application/json

--- request body ---
{"handle":"qa-1f7282c94b1d","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c47ac1d0-421e-454c-9a54-84c3ff810a64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c47ac1d0-421e-454c-9a54-84c3ff810a64"}
```
