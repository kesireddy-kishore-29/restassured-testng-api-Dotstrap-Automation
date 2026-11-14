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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-672ba4d7-5334-4d23-9a4f-0ee709d13f75` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-f1068d7c-b1c2-40e1-8204-6c8b12e96e58` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-d5610afa-9898-4e3f-bb9f-ac6022fce502` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-275f1f6a-4a71-4f2a-a1f5-c8295d001cc2` |
| 5 | `GET /v1/admin/stats` | 503 | 12 | `qa-c973a252-3dfd-4217-ab76-b8091593b73a` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-eaaf544f-e79f-4b03-9291-1a1ecc95e0ae` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-99156968-d504-4ed3-9410-018e62450273` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-6f67dc7c-750d-4444-a75e-8a62eaa0fcec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-20432947-a867-4861-8e2f-e93e38b69021` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-e2648c50-9ca2-4c83-9540-9f7b0e227424` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-672ba4d7-5334-4d23-9a4f-0ee709d13f75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-672ba4d7-5334-4d23-9a4f-0ee709d13f75
Content-Type: application/json

--- request body ---
{"handle":"qa-37ba50b68d9f","displayName":"QA 37ba50b68d9f","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-672ba4d7-5334-4d23-9a4f-0ee709d13f75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 8
Location: /v1/accounts/qa-37ba50b68d9f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0cbd99f4-3421-4b54-a307-14cb7477273c","handle":"qa-37ba50b68d9f","displayName":"QA 37ba50b68d9f","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.895583400Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f1068d7c-b1c2-40e1-8204-6c8b12e96e58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1068d7c-b1c2-40e1-8204-6c8b12e96e58
Content-Type: application/json

--- request body ---
{"handle":"qa-309ee7d9533d","displayName":"QA 309ee7d9533d","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1068d7c-b1c2-40e1-8204-6c8b12e96e58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 8
Location: /v1/accounts/qa-309ee7d9533d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b9eea1e-51e0-4474-8a8a-7104b623a683","handle":"qa-309ee7d9533d","displayName":"QA 309ee7d9533d","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.912353906Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d5610afa-9898-4e3f-bb9f-ac6022fce502

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5610afa-9898-4e3f-bb9f-ac6022fce502
Content-Type: application/json

--- request body ---
{"handle":"qa-37ba50b68d9f","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5610afa-9898-4e3f-bb9f-ac6022fce502
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0cbd99f4-3421-4b54-a307-14cb7477273c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-275f1f6a-4a71-4f2a-a1f5-c8295d001cc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-275f1f6a-4a71-4f2a-a1f5-c8295d001cc2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-309ee7d9533d","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-275f1f6a-4a71-4f2a-a1f5-c8295d001cc2
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
Location: /v1/conversations/cnv_1408f17c-addd-4408-a053-18e3720efdbb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1408f17c-addd-4408-a053-18e3720efdbb","subject":"Error contract","status":"open","region":"eu","participants":["qa-37ba50b68d9f","qa-309ee7d9533d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.955919780Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-c973a252-3dfd-4217-ab76-b8091593b73a

--- request headers ---
Accept: application/json
X-Fault-Key: a5bfc048-b727-4876-a4e6-12aabe21856c
X-Fault: unavailable-once
X-Correlation-Id: qa-c973a252-3dfd-4217-ab76-b8091593b73a
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c973a252-3dfd-4217-ab76-b8091593b73a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-c973a252-3dfd-4217-ab76-b8091593b73a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eaaf544f-e79f-4b03-9291-1a1ecc95e0ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaaf544f-e79f-4b03-9291-1a1ecc95e0ae
Content-Type: application/json

--- request body ---
{"handle":"qa-309ee7d9533d","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaaf544f-e79f-4b03-9291-1a1ecc95e0ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b9eea1e-51e0-4474-8a8a-7104b623a683"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99156968-d504-4ed3-9410-018e62450273

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99156968-d504-4ed3-9410-018e62450273
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99156968-d504-4ed3-9410-018e62450273
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
correlation: qa-6f67dc7c-750d-4444-a75e-8a62eaa0fcec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f67dc7c-750d-4444-a75e-8a62eaa0fcec
Content-Type: application/json

--- request body ---
{"handle":"qa-309ee7d9533d","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f67dc7c-750d-4444-a75e-8a62eaa0fcec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f67dc7c-750d-4444-a75e-8a62eaa0fcec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20432947-a867-4861-8e2f-e93e38b69021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20432947-a867-4861-8e2f-e93e38b69021
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20432947-a867-4861-8e2f-e93e38b69021
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
correlation: qa-e2648c50-9ca2-4c83-9540-9f7b0e227424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2648c50-9ca2-4c83-9540-9f7b0e227424
Content-Type: application/json

--- request body ---
{"handle":"qa-37ba50b68d9f","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2648c50-9ca2-4c83-9540-9f7b0e227424
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e2648c50-9ca2-4c83-9540-9f7b0e227424"}
```
